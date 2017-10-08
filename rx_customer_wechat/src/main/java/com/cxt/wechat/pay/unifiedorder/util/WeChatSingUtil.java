package com.cxt.wechat.pay.unifiedorder.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by cccxt on 2016/4/5.
 */
public class WeChatSingUtil extends StringUtil {


    /**
     * 验证sha1签名
     * @param o
     * @param str
     * @return
     */
    public boolean checkSha1(Object o,String key,String str){
        String  stringSignTemp=getStringSignTemp(o, key);
        if (getSha1(stringSignTemp,"utf-8").toUpperCase().equals(str))
        {
            return true;
        }
        return false;
    }

    /**
     * 验证sha1签名
     * @param map
     * @param str
     * @return
     */
    public boolean checkSha1(Map<String,String> map,String key,String str){
        String  stringSignTemp=getStringSignTemp(map, key);
        if (getSha1(stringSignTemp,"utf-8").toUpperCase().equals(str))
        {
            return true;
        }
        return false;
    }
    /**
     * 验证md5签名
     * @param o
     * @param str
     * @return
     */
    public boolean checkMD5(Object o,String key,String str){
        String  stringSignTemp=getStringSignTemp(o, key);
        if (getMD5(stringSignTemp,"utf-8").toUpperCase().equals(str))
        {
            return true;
        }
        return false;
    }

    /**
     * 验证md5签名
     * @param map
     * @param str
     * @return
     */
    public boolean checkMD5(Map<String,String> map,String key,String str){
        String  stringSignTemp=getStringSignTemp(map, key);
        if (getMD5(stringSignTemp,"utf-8").toUpperCase().equals(str))
        {
            return true;
        }
        return false;
    }

    /**
     * 拼接生成字符串
     * @param o 简单对象
     * @return
     */
    public String getStringSignTemp(Object o,String key){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();
        Class cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            try {
                if (f.get(o) != null && f.get(o) != "") {
                    list.add(f.getName() + "=" + f.get(o) + "&");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        Integer size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        return result;
    }

    /**
     * 拼接生成字符串
     * @param map map对象
     * @param key
     * @return
     */
    public String getStringSignTemp(Map<String,String> map, String key){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry.getKey() + "=" + entry.getValue() + "&");
        }
        Integer size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        return result;
    }

}
