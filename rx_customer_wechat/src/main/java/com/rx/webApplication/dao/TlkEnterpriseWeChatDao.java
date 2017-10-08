package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TlkEnterpriseWeChatEntity;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by aria on 2017/7/17.
 */

public interface TlkEnterpriseWeChatDao {
    /**
     * 将验证码保存到表中
     * @param tlkEnterpriseWeChatEntity
     */
    void saveCheckSortMessage(TlkEnterpriseWeChatEntity tlkEnterpriseWeChatEntity) ;

    /**
     * 通过openid和电话号码获得验证码
     * @param phone
     * @param userID
     * @return
     */
    List<TlkEnterpriseWeChatEntity> findCheckMessageByPhone(String phone, String userID);

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

}
