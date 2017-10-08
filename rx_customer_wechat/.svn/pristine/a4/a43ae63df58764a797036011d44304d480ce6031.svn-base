package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkEnterpriseWeChatDao;
import com.rx.webApplication.entities.TlkEnterpriseWeChatEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by aria on 2017/7/17.
 */
public class TlkEnterpriseWeChatDaoImpl implements TlkEnterpriseWeChatDao{
    @Override
    public void saveCheckSortMessage(TlkEnterpriseWeChatEntity tlkEnterpriseWeChatEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "insert into tlk_enterprisewechat (ID,ITEM_USERID,ITEM_CHECKCODE,ITEM_SENDTIME,ITEM_EFFECTIVETIME,ITEM_TYPE,ITEM_PHONE,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?)";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkEnterpriseWeChatEntity.getId());
            preparedStatement.setString(2,tlkEnterpriseWeChatEntity.getItemUserId());
            preparedStatement.setInt(3,tlkEnterpriseWeChatEntity.getItemCheckcode());
            preparedStatement.setTimestamp(4,tlkEnterpriseWeChatEntity.getItemSendtime());
            preparedStatement.setTimestamp(5, tlkEnterpriseWeChatEntity.getItemEffectivetime());
            preparedStatement.setString(6,tlkEnterpriseWeChatEntity.getItemType());
            preparedStatement.setString(7,tlkEnterpriseWeChatEntity.getItemPhone());
            preparedStatement.setString(8,"11e7-60bd-8511c8c0-9c01-154e3e59e308");
            preparedStatement.setString(9,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(10,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, UUID.randomUUID().toString());
            preparedStatement.setString(2,"11e7-60bd-8511c8c0-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkEnterpriseWeChatEntity.getId());
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
    public List<TlkEnterpriseWeChatEntity> findCheckMessageByPhone(String phone, String userID) {
        List<TlkEnterpriseWeChatEntity> list = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "select ID,ITEM_USERID,ITEM_CHECKCODE,ITEM_SENDTIME,ITEM_TYPE,ITEM_PHONE,ITEM_EFFECTIVETIME" +
                " from tlk_enterprisewechat where ITEM_PHONE = ? AND ITEM_USERID = ? ORDER BY ITEM_EFFECTIVETIME  DESC LIMIT 1";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,phone);
            preparedStatement.setString(2,userID);
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                TlkEnterpriseWeChatEntity tlkEnterpriseWeChatEntity = new TlkEnterpriseWeChatEntity();
                tlkEnterpriseWeChatEntity.setId(resultSet.getString(1));
                tlkEnterpriseWeChatEntity.setItemUserId(resultSet.getString(2));
                tlkEnterpriseWeChatEntity.setItemCheckcode(resultSet.getInt(3));
                tlkEnterpriseWeChatEntity.setItemSendtime(resultSet.getTimestamp(4));
                tlkEnterpriseWeChatEntity.setItemType(resultSet.getString(5));
                tlkEnterpriseWeChatEntity.setItemPhone(resultSet.getString(6));
                tlkEnterpriseWeChatEntity.setItemEffectivetime(resultSet.getTimestamp(7));
                list.add(tlkEnterpriseWeChatEntity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return list;
    }

    @Override
    public int findCurrtCheckCodeNums(String phone) {
        PreparedStatement preparedStatement =null;
        Connection connection =DBFactory.getConnection();
        String sql = "SELECT count(*) FROM tlk_enterprisewechat WHERE TO_DAYS(item_sendtime) = TO_DAYS(NOW()) and item_phone=?";
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
        }finally {
            DBFactory.closeConn(connection);
        }
        return count;
    }

    @Override
    public Timestamp findLastCheckMessageByPhone(String phone) {
        PreparedStatement preparedStatement = null;
        Connection connection  = DBFactory.getConnection();
        String sql = "select max(a.item_sendtime) from (select * from tlk_enterprisewechat c where c.ITEM_PHONE = ? ) as a; ";
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
        }finally {
            DBFactory.closeConn(connection);
        }
        return lastTime;
    }

}
