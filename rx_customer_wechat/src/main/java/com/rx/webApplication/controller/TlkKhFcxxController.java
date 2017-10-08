package com.rx.webApplication.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rx.webApplication.dao.Impl.TlkKhClxxEntityDaoImpl;
import com.rx.webApplication.dao.Impl.TlkKhFcxxEntityDaoImpl;
import com.rx.webApplication.dao.TlkKhClxxEntityDao;
import com.rx.webApplication.dao.TlkKhFcxxEntityDao;
import com.rx.webApplication.entities.TLkKhClxxEntity;
import com.rx.webApplication.entities.TlkKhFcxxEntity;
import com.rx.webApplication.util.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2017/7/4.
 */
@RequestMapping("fcxx")
public class TlkKhFcxxController {

    Gson gson = new Gson();
    Map<String,Object> map = new HashMap<>();
    @RequestMapping("readhouse")
    public void fcxx(@RequestParam("khid") String khid, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        List<TlkKhFcxxEntity> tlkKhFcxxEntityList = new TlkKhFcxxEntityDaoImpl().findHouseByKhid(khid);
        map.put("tlkKhFcxxEntityList",tlkKhFcxxEntityList);
        ResponseUtil.response(response, gson.toJson(map));
    }
    @RequestMapping("readhousebyid")
    public void readhousebyid( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        String id = request.getParameter("id");
        if(id!="null"&&!id.equals("null")){
            TlkKhFcxxEntity tlkKhFcxxEntity = new TlkKhFcxxEntityDaoImpl().findHouseByid(id);
            map.put("tlkKhFcxxEntity", tlkKhFcxxEntity);
            map.put("code","200");
            ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(map));
        }else {
            map.put("msg","未取得参保id");
        }
    }

    @RequestMapping("savehouse")
    public void savehouse(HttpServletRequest request,  HttpServletResponse response,
                        @RequestParam("ITEM_FCXZ") String ITEM_FCXZ,
                        @RequestParam("ITEM_YGJE") Double ITEM_YGJE,
                        @RequestParam("ITEM_JZLX") String ITEM_JZLX,
                        @RequestParam("ITEM_SZSFQQ") String ITEM_SZSFQQ,
                        @RequestParam("ITEM_GTZQK") String ITEM_GTZQK,
                          @RequestParam("ITEM_JZLX") String ITEM_GFSJ,
                          @RequestParam("ITEM_JZMJ") String ITEM_JZMJ,
                          @RequestParam("ITEM_SCDJ") Double ITEM_SCDJ,
                        @RequestParam("ITEM_KHID") String ITEM_KHID,
                          @RequestParam("ITEM_FCDZ") String ITEM_FCDZ
    ) throws ServletException, IOException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date = null;
        try {
            date = sdf.parse(ITEM_GFSJ);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date1 = new Date(date.getTime());
        TlkKhFcxxEntity tlkKhFcxxEntity = new TlkKhFcxxEntity();
        tlkKhFcxxEntity.setId(UUID.randomUUID().toString());
        tlkKhFcxxEntity.setItemFcxz(ITEM_FCXZ);
        tlkKhFcxxEntity.setItemGfsj(date1);
        tlkKhFcxxEntity.setItemJzlx(ITEM_JZLX);
        tlkKhFcxxEntity.setItemSzsfqq(ITEM_SZSFQQ);
        tlkKhFcxxEntity.setItemYgje(ITEM_YGJE);
        tlkKhFcxxEntity.setItemGtzqk(ITEM_GTZQK);
        tlkKhFcxxEntity.setItemJzmj(ITEM_JZMJ);
        tlkKhFcxxEntity.setItemScdj(ITEM_SCDJ);
        tlkKhFcxxEntity.setItemKhid(ITEM_KHID);
        tlkKhFcxxEntity.setItemFcdz(ITEM_FCDZ);
        TlkKhFcxxEntityDao tlkKhFcxxEntityDao = new TlkKhFcxxEntityDaoImpl();
        tlkKhFcxxEntityDao.addHouseByKhid(tlkKhFcxxEntity);
        if(tlkKhFcxxEntity!=null){
            map.put("code",200);
            map.put("msg","保存消息成功");
        }
        else{
            map.put("code",400);
            map.put("msg","保存消息失败");
        }
        ResponseUtil.response(response,gson.toJson(map));

    }



}
