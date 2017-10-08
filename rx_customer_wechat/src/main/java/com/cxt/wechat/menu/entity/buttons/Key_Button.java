package com.cxt.wechat.menu.entity.buttons;

/**带key参数类型按钮
 *
 * 点击推事件用户点击click类型按钮后，微信服务器会通过消息接口推送消息类型为event的结构给开发者，并且带上按钮中开发者填写的key值，开发者可以通过自定义的key值与用户进行交互；
 *
 * location_select弹出地理位置选择器用户点击按钮后，微信客户端将调起地理位置选择工具，完成选择操作后，将选择的地理位置发送给开发者的服务器，同时收起位置选择工具，随后可能会收到开发者下发的消息。
 *
 * Created by cccxt on 2016/7/5.
 */
public class Key_Button extends BaseButton{
    //推送事件信息将携带的参数
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
