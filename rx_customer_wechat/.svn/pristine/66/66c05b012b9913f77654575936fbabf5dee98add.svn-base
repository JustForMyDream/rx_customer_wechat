package com.cxt.wechat.qrcode;

import com.cxt.wechat.entity.qrcode.Qrcode;
import com.cxt.wechat.util.HttpUtil;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by cccxt on 2016/9/10.
 */
public class QrcodeImpl extends HttpUtil implements Qrcode_Interface {
    Gson gson = new Gson();

    public String create(Qrcode qrcode, String ACCESS_TOKEN) {
        try {
            return getHttpsPost(CREATE.replace("ACCESS_TOKEN", ACCESS_TOKEN), gson.toJson(qrcode));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] showqrcode(String TICKET) {
        try {
            return getHttpsGet_byte(SHOWQRCPDE.replace("TICKET", TICKET));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
