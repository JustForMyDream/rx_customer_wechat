package com.rx.webApplication.util.enterpriseWechat;

import com.cxt.wechat.util.HttpUtil;
import com.google.gson.Gson;

import java.io.IOException;

public  class  EnterpriseMessageImpl extends HttpUtil implements EnterpriseMessage {

    Gson gson = new Gson();

    @Override
    public String send(EnterpriseMessageTemplate enterpriseMessageTemplate, String access_token) {

        try {
            return getHttpsPost(setACCESS_TOKEN(SEND,access_token),gson.toJson(enterpriseMessageTemplate));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String setACCESS_TOKEN(String uri, String access_token) {
        return uri.replace("ACCESS_TOKEN", access_token);
    }
}
