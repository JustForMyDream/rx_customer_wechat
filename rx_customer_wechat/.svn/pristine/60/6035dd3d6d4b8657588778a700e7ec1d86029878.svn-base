package com.rx.webApplication.controller;

import com.cxt.wechat.entity.WechatUser;
import com.google.gson.Gson;
import com.rx.webApplication.SessionStorage;
import com.rx.webApplication.dao.Impl.TlkKhjcxxEntityDaoImpl;
import com.rx.webApplication.entities.TLkKhjcxxEntity;
import com.rx.webApplication.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static sun.misc.Version.println;

/**
 * Created by Ace on 2017/7/3.
 */

@RequestMapping("perInf")
@Controller
public class TlkKhjcxxController {
    Gson gson = new Gson();


    private TlkKhjcxxEntityDaoImpl tlkKhjcxxEntityDao = new TlkKhjcxxEntityDaoImpl();

    @RequestMapping("query")
    public String query(HttpServletRequest request) {
        String khid = (String) request.getSession().getAttribute(SessionStorage.KHID);
        request.setAttribute("tLkKhjcxxEntity", tlkKhjcxxEntityDao.getById(khid));
        return "personalInformation";
    }

    public void insert() {
        tlkKhjcxxEntityDao.insert("12345678911");
    }

    @RequestMapping("update")
    public void update(TLkKhjcxxEntity tLkKhjcxxEntity, HttpServletResponse response, HttpServletRequest request) {
        String khid = (String) request.getSession().getAttribute(SessionStorage.KHID);
        if (tLkKhjcxxEntity.getItemYgzsr() == null)
            tLkKhjcxxEntity.setItemYgzsr(0.0);
        if (tLkKhjcxxEntity.getItemYwzxyq().equals("空"))
            tLkKhjcxxEntity.setItemYwzxyq(null);
        if (tLkKhjcxxEntity.getItemZxxx().equals("空"))
            tLkKhjcxxEntity.setItemZxxx(null);
        tLkKhjcxxEntity.setId(khid);
        try {
            response.getWriter().append(String.valueOf(tlkKhjcxxEntityDao.updateById(tLkKhjcxxEntity)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("Info")
    public String khInfo(HttpServletRequest request, HttpSession session) {
        String khid=(String)request.getSession().getAttribute(SessionStorage.KHID);
        //String khid = "11e7-6de2-4238e200-8d42-4f6fa9b0ec38";
        WechatUser wechatUser = (WechatUser) session.getAttribute(SessionStorage.WECHATUSER);
        //System.out.println("WechatUser:"+new Gson().toJson(wechatUser));
        request.setAttribute("WechatUser", wechatUser);
        request.setAttribute("tLkKhjcxxEntity", tlkKhjcxxEntityDao.getById(khid));
        request.setAttribute("khid", khid);
        return "khInfo";
    }

    @RequestMapping("zhengxin")
    public String zhengxin(HttpServletRequest request) {
//        String khid=(String)request.getSession().getAttribute(SessionStorage.KHID);
        String id = request.getParameter("khid");
        request.setAttribute("tLkKhjcxxEntity", tlkKhjcxxEntityDao.getById(id));
        return "zhengxinXX";
    }

    // 征信信息里面的 职业信息修改接口
    @RequestMapping("updatezhengxin")
    public void updatezhengxin( HttpServletRequest request ,HttpServletResponse response,ModelMap map) {
        String khid = (String) request.getSession().getAttribute(SessionStorage.KHID);
//        String khid = "11e7-6de2-4238e200-8d42-4f6fa9b0ec38";
        TLkKhjcxxEntity tLkKhjcxxEntity = tlkKhjcxxEntityDao.getById(khid);

        tLkKhjcxxEntity.setItemZylb(request.getParameter("ITEM_ZYLB"));
        tLkKhjcxxEntity.setItemYgzsr(Double.parseDouble(request.getParameter("ITEM_YGZSR")));
        tLkKhjcxxEntity.setItemGznx(request.getParameter("ITEM_GZNX"));
        tLkKhjcxxEntity.setItemGzfffs(request.getParameter("ITEM_GZFFFS"));
        tLkKhjcxxEntity.setId(khid);
        tlkKhjcxxEntityDao.updateById(tLkKhjcxxEntity);
        if (tLkKhjcxxEntity != null) {
            map.put("code", 200);
            map.put("msg", "修改消息成功");
        } else {
            map.put("code", 400);
            map.put("msg", "修改消息失败");
        }
      ResponseUtil.response(response, gson.toJson(map));
    }

}
