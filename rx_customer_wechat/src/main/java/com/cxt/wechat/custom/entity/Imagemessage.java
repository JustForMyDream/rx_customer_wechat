package com.cxt.wechat.custom.entity;

/**
 * Created by 审判之月 on 2016/12/29.
 */
public class Imagemessage {
    private String touser;
    private String msgtype="image";
    private Image image;

    public Imagemessage(String touser, String msgtype, Image image) {
        this.touser = touser;
        this.msgtype = msgtype;
        this.image = image;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
