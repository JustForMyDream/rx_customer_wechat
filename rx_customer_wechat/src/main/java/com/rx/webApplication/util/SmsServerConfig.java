package com.rx.webApplication.util;

/**
 * Created by 王玉粮 on 2017/6/29.
 */
public interface SmsServerConfig {
    final String product = "Dysmsapi";//短信API产品名称
    final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名
    //替换成你的AK
    final String accessKeyId = "LTAInD1zfGH8OY7B";//你的accessKeyId,参考本文档步骤2
    final String accessKeySecret = "ledfRtp2v4CEy7bb66UffunC7epdTt";//你的accessKeySecret，参考本文档步骤2
}
