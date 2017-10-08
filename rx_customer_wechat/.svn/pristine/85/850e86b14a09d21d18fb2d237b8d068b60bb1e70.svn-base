package com.cxt.wechat.token;

import com.cxt.wechat.util.HttpUtil;

import java.io.IOException;

/**
 * 获取accesstoken 和 ip列表
 * Created by cccxt on 2016/7/11.
 */
public class Token {
    HttpUtil httpUtil = new HttpUtil();
    final String get = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    final String getIps = "https://api.weixin.qq.com/cgi-bin/getcallbackip?access_token=ACCESS_TOKEN";
    final String getJsTicket = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";

    /**
     * 获取accesstoken
     * @param APPID 公众号id
     * @param APPSECRET 秘钥
     * @return 调用结果
     */
    public String getAccessToken(String APPID, String APPSECRET) {
        try {
            return httpUtil.getHttpsGet(get.replace("APPID", APPID).replace("APPSECRET", APPSECRET));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取微信服务器列表
     * @param ACCESS_TOKEN 调用凭证
     * @return 结果
     */
    public String getcallbackip(String ACCESS_TOKEN) {
        try {
            return httpUtil.getHttpsGet(getIps.replace("ACCESS_TOKEN", ACCESS_TOKEN));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getticket(String ACCESS_TOKEN){
        try {
            return httpUtil.getHttpsGet(getJsTicket.replace("ACCESS_TOKEN", ACCESS_TOKEN));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
