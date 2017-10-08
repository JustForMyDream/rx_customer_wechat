package com.rx.webApplication.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.cxt.wechat.entity.WechatUser;
import com.google.gson.Gson;
import com.rx.webApplication.SessionStorage;
import com.rx.webApplication.dao.Impl.TlkCheckSortMessageEntityDaoImpl;
import com.rx.webApplication.dao.Impl.TlkKhjcxxEntityDaoImpl;
import com.rx.webApplication.dao.Impl.TlkUserMessageEntityDaoImpl;
import com.rx.webApplication.dao.Impl.TlkWechatUserEntityDaoImpl;
import com.rx.webApplication.dao.TlkCheckSortMessageEntityDao;
import com.rx.webApplication.dao.TlkKhjcxxEntityDao;
import com.rx.webApplication.dao.TlkUserMessageEntityDao;
import com.rx.webApplication.dao.TlkWechatUserEntityDao;
import com.rx.webApplication.entities.TLkKhjcxxEntity;
import com.rx.webApplication.entities.TlkCheckSortMessageEntity;
import com.rx.webApplication.entities.TlkUserMessageEntity;
import com.rx.webApplication.util.ResponseUtil;
import com.rx.webApplication.util.SendMessageUtil;
import com.rx.webApplication.util.ShortMessageType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;


/**
 * Created by 王玉粮 on 2017/6/29.
 */
@Controller
@RequestMapping("SmsVerification")
public class SmsVerificationContoller {

    private static final String signName = "融祥普惠";//签名
    private static final String templateCode = "SMS_73985158";//

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("toConfirmPage")
    public String toConfirmPage(){
        return "confirmPage";
    }

