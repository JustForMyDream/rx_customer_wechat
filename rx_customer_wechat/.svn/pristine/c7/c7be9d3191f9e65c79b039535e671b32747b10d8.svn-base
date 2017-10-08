package com.cxt.wechat.usermanage.tag;

/**
 * 用户标签管理接口
 * 标签功能目前支持公众号为用户打上最多三个标签。
 * Created by cccxt on 2016/7/5.
 */
public interface UserTagInterface {
    //创建标签接口
    String tags_create = "https://api.weixin.qq.com/cgi-bin/tags/create?access_token=ACCESS_TOKEN";
    //获取已创建标签接口
    String tags_get = "https://api.weixin.qq.com/cgi-bin/tags/get?access_token=ACCESS_TOKEN";
    //编辑标签接口
    String tags_update = "https://api.weixin.qq.com/cgi-bin/tags/update?access_token=ACCESS_TOKEN";
    //删除标签接口
    String tags_delete = "https://api.weixin.qq.com/cgi-bin/tags/delete?access_token=ACCESS_TOKEN";
    //获取标签下粉丝列表接口
    String tag_get = "https://api.weixin.qq.com/cgi-bin/user/tag/get?access_token=ACCESS_TOKEN";

    /**
     * 创建标签
     * http请求方式：POST（请使用https协议）
     * POST数据格式：JSON
     * POST数据例子：
     * {
     * "tag" : {
     * "name" : "广东"
     * }
     * }
     *
     * @param access_token 调用接口凭据
     * @param name         标签名（30个字符以内）
     * @return 返回说明（正常时返回的json数据包示例）
     * {
     * "tag":{
     * "id":134,//标签id，由微信分配
     * "name":"广东"
     * }
     * }
     * <p/>
     * 错误码	说明
     * -1	系统繁忙
     * 45157  标签名非法，请注意不能和其他标签重名
     * 45158	标签名长度超过30个字节
     * 45056	创建的标签数过多，请注意不能超过100个
     */
    String TAGS_create(String access_token, String name);

    /**
     * 获取公众号已创建的标签
     * http请求方式：GET（请使用https协议）
     *
     * @param access_token 调用接口凭据
     * @return {
     * "tags":[{
     * "id":1,
     * "name":"每天一罐可乐星人",
     * "count":0 //此标签下粉丝数
     * }]
     * }
     */
    String TAGS_get(String access_token);

    /**
     * 编辑标签
     * http请求方式：POST（请使用https协议）
     * https://api.weixin.qq.com/cgi-bin/tags/update?access_token=ACCESS_TOKEN
     * POST数据格式：JSON
     * POST数据例子：
     * {
     * "tag" : {
     * "id" : 134,
     * "name" : "广东人"
     * }
     * }
     *
     * @param access_token 调用接口凭据
     * @param id           标签id
     * @param name         标签名
     * @return {"errcode":0,"errmsg":"ok"}
     * -1	系统繁忙
     * 45157	标签名非法，请注意不能和其他标签重名
     * 45158	标签名长度超过30个字节
     * 45058	不能修改0/1/2这三个系统默认保留的标签
     */
    String TAGS_update(String access_token, String id, String name);

    /**
     * 删除标签
     * http请求方式：POST（请使用https协议）
     * https://api.weixin.qq.com/cgi-bin/tags/delete?access_token=ACCESS_TOKEN
     * POST数据格式：JSON
     * POST数据例子：
     * {
     * "tag":{
     * "id" : 134
     * }
     * }
     *
     * @param access_token 调用接口凭据
     * @param id           标签id
     * @return {"errcode":0,"errmsg":"ok"}
     * -1	系统繁忙
     * 45058	不能修改0/1/2这三个系统默认保留的标签
     * 45057
     * 该标签下粉丝数超过10w，不允许直接删除
     */
    String TAGS_delete(String access_token, String id);

    /**
     * 获取标签下粉丝列表
     * http请求方式：GET（请使用https协议）
     * https://api.weixin.qq.com/cgi-bin/user/tag/get?access_token=ACCESS_TOKEN
     * POST数据格式：JSON
     * POST数据例子：
     * {
     * "tagid" : 134,
     * "next_openid":""//第一个拉取的OPENID，不填默认从头开始拉取
     * }
     *
     * @param access_token 调用接口凭据
     * @param tagid        标签id
     * @param next_openid  第一个拉取的OPENID，不填默认从头开始拉取
     * @return {
     * "count":2,//这次获取的粉丝数量
     * "data":{//粉丝列表
     * "openid":[
     * "ocYxcuAEy30bX0NXmGn4ypqx3tI0",
     * "ocYxcuBt0mRugKZ7tGAHPnUaOW7Y"
     * ]
     * },
     * "next_openid":"ocYxcuBt0mRugKZ7tGAHPnUaOW7Y"//拉取列表最后一个用户的openid
     * }
     * -1	系统繁忙
     * 40003	传入非法的openid
     * 45159	非法的tag_id
     */
    String TAG_get(String access_token, String tagid, String next_openid);


}
