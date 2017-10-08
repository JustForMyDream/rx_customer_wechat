package com.cxt.wechat.Template;

import com.cxt.wechat.entity.WechatIndustry.IndustryMessage;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateEntity;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateEntity_List;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateMessage;
import com.cxt.wechat.util.HttpUtil;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * Created by cccxt on 2016/3/31.
 */
public class TemplateMessageBussinessImpl extends HttpUtil implements TemplateMessageBussiness {
    Gson gson = new Gson();


    public String getTemplate_id(String template_id_short, String access_token) {
        try {
            return getHttpsPost(setACCESS_TOKEN(API_ADD_TEMPLATE, access_token), template_id_short);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String api_set_industry(String industry_id1, String industry_id2, String access_token) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("industry_id1", industry_id1);
        map.put("industry_id2", industry_id2);
        try {
            return getHttpsPost(setACCESS_TOKEN(API_SET_INDUSTRY, access_token), gson.toJson(map));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String STRING_get_industry(String access_token) {
        try {
            return getHttpsGet(setACCESS_TOKEN(GET_INDUSTRY, access_token));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public IndustryMessage get_industry(String access_token) {
        String s = STRING_get_industry(access_token);
        if (s != null) return gson.fromJson(s, IndustryMessage.class);
        return null;
    }

    public String STRING_get_all_private_template(String access_token) {
        try {
            return getHttpsGet(setACCESS_TOKEN(GET_ALL_PRIVATE_TEMPLATE, access_token));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WechatTemplateEntity_List get_all_private_template(String access_token) {
        String s = STRING_get_all_private_template(access_token);
        if(s!=null) return gson.fromJson(s, WechatTemplateEntity_List.class);
        return null;
    }

    public String del_private_template(String template_id, String access_token) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("template_id", template_id);
        try {
            return getHttpsPost(setACCESS_TOKEN(DEL_PRIVATE_TEMLATE, access_token), gson.toJson(map));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String send(WechatTemplateMessage wechatTemplateMessage, String access_token) {
        try {
            return getHttpsPost(setACCESS_TOKEN(SEND, access_token), gson.toJson(wechatTemplateMessage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String setACCESS_TOKEN(String uri, String access_token) {
        return uri.replace("ACCESS_TOKEN", access_token);
    }
}