    /**
     * 发送验证码
     * @param request
     * @param response
     * @param phoneNumber
     */
    @RequestMapping(path = "/sendCode",method = RequestMethod.GET)
    public void  sendCode( HttpServletRequest request,  HttpServletResponse response, @RequestParam( "phoneNumber")String phoneNumber){
        TlkCheckSortMessageEntityDao tlkCheckSortMessageEntityDao = new TlkCheckSortMessageEntityDaoImpl();
        Map<String,Object> map = new HashMap<>();

        HttpSession session = request.getSession();
        //从session中获取微信息的信息
       WechatUser wechatUser = (WechatUser) session.getAttribute(SessionStorage.WECHATUSER);
        //随机成成一个6位数的验证码
        int randomCode = SendMessageUtil.getRandnNum(100000,999999);
        //发送短信

        if(phoneNumber!=null&&phoneNumber!=""){
            //获取最近一次发送验证的码的时间
            if(phoneNumber.matches("^1\\d{10}$")){
                Timestamp lastTime = tlkCheckSortMessageEntityDao.findLastCheckMessageByPhone(phoneNumber);
                System.out.println("lastTime:"+lastTime);
                if(lastTime!=null){
                    Timestamp currentTime = new Timestamp(new Date().getTime());

                    if(currentTime.getTime()-lastTime.getTime()<60000){
                        map.put("msg","alreadySendMessage");
                    }else {
                        //获取当天验证码的次数
                        int currentCodeNumbers = tlkCheckSortMessageEntityDao.findCurrtCheckCodeNums(phoneNumber);

                        if(currentCodeNumbers < 3 ){
                            try {
                                SendSmsResponse sendSmsResponse = SendMessageUtil.send(phoneNumber,signName,randomCode,templateCode);
                                Date date = new Date();
                                TlkCheckSortMessageEntity tlkCheckSortMessageEntity = new TlkCheckSortMessageEntity();
                                tlkCheckSortMessageEntity.setId(UUID.randomUUID().toString());
                                tlkCheckSortMessageEntity.setItemOpenid(wechatUser.getOpenid());
                                tlkCheckSortMessageEntity.setItemCheckcode(randomCode);
                                tlkCheckSortMessageEntity.setItemSendtime(new Timestamp(date.getTime()));
                                tlkCheckSortMessageEntity.setItemEffectivetime(new Timestamp(date.getTime()+600000));
                                tlkCheckSortMessageEntity.setItemType(ShortMessageType.MESSAGETYPE);
                                tlkCheckSortMessageEntity.setItemPhone(phoneNumber);
                                String code = sendSmsResponse.getCode();
                                if(code == "OK"||code.equals("OK")){
                                    tlkCheckSortMessageEntityDao.saveCheckSortMessage(tlkCheckSortMessageEntity);
                                    session.setAttribute(SessionStorage.CODE,randomCode);
                                    map.put("msg","sendSuccess");
                                }else {
                                    String failMessage = sendSmsResponse.getMessage();
                                    System.out.println("failMessage:"+failMessage);
                                    map.put("msg","sendFail");
                                    map.put("failMessage",failMessage);
                                }
                            } catch (ClientException e) {
                                e.printStackTrace();
                            }
                        }else {
                            map.put("msg","messageNumberIsFull");
                        }
                    }
                }else {
                    //获取当天验证码的次数
                    int currentCodeNumbers = tlkCheckSortMessageEntityDao.findCurrtCheckCodeNums(phoneNumber);

                    if(currentCodeNumbers < 3 ){
                        try {
                            SendSmsResponse sendSmsResponse = SendMessageUtil.send(phoneNumber,signName,randomCode,templateCode);
                            Date date = new Date();
                            TlkCheckSortMessageEntity tlkCheckSortMessageEntity = new TlkCheckSortMessageEntity();
                            tlkCheckSortMessageEntity.setId(UUID.randomUUID().toString());
                            tlkCheckSortMessageEntity.setItemOpenid(wechatUser.getOpenid());
                            tlkCheckSortMessageEntity.setItemCheckcode(randomCode);
                            tlkCheckSortMessageEntity.setItemSendtime(new Timestamp(date.getTime()));
                            tlkCheckSortMessageEntity.setItemEffectivetime(new Timestamp(date.getTime()+600000));
                            tlkCheckSortMessageEntity.setItemType(ShortMessageType.MESSAGETYPE);
                            tlkCheckSortMessageEntity.setItemPhone(phoneNumber);
                            String code = sendSmsResponse.getCode();
                            if(code == "OK"||code.equals("OK")){
                                tlkCheckSortMessageEntityDao.saveCheckSortMessage(tlkCheckSortMessageEntity);
                                session.setAttribute(SessionStorage.CODE,randomCode);
                                map.put("msg","sendSuccess");
                            }else {
                                String failMessage = sendSmsResponse.getMessage();
                                System.out.println("failMessage:"+failMessage);
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


    /**
     * 匹配验证码
     * @param request
     * @param phoneNumber
     * @param confirmCode
     * @return
     */
    @RequestMapping(path = "VerificationCode",method = RequestMethod.GET)
    public void verificationCode( HttpServletRequest request,HttpServletResponse response,@RequestParam( "phoneNumber")String phoneNumber,@RequestParam("confirmCode")String confirmCode){
        String sjly = "wx";
        //判断是否验证成功
        boolean flag = false;
        HttpSession session = request.getSession();
        //从session 获取微信用户信息
        WechatUser wechatUser = (WechatUser) session.getAttribute(SessionStorage.WECHATUSER);

        System.out.println("WechatUser:"+wechatUser);

        Map<String,Object> map = new HashMap<>();

        TlkCheckSortMessageEntityDao tlkCheckSortMessageEntityDao = new TlkCheckSortMessageEntityDaoImpl();

        TlkUserMessageEntityDao tlkUserMessageEntityDao = new TlkUserMessageEntityDaoImpl();

        List<TlkCheckSortMessageEntity> tlkCheckSortMessageEntityList = tlkCheckSortMessageEntityDao.findCheckMessageByPhone(phoneNumber,wechatUser.getOpenid());
        if(tlkCheckSortMessageEntityList.size()!=0){
            for(int i = 0;i < tlkCheckSortMessageEntityList.size(); i++){
                TlkCheckSortMessageEntity tlkCheckSortMessageEntity = tlkCheckSortMessageEntityList.get(i);
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
    //      tlkCheckSortMessageEntityDao.updateOpenid(wechatUser.getOpenid(),phoneNumber);
//          tlkCheckSortMessageEntityDao.updateOpenid("aaa",phoneNumber);
          TlkUserMessageEntity tlkUserMessageEntity = new TlkUserMessageEntity();
          tlkUserMessageEntity.setId(UUID.randomUUID().toString());
          tlkUserMessageEntity.setPhone(phoneNumber);
          tlkUserMessageEntityDao.saveUserMessage(tlkUserMessageEntity);  //保存到用户信息表中
          TlkKhjcxxEntityDao tlkKhjcxxEntityDao = new TlkKhjcxxEntityDaoImpl();
          String phone = tlkKhjcxxEntityDao.judgeByPhone(phoneNumber); // 查询客户基础信息表是否有用户电话
          System.out.println("phone:"+phone);
          String khid = tlkKhjcxxEntityDao.findByPhone(phoneNumber);
          System.out.println("khid:"+khid);
          TlkWechatUserEntityDao tlkWechatUserEntityDao = new TlkWechatUserEntityDaoImpl();
          if(phone==null||phone==""){
              System.out.println("插入客户信息");
              tlkKhjcxxEntityDao.insertIntoIdAndPhone(UUID.randomUUID().toString(),phoneNumber,wechatUser.getOpenid(),sjly);
          }else {
              System.out.println("绑定客户ID");
              tlkWechatUserEntityDao.updateWechatUserByOpenid(khid,phoneNumber,wechatUser.getOpenid());
          }
          session.setAttribute(SessionStorage.PHONE,phoneNumber);
          map.put("code","200");
          map.put("msg","验证成功！");

      }else {
          System.out.println("flag:"+flag);
          map.put("code","400");
          map.put("msg","验证失败!");
      }
        ResponseUtil.response(response,new Gson().toJson(map));
    }

}
