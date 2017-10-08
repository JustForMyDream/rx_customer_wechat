package com.rx.webApplication.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.google.gson.Gson;
import com.rx.webApplication.SessionStorage;
import com.rx.webApplication.dao.Impl.TUserEntityDaoImpl;
import com.rx.webApplication.dao.Impl.TlkEnterpriseWeChatDaoImpl;
import com.rx.webApplication.dao.Impl.TlkEnterpriseWeChatTokenDaoImpl;
import com.rx.webApplication.dao.Impl.TlkUserMessageEntityDaoImpl;
import com.rx.webApplication.dao.TUserEntityDao;
import com.rx.webApplication.dao.TlkEnterpriseWeChatDao;
import com.rx.webApplication.entities.TUserEntity;
import com.rx.webApplication.entities.TlkEnterpriseWeChatEntity;
import com.rx.webApplication.util.HttpUtil;
import com.rx.webApplication.util.ResponseUtil;
import com.rx.webApplication.util.SendMessageUtil;
import com.rx.webApplication.util.ShortMessageType;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by Aria on 2017/7/15.
 */
@Controller
@RequestMapping("entwec")
public class EntWecController {
    private static final String url="https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wxc9b7502a61dd9c64&corpsecret=oRQVvTm_NUgKeEQlShD-F6ZfGhsd4a7V9D11dZiNCyg";

    private TUserEntityDao tUserEntityDao=new TUserEntityDaoImpl();

    private static final String signName = "融祥普惠";//签名
    private static final String templateCode = "SMS_73985158";//


    @RequestMapping(path = "/sendCode",method = RequestMethod.GET)
    public void  sendCode( HttpServletRequest request,  HttpServletResponse response, @RequestParam( "phoneNumber")String phoneNumber){
        TlkEnterpriseWeChatDao tlkEnterpriseWeChatDao = new TlkEnterpriseWeChatDaoImpl();
        Map<String,Object> map = new HashMap<>();

        HttpSession session = request.getSession();
        //从session中获取微信息的信息
        String userId = (String) session.getAttribute("userId");
        //随机成成一个6位数的验证码
        int randomCode = SendMessageUtil.getRandnNum(100000,999999);
        //发送短信

        if(phoneNumber!=null&&phoneNumber!=""){
            //获取最近一次发送验证的码的时间
            if(phoneNumber.matches("^1\\d{10}$")){
                Timestamp lastTime = tlkEnterpriseWeChatDao.findLastCheckMessageByPhone(phoneNumber);

                if(lastTime!=null){
                    Timestamp currentTime = new Timestamp(new Date().getTime());

                    if(currentTime.getTime()-lastTime.getTime()<60000){
                        map.put("msg","alreadySendMessage");
                    }else {
                        //获取当天验证码的次数
                        int currentCodeNumbers = tlkEnterpriseWeChatDao.findCurrtCheckCodeNums(phoneNumber);

                        if(currentCodeNumbers < 3 ){
                            try {
                                SendSmsResponse sendSmsResponse = SendMessageUtil.send(phoneNumber,signName,randomCode,templateCode);
                                Date date = new Date();
                                TlkEnterpriseWeChatEntity tlkEnterpriseWeChatEntity = new TlkEnterpriseWeChatEntity();
                                tlkEnterpriseWeChatEntity.setId(UUID.randomUUID().toString());
                                tlkEnterpriseWeChatEntity.setItemUserId(userId);
                                tlkEnterpriseWeChatEntity.setItemCheckcode(randomCode);
                                tlkEnterpriseWeChatEntity.setItemSendtime(new Timestamp(date.getTime()));
                                tlkEnterpriseWeChatEntity.setItemEffectivetime(new Timestamp(date.getTime()+600000));
                                tlkEnterpriseWeChatEntity.setItemType(ShortMessageType.MESSAGETYPE);
                                tlkEnterpriseWeChatEntity.setItemPhone(phoneNumber);
                                String code = sendSmsResponse.getCode();
                                String message=sendSmsResponse.getMessage();

                                if(code == "OK"||code.equals("OK")){
                                    tlkEnterpriseWeChatDao.saveCheckSortMessage(tlkEnterpriseWeChatEntity);
                                    session.setAttribute(SessionStorage.CODE,randomCode);
                                    map.put("msg","sendSuccess");
                                }else {
                                    String failMessage = sendSmsResponse.getMessage();
                                    map.put("msg","sendFail");
                                    map.put("failMessage",failMessage);
                                }
                            } catch (ClientException e) {
                                e.printStackTrace();
                            }
                        }else {
                            map.put("msg","你当日短信次数已用完");
                        }
                    }
                }else {
                    //获取当天验证码的次数
                    int currentCodeNumbers = tlkEnterpriseWeChatDao.findCurrtCheckCodeNums(phoneNumber);
                    if(currentCodeNumbers < 3 ){
                        try {
                            SendSmsResponse sendSmsResponse = SendMessageUtil.send(phoneNumber,signName,randomCode,templateCode);
                            Date date = new Date();
                            TlkEnterpriseWeChatEntity tlkEnterpriseWeChatEntity = new TlkEnterpriseWeChatEntity();
                            tlkEnterpriseWeChatEntity.setId(UUID.randomUUID().toString());
                            tlkEnterpriseWeChatEntity.setItemUserId(userId);
                            tlkEnterpriseWeChatEntity.setItemCheckcode(randomCode);
                            tlkEnterpriseWeChatEntity.setItemSendtime(new Timestamp(date.getTime()));
                            tlkEnterpriseWeChatEntity.setItemEffectivetime(new Timestamp(date.getTime()+600000));
                            tlkEnterpriseWeChatEntity.setItemType(ShortMessageType.MESSAGETYPE);
                            tlkEnterpriseWeChatEntity.setItemPhone(phoneNumber);
                            String code = sendSmsResponse.getCode();
                            if(code == "OK"||code.equals("OK")){
                                tlkEnterpriseWeChatDao.saveCheckSortMessage(tlkEnterpriseWeChatEntity);
                                session.setAttribute(SessionStorage.CODE,randomCode);
                                map.put("msg","sendSuccess");
                            }else {
                                String failMessage = sendSmsResponse.getMessage();
                                map.put("failMessage",failMessage);
                                map.put("msg","sendFail");
                            }
                        } catch (ClientException e) {
                            e.printStackTrace();
                        }
                    }else {
                        map.put("msg","messageNumberIsFull");
                    }
                }
            }else {
                map.put("msg","PhoneIsError");
            }

        }else {
            map.put("msg","noPhoneNumber");
        }
        ResponseUtil.response(response,new Gson().toJson(map));
    }

