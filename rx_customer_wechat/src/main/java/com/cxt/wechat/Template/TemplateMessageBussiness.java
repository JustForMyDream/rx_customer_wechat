package com.cxt.wechat.Template;


import com.cxt.wechat.entity.WechatIndustry.IndustryMessage;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateEntity;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateEntity_List;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateMessage;

import java.util.List;

/**
 * Created by cccxt on 2016/3/31.
 * 模板消息接口
 */
public interface TemplateMessageBussiness {

    /**
     * 设置所属行业Url
     */
    String API_SET_INDUSTRY = "https://api.weixin.qq.com/cgi-bin/template/api_set_industry?access_token=ACCESS_TOKEN";
    /**
     * 获取设置的行业信息url
     */
    String GET_INDUSTRY = "https://api.weixin.qq.com/cgi-bin/template/get_industry?access_token=ACCESS_TOKEN";
    /**
     * 获得模板IDurl
     */
    String API_ADD_TEMPLATE = "https://api.weixin.qq.com/cgi-bin/template/api_add_template?access_token=ACCESS_TOKEN";

    /**
     * 获取模板列表url
     */
    String GET_ALL_PRIVATE_TEMPLATE = "https://api.weixin.qq.com/cgi-bin/template/get_all_private_template?access_token=ACCESS_TOKEN";
    /**
     * 删除模板url
     */
    String DEL_PRIVATE_TEMLATE = "https://api,weixin.qq.com/cgi-bin/template/del_private_template?access_token=ACCESS_TOKEN";

    /**
     * 发送模板消息url
     */
    String SEND = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

    /**
     * 通过模板库的编号获取模板id
     *
     * @param template_id_short
     * @return
     */
    public String getTemplate_id(String template_id_short, String access_token);

    /**
     * 设置所属行业
     *
     * @param industry_id1 公众号模板消息所属行业编号
     * @param industry_id2 公众号模板消息所属行业编号
     * @return
     */
    public String api_set_industry(String industry_id1, String industry_id2, String access_token);

    /**
     * 获取设置的行业信息
     *
     * @param access_token access_token
     * @return IndustryMessage行业信息
     */
    public IndustryMessage get_industry(String access_token);

    /**
     * 获取模板列表
     *
     * @return WechatTemplateEntity_List 实体
     */
    public WechatTemplateEntity_List get_all_private_template(String access_token);

    /**
     * 删除模板
     *
     * @param template_id 模板编号
     * @return 结果
     */
    public String del_private_template(String template_id, String access_token);

    /**
     * 发送模板消息
     *
     * @param wechatTemplateMessage 模板消息实体类
     * @return 发送消息结果
     */
    public String send(WechatTemplateMessage wechatTemplateMessage, String access_token);
}
