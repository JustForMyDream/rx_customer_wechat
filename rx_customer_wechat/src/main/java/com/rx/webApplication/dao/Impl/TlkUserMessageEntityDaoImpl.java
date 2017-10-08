package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkUserMessageEntityDao;
import com.rx.webApplication.entities.TlkCheckSortMessageEntity;
import com.rx.webApplication.entities.TlkUserMessageEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

/**
 * Created by 王玉粮 on 2017/7/1.
 */
public class TlkUserMessageEntityDaoImpl implements TlkUserMessageEntityDao {
    @Override
    public void saveUserMessage(TlkUserMessageEntity tlkUserMessageEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "insert into tlk_usermessage (ID,ITEM_PHONE,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?)";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkUserMessageEntity.getId());
            preparedStatement.setString(2,tlkUserMessageEntity.getPhone());
            preparedStatement.setString(3,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(4,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(5,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, UUID.randomUUID().toString());
            preparedStatement.setString(2,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkUserMessageEntity.getId());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }
}