    @RequestMapping(path = "VerificationCode",method = RequestMethod.GET)
    public void verificationCode( HttpServletRequest request,HttpServletResponse response,@RequestParam( "phoneNumber")String phoneNumber,@RequestParam("confirmCode")String confirmCode){
        //判断是否验证成功
        boolean flag = false;
        HttpSession session = request.getSession();
        //从session 获取微信用户信息
        String userId = (String) session.getAttribute("userId");
        System.out.println("userId:"+userId);

        Map<String,Object> map = new HashMap<>();

        TlkEnterpriseWeChatDao tlkEnterpriseWeChatDao = new TlkEnterpriseWeChatDaoImpl();

        List<TlkEnterpriseWeChatEntity> tlkEnterpriseWeChatEntities = tlkEnterpriseWeChatDao.findCheckMessageByPhone(phoneNumber,userId);
        if(tlkEnterpriseWeChatEntities.size()!=0){
            for(int i = 0;i < tlkEnterpriseWeChatEntities.size(); i++){
                TlkEnterpriseWeChatEntity tlkCheckSortMessageEntity = tlkEnterpriseWeChatEntities.get(i);
                String checkCode = String.valueOf(tlkCheckSortMessageEntity.getItemCheckcode());
                Timestamp currenTime = new Timestamp(new Date().getTime());
                Timestamp effectiveTime = tlkCheckSortMessageEntity.getItemEffectivetime();
                if(effectiveTime!=null){
                    if(currenTime.getTime()<effectiveTime.getTime()){
                        if(checkCode==confirmCode||checkCode.equals(confirmCode)){
                            System.out.println("验证成功！");
                            flag = true;
                        }else {
                            System.out.println("验证码输入错误！");
                        }
                    }else {
                        System.out.println("验证码失效！");
                    }
                }else {
                    System.out.println("未取得有效时间！");
                }
            }

        }else {
            System.out.println("未取得验证码！");
        }
        if(flag==true){
            System.out.println("flag:"+flag);

            if(tUserEntityDao.getByPhone(phoneNumber)==null) {
                System.out.println("手机号不符");
                map.put("msg", "differentFromOA365");
            }
            else {
                TUserEntity tUserEntity = new TUserEntity();
                tUserEntity.setField6(userId);
                tUserEntity.setTelephone(phoneNumber);
                tUserEntityDao.updateByPhone(tUserEntity);
                session.setAttribute(SessionStorage.PHONE, phoneNumber);
                map.put("code", "200");
                map.put("msg", "验证成功！");
            }

        }else {
            System.out.println("flag:"+flag);
            map.put("code","400");
            map.put("msg","验证失败!");
        }
        ResponseUtil.response(response,new Gson().toJson(map));
    }

    @RequestMapping("loader")//获取code跳转页面
    public String loader(){
        return "loader";
    }

    @RequestMapping("judge")//获取用户id
    public void judge(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String url2="https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";
        String code=request.getParameter("code");
        //get微信接口返回access_token
        String access_token= new TlkEnterpriseWeChatTokenDaoImpl().getToken();
        url2=url2.replaceAll("ACCESS_TOKEN",access_token);
        url2=url2.replaceAll("CODE",code);
        String userId= (String) getKey("UserId",url2);
        System.out.println("-----------------------------------------ACCESSTOKEN:"+access_token);
        System.out.println("-----------------------------------------CODE:"+code);
        System.out.println("-----------------------------------------ACCESS_TOKEN:"+access_token);
        System.out.println("-----------------------------------------UserId:"+userId);
        request.getSession().setAttribute("userId",userId);
        if(userId!=null) {
            if (tUserEntityDao.getByUserId(userId) == null)
                response.getWriter().append("entwec");
            else
                response.getWriter().append("login");
        }else {
            response.getWriter().append("phone");
        }
    }

    @RequestMapping("entwec")
    public String entWec(){
        return "EntWec";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request){
        String userId= (String) request.getSession().getAttribute("userId");
        TUserEntity tUserEntity=tUserEntityDao.getByUserId(userId);
        request.setAttribute("tUser",tUserEntity);
        return "login";
    }

    public Object getKey(String key,String url) throws IOException {//Get requests JSON data
        String rtn = new HttpUtil().getHttpsGet(url);
        JSONObject jsStr = JSONObject.fromObject(rtn);
        return jsStr.get(key);
    }

}