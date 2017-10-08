package com.cxt.wechat.dataAnalysis;

/**
 * Created by cccxt on 2016/7/6.
 * 图文分析数据接口
 * <p/>
 * 1、接口侧的公众号数据的数据库中仅存储了2014年12月1日之后的数据，将查询不到在此之前的日期，即使有查到，也是不可信的脏数据；
 * 2、请开发者在调用接口获取数据后，将数据保存在自身数据库中，即加快下次用户的访问速度，也降低了微信侧接口调用的不必要损耗。
 * 3、额外注意，获取图文群发每日数据接口的结果中，只有中间页阅读人数+原文页阅读人数+分享转发人数+分享转发次数+收藏次数 >=3的结果才会得到统计，过小的阅读量的图文消息无法统计。
 * <p/>
 * <p/>
 * 参数	                                  说明
 * ref_date	                        数据的日期，需在begin_date和end_date之间
 * ref_hour	                        数据的小时，包括从000到2300，分别代表的是[000,100)到[2300,2400)，即每日的第1小时和最后1小时
 * stat_date	                    统计的日期，在getarticletotal接口中，ref_date指的是文章群发出日期， 而stat_date是数据统计日期
 * msgid	                        请注意：这里的msgid实际上是由msgid（图文消息id，这也就是群发接口调用后返回的msg_data_id）和index（消息次序索引）组成， 例如12003_3， 其中12003是msgid，即一次群发的消息的id； 3为index，假设该次群发的图文消息共5个文章（因为可能为多图文），3表示5个中的第3个
 * title	                        图文消息的标题
 * int_page_read_user	            图文页（点击群发图文卡片进入的页面）的阅读人数
 * int_page_read_count	            图文页的阅读次数
 * ori_page_read_user	            原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
 * ori_page_read_count	            原文页的阅读次数
 * share_scene                  	分享的场景 1代表好友转发 2代表朋友圈 3代表腾讯微博 255代表其他
 * share_user	                    分享的人数
 * share_count	                    分享的次数
 * add_to_fav_user	                收藏的人数
 * add_to_fav_count	                收藏的次数
 * 获取图文群发总数据接口中的详细字段解释
 * intpagefromsessionreaduser       公众号会话阅读人数
 * intpagefromsessionreadcount      公众号会话阅读次数
 * intpagefromhistmsgreaduser       历史消息页阅读人数
 * intpagefromhistmsgreadcount      历史消息页阅读次数
 * intpagefromfeedreaduser          朋友圈阅读人数
 * intpagefromfeedreadcount         朋友圈阅读次数
 * intpagefromfriendsreaduser       好友转发阅读人数
 * intpagefromfriendsreadcount      好友转发阅读次数
 * intpagefromotherreaduser         其他场景阅读人数
 * intpagefromotherreadcount        其他场景阅读次数
 * <p/>
 * feedsharefromsessionuser         公众号会话转发朋友圈人数
 * feedsharefromsessioncnt          公众号会话转发朋友圈次数
 * feedsharefromfeeduser            朋友圈转发朋友圈人数
 * feedsharefromfeedcnt             朋友圈转发朋友圈次数
 * feedsharefromotheruser           其他场景转发朋友圈人数
 * feedsharefromothercnt            其他场景转发朋友圈次数
 * target_user	                    送达人数，一般约等于总粉丝数（需排除黑名单或其他异常情况下无法收到消息的粉丝）
 * user_source	                    在获取图文阅读分时数据时才有该字段，代表用户从哪里进入来阅读该图文。0:会话;1.好友;2.朋友圈;3.腾讯微博;4.历史消息页;5.其他
 */
public interface ViewDataAnalysis {
    /**
     * 获取图文群发每日数据
     * 最大时间跨度(1)
     * 正常情况下，获取图文群发每日数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-08",
     * "msgid": "10000050_1",
     * "title": "12月27日 DiLi日报",
     * "int_page_read_user": 23676,
     * "int_page_read_count": 25615,
     * "ori_page_read_user": 29,
     * "ori_page_read_count": 34,
     * "share_user": 122,
     * "share_count": 994,
     * "add_to_fav_user": 1,
     * "add_to_fav_count": 3
     * }
     * //后续会列出该日期内所有被阅读过的文章（仅包括群发的文章）在当天的阅读次数等数据
     * ]
     * }
     */
    String getarticlesummary = "https://api.weixin.qq.com/datacube/getarticlesummary?access_token=ACCESS_TOKEN";

