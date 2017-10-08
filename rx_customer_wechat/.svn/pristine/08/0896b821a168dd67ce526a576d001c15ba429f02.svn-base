package com.cxt.wechat.menu;

import com.cxt.wechat.entity.BaseResult;
import com.cxt.wechat.menu.entity.buttons.MenuConditional;
import com.cxt.wechat.menu.entity.buttons.MenuEntity;

/**
 * 自定义菜单接口
 * <p/>
 * Created by cccxt on 2016/7/5.
 */
public interface MenuInterface {
    //创建菜单接口路径
    String createInterface = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    //查询菜单接口路径
    String getInterface = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
    //删除自定义菜单（删除所有菜单）接口路径
    String deleteInterface = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
    //创建个性化菜单接口路径
    String addconditionalInterface = "https://api.weixin.qq.com/cgi-bin/menu/addconditional?access_token=ACCESS_TOKEN";
    //删除个性化菜单接口路径
    String delconditionalInterface = "https://api.weixin.qq.com/cgi-bin/menu/delconditional?access_token=ACCESS_TOKEN";
    //测试个性化菜单匹配结果接口路径
    String trymatchInterface="https://api.weixin.qq.com/cgi-bin/menu/trymatch?access_token=ACCESS_TOKEN";
    //获取自定义菜单配置接口路径
    String get_current_selfmenu_infoInterface = "https://api.weixin.qq.com/cgi-bin/get_current_selfmenu_info?access_token=ACCESS_TOKEN";

    /**
     * 创建自定义菜单
     * http请求方式：POST（请使用https协议）
     *
     * @param access_token access_token
     * @param menu         菜单类
     * @return {"errcode":0,"errmsg":"ok"}
     */
    String create(String access_token, MenuEntity menu);

    /**
     * 创建自定义菜单
     * http请求方式：POST（请使用https协议）
     *
     * @param access_token access_token
     * @param menu         菜单json字符串
     * @return {"errcode":0,"errmsg":"ok"}
     */
    String create(String access_token, String menu);

    /**
     * 获取菜单信息
     * http请求方式：GET
     *
     * @param access_token access_token
     * @return 菜单json字符串
     */
    String get(String access_token);

    /**
     * 删除自定义菜单（删除所有菜单）
     * http请求方式：GET
     *
     * @param access_token access_token
     * @return 成功返回 {"errcode":0,"errmsg":"ok"}
     */
    String delete(String access_token);

    /**
     * 创建个性化菜单
     * http请求方式：POST（请使用https协议）
     *
     * @param access_token    access_token
     * @param menuConditional 个性化菜单类
     * @return 若成功返回菜单编号 {"menuid":"208379533"}
     */
    String addconditional(String access_token, MenuConditional menuConditional);

    /**
     * 创建个性化菜单
     * http请求方式：POST（请使用https协议）
     *
     * @param access_token    access_token
     * @param menuConditional 个性化菜单json字符串
     * @return 若成功返回菜单编号 {"menuid":"208379533"}
     */
    String addconditional(String access_token, String menuConditional);

    /**
     * 删除个性化菜单
     * http请求方式：POST（请使用https协议）
     *
     * @param access_token access_token
     * @return 若成功返回 {"errcode":0,"errmsg":"ok"}
     */
    String delconditional(String access_token, String menuid);

    /**
     * 测试个性化菜单匹配结果
     * http请求方式：POST（请使用https协议）
     *
     * @param access_token access_token
     * @param user_id      user_id可以是粉丝的OpenID，也可以是粉丝的微信号。
     * @return 该接口将返回菜单配置
     */
    String trymatch(String access_token, String user_id);

    /**
     * 获取自定义菜单配置接口
     * http请求方式: GET（请使用https协议）
     *
     * @param access_token access_token
     * @return 本接口将会提供公众号当前使用的自定义菜单的配置，如果公众号是通过API调用设置的菜单，则返回菜单的开发配置，而如果公众号是在公众平台官网通过网站功能发布菜单，则本接口返回运营者设置的菜单配置。
     */
    String get_current_selfmenu_info(String access_token);
}
