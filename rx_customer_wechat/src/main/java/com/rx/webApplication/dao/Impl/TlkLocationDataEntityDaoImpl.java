package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkLocationDataEntityDao;
import com.rx.webApplication.entities.TlkLocationDataEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class TlkLocationDataEntityDaoImpl implements TlkLocationDataEntityDao {
    @Override
    public void saveLocationData(TlkLocationDataEntity tlkLocationDataEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql1 = "insert into tlk_locationdata(ID,ITEM_OPENID,ITEM_DATETIME,ITEM_LATITUDE,ITEM_LONGITUDE,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?)";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,tlkLocationDataEntity.getId());
            preparedStatement.setString(2,tlkLocationDataEntity.getItemOpenid());
            preparedStatement.setTimestamp(3,tlkLocationDataEntity.getDateTime());
            preparedStatement.setString(4,tlkLocationDataEntity.getItemLatitude());
            preparedStatement.setString(5,tlkLocationDataEntity.getItemLongitude());
            preparedStatement.setString(6,"11e7-69fe-c19a64f1-a550-ddf4d77de9dd");
            preparedStatement.setString(7,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(8,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, UUID.randomUUID().toString());
            preparedStatement.setString(2,"11e7-69fe-c19a64f1-a550-ddf4d77de9dd");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkLocationDataEntity.getId());
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
