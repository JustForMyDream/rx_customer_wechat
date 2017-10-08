package com.cxt.wechat.pay.transfers.entity;

/**
 * 用户校验类型
 * Created by cccxt on 2016/7/26.
 */
public enum Check_Name_Type {
    NO_CHECK("NO_CHECK"),FORCE_CHECK("FORCE_CHECK"),OPTION_CHECK("OPTION_CHECK");
    private String type;

    private Check_Name_Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
