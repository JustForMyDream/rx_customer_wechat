package com.cxt.wechat.dataAnalysis;

/**
 * 数据统计接口类
 * Created by cccxt on 2016/7/6.
 */
public interface DataAnalysis {
    /**
     * 数据统计查询接口
     *
     * @param uri          接口路径
     * @param access_token 调用凭证
     * @param begin_date   获取数据的起始日期，begin_date和end_date的差值需小于“最大时间跨度”（比如最大时间跨度为1时，begin_date和end_date的差值只能为0，才能小于1），否则会报错
     * @param end_date     获取数据的结束日期，end_date允许设置的最大值为昨日
     * @return JSON数据包 （详情看各个数据分析接口）
     * <p/>
     * <p/>
     * 日期格式为yyyy-MM-dd
     */
    String getAnalysisData(String uri, String access_token, String begin_date, String end_date);
}
