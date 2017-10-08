package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhjcxxEntityDao;
import com.rx.webApplication.dao.TlkWechatUserEntityDao;
import com.rx.webApplication.entities.TlkWechatUserEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

/**
 * Created by 王玉粮 on 2017/7/1.
 */
public class TlkWechatUserEntityDaoImpl implements TlkWechatUserEntityDao {

    @Override
    public void InsertToWechatUser(String id,String openid) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "insert into tlk_wechatuser (id,item_openid,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?)";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,openid);
            preparedStatement.setString(3,"11e7-60bc-d00f4833-9c01-154e3e59e308");
            preparedStatement.setString(4,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(5,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, UUID.randomUUID().toString());
            preparedStatement.setString(2,"11e7-60bc-d00f4833-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,id);
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

    @Override
    public void updateWechatUserByOpenid(String khid,String phone,String openid) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_wechatuser set ITEM_KHID = ?,ITEM_PHONE = ? where ITEM_OPENID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,khid);
            preparedStatement.setString(2,phone);
            preparedStatement.setString(3,openid);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }

    @Override
    public TlkWechatUserEntity findByOpenid(String openid) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "select ID,ITEM_OPENID,ITEM_PHONE,ITEM_KHID,ITEM_REFERENCE from tlk_wechatuser where ITEM_OPENID = ?";
        String itemOpenid = "";
        TlkWechatUserEntity tlkWechatUserEntity = new TlkWechatUserEntity();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,openid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                tlkWechatUserEntity.setId(resultSet.getString(1));
                tlkWechatUserEntity.setItemOpenid(resultSet.getString(2));
                tlkWechatUserEntity.setItemPhone(resultSet.getString(3));
                tlkWechatUserEntity.setItemKhid(resultSet.getString(4));
                tlkWechatUserEntity.setItemReference(resultSet.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkWechatUserEntity;
    }

}
