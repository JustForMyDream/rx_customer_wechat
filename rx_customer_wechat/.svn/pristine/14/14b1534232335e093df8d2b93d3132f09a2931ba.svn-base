package com.rx.webApplication.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rx.webApplication.dao.*;
import com.rx.webApplication.dao.Impl.*;
import com.rx.webApplication.entities.*;
import com.rx.webApplication.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * Created by 李静 on 2017/7/2.
 */
@Controller
@RequestMapping("clxx")
public class TlkKhClxxContoller {

    @RequestMapping("readcar")
    public void clxx(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String khid = request.getParameter("khid");
        System.out.println("读取信息khid:"+khid);
        if(khid!="null"&&!khid.equals("")){
            List<TLkKhClxxEntity> tlkKhClxxEntityList = new TlkKhClxxEntityDaoImpl().findCarByKhid(khid);
            List<TlkKhFcxxEntity> tlkKhFcxxEntityList = new TlkKhFcxxEntityDaoImpl().findHouseByKhid(khid);
            List<TlkKhSpxxEntity> tlkKhSpxxEntityList = new TlkKhSpxxEntityDaoImpl().findShopByKhid(khid);
            List<TlkKhGjjxxEntity> tlkKhGjjxxEntityList = new TlkKhGjjxxEntityDaoImpl().findGjjByKhid(khid);
            List<TLkKhCbxxEntity> tLkKhCbxxEntityList = new TLkKhCbxxEntityDaoImpl().findCbxxByKhid(khid);
            List<TlkKhGsxxEntity> tlkKhGsxxEntityList = new TlkKhGsxxEntityDaoImpl().findGsxxByKhid(khid);
            map.put("tlkKhFcxxEntityList", tlkKhFcxxEntityList);
            map.put("tlkKhClxxEntityList", tlkKhClxxEntityList);
            map.put("tlkKhSpxxEntityList", tlkKhSpxxEntityList);
            map.put("tlkKhGjjxxEntityList", tlkKhGjjxxEntityList);
            map.put("tLkKhCbxxEntityList", tLkKhCbxxEntityList);
            map.put("tlkKhGsxxEntityList", tlkKhGsxxEntityList);
            map.put("code","200");

        }else {
            map.put("msg","未取得客户id");
        }
        ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM").create().toJson(map));
    }

