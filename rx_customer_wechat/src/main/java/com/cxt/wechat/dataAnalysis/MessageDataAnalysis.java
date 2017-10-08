package com.cxt.wechat.dataAnalysis;

/**
 * 消息分析数据接口
 * 消息分析数据接口指的是用于获得公众平台官网数据统计模块中消息分析数据的接口
 * 参数	                                 说明
 * ref_date	            数据的日期，需在begin_date和end_date之间
 * ref_hour	            数据的小时，包括从000到2300，分别代表的是[000,100)到[2300,2400)，即每日的第1小时和最后1小时
 * msg_type	            消息类型，代表含义如下：
 * 1代表文字 2代表图片 3代表语音 4代表视频 6代表第三方应用消息（链接消息）
 * msg_user	            上行发送了（向公众号发送了）消息的用户数
 * msg_count	        上行发送了消息的消息总数
 * count_interval	    当日发送消息量分布的区间，0代表 “0”，1代表“1-5”，2代表“6-10”，3代表“10次以上”
 * int_page_read_count	图文页的阅读次数
 * ori_page_read_user	原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
 * Created by cccxt on 2016/7/6.
 */
public interface MessageDataAnalysis {
    /**
     * 获取消息发送概况数据
     * 最大时间跨度(7)
     * 获取消息发送概况数据接口需要向相应接口调用地址POST以下数据包：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "msg_type": 1,
     * "msg_user": 282,
     * "msg_count": 817
     * }
     * //后续还有同一ref_date的不同msg_type的数据，以及不同ref_date（在时间范围内）的数据
     * ]
     * }
     */
    String getupstreammsg = "https://api.weixin.qq.com/datacube/getupstreammsg?access_token=ACCESS_TOKEN";

    /**
     * 获取消息分送分时数据
     * 最大时间跨度(1)
     * 获取消息分送分时数据接口需要向相应接口调用地址POST以下数据包：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "ref_hour": 0,
     * "msg_type": 1,
     * "msg_user": 9,
     * "msg_count": 10
     * }
     * //后续还有同一ref_hour的不同msg_type的数据，以及不同ref_hour的数据，ref_date固定，因为最大时间跨度为1
     * ]
     * }
     */
    String getupstreammsghour = "https://api.weixin.qq.com/datacube/getupstreammsghour?access_token=ACCESS_TOKEN";

    /**
     * 获取消息发送周数据
     * 最大时间跨度(30)
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-08",
     * "msg_type": 1,
     * "msg_user": 16,
     * "msg_count": 27
     * }
     * //后续还有同一ref_date下不同msg_type的数据，及不同ref_date的数据
     * ]
     * }
     */
    String getupstreammsgweek = "https://api.weixin.qq.com/datacube/getupstreammsgweek?access_token=ACCESS_TOKEN";

    /**
     * 获取消息发送月数据
     * 最大时间跨度(30)
     * 获取消息发送月数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-11-01",
     * "msg_type": 1,
     * "msg_user": 7989,
     * "msg_count": 42206
     * }
     * //后续还有同一ref_date下不同msg_type的数据，及不同ref_date的数据
     * ]
     * }
     */
    String getupstreammsgmonth = "https://api.weixin.qq.com/datacube/getupstreammsgmonth?access_token=ACCESS_TOKEN";

    /**
     * 获取消息发送分布数据
     * 最大时间跨度(15)
     * 获取消息发送分布数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "count_interval": 1,
     * "msg_user": 246
     * }
     * //后续还有同一ref_date下不同count_interval的数据，及不同ref_date的数据
     * ]
     * }
     */
    String getupstreammsgdist = "https://api.weixin.qq.com/datacube/getupstreammsgdist?access_token=ACCESS_TOKEN";

    /**
     * 获取消息发送分布周数据
     * 最大时间跨度(30)
     * 获取消息发送分布周数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "count_interval": 1,
     * "msg_user": 246
     * }
     * //后续还有同一ref_date下不同count_interval的数据，及不同ref_date的数据
     * ]
     * }
     */
    String getupstreammsgdistweek = "https://api.weixin.qq.com/datacube/getupstreammsgdistweek?access_token=ACCESS_TOKEN";

    /**
     * 获取消息发送分布月数据
     * 最大时间跨度(30)
     * 获取消息发送分布月数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "count_interval": 1,
     * "msg_user": 246
     * }
     * //后续还有同一ref_date下不同count_interval的数据，及不同ref_date的数据
     * ]
     * }
     */
    String getupstreammsgdistmonth = "https://api.weixin.qq.com/datacube/getupstreammsgdistmonth?access_token=ACCESS_TOKEN";
}
