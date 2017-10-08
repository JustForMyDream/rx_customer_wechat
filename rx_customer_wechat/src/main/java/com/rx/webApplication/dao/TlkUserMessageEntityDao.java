package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TlkCheckSortMessageEntity;
import com.rx.webApplication.entities.TlkUserMessageEntity;

import java.util.List;

/**
 * Created by 王玉粮 on 2017/7/1.
 */
public interface TlkUserMessageEntityDao {
    /**
     * 将用户基础信息报春到用户信息表
     * @param tlkUserMessageEntity
     */
    void saveUserMessage(TlkUserMessageEntity tlkUserMessageEntity);



}
