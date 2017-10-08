package com.cxt.wechat.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**字符串工具类
 * Created by cccxt on 2016/7/4.
 */
public class StringUtil {
    /**
     * 生成sha1字符串
     *
     * @param o 原字符串
     * @param enchod 编码格式
     * @return sha1加密后的字符串
     */
    public static String getSha1(String o, String enchod) {
        String result;
        byte[] bytes;
        bytes = getEncodeByte(o, enchod);
        result = DigestUtils.sha1Hex(bytes);
        return result;
    }

    /**
     * 生成MD5字符串
     *
     * @param o 原3字符串
     * @param enchod 编码格式
     * @return md5加密后的字符串
     */
    public static String getMD5(String o, String enchod) {
        String result;
        byte[] bytes;
        bytes = getEncodeByte(o, enchod);
        result = DigestUtils.md5Hex(bytes);
        return result;
    }

    /**
     * 获取随机字符串
     *
     * @param length 所需生成字符串长度
     * @return 生成的字符串
     */
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 获取编码后的字节
     *
     * @param o 原字符串
     * @param enchod 编码格式
     * @return 生成的字节数组
     */
    public static byte[] getEncodeByte(String o, String enchod) {
        byte[] bytes;
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
