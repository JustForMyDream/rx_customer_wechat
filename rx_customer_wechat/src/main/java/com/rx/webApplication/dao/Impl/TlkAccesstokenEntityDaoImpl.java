package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkAccesstokenEntityDao;
import com.rx.webApplication.entities.TlkAccesstokenEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.*;
import java.util.UUID;

/**
 * Created by 王玉粮 on 2017/7/16.
 */
public class TlkAccesstokenEntityDaoImpl implements TlkAccesstokenEntityDao {
    @Override
    public void save(TlkAccesstokenEntity tlkAccesstokenEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql1 = "insert into tlk_accesstoken(ID,ITEM_ACCESS_TOKEN,ITEM_EXPIRES_IN,ITEM_UPDATE_TIME,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?)";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,tlkAccesstokenEntity.getId());
            preparedStatement.setString(2,tlkAccesstokenEntity.getItem_access_token());
            preparedStatement.setString(3,tlkAccesstokenEntity.getItem_expires_in());
            preparedStatement.setTimestamp(4,tlkAccesstokenEntity.getItem_update_time());
            preparedStatement.setString(5,"11e7-69fe-c19a64f1-a550-ddf4d77de9dd");
            preparedStatement.setString(6,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(7,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1,UUID.randomUUID().toString());
            preparedStatement.setString(2,"11e7-69fe-c19a64f1-a550-ddf4d77de9dd");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkAccesstokenEntity.getId());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }


    }

    @Override
    public TlkAccesstokenEntity findTlkAccesstokenEntityByLastTime() {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        TlkAccesstokenEntity tlkAccesstokenEntity = new TlkAccesstokenEntity();
        String sql = "select ID,ITEM_ACCESS_TOKEN,ITEM_EXPIRES_IN,ITEM_UPDATE_TIME from tlk_accesstoken where ITEM_UPDATE_TIME =  (select max(ITEM_UPDATE_TIME) from tlk_accesstoken)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                tlkAccesstokenEntity.setId(resultSet.getString(1));
                tlkAccesstokenEntity.setItem_access_token(resultSet.getString(2));
                tlkAccesstokenEntity.setItem_expires_in(resultSet.getString(3));
                tlkAccesstokenEntity.setItem_update_time(resultSet.getTimestamp(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }
        return tlkAccesstokenEntity;
    }
}
