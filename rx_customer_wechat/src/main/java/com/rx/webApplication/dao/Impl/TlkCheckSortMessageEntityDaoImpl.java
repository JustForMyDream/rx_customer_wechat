package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkCheckSortMessageEntityDao;
import com.rx.webApplication.entities.TlkCheckSortMessageEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by 王玉粮 on 2017/7/1.
 */
public class TlkCheckSortMessageEntityDaoImpl implements TlkCheckSortMessageEntityDao {
    @Override
    public void saveCheckSortMessage(TlkCheckSortMessageEntity tlkCheckSortMessageEntity)  {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "insert into tlk_checksortmessage (ID,ITEM_OPENID,ITEM_CHECKCODE,ITEM_SENDTIME,ITEM_EFFECTIVETIME,ITEM_TYPE,ITEM_PHONE,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?)";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkCheckSortMessageEntity.getId());
            preparedStatement.setString(2,tlkCheckSortMessageEntity.getItemOpenid());
            preparedStatement.setInt(3,tlkCheckSortMessageEntity.getItemCheckcode());
            preparedStatement.setTimestamp(4,tlkCheckSortMessageEntity.getItemSendtime());
            preparedStatement.setTimestamp(5, tlkCheckSortMessageEntity.getItemEffectivetime());
            preparedStatement.setString(6,tlkCheckSortMessageEntity.getItemType());
            preparedStatement.setString(7,tlkCheckSortMessageEntity.getItemPhone());
            preparedStatement.setString(8,"11e7-60bd-8511c8c0-9c01-154e3e59e308");
            preparedStatement.setString(9,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(10,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, UUID.randomUUID().toString());
            preparedStatement.setString(2,"11e7-60bd-8511c8c0-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkCheckSortMessageEntity.getId());
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
    public List<TlkCheckSortMessageEntity> findCheckMessageByPhone(String phone,String openid) {
        List<TlkCheckSortMessageEntity> list = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "select ID,ITEM_OPENID,ITEM_CHECKCODE,ITEM_SENDTIME,ITEM_TYPE,ITEM_PHONE,ITEM_EFFECTIVETIME from tlk_checksortmessage where ITEM_PHONE = ? AND ITEM_OPENID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,phone);
            preparedStatement.setString(2,openid);
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                TlkCheckSortMessageEntity tlkCheckSortMessageEntity = new TlkCheckSortMessageEntity();
                tlkCheckSortMessageEntity.setId(resultSet.getString(1));
                tlkCheckSortMessageEntity.setItemOpenid(resultSet.getString(2));
                tlkCheckSortMessageEntity.setItemCheckcode(resultSet.getInt(3));
                tlkCheckSortMessageEntity.setItemSendtime(resultSet.getTimestamp(4));
                tlkCheckSortMessageEntity.setItemType(resultSet.getString(5));
                tlkCheckSortMessageEntity.setItemPhone(resultSet.getString(6));
                tlkCheckSortMessageEntity.setItemEffectivetime(resultSet.getTimestamp(7));
                list.add(tlkCheckSortMessageEntity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }
        return list;
    }


    @Override
    public int findCurrtCheckCodeNums(String phone) {
        PreparedStatement preparedStatement =null;
        Connection connection =DBFactory.getConnection();
        String sql = "SELECT count(*) FROM tlk_checksortmessage WHERE TO_DAYS(item_sendtime) = TO_DAYS(NOW()) and item_phone=?";
        int count = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                 count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }
        return count;
    }

    @Override
    public Timestamp findLastCheckMessageByPhone(String phone) {
        PreparedStatement preparedStatement = null;
        Connection connection  = DBFactory.getConnection();
        String sql = "select max(a.item_sendtime) from (select * from tlk_checksortmessage c where c.ITEM_PHONE = ? ) as a; ";
        Timestamp lastTime = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                lastTime = resultSet.getTimestamp(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }
        return lastTime;
    }

    @Override
    public void updateOpenid(String openid, String phone) {
        PreparedStatement preparedStatement =null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_checksortmessage set ITEM_OPENID = ? where ITEM_PHONE = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,openid);
            preparedStatement.setString(2,phone);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }
    }


}
