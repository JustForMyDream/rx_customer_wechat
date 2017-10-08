package com.cxt.wechat.entity;

/**微信接口基本返回信息
 *
 * Created by cccxt on 2016/7/5.
 */
public class BaseResult {
    //返回码
    private String errcode;
    //返回接口信息
    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
