package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TlkWechatUserEntity;

/**
 * Created by 王玉粮 on 2017/7/1.
 */
public interface TlkWechatUserEntityDao {

    /**
     * 将基本信息保存到微信客户表
     * @param id
     * @param openid
     */
    void InsertToWechatUser(String id,String openid);



    /**
     * 将客户id更新到TlkWechatUser表建立关联
     * @param openid
     * @param khid
     */
     void updateWechatUserByOpenid(String khid,String phone, String openid);

    /**
     * 通过openid判断wechatUser表是否有客户
     * @param openid
     * @return
     */
    TlkWechatUserEntity findByOpenid(String openid);


}
