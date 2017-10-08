package com.cxt.wechat.menu;

import com.cxt.wechat.entity.BaseResult;
import com.cxt.wechat.menu.entity.buttons.MenuConditional;
import com.cxt.wechat.menu.entity.buttons.MenuEntity;
import com.cxt.wechat.util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

/**
 * 菜单接口实现
 * Created by cccxt on 2016/7/5.
 */
public class Menuimpl implements MenuInterface {

    HttpUtil httpUtil = new HttpUtil();
    Gson gson = new Gson();
    GsonBuilder gsonBuilder = new GsonBuilder();

    public String create(String access_token, MenuEntity menu) {
        return create(access_token, gsonBuilder.disableHtmlEscaping().create().toJson(menu));
    }

    public String create(String access_token, String menu) {
        try {
            return httpUtil.getHttpsPost(createInterface.replace("ACCESS_TOKEN", access_token), menu);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String get(String access_token) {
        try {
            return httpUtil.getHttpsGet(getInterface.replace("ACCESS_TOKEN", access_token));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String delete(String access_token) {
        try {
            return httpUtil.getHttpsGet(deleteInterface.replace("ACCESS_TOKEN", access_token));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String addconditional(String access_token, MenuConditional menuConditional) {
        return addconditional(access_token,gson.toJson(menuConditional));
    }

    public String addconditional(String access_token, String menuConditional) {
        try {
            return httpUtil.getHttpsPost(addconditionalInterface.replace("ACCESS_TOKEN", access_token),menuConditional);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String delconditional(String access_token, String menuid) {
        try {
            return httpUtil.getHttpsPost(delconditionalInterface.replace("ACCESS_TOKEN", access_token),"{\"menuid\":\""+menuid+"\"}");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String trymatch(String access_token, String user_id) {
        try {
            return httpUtil.getHttpsPost(trymatchInterface.replace("ACCESS_TOKEN", access_token),"{\"user_id\":\""+user_id+"\"}");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String get_current_selfmenu_info(String access_token) {
        try {
            return httpUtil.getHttpsGet(get_current_selfmenu_infoInterface.replace("ACCESS_TOKEN", access_token));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
