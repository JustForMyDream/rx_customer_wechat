package com.cxt.wechat.dataAnalysis;

/**
 * 接口分析数据接口
 * 接口分析数据接口指的是用于获得公众平台官网数据统计模块中接口分析数据的接口
 * Created by cccxt on 2016/7/6.
 * <p/>
 * 参数	说明
 * ref_date	        数据的日期
 * ref_hour	        数据的小时
 * callback_count	通过服务器配置地址获得消息后，被动回复用户消息的次数
 * fail_count	    上述动作的失败次数
 * total_time_cost	总耗时，除以callback_count即为平均耗时
 * max_time_cost	最大耗时
 */
public interface InterfaceDataAnalysis {
    /**
     * 获取接口分析数据
     * 最大时间跨度(30)
     * 正常情况下，获取接口分析数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "callback_count": 36974,
     * "fail_count": 67,
     * "total_time_cost": 14994291,
     * "max_time_cost": 5044
     * }
     * //后续还有不同ref_date（在begin_date和end_date之间）的数据
     * ]
     * }
     */
    String getinterfacesummary = "https://api.weixin.qq.com/datacube/getinterfacesummary?access_token=ACCESS_TOKEN";

    /**
     * 获取接口分析分时数据
     * 最大时间跨度(1)
     * 正常情况下，获取接口分析分时数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-01",
     * "ref_hour": 0,
     * "callback_count": 331,
     * "fail_count": 18,
     * "total_time_cost": 167870,
     * "max_time_cost": 5042
     * }
     * //后续还有不同ref_hour的数据
     * ]
     * }
     */
    String getinterfacesummaryhour = "https://api.weixin.qq.com/datacube/getinterfacesummaryhour?access_token=ACCESS_TOKEN";
}
