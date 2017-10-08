package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TlkCheckSortMessageEntity;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by 王玉粮 on 2017/7/1.
 */
public interface TlkCheckSortMessageEntityDao {
    /**
     * 将验证码保存到表中
     * @param tlkCheckSortMessageEntity
     */
    void saveCheckSortMessage(TlkCheckSortMessageEntity tlkCheckSortMessageEntity) ;

    /**
     * 通过openid和电话号码获得验证码
     * @param phone
     * @param openid
     * @return
     */
    List<TlkCheckSortMessageEntity> findCheckMessageByPhone(String phone,String openid);

    /**
     * 通过电话号码获取当天发送验证码次数
     * @param phone
     * @return
     */
    int findCurrtCheckCodeNums(String phone);

    /**
     * 通过电话号码找到最近一次发送的验证码
     * @param phone
     * @return
     */
    Timestamp findLastCheckMessageByPhone(String phone);

    /**
     * 通过电话号码将有效的openid保存更新到数据库
     * @param openid
     */
    void updateOpenid(String openid,String phone);
}
