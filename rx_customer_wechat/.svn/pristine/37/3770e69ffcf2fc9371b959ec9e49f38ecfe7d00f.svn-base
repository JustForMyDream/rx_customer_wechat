package com.cxt.wechat.pay.refund;

import com.cxt.wechat.pay.refund.Entity.RefundEntity;
import com.cxt.wechat.pay.unifiedorder.Entity.Refundquery;
import com.cxt.wechat.util.HttpUtil;
import com.cxt.wechat.util.WechatXmlUtil;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by 王干 on 2016/8/5.\
 *退款工具类
 */
public class RefundUtil extends HttpUtil {
    Gson gson = new Gson();
    public RefundEntity Refound(RefundEntity refundEntity,File file,String password){
        final String REFOUNF = "https://api.mch.weixin.qq.com/secapi/pay/refund";
        String re = new WechatXmlUtil().createDefaultXstream().simpleObjestToCDATAXml(refundEntity);
        try {
            String getresult  = getHttpsPostCustom_package12(REFOUNF,re,file,password);
            Map<String, String> map = new WechatXmlUtil().createDefaultXstream().parseXml(getresult);
            String jsonstr = gson.toJson(map);
            RefundEntity refundEntity1 = gson.fromJson(jsonstr,RefundEntity.class);
            return refundEntity1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Refundquery  CxRefound(Refundquery refundquery){
        final String CXREFOUND = "https://api.mch.weixin.qq.com/pay/refundquery";
        String re = new WechatXmlUtil().createDefaultXstream().simpleObjestToCDATAXml(refundquery);
        try {
            String getresult  = getHttpsPost(CXREFOUND,re);
            String jsonstr = gson.toJson(getresult);
            Refundquery refundquery1 = gson.fromJson(jsonstr,Refundquery.class);
            return refundquery1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
