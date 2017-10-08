package com.rx.webApplication.util.enterpriseWechat;

public interface EnterpriseMessage {

    /**
     * 企业微信发送模板路径
     */
    String SEND = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN";


    public String send(EnterpriseMessageTemplate enterpriseMessageTemplate,String access_token);

}
