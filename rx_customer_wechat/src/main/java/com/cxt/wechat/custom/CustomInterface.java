package com.cxt.wechat.custom;

import com.cxt.wechat.custom.entity.Imagemessage;
import com.cxt.wechat.custom.entity.Text;
import com.cxt.wechat.custom.entity.Textmessage;
import com.cxt.wechat.util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

/**
 * Created by cccxt on 2016/10/11.
 */
public class CustomInterface extends HttpUtil {
    String SEND = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
    Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    public String send(String ACCESS_TOKEN,String touser,String text){
        Textmessage textmessage = new Textmessage();
        textmessage.setMsgtype("text");
        textmessage.setTouser(touser);
        textmessage.setText(new Text(text));
        try {
            return getHttpsPost(SEND.replace("ACCESS_TOKEN",ACCESS_TOKEN),gson.toJson(textmessage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String send(String ACCESS_TOKEN,Imagemessage object) {
        try {
            return getHttpsPost(SEND.replace("ACCESS_TOKEN", ACCESS_TOKEN), gson.toJson(object));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String send(String ACCESS_TOKEN,Object object){
        try {
            return getHttpsPost(SEND.replace("ACCESS_TOKEN",ACCESS_TOKEN),gson.toJson(object));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
