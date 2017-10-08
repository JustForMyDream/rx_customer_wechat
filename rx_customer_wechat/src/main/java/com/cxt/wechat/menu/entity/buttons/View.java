package com.cxt.wechat.menu.entity.buttons;

/**View类型的按钮
 * 跳转URL用户点击view类型按钮后，微信客户端将会打开开发者在按钮中填写的网页URL，可与网页授权获取用户基本信息接口结合，获得用户基本信息。
 *
 * Created by cccxt on 2016/7/5.
 */
public class View extends BaseButton{
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
