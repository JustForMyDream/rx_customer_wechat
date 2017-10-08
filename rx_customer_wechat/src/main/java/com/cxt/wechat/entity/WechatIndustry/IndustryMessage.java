package com.cxt.wechat.entity.WechatIndustry;

/**
 * Created by cccxt on 2016/3/31.
 */
public class IndustryMessage {
    //主行业
    private Industry primary_industry;
    //副行业
    private Industry secondary_industry;

    public Industry getPrimary_industry() {
        return primary_industry;
    }

    public void setPrimary_industry(Industry primary_industry) {
        this.primary_industry = primary_industry;
    }

    public Industry getSecondary_industry() {
        return secondary_industry;
    }

    public void setSecondary_industry(Industry secondary_industry) {
        this.secondary_industry = secondary_industry;
    }
}
