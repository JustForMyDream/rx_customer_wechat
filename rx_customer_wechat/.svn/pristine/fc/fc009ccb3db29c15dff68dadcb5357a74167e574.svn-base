package com.cxt.wechat.util;

/**
 * 接入验证
 * Created by cccxt on 2016/7/4.
 */
public class AccessCheck {
    /**
     * 服务器配置接入
     *
     * @param signature 编码后的签名
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @param token     服务器配置的签名
     * @return 验证结果（true=成功； false=失败）
     */
    public static boolean ServiceAccessCheck(String signature, String timestamp, String nonce, String token) {
        String sha1String = StringUtil.getSha1(nonce + timestamp + token, "utf-8");
        return sha1String.equals(signature);
    }


}
