package com.cxt.wechat.usermanage.user;

import com.cxt.wechat.entity.WechatUser;

import java.util.List;

/**
 * 微信用户接口类
 * Created by cccxt on 2016/7/6.
 */
public interface UserInterface {
    //用户添加备注名接口
    String userinfo_updateremark = "https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=ACCESS_TOKEN";
    //获取用户基本信息接口
    String user_info = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    //批量获取用户基本信息接口
    String user_info_batchget = "https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=ACCESS_TOKEN";
    //获取用户列表
    String user_get = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&next_openid=NEXT_OPENID";

    /**
     * 设置用户备注名
     * http请求方式: POST（请使用https协议）
     * https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=ACCESS_TOKEN
     * POST数据格式：JSON
     * POST数据例子：
     * {
     * "openid":"oDF3iY9ffA-hqb2vVvbr7qxf6A0Q",
     * "remark":"pangzi"
     * }
     *
     * @param access_token 调用接口凭证
     * @param openid       用户标识
     * @param remark       新的备注名，长度必须小于30字符
     * @return {"errcode":0,"errmsg":"ok"}
     */
    String USERINFO_updateremark(String access_token, String openid, String remark);

    /**
     * 获取用户基本信息（包括UnionID机制）
     * 开发者可通过OpenID来获取用户基本信息。请使用https协议。
     * 接口调用请求说明
     * http请求方式: GET https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN
     *
     * @param access_token 调用接口凭证
     * @param openid       普通用户的标识，对当前公众号唯一
     * @param lang         返回国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语
     * @return 返回说明
     * 正常情况下，微信会返回下述JSON数据包给公众号：
     * {
     * "subscribe": 1,
     * "openid": "o6_bmjrPTlm6_2sgVt7hMZOPfL2M",
     * "nickname": "Band",
     * "sex": 1,
     * "language": "zh_CN",
     * "city": "广州",
     * "province": "广东",
     * "country": "中国",
     * "headimgurl":  "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4
     * eMsv84eavHiaiceqxibJxCfHe/0",
     * "subscribe_time": 1382694957,
     * "unionid": " o6_bmasdasdsad6_2sgVt7hMZOPfL"
     * "remark": "",
     * "groupid": 0,
     * "tagid_list":[128,2]
     * }
     * <p/>
     * 参数	         说明
     * subscribe	用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
     * openid	    用户的标识，对当前公众号唯一
     * nickname	    用户的昵称
     * sex	        用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     * city	        用户所在城市
     * country	    用户所在国家
     * province	    用户所在省份
     * language	    用户的语言，简体中文为zh_CN
     * headimgurl	用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     * subscribe_time	用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     * unionid	    只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     * remark	    公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     * groupid	     用户所在的分组ID（兼容旧的用户分组接口）
     * tagid_list	用户被打上的标签ID列表
     * <p/>
     * 错误时微信会返回错误码等信息，JSON数据包示例如下（该示例为AppID无效错误）:
     * {"errcode":40013,"errmsg":"invalid appid"}
     */
    String USER_info(String access_token, String openid, String lang);

    String USER_info(String access_token, String openid);

    /**
     * 批量获取用户基本信息
     * 开发者可通过该接口来批量获取用户基本信息。最多支持一次拉取100条。
     * 接口调用请求说明
     * http请求方式: POST
     * https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=ACCESS_TOKEN
     * POST数据示例
     * {
     * "user_list": [
     * {
     * "openid": "otvxTs4dckWG7imySrJd6jSi0CWE",
     * "lang": "zh-CN"
     * },
     * {
     * "openid": "otvxTs_JZ6SEiP0imdhpi50fuSZg",
     * "lang": "zh-CN"
     * }
     * ]
     * }
     *
     * @param access_token 调用接口凭证
     * @param users        微信用户类（必须有openid）
     * @return {
     * "user_info_list": [
     * {
     * "subscribe": 1,
     * "openid": "otvxTs4dckWG7imySrJd6jSi0CWE",
     * "nickname": "iWithery",
     * "sex": 1,
     * "language": "zh_CN",
     * "city": "Jieyang",
     * "province": "Guangdong",
     * "country": "China",
     * "headimgurl": "http://wx.qlogo.cn/mmopen/xbIQx1GRqdvyqkMMhEaGOX802l1CyqMJNgUzKP8MeAeHFicRDSnZH7FY4XB7p8XHXIf6uJA2SCun
     * TPicGKezDC4saKISzRj3nz/0",
     * "subscribe_time": 1434093047,
     * "unionid": "oR5GjjgEhCMJFyzaVZdrxZ2zRRF4",
     * "remark": "",
     * "groupid": 0,
     * "tagid_list":[128,2]
     * },
     * {
     * "subscribe": 0,
     * "openid": "otvxTs_JZ6SEiP0imdhpi50fuSZg",
     * "unionid": "oR5GjjjrbqBZbrnPwwmSxFukE41U",
     * }
     * ]
     * }
     * <p/>
     * 参数	          说明
     * subscribe	用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息，只有openid和UnionID（在该公众号绑定到了微信开放平台账号时才有）。
     * openid	    用户的标识，对当前公众号唯一
     * nickname	    用户的昵称
     * sex	        用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     * city	        用户所在城市
     * country	    用户所在国家
     * province	    用户所在省份
     * language	    用户的语言，简体中文为zh_CN
     * headimgurl	用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     * subscribe_time	用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     * unionid	    只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     * remark	    公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     * groupid      用户所在的分组ID（暂时兼容用户分组旧接口）
     * tagid_list	用户被打上的标签ID列表
     */
    String USER_info_batchget(String access_token, List<WechatUser> users);

    /**
     * 获取用户列表
     * 公众号可通过本接口来获取帐号的关注者列表，关注者列表由一串OpenID（加密后的微信号，每个用户对每个公众号的OpenID是唯一的）组成。一次拉取调用最多拉取10000个关注者的OpenID，可以通过多次拉取的方式来满足需求。
     * http请求方式: GET（请使用https协议）
     * https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&next_openid=NEXT_OPENID
     *
     * @param access_token 调用接口凭证
     * @param next_openid  第一个拉取的OPENID，不填默认从头开始拉取
     * @return 正确时返回JSON数据包：
     * {"total":2,"count":2,"data":{"openid":["","OPENID1","OPENID2"]},"next_openid":"NEXT_OPENID"}
     * 参数	    说明
     * total	关注该公众账号的总用户数
     * count	拉取的OPENID个数，最大值为10000
     * data	列表数据，OPENID的列表
     * next_openid	拉取列表的最后一个用户的OPENID   关注者列表已返回完时，返回next_openid为空
     */
    String USER_get(String access_token, String next_openid);

    String USER_get(String access_token);
}
