package com.cxt.wechat.pay.unifiedorder.business.impl;


import com.cxt.wechat.pay.unifiedorder.Entity.Orderquery;
import com.cxt.wechat.pay.unifiedorder.Entity.UnifiedorderRequestEntity;
import com.cxt.wechat.pay.unifiedorder.Entity.UnifiedorderResponseEntity;
import com.cxt.wechat.pay.unifiedorder.business.PayInterface;
import com.cxt.wechat.pay.unifiedorder.util.WeChatSingUtil;
import com.cxt.wechat.util.HttpUtil;
import com.cxt.wechat.util.WechatXmlUtil;
import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Map;

/**
 *
 * Created by cccxt on 2016/4/5.
 */
public class PayImpl extends HttpUtil implements PayInterface {
    Log log = LogFactory.getLog("WECHATPAY");

    WeChatSingUtil weChatSingUtil = new WeChatSingUtil();
    Gson gson = new Gson();

    private final String UNIFIEDURI = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    private final String ORDERQUERY = "https://api.mch.weixin.qq.com/pay/orderquery";

    //统一下单
    public UnifiedorderRequestEntity unifiedorder(UnifiedorderRequestEntity unifiedorderRequestEntity, String key) {
        String queryString = new WechatXmlUtil().createDefaultXstream().simpleObjestToCDATAXml(unifiedorderRequestEntity);
        UnifiedorderRequestEntity unifiedorderRequestEntity1 = new UnifiedorderRequestEntity();
        try {
            String resultString = getHttpsPost(UNIFIEDURI, queryString);
            Map<String, String> map = new WechatXmlUtil().createDefaultXstream().parseXml(resultString);
            if(map!=null)  unifiedorderRequestEntity1.setResultFromReturnMap(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unifiedorderRequestEntity1;
    }

    public Orderquery orderQueryBy_Transaction_id(Orderquery orderquery, String key) {
        String queryString = new WechatXmlUtil().createDefaultXstream().simpleObjestToCDATAXml(orderquery);
        try {
            String resultString = getHttpsPost(ORDERQUERY, queryString);
            Map<String, String> map = new WechatXmlUtil().createDefaultXstream().parseXml(resultString);
            String orderQueryStr = gson.toJson(map);
            return gson.fromJson(orderQueryStr,Orderquery.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
