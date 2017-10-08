package com.rx.webApplication.entities.bean;

/**
 * Created by 王玉粮 on 2017/6/28.
 */
public  class AccessTokenEntity {
    private String access_token;
    private String expires_in;
    private String refresh_token;
    private String openid;
    private String scope;
    private String errcode;
    private String errmsg;
    private String hints;
    /**
     * 设置为单列模式保证内存自存在一个
     */
    private static AccessTokenEntity accessTokenEntity = new AccessTokenEntity();
    private AccessTokenEntity(){}
    public static  AccessTokenEntity getAccessTokenEntity(){
        return accessTokenEntity;
    }

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

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
