package com.rx.webApplication.entities;

/**
 * Created by 王玉粮 on 2017/6/23.
 */
public class TlkWechatUserEntity {
    private String id;
    private String itemOpenid;
    private String itemPhone;
    private boolean itemIsfirst;
    private String itemKhid;
    private String itemReference;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemOpenid() {
        return itemOpenid;
    }

    public void setItemOpenid(String itemOpenid) {
        this.itemOpenid = itemOpenid;
    }

    public String getItemPhone() {
        return itemPhone;
    }

    public void setItemPhone(String itemPhone) {
        this.itemPhone = itemPhone;
    }

    public boolean isItemIsfirst() {
        return itemIsfirst;
    }

    public void setItemIsfirst(boolean itemIsfirst) {
        this.itemIsfirst = itemIsfirst;
    }

    public String getItemKhid() {
        return itemKhid;
    }

    public void setItemKhid(String itemKhid) {
        this.itemKhid = itemKhid;
    }

    public String getItemReference() {
        return itemReference;
    }

    public void setItemReference(String itemReference) {
        this.itemReference = itemReference;
    }
}
