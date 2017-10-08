package com.cxt.wechat.oauth2;

import com.cxt.wechat.util.HttpUtil;

import java.io.IOException;

/**
 * 用户网页登录
 * Created by cccxt on 2016/7/17.
 */
public class Oauth2 {

    private static Oauth2 oauth2 = new Oauth2();
    private Oauth2(){}
    public static Oauth2 getOauth2(){
        return  oauth2;
    }

    HttpUtil httpUtil = new HttpUtil();
    final String GetUserAccessToken = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    final String Refresh_Token = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=APPID&grant_type=refresh_token&refresh_token=REFRESH_TOKEN";
    final String USERINFO ="https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    public String access_token(String APPID,String SECRET,String CODE){
        try {
            return httpUtil.getHttpsGet(GetUserAccessToken.replace("APPID", APPID).replace("SECRET", SECRET).replace("CODE",CODE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String refresh_token(String APPID,String REFRESH_TOKEN){
        try {
            return httpUtil.getHttpsGet(Refresh_Token.replace("APPID", APPID).replace("REFRESH_TOKEN", REFRESH_TOKEN));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String userinfo(String ACCESS_TOKEN,String OPENID){
        try {
            return httpUtil.getHttpsGet(USERINFO.replace("ACCESS_TOKEN", ACCESS_TOKEN).replace("OPENID", OPENID));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
