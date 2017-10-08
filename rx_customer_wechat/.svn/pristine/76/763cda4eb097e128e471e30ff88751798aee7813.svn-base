package com.cxt.wechat.dataAnalysis;

import com.cxt.wechat.util.HttpUtil;

import java.io.IOException;

/**
 * 数据统计
 * Created by cccxt on 2016/7/6.
 */
public class DataAnalysisImpl implements DataAnalysis {
    HttpUtil httpUtil = new HttpUtil();

    public String getAnalysisData(String uri, String access_token, String begin_date, String end_date) {
        try {
            return httpUtil.getHttpsPost(uri.replace("ACCESS_TOKEN", access_token), "{ \"begin_date\": \"" + begin_date + "\",\"end_date\": \"" + end_date + "\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
