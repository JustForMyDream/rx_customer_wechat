package com.cxt.wechat.usermanage.user;

import com.cxt.wechat.entity.WechatUser;
import com.cxt.wechat.util.HttpUtil;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

/**
 * 用户管理接口
 * Created by cccxt on 2016/7/6.
 */
public class UserImpl implements UserInterface {

    HttpUtil httpUtil = new HttpUtil();
    Gson gson = new Gson();

    public String USERINFO_updateremark(String access_token, String openid, String remark) {
        try {
            return httpUtil.getHttpsPost(userinfo_updateremark.replace("ACCESS_TOKEN", access_token), "{\"openid\":\"" + openid + "\",\"remark\":\"" + remark + "\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String USER_info(String access_token, String openid, String lang) {
        try {
            return httpUtil.getHttpsGet(user_info.replace("ACCESS_TOKEN", access_token).replace("zh_CN", lang).replace("OPENID", openid));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String USER_info(String access_token, String openid) {
        return USER_info(access_token, openid, "zh_CN");
    }

    public String USER_info_batchget(String access_token, List<WechatUser> users) {
        try {
            return httpUtil.getHttpsPost(user_info_batchget.replace("ACCESS_TOKEN", access_token), "{\"user_list\": [" + gson.toJson(users) + "]}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String USER_get(String access_token, String next_openid) {
        if (next_openid == null) next_openid = "";
        try {
            return httpUtil.getHttpsGet(user_get.replace("ACCESS_TOKEN", access_token).replace("NEXT_OPENID", next_openid));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String USER_get(String access_token) {
        return USER_get(access_token, "");
    }
}
