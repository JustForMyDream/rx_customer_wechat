package com.cxt.wechat.menu.entity.buttons;

/**按钮的基础类型
 * Created by cccxt on 2016/7/5.
 */
public class BaseButton {
    //按钮类型
    private String type;
    //按钮名称（菜单上显示的文字）
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
