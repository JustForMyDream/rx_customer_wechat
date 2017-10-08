package com.cxt.wechat.menu.entity.buttons;

import java.util.List;

/**二级菜单
 *
 * Created by cccxt on 2016/7/5.
 */
public class SubButton extends BaseButton{
    private String name;
    private List<BaseButton> sub_button;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<BaseButton> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<BaseButton> sub_button) {
        this.sub_button = sub_button;
    }
}