    @RequestMapping("readcarbyid")
    public void readcarbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String id = request.getParameter("id");
        System.out.println("读取信息id:"+id);
        if(id!="null"&&!id.equals("null")){
            TLkKhClxxEntity tlkKhClxxEntity = new TlkKhClxxEntityDaoImpl().findCarByid(id);
            map.put("tlkKhClxxEntity", tlkKhClxxEntity);
            map.put("code","200");

        }else {
            map.put("msg","未取得车辆id");
        }
        ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(map));
    }
    @RequestMapping("readcbxxbyid")
    public void readcbxxbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String id = request.getParameter("id");
        if(id!="null"&&!id.equals("")){
            TLkKhCbxxEntity tLkKhCbxxEntity = (TLkKhCbxxEntity) new TLkKhCbxxEntityDaoImpl().findCbxxByid(id);
            map.put("tLkKhCbxxEntity", tLkKhCbxxEntity);
            map.put("code","200");
        }else {
            map.put("msg","未取得参保id");
        }
        ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(map));

    }
    @RequestMapping("readgjjxxbyid")
    public void readgjjxxbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String id = request.getParameter("id");
        if(id!="null"&&!id.equals("")){
            TlkKhGjjxxEntity tlkKhGjjxxEntity = new TlkKhGjjxxEntityDaoImpl().findGjjByid(id);
            map.put("tlkKhGjjxxEntity", tlkKhGjjxxEntity);
            map.put("code","200");
        }else {
            map.put("msg","未取得公积金信息id");
        }
        ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(map));

    }
    @RequestMapping("readgsxxbyid")
    public void readgsxxbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String id = request.getParameter("id");
        if(id!="null"&&!id.equals("")){
            TlkKhGsxxEntity tlkKhGsxxEntity= new TlkKhGsxxEntityDaoImpl().findGsxxByid(id);
            map.put("tlkKhGsxxEntity", tlkKhGsxxEntity);
            map.put("code","200");
        }else {
            map.put("msg","未取得公司信息id");
        }
        ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(map));

    }
    @RequestMapping("readspxxbyid")
    public void readspxxbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String id = request.getParameter("id");
        if(id!="null"&&!id.equals("")){
            TlkKhSpxxEntity tlkKhSpxxEntity = new TlkKhSpxxEntityDaoImpl().findShopByid(id);
            map.put("tlkKhSpxxEntity", tlkKhSpxxEntity);
            map.put("code","200");
        }else {
            map.put("msg","未取得商铺信息id");
        }
        ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(map));

    }
    @RequestMapping("readfcxxbyid")
    public void readfcxxbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String id = request.getParameter("id");
        if(id!="null"&&!id.equals("")){
            TlkKhFcxxEntity tlkKhFcxxEntity = new TlkKhFcxxEntityDaoImpl().findHouseByid(id);
            map.put("tlkKhFcxxEntity", tlkKhFcxxEntity);
            map.put("code","200");
        }else {
            map.put("msg","未取得房产信息id");
        }
        ResponseUtil.response(response, new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(map));

    }

    @RequestMapping("readhouse")
    public void fcxx(@RequestParam("khid") String khid, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        List<TlkKhFcxxEntity> tlkKhFcxxEntityList = new TlkKhFcxxEntityDaoImpl().findHouseByKhid(khid);
        map.put("tlkKhFcxxEntityList",tlkKhFcxxEntityList);
        ResponseUtil.response(response, gson.toJson(map));
    }
    @RequestMapping("savecar")
    public void savecar(HttpServletRequest request,  HttpServletResponse response,
                        @RequestParam("ITEM_CLPP") String ITEM_CLPP,
                        @RequestParam("ITEM_GCSJ") String ITEM_GCSJ,
                        @RequestParam("ITEM_LCJ") Double ITEM_LCJ,
                        @RequestParam("ITEM_YGJE") Double ITEM_YGJE,
                        @RequestParam("ITEM_KHID") String ITEM_KHID,
                        @RequestParam("ITEM_CPH") String ITEM_CPH,
                        @RequestParam("ITEM_CCSJ") String ITEM_CCSJ,
                        @RequestParam("ITEM_CLSS") String ITEM_CLSS
    ) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        if(ITEM_CLPP==""||ITEM_GCSJ==""||ITEM_LCJ==null||ITEM_YGJE==null||ITEM_KHID==""||ITEM_CPH==""||ITEM_CCSJ==""||ITEM_CLSS==""){
          System.out.println("传入的信息不完整！");
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date1 = null;
            java.util.Date date2 = null;
            try {
                date1 = sdf.parse(ITEM_GCSJ);
                date2 = sdf.parse(ITEM_CCSJ);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date dategcsj = new java.sql.Date(date1.getTime());
            java.sql.Date dateccsj = new java.sql.Date(date2.getTime());
            TLkKhClxxEntity tLkKhClxxEntity = new TLkKhClxxEntity();
            tLkKhClxxEntity.setId(UUID.randomUUID().toString());
            tLkKhClxxEntity.setItemClpp(ITEM_CLPP);
            tLkKhClxxEntity.setItemGcsj(dategcsj);
            tLkKhClxxEntity.setItemLcj(ITEM_LCJ);
            tLkKhClxxEntity.setItemYgje(ITEM_YGJE);
            tLkKhClxxEntity.setItemKhid(ITEM_KHID);
            tLkKhClxxEntity.setItemCph(ITEM_CPH);
            tLkKhClxxEntity.setItemCcsj(dateccsj);
            tLkKhClxxEntity.setItemClss(ITEM_CLSS);
            TlkKhClxxEntityDao tlkKhClxxEntityDao = new TlkKhClxxEntityDaoImpl();
            tlkKhClxxEntityDao.addfindCarByKhid(tLkKhClxxEntity);
            if (tLkKhClxxEntity != null) {
                map.put("code", 200);
                map.put("msg", "保存消息成功");
            } else {
                map.put("code", 400);
                map.put("msg", "保存消息失败");
            }
            ResponseUtil.response(response, gson.toJson(map));
        }

    }


    @RequestMapping("savehouse")
    public void savehouse(HttpServletRequest request,  HttpServletResponse response,
                          @RequestParam("ITEM_FCXZ") String ITEM_FCXZ,
                          @RequestParam("ITEM_YGJE") Double ITEM_YGJE,
                          @RequestParam("ITEM_JZLX") String ITEM_JZLX,
                          @RequestParam("ITEM_SZSFQQ") String ITEM_SZSFQQ,
                          @RequestParam("ITEM_GFSJ") String ITEM_GFSJ,
                          @RequestParam("ITEM_JZMJ") String ITEM_JZMJ,
                          @RequestParam("ITEM_SCDJ") Double ITEM_SCDJ,
                          @RequestParam("ITEM_KHID") String ITEM_KHID,
                          @RequestParam("ITEM_FCDZ") String ITEM_FCDZ
    ) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        if(ITEM_FCXZ==""||ITEM_YGJE==null||ITEM_JZLX==""||ITEM_SZSFQQ==""||ITEM_GFSJ==""
                ||ITEM_JZMJ==""||ITEM_SCDJ==null||ITEM_KHID==""||ITEM_FCDZ==""){
            System.out.println("传入的信息不完整！");
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = null;
            try {
                date = sdf.parse(ITEM_GFSJ);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date date1 = new java.sql.Date(date.getTime());
            TlkKhFcxxEntity tlkKhFcxxEntity = new TlkKhFcxxEntity();
            tlkKhFcxxEntity.setId(UUID.randomUUID().toString());
            tlkKhFcxxEntity.setItemFcxz(ITEM_FCXZ);
            tlkKhFcxxEntity.setItemGfsj(date1);
            tlkKhFcxxEntity.setItemJzlx(ITEM_JZLX);
            tlkKhFcxxEntity.setItemSzsfqq(ITEM_SZSFQQ);
            tlkKhFcxxEntity.setItemYgje(ITEM_YGJE);
            tlkKhFcxxEntity.setItemJzmj(ITEM_JZMJ);
            tlkKhFcxxEntity.setItemScdj(ITEM_SCDJ);
            tlkKhFcxxEntity.setItemKhid(ITEM_KHID);
            tlkKhFcxxEntity.setItemFcdz(ITEM_FCDZ);
            TlkKhFcxxEntityDao tlkKhFcxxEntityDao = new TlkKhFcxxEntityDaoImpl();
            tlkKhFcxxEntityDao.addHouseByKhid(tlkKhFcxxEntity);
            if (tlkKhFcxxEntity != null) {
                map.put("code", 200);
                map.put("msg", "保存消息成功");
            } else {
                map.put("code", 400);
                map.put("msg", "保存消息失败");
            }
            ResponseUtil.response(response, gson.toJson(map));
        }
    }

    @RequestMapping("saveshop")
    public void saveshop(HttpServletRequest request,  HttpServletResponse response,
                          @RequestParam("ITEM_SPDZ") String ITEM_SPDZ,
                          @RequestParam("ITEM_SPLC") String ITEM_SPLC,
                          @RequestParam("ITEM_SPXZ") String ITEM_SPXZ,
                          @RequestParam("ITEM_YGJE") Double ITEM_YGJE,
                          @RequestParam("ITEM_SPZJSY") Double ITEM_SPZJSY,
                          @RequestParam("ITEM_SPPGJZ") Double ITEM_SPPGJZ,
                          @RequestParam("ITEM_KHID") String ITEM_KHID
    ) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        if(ITEM_SPDZ==""||ITEM_SPLC==""||ITEM_SPXZ==""||ITEM_YGJE==null||ITEM_SPZJSY==null||ITEM_SPPGJZ==null
               ||ITEM_KHID==""){
            System.out.println("传入的信息不完整！");
        }else {
            TlkKhSpxxEntity tlkKhSpxxEntity = new TlkKhSpxxEntity();
            tlkKhSpxxEntity.setId(UUID.randomUUID().toString());
            tlkKhSpxxEntity.setItemSpdz(ITEM_SPDZ);
            tlkKhSpxxEntity.setItemSplc(ITEM_SPLC);
            tlkKhSpxxEntity.setItemSpxz(ITEM_SPXZ);
            tlkKhSpxxEntity.setItemYgje(ITEM_YGJE);
            tlkKhSpxxEntity.setItemSpzjsy(ITEM_SPZJSY);
            tlkKhSpxxEntity.setItemSppgjz(ITEM_SPPGJZ);
            tlkKhSpxxEntity.setItemKhid(ITEM_KHID);
            TlkKhSpxxEntityDao tlkKhSpxxEntityDao = new TlkKhSpxxEntityDaoImpl();
            tlkKhSpxxEntityDao.addShopByKhid(tlkKhSpxxEntity);
            if (tlkKhSpxxEntity != null) {
                map.put("code", 200);
                map.put("msg", "保存消息成功");
            } else {
                map.put("code", 400);
                map.put("msg", "保存消息失败");
            }
            ResponseUtil.response(response, gson.toJson(map));
        }
    }

    @RequestMapping("savegjj")
    public void savegjj(HttpServletRequest request,  HttpServletResponse response,
                         @RequestParam("ITEM_GJJJCKSSJ") String ITEM_GJJJCKSSJ,
                         @RequestParam("ITEM_GJJJCJSSJ") String ITEM_GJJJCJSSJ,
                         @RequestParam("ITEM_ZHZT") String ITEM_ZHZT,
                         @RequestParam("ITEM_BZ") String ITEM_BZ,
                         @RequestParam("ITEM_ZHYE") Double ITEM_ZHYE,
                         @RequestParam("ITEM_YJCJE") Double ITEM_YJCJE,
                         @RequestParam("ITEM_KHID") String ITEM_KHID
    ) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        if(ITEM_GJJJCKSSJ==""||ITEM_GJJJCJSSJ==""||ITEM_ZHZT==""||ITEM_BZ==""||ITEM_ZHYE==null||ITEM_YJCJE==null
                ||ITEM_KHID==""){
            System.out.println("传入的信息不完整！");
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date datec = null;
            java.util.Date datej = null;
            try {
                datec = sdf.parse(ITEM_GJJJCKSSJ);
                datej = sdf.parse(ITEM_GJJJCJSSJ);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date date1 = new java.sql.Date(datec.getTime());
            java.sql.Date date2 = new java.sql.Date(datej.getTime());
            TlkKhGjjxxEntity tlkKhGjjxxEntity = new TlkKhGjjxxEntity();
            tlkKhGjjxxEntity.setId(UUID.randomUUID().toString());
            tlkKhGjjxxEntity.setItemGjjjckssj(date1);
            tlkKhGjjxxEntity.setItemGjjjcjssj(date2);
            tlkKhGjjxxEntity.setItemZhzt(ITEM_ZHZT);
            tlkKhGjjxxEntity.setItemBz(ITEM_BZ);
            tlkKhGjjxxEntity.setItemZhye(ITEM_ZHYE);
            tlkKhGjjxxEntity.setItemYjcje(ITEM_YJCJE);
            tlkKhGjjxxEntity.setItemKhid(ITEM_KHID);
            TlkKhGjjxxEntityDao tlkKhGjjxxEntityDao = new TlkKhGjjxxEntityDaoImpl();
            tlkKhGjjxxEntityDao.addGjjByKhid(tlkKhGjjxxEntity);
            if (tlkKhGjjxxEntity != null) {
                map.put("code", 200);
                map.put("msg", "保存消息成功");
            } else {
                map.put("code", 400);
                map.put("msg", "保存消息失败");
            }
            ResponseUtil.response(response, gson.toJson(map));
        }
    }

    @RequestMapping("savecbxx")
    public void savecbxx(HttpServletRequest request,  HttpServletResponse response,
                        @RequestParam("ITEM_CBZL") String ITEM_CBZL,
                        @RequestParam("ITEM_SBBH") String ITEM_SBBH,
                        @RequestParam("ITEM_DWMC") String ITEM_DWMC,
                        @RequestParam("ITEM_RYSSQY") String ITEM_RYSSQY,
                        @RequestParam("ITEM_SFTX") String ITEM_SFTX,
                        @RequestParam("ITEM_CBKSSJ") String ITEM_CBKSSJ,
                         @RequestParam("ITEM_DQZT") String ITEM_DQZT,
                        @RequestParam("ITEM_KHID") String ITEM_KHID
    ) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        if(ITEM_CBZL==""||ITEM_SBBH==""||ITEM_DWMC==""||ITEM_RYSSQY==""||ITEM_SFTX==""||ITEM_CBKSSJ==""
                ||ITEM_DQZT=="" ||ITEM_KHID==""){
            System.out.println("传入的信息不完整！");
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date datec = null;
            try {
                datec = sdf.parse(ITEM_CBKSSJ);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date date1 = new java.sql.Date(datec.getTime());
            TLkKhCbxxEntity tLkKhCbxxEntity = new TLkKhCbxxEntity();
            tLkKhCbxxEntity.setId(UUID.randomUUID().toString());
            tLkKhCbxxEntity.setItemCbkssj(date1);
            tLkKhCbxxEntity.setItemCbzl(ITEM_CBZL);
            tLkKhCbxxEntity.setItemSsbh(ITEM_SBBH);
            tLkKhCbxxEntity.setItemDwmc(ITEM_DWMC);
            tLkKhCbxxEntity.setItemRyssqy(ITEM_RYSSQY);
            tLkKhCbxxEntity.setItemSftx(ITEM_SFTX);
            tLkKhCbxxEntity.setItemDqzt(ITEM_DQZT);
            tLkKhCbxxEntity.setItemKhid(ITEM_KHID);
            TLkKhCbxxEntityDao tlkKhCbxxEntityDao = new TLkKhCbxxEntityDaoImpl();
            tlkKhCbxxEntityDao.addCbxxByKhid(tLkKhCbxxEntity);
            if (tLkKhCbxxEntity != null) {
                map.put("code", 200);
                map.put("msg", "保存消息成功");
            } else {
                map.put("code", 400);
                map.put("msg", "保存消息失败");
            }
            ResponseUtil.response(response, gson.toJson(map));
        }
    }

    @RequestMapping("savegsxx")
    public void savegsxx(HttpServletRequest request,  HttpServletResponse response,
                         @RequestParam("ITEM_DWMC") String ITEM_DWMC,
                         @RequestParam("ITEM_JYCS") String ITEM_JYCS,
                         @RequestParam("ITEM_DWDZ") String ITEM_DWDZ,
                         @RequestParam("ITEM_DWXZ") String ITEM_DWXZ,
                         @RequestParam("ITEM_DWDH") String ITEM_DWDH,
                         @RequestParam("ITEM_JYMS") String ITEM_JYMS,
                         @RequestParam("ITEM_CLSJ") String ITEM_CLSJ,
                         @RequestParam("ITEM_ZW") String ITEM_ZW,
                         @RequestParam("ITEM_NYYE") Double ITEM_NYYE,
                         @RequestParam("ITEM_YSZK") Double ITEM_YSZK,
                         @RequestParam("ITEM_FZQK") Double ITEM_FZQK,
                         @RequestParam("ITEM_CHJZ") Double ITEM_CHJZ,
                         @RequestParam("ITEM_KHID") String ITEM_KHID,
                         @RequestParam("ITEM_YWYYZZ") String ITEM_YWYYZZ
    ) throws ServletException, IOException, ParseException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        if(ITEM_DWMC==""||ITEM_JYCS==""||ITEM_DWDZ==""||ITEM_DWXZ==""||ITEM_DWDH==""||ITEM_JYMS==""
                ||ITEM_CLSJ==""||ITEM_ZW==""||ITEM_NYYE==null||ITEM_YSZK==null||ITEM_FZQK==null||ITEM_CHJZ==null ||ITEM_KHID==""||ITEM_YWYYZZ==""){
            System.out.println("传入的信息不完整！");
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date datec = null;
            try {
                datec = sdf.parse(ITEM_CLSJ);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date date1 = new java.sql.Date(datec.getTime());
            TlkKhGsxxEntity tlkKhGsxxEntity = new TlkKhGsxxEntity();
            tlkKhGsxxEntity.setId(UUID.randomUUID().toString());
            tlkKhGsxxEntity.setItemClsj(date1);
            tlkKhGsxxEntity.setItemJycs(ITEM_JYCS);
            tlkKhGsxxEntity.setItemDwdz(ITEM_DWDZ);
            tlkKhGsxxEntity.setItemDwmc(ITEM_DWMC);
            tlkKhGsxxEntity.setItemDwxz(ITEM_DWXZ);
            tlkKhGsxxEntity.setItemDwdh(ITEM_DWDH);
            tlkKhGsxxEntity.setItemJyms(ITEM_JYMS);
            tlkKhGsxxEntity.setItemZw(ITEM_ZW);
            tlkKhGsxxEntity.setItemChjz(ITEM_CHJZ);
            tlkKhGsxxEntity.setItemNyye(ITEM_NYYE);
            tlkKhGsxxEntity.setItemYszk(ITEM_YSZK);
            tlkKhGsxxEntity.setItemFzqk(ITEM_FZQK);
            tlkKhGsxxEntity.setItemKhid(ITEM_KHID);
            tlkKhGsxxEntity.setItemYwyyzz(ITEM_YWYYZZ);
            TlkKhGsxxEntityDao tlkKhGsxxEntityDao = new TlkKhGsxxEntityDaoImpl();
            tlkKhGsxxEntityDao.addGsxxByKhid(tlkKhGsxxEntity);
            if (tlkKhGsxxEntity != null) {
                map.put("code", 200);
                map.put("msg", "保存消息成功");
            } else {
                map.put("code", 400);
                map.put("msg", "保存消息失败");
            }
            ResponseUtil.response(response, gson.toJson(map));
        }
    }

    @RequestMapping("query")
    public String query(HttpServletRequest request){
       return "newzcxx";
    }

}

