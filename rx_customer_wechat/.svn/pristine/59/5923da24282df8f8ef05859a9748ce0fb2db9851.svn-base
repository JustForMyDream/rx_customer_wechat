package com.cxt.wechat.usermanage.tag;

import com.cxt.wechat.util.HttpUtil;

import java.io.IOException;

/** 用户标签管理接口实现
 * Created by cccxt on 2016/7/5.
 */
public class UserTagImpl implements UserTagInterface {
    HttpUtil httpUtil = new HttpUtil();
    public String TAGS_create(String access_token, String name) {
        try {
            return httpUtil.getHttpsPost(tags_create.replace("ACCESS_TOKEN",access_token),"{\"tag\" : {\"name\" : \""+name+"}}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String TAGS_get(String access_token) {
        try {
            return httpUtil.getHttpsGet(tags_create.replace("ACCESS_TOKEN",access_token));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String TAGS_update(String access_token, String id, String name) {
        try {
            return httpUtil.getHttpsPost(tags_update.replace("ACCESS_TOKEN",access_token),"{\"tag\" : {\"id\" : \""+id+",\"name\" : \""+name+"}}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String TAGS_delete(String access_token, String id) {
        try {
            return httpUtil.getHttpsPost(tags_delete.replace("ACCESS_TOKEN",access_token),"{\"tag\" : {\"id\" : \""+id+"}}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String TAG_get(String access_token, String tagid, String next_openid) {
        try {
            return httpUtil.getHttpsPost(tag_get.replace("ACCESS_TOKEN",access_token),"{\"tagid\" : \""+tagid+"\",\"next_openid\" : \""+next_openid+"\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
