package com.cxt.wechat.menu.entity.buttons;

/**个性化菜单
 * Created by cccxt on 2016/7/5.
 */
public class MenuConditional extends MenuEntity{
    private Matchrule matchrule;

    public Matchrule getMatchrule() {
        return matchrule;
    }

    public void setMatchrule(Matchrule matchrule) {
        this.matchrule = matchrule;
    }
}
