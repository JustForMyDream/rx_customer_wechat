package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TlkAccesstokenEntity;

import java.sql.Timestamp;

/**
 * Created by 王玉粮 on 2017/7/16.
 */
public interface TlkAccesstokenEntityDao {
    /**
     * 将刷新的access_token保存到数据库
     * @param tlkAccesstokenEntity
     */
    void save(TlkAccesstokenEntity tlkAccesstokenEntity);

    /**
     * 通过最近一次时间找到accesstoken
     *
     * @return
     */
    TlkAccesstokenEntity findTlkAccesstokenEntityByLastTime();

}
