package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhClxxEntityDao;
import com.rx.webApplication.entities.TLkKhClxxEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李静 on 2017/7/2.
 */
public class TlkKhClxxEntityDaoImpl implements TlkKhClxxEntityDao {
    @Override
    public List<TLkKhClxxEntity> findCarByKhid(String khid) {
        List<TLkKhClxxEntity> tlkKhClxxEntityList=new ArrayList<TLkKhClxxEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "SELECT ID,ITEM_CLPP,ITEM_GCSJ,ITEM_LCJ ,ITEM_YGJE,ITEM_CPH,ITEM_CCSJ,ITEM_CLSS  FROM  tlk_kh_clxx   WHERE ITEM_KHID =? ";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TLkKhClxxEntity tlkKhClxxEntity = new TLkKhClxxEntity(
                        resultSet.getString("ITEM_CLPP"),
                        resultSet.getDate("ITEM_GCSJ"),
                        resultSet.getDouble("ITEM_LCJ"),
                        resultSet.getDouble("ITEM_YGJE"),
                        resultSet.getString("ID"),
                        resultSet.getString("ITEM_CPH"),
                        resultSet.getDate("ITEM_CCSJ"),
                        resultSet.getString("ITEM_CLSS"));
                tlkKhClxxEntityList.add(tlkKhClxxEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhClxxEntityList;
    }

    @Override
    public TLkKhClxxEntity findCarByid(String id) {
        TLkKhClxxEntity tlkKhClxxEntity = new TLkKhClxxEntity();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "SELECT ITEM_CLPP,ITEM_GCSJ,ITEM_LCJ ,ITEM_YGJE,ITEM_CPH,ITEM_CCSJ,ITEM_CLSS  FROM  tlk_kh_clxx   WHERE ID =? ";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                tlkKhClxxEntity.tLkKhClxxEntityid(resultSet.getString("ITEM_CLPP"),
                        resultSet.getDate("ITEM_GCSJ"),
                        resultSet.getDouble("ITEM_LCJ"),
                        resultSet.getDouble("ITEM_YGJE"),
                        resultSet.getString("ITEM_CPH"),
                        resultSet.getDate("ITEM_CCSJ"),
                        resultSet.getString("ITEM_CLSS"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhClxxEntity;
    }

    @Override
    public  void  addfindCarByKhid(TLkKhClxxEntity tlkKhClxxEntity){
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "insert into tlk_kh_clxx (ID,ITEM_CLPP,ITEM_LCJ,ITEM_YGJE,ITEM_GCSJ,ITEM_CPH,ITEM_CCSJ,ITEM_CLSS,ITEM_KHID,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?,?,?) ";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhClxxEntity.getId());
            preparedStatement.setString(2,tlkKhClxxEntity.getItemClpp());
            preparedStatement.setDouble(3,tlkKhClxxEntity.getItemLcj());
            preparedStatement.setDouble(4,tlkKhClxxEntity.getItemYgje());
            preparedStatement.setDate(5,tlkKhClxxEntity.getItemGcsj());
            preparedStatement.setString(6,tlkKhClxxEntity.getItemCph());
            preparedStatement.setDate(7,tlkKhClxxEntity.getItemCcsj());
            preparedStatement.setString(8,tlkKhClxxEntity.getItemClss());
            preparedStatement.setString(9,tlkKhClxxEntity.getItemKhid());
            preparedStatement.setString(10,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(11,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(12,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, tlkKhClxxEntity.getId());
            preparedStatement.setString(2,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkKhClxxEntity.getId());
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
    public void updateCarById(TLkKhClxxEntity tLkKhClxxEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_kh_clxx set ITEM_CLPP = ?,ITEM_LCJ = ?,ITEM_YGJE = ?,ITEM_GCSJ = ?,ITEM_CPH= ?,ITEM_CCSJ= ?,ITEM_CLSS= ? where ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tLkKhClxxEntity.getItemClpp());
            preparedStatement.setDouble(2,tLkKhClxxEntity.getItemLcj());
            preparedStatement.setDouble(3,tLkKhClxxEntity.getItemYgje());
            preparedStatement.setDate(4,tLkKhClxxEntity.getItemGcsj());
            preparedStatement.setString(5,tLkKhClxxEntity.getItemCph());
            preparedStatement.setDate(6,tLkKhClxxEntity.getItemCcsj());
            preparedStatement.setString(7,tLkKhClxxEntity.getItemClss());
            preparedStatement.setString(8,tLkKhClxxEntity.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }

    }
}
