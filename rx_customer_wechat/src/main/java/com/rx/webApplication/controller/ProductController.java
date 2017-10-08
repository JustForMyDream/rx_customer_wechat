package com.rx.webApplication.controller;

import com.cxt.wechat.entity.WechatUser;
import com.google.gson.Gson;
import com.rx.webApplication.SessionStorage;
import com.rx.webApplication.dao.Impl.TlkEnterpriseWeChatTokenDaoImpl;
import com.rx.webApplication.dao.Impl.TlkKhjcxxEntityDaoImpl;
import com.rx.webApplication.dao.TlkEnterpriseWeChatDao;
import com.rx.webApplication.dao.TlkEnterpriseWeChatTokenDao;
import com.rx.webApplication.dao.TlkKhjcxxEntityDao;
import com.rx.webApplication.entities.TLkKhjcxxEntity;
import com.rx.webApplication.entities.TlkCpEntity;
import com.rx.webApplication.util.ResponseUtil;
import com.rx.webApplication.util.enterpriseWechat.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 王玉粮 on 2017/7/26.
 */
@Controller
@RequestMapping("product")
public class ProductController {
    EnterpriseSendMessage enterpriseSendMessage = new EnterpriseSendMessage();

    Gson gson = new Gson();


    @RequestMapping("reservation")
    public String reservation(){
        return "productReservation";
    }

    /**
     * 根据openid查询所有的用户
     * @param request
     * @param response
     * @param session
     */
    @RequestMapping("querykhxx")
    public void queryKhxxByOpenid(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        WechatUser wechatUser = (WechatUser) session.getAttribute(SessionStorage.WECHATUSER);//取得用户的WechatUser
//        WechatUser wechatUser = new WechatUser();
//        wechatUser.setOpenid("oyaYgt4WnzPfhW5aSA8g87ktBvfI");
        if(wechatUser==null){
            System.out.println("未取得用户的WechatUser");
            map.put("msg","未取得用户的WechatUser");
            map.put("code","500");
            return;
        }
        String openid = wechatUser.getOpenid();//取得用户openid
//        String openid = "oyaYgt4WnzPfhW5aSA8g87ktBvfI";
        if(openid == null){
            System.out.println("未取得用户的openid");
            map.put("msg","未取得用户的openid");
            map.put("code","500");
            return;
        }
        TlkKhjcxxEntityDao tlkKhjcxxEntityDao = new TlkKhjcxxEntityDaoImpl();
        TLkKhjcxxEntity tLkKhjcxxEntity = tlkKhjcxxEntityDao.findByOpenId(openid);//通过openid获取客户基础信息

        if(tLkKhjcxxEntity == null){
            System.out.println("未取得用户基础信息");
            map.put("msg","未取得用户基础信息");
            map.put("code","500");
            return;
        }
        map.put("code","200");
        map.put("tLkKhjcxxEntity",tLkKhjcxxEntity);
        ResponseUtil.response(response,gson.toJson(map));
    }


    /**
     * 预约产品发送消息
     * @param request
     * @param response
     * @param session
     */
    @RequestMapping("reservedProduct")
    public void  reservedProduct(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        TlkCpEntity tlkCpEntity = (TlkCpEntity) request.getSession().getAttribute(SessionStorage.PRODUCT);//获取产品实体
        System.out.println("产品实体tlkCpEntity:"+gson.toJson(tlkCpEntity));
        Map<String,Object> map = new HashMap<>();
        TlkKhjcxxEntityDao tlkKhjcxxEntityDao = new TlkKhjcxxEntityDaoImpl();
        List list = new ArrayList();
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String state = request.getParameter("state");
        if(state.equals("1")){
            System.out.println("执行更新操作");
            tlkKhjcxxEntityDao.UpdateNameByPhone(username,phone);
        }
        String ssr = tlkKhjcxxEntityDao.findSSRIdByPhone(phone);
        if (ssr == null){
            System.out.println("未找到所属人！");

        }else {
            String userid = tlkKhjcxxEntityDao.findSSROpenidById(ssr);
            System.out.println("userid:"+userid);
            System.out.println("发送消息给所属人");
            enterpriseSendMessage.sendToStaff(userid,username,tlkCpEntity.getITEM_CPMC(),phone);
        }
        list = tlkKhjcxxEntityDao.findAllUserOpenidByRoleName("电销中心主管");
        if(list.size()!=0){
            for(int i = 0;i < list.size();i ++){
                String dirUserid = (String) list.get(i);
                System.out.println("dirUserid:"+dirUserid);
                enterpriseSendMessage.sendToDirector(dirUserid,username,tlkCpEntity.getITEM_CPMC(),phone);
                System.out.println("发送消息给电销中心主管");
            }
        }else {
            System.out.println("未找到电销中心主管！");
        }
        map.put("code","200");
        ResponseUtil.response(response,gson.toJson(map));
    }




}
