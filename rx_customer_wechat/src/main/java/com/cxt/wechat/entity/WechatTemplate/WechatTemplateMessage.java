package com.cxt.wechat.entity.WechatTemplate;

import java.util.Map;

/**
 * Created by cccxt on 2016/3/30.
 * 模板消息实体
 */
public class WechatTemplateMessage {
    private String touser;
    private String template_id;
    private String url;
    private Map<String,WechatTemplateItem> data;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, WechatTemplateItem> getData() {
        return data;
    }

    public void setData(Map<String, WechatTemplateItem> data) {
        this.data = data;
    }
}
