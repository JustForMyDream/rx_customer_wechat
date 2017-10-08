package com.cxt.wechat.pay.unifiedorder.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * Created by cccxt on 2016/4/5.
 */
public class StringUtil {
    /**
     * 生成sha1字符串
     *
     * @param o
     * @param enchod
     * @return
     */
    public String getSha1(String o, String enchod) {
        String result = null;
        byte[] bytes = null;
        bytes = getEncodeByte(o, enchod);
        result = DigestUtils.sha1Hex(bytes);
        return result;
    }

    /**
     * 生成MD5字符串
     *
     * @param o
     * @param enchod
     * @return
     */
    public String getMD5(String o, String enchod) {
        String result = null;
        byte[] bytes = null;
        bytes = getEncodeByte(o, enchod);
        result = DigestUtils.md5Hex(bytes);
        return result;
    }

    /**
     * 获取随机字符串
     *
     * @param length
     * @return
     */
    public String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; ++i) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 获取编码字节
     *
     * @param o
     * @param enchod
     * @return
     */
    public byte[] getEncodeByte(String o, String enchod) {
        byte[] bytes = null;
        if (enchod == null) {
            bytes = o.getBytes();
        } else {
            try {
                bytes = o.getBytes(enchod);
            } catch (UnsupportedEncodingException e) {
                bytes = o.getBytes();
            }
        }
        return bytes;
    }
}
