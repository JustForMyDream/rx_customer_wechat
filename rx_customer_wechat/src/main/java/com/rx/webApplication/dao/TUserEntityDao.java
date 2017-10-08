package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TUserEntity;

/**
 * Created by aria on 2017/7/17.
 */
public interface TUserEntityDao {

    TUserEntity getByUserId(String userId);//通过企业微信id获取用户信息;

    TUserEntity getByPhone(String phone);//通过用户手机号码获取用户信息;

    int updateByPhone(TUserEntity tUserEntity);//根据用户手机号更新企业微信id,验证码,验证码发送时间;
}
