package com.rx.webApplication.util;

/**
 * Created by 王玉粮 on 2017/6/27.
 */
public class WeChatConfig {
    private static final String AppId = "";
    private static final String AppSecret = "";
    private static String access_token = "";
    private static String expires_in = "";

    public static String getAppId() {
        return AppId;
    }

    public static String getAppSecret() {
        return AppSecret;
    }

    public static String getAccess_token() {
        return access_token;
    }

    public static void setAccess_token(String access_token) {
        WeChatConfig.access_token = access_token;
    }

    public static String getExpires_in() {
        return expires_in;
    }

    public static void setExpires_in(String expires_in) {
        WeChatConfig.expires_in = expires_in;
    }
}
