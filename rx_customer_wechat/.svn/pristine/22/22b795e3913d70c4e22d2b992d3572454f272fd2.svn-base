package com.cxt.wechat.util;

/**
 *
 *
 * Created by cccxt on 2016/7/31.
 */
public class SignUtil {
    public static String jssdkSign(String jsapi_ticket,String noncestr,String timestamp,String url){
        String o = "jsapi_ticket=JSAPI_TICKET&noncestr=NONCESTR&timestamp=TIMESTAMP&url=URL";
        return StringUtil.getSha1(o.replace("URL",url).replace("TIMESTAMP",timestamp).replace("NONCESTR",noncestr).replace("JSAPI_TICKET",jsapi_ticket),"utf-8");
    }
}