    /**
     * 获取图文群发总数据
     * 最大时间跨度(1)
     * 正常情况下，获取图文群发总数据接口的返回JSON数据包如下（请注意，details中，每天对应的数值为该文章到该日为止的总量（而不是当日的量））。 额外需要注意获取图文群发每日数据（getarticlesummary）和获取图文群发总数据（getarticletotal）的区别如下：
     * 1、前者获取的是某天所有被阅读过的文章（仅包括群发的文章）在当天的阅读次数等数据。
     * 2、后者获取的是，某天群发的文章，从群发日起到接口调用日（但最多统计发表日后7天数据），每天的到当天的总等数据。例如某篇文章是12月1日发出的，发出后在1日、2日、3日的阅读次数分别为1万，则getarticletotal获取到的数据为，距发出到12月1日24时的总阅读量为1万，距发出到12月2日24时的总阅读量为2万，距发出到12月1日24时的总阅读量为3万。
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-14",
     * "msgid": "202457380_1",
     * "title": "马航丢画记",
     * "details": [
     * {
     * "stat_date": "2014-12-14",
     * "target_user": 261917,
     * "int_page_read_user": 23676,
     * "int_page_read_count": 25615,
     * "ori_page_read_user": 29,
     * "ori_page_read_count": 34,
     * "share_user": 122,
     * "share_count": 994,
     * "add_to_fav_user": 1,
     * "add_to_fav_count": 3,
     * "int_page_from_session_read_user": 657283,
     * "int_page_from_session_read_count": 753486,
     * "int_page_from_hist_msg_read_user": 1669,
     * "int_page_from_hist_msg_read_count": 1920,
     * "int_page_from_feed_read_user": 367308,
     * "int_page_from_feed_read_count": 433422,
     * "int_page_from_friends_read_user": 15428,
     * "int_page_from_friends_read_count": 19645,
     * "int_page_from_other_read_user": 477,
     * "int_page_from_other_read_count": 703,
     * "feed_share_from_session_user": 63925,
     * "feed_share_from_session_cnt": 66489,
     * "feed_share_from_feed_user": 18249,
     * "feed_share_from_feed_cnt": 19319,
     * "feed_share_from_other_user": 731,
     * "feed_share_from_other_cnt": 775
     * },
     * //后续还会列出所有stat_date符合“ref_date（群发的日期）到接口调用日期”（但最多只统计7天）的数据
     * ]
     * },
     * //后续还有ref_date（群发的日期）在begin_date和end_date之间的群发文章的数据
     * ]
     * }
     */
    String getarticletotal = "https://api.weixin.qq.com/datacube/getarticletotal?access_token=ACCESS_TOKEN";

    /**
     * 获取图文统计数据
     * 最大时间跨度(3)
     * 正常情况下，获取图文统计数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "int_page_read_user": 45524,
     * "int_page_read_count": 48796,
     * "ori_page_read_user": 11,
     * "ori_page_read_count": 35,
     * "share_user": 11,
     * "share_count": 276,
     * "add_to_fav_user": 5,
     * "add_to_fav_count": 15
     * },
     * //后续还有ref_date在begin_date和end_date之间的数据
     * ]
     * }
     */
    String getuserread = "https://api.weixin.qq.com/datacube/getuserread?access_token=ACCESS_TOKEN";

    /**
     * 获取图文统计分时数据
     * 最大时间跨度(1)
     * 正常情况下，获取图文统计分时数据接口的返回JSON数据包如下：
     * {
     * {
     * "list": [
     * {
     * "ref_date": "2015-07-14",
     * "ref_hour": 0,
     * "user_source": 0,
     * "int_page_read_user": 6391,
     * "int_page_read_count": 7836,
     * "ori_page_read_user": 375,
     * "ori_page_read_count": 440,
     * "share_user": 2,
     * "share_count": 2,
     * "add_to_fav_user": 0,
     * "add_to_fav_count": 0
     * },
     * {
     * "ref_date": "2015-07-14",
     * "ref_hour": 0,
     * "user_source": 1,
     * "int_page_read_user": 1,
     * "int_page_read_count": 1,
     * "ori_page_read_user": 0,
     * "ori_page_read_count": 0,
     * "share_user": 0,
     * "share_count": 0,
     * "add_to_fav_user": 0,
     * "add_to_fav_count": 0
     * },
     * {
     * "ref_date": "2015-07-14",
     * "ref_hour": 0,
     * "user_source": 2,
     * "int_page_read_user": 3,
     * "int_page_read_count": 3,
     * "ori_page_read_user": 0,
     * "ori_page_read_count": 0,
     * "share_user": 0,
     * "share_count": 0,
     * "add_to_fav_user": 0,
     * "add_to_fav_count": 0
     * },
     * {
     * "ref_date": "2015-07-14",
     * "ref_hour": 0,
     * "user_source": 4,
     * "int_page_read_user": 42,
     * "int_page_read_count": 100,
     * "ori_page_read_user": 0,
     * "ori_page_read_count": 0,
     * "share_user": 0,
     * "share_count": 0,
     * "add_to_fav_user": 0,
     * "add_to_fav_count": 0
     * }
     * //后续还有ref_hour逐渐增大,以列举1天24小时的数据
     * ]
     * }
     */
    String getuserreadhour = "https://api.weixin.qq.com/datacube/getuserreadhour?access_token=ACCESS_TOKEN";

    /**
     * 获取图文分享转发数据
     * 最大时间跨度(7)
     * 正常情况下，获取图文分享转发数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "share_scene": 1,
     * "share_count": 207,
     * "share_user": 11
     * },
     * {
     * "ref_date": "2014-12-07",
     * "share_scene": 5,
     * "share_count": 23,
     * "share_user": 11
     * }
     * //后续还有不同share_scene（分享场景）的数据，以及ref_date在begin_date和end_date之间的数据
     * ]
     * }
     */
    String getusershare = "https://api.weixin.qq.com/datacube/getusershare?access_token=ACCESS_TOKEN";

    /**
     * 获取图文分享转发分时数据
     * 最大时间跨度(1)
     * 正常情况下，获取图文分享转发每日数据接口的返回JSON数据包如下：
     * {
     * "list": [
     * {
     * "ref_date": "2014-12-07",
     * "ref_hour": 1200,
     * "share_scene": 1,
     * "share_count": 72,
     * "share_user": 4
     * }
     * //后续还有不同share_scene的数据，以及ref_hour逐渐增大的数据。由于最大时间跨度为1，所以ref_date此处固定
     * ]
     * }
     */
    String getusersharehour = "https://api.weixin.qq.com/datacube/getusersharehour?access_token=ACCESS_TOKEN";
}
