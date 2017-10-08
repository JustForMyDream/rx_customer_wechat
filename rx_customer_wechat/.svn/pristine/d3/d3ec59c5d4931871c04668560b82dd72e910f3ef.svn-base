package com.cxt.wechat.dataAnalysis;

/**
 * 用户分析数据接口
 * <p/>
 * 微信公众平台于2015年1月6日启动了数据接口的邀请内测。通过数据接口，开发者可以获取与公众平台官网统计模块类似但更灵活的数据，还可根据需要进行高级处理。
 * 在公众号登录授权机制的权限集划分中，用户分析数据接口属于用户管理权限。
 * 向所有公众号开发者开放数据接口的时间将另行通知。
 * 请注意：
 * 1、接口侧的公众号数据的数据库中仅存储了2014年12月1日之后的数据，将查询不到在此之前的日期，即使有查到，也是不可信的脏数据；
 * 2、请开发者在调用接口获取数据后，将数据保存在自身数据库中，即加快下次用户的访问速度，也降低了微信侧接口调用的不必要损耗。
 * <p/>
 * 最大时间跨度是指一次接口调用时最大可获取数据的时间范围，如最大时间跨度为7是指最多一次性获取7天的数据
 * <p/>
 * Created by cccxt on 2016/7/6.
 * <p/>
 * 参数	说明
 * ref_date	数据的日期
 * user_source	用户的渠道，数值代表的含义如下：
 * 0代表其他合计 1代表公众号搜索 17代表名片分享 30代表扫描二维码 43代表图文页右上角菜单 51代表支付后关注（在支付完成页） 57代表图文页内公众号名称 75代表公众号文章广告 78代表朋友圈广告
 * new_user	新增的用户数量
 * cancel_user	取消关注的用户数量，new_user减去cancel_user即为净增用户数量
 * cumulate_user	总用户量
 */
public interface UserDataAnalysis {
    /**
     * 获取用户增减数据 最大时间跨度(7)
     * 正常情况下，获取用户增减数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "user_source": 0,
     * "new_user": 0,
     * "cancel_user": 0
     * }
     * //后续还有ref_date在begin_date和end_date之间的数据
     * ]
     * }
     */
    String getusersummary = "https://api.weixin.qq.com/datacube/getusersummary?access_token=ACCESS_TOKEN";

    /**
     * 获取累计用户数据 最大时间跨度(7)
     * 正常情况下，获取累计用户数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "cumulate_user": 1217056
     * },
     * //后续还有ref_date在begin_date和end_date之间的数据
     * ]
     * }
     */
    String getusercumulate = "https://api.weixin.qq.com/datacube/getusercumulate?access_token=ACCESS_TOKEN";
}
