package com.rx.webApplication.controller;

import com.cxt.wechat.entity.WechatUser;
import com.google.gson.Gson;
import com.rx.webApplication.SessionStorage;
import com.rx.webApplication.dao.Impl.TlkLocationDataEntityDaoImpl;
import com.rx.webApplication.dao.TlkLocationDataEntityDao;
import com.rx.webApplication.entities.TlkLocationDataEntity;
import com.rx.webApplication.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 获取地理位置信息
 */
@Controller
@RequestMapping("location")
public class LocationController {

    @RequestMapping("toGetLocation")
    public String toGetLocation(){
        return "getLocation";
    }

    /**
     * 保存用户的经度纬度到数据库
     * @param request
     * @param response
     */
    @RequestMapping("userLocation")
    public void userLocation(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();

        TlkLocationDataEntity tlkLocationDataEntity = new TlkLocationDataEntity();

        TlkLocationDataEntityDao tlkLocationDataEntityDao = new TlkLocationDataEntityDaoImpl();

        Map<String,Object> map = new HashMap<>();

        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");
        System.out.println("longitude:"+longitude+",latitude"+latitude);

        WechatUser wechatUser = (WechatUser) session.getAttribute(SessionStorage.WECHATUSER);
        if(wechatUser!=null){
            if(longitude!=null&&latitude!=null){
                session.setAttribute(SessionStorage.LOCATION,"1");
                Date date = new Date();
                tlkLocationDataEntity.setId(UUID.randomUUID().toString());
                tlkLocationDataEntity.setItemOpenid(wechatUser.getOpenid());
                tlkLocationDataEntity.setDateTime(new Timestamp(date.getTime()));
                tlkLocationDataEntity.setItemLatitude(latitude);
                tlkLocationDataEntity.setItemLongitude(longitude);
                tlkLocationDataEntityDao.saveLocationData(tlkLocationDataEntity);
            }else {
                map.put("code","500");
                map.put("msg","nolocation");
            }
        }else {
            map.put("code","500");
            map.put("msg","noWechatUser");
        }

        ResponseUtil.response(response,new Gson().toJson(map));

    }


}
