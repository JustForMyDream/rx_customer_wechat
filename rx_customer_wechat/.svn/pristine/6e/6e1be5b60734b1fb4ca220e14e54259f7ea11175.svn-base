package com.cxt.wechat.pay.transfers;

import com.cxt.wechat.pay.transfers.entity.TransferinfoReq;
import com.cxt.wechat.pay.transfers.entity.Transform;
import com.cxt.wechat.util.HttpUtil;
import com.cxt.wechat.util.StringUtil;
import com.cxt.wechat.util.WechatXmlUtil;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by 王干 on 2016/8/4.
 * 付款给摄影师工具类
 */
public class TransformPay extends HttpUtil {
    Gson gson  = new Gson();

    /**
     * 微信企业付款支付
     * @param transform
     * @param file
     * @param password
     * @return
     */
    public Transform Refound(Transform transform, File file, String password){
        final String TRANS = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";
        String re = new WechatXmlUtil().createDefaultXstream().simpleObjestToCDATAXml(transform);
        try {
            String getresult  = getHttpsPostCustom_package12(TRANS,re,file,password);
            Map<String, String> map = new WechatXmlUtil().createDefaultXstream().parseXml(getresult);
            String jsonstr = gson.toJson(map);
            Transform transform1 = gson.fromJson(jsonstr,Transform.class);
            return transform1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询微信企业付款结果
     * @param nonce_str
     * @param partner_trade_no
     * @param mch_id
     * @param appid
     * @param file
     * @param password
     * @return
     */
    public Map<String,String> gettransferinfo(String nonce_str,String partner_trade_no,String mch_id,String appid,String key,File file,String password){
        String TRANSFERINFO = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gettransferinfo";
        String s= "appid="+appid+"&mch_id="+mch_id+"&nonce_str="+nonce_str+"&partner_trade_no="+partner_trade_no+"&key="+key;
        String sing = StringUtil.getMD5(s,"utf-8").toUpperCase();
        TransferinfoReq transferinfoReq = new TransferinfoReq(sing,partner_trade_no,mch_id,appid,nonce_str);
        String re = new WechatXmlUtil().createDefaultXstream().simpleObjestToCDATAXml(transferinfoReq);
        Map<String, String> map = null;
        try {
            String getresult  = getHttpsPostCustom_package12(TRANSFERINFO,re,file,password);
            map = new WechatXmlUtil().createDefaultXstream().parseXml(getresult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
