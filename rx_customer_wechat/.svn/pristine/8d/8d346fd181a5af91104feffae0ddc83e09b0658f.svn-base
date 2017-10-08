package com.cxt.wechat.entity.qrcode;

/**
 * 获取二维码请求实体
 * Created by cccxt on 2016/9/10.
 */
public class Qrcode {
    /**
     * 该二维码有效时间，以秒为单位。 最大不超过2592000（即30天），此字段如果不填，则默认有效期为30秒。
     */
    private int expire_seconds;

    /**
     * 二维码类型，QR_SCENE为临时,QR_LIMIT_SCENE为永久,QR_LIMIT_STR_SCENE为永久的字符串参数值
     */
    private Action_name action_name;

    /**
     * 二维码详细信息
     */
    private Action_info action_info;

    public Qrcode() {
    }

    public Qrcode(int expire_seconds, Action_name action_name, Action_info action_info) {
        this.expire_seconds = expire_seconds;
        this.action_name = action_name;
        this.action_info = action_info;
    }

    public Qrcode(Action_name action_name, Action_info action_info) {
        this.action_name = action_name;
        this.action_info = action_info;
    }

    public int getExpire_seconds() {
        return expire_seconds;
    }

    public void setExpire_seconds(int expire_seconds) {
        this.expire_seconds = expire_seconds;
    }

    public Action_name getAction_name() {
        return action_name;
    }

    public void setAction_name(Action_name action_name) {
        this.action_name = action_name;
    }

    public Action_info getAction_info() {
        return action_info;
    }

    public void setAction_info(Action_info action_info) {
        this.action_info = action_info;
    }
}
