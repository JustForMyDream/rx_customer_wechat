package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhSpxxEntityDao;
import com.rx.webApplication.entities.TlkKhFcxxEntity;
import com.rx.webApplication.entities.TlkKhSpxxEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/5.
 */
public class TlkKhSpxxEntityDaoImpl implements TlkKhSpxxEntityDao {
    @Override
    public List<TlkKhSpxxEntity> findShopByKhid(String khid){
        List<TlkKhSpxxEntity> tlkKhSpxxEntityList = new ArrayList<TlkKhSpxxEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_SPDZ, ITEM_SPLC, ITEM_SPXZ,ITEM_YGJE, ITEM_SPZJSY, ITEM_SPPGJZ,ID FROM tlk_kh_spxx WHERE ITEM_KHID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TlkKhSpxxEntity tlkKhSpxxEntity = new TlkKhSpxxEntity(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getDouble(5),
                        resultSet.getDouble(6),
                        resultSet.getString(7));
                tlkKhSpxxEntityList.add(tlkKhSpxxEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhSpxxEntityList;
    }
    @Override
    public TlkKhSpxxEntity findShopByid(String id){
        TlkKhSpxxEntity tlkKhSpxxEntity = new TlkKhSpxxEntity();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_SPDZ, ITEM_SPLC, ITEM_SPXZ,ITEM_YGJE, ITEM_SPZJSY, ITEM_SPPGJZ FROM tlk_kh_spxx WHERE ID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                 tlkKhSpxxEntity.TlkKhSpxxEntitybyid(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getDouble(5),
                        resultSet.getDouble(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhSpxxEntity;
    }
    @Override
    public  void  addShopByKhid(TlkKhSpxxEntity tlkKhSpxxEntity){
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "INSERT INTO tlk_kh_spxx (id,ITEM_SPDZ,ITEM_SPLC,ITEM_SPXZ,ITEM_YGJE,ITEM_SPZJSY,ITEM_SPPGJZ,ITEM_KHID,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?,?) ";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhSpxxEntity.getId());
            preparedStatement.setString(2,tlkKhSpxxEntity.getItemSpdz());
            preparedStatement.setString(3,tlkKhSpxxEntity.getItemSplc());
            preparedStatement.setString(4,tlkKhSpxxEntity.getItemSpxz());
            preparedStatement.setDouble(5,tlkKhSpxxEntity.getItemYgje());
            preparedStatement.setDouble(6,tlkKhSpxxEntity.getItemSpzjsy());
            preparedStatement.setDouble(7,tlkKhSpxxEntity.getItemSppgjz());
            preparedStatement.setString(8,tlkKhSpxxEntity.getItemKhid());
            preparedStatement.setString(9,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(10,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(11,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, tlkKhSpxxEntity.getId());
            preparedStatement.setString(2,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkKhSpxxEntity.getId());
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
    public void updateSpxxById(TlkKhSpxxEntity tlkKhSpxxEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_kh_spxx set ITEM_SPDZ = ?,ITEM_SPLC = ?,ITEM_SPXZ = ?,ITEM_YGJE = ?,ITEM_SPZJSY = ?,ITEM_SPPGJZ = ? where ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhSpxxEntity.getItemSpdz());
            preparedStatement.setString(2,tlkKhSpxxEntity.getItemSplc());
            preparedStatement.setString(3,tlkKhSpxxEntity.getItemSpxz());
            preparedStatement.setDouble(4,tlkKhSpxxEntity.getItemYgje());
            preparedStatement.setDouble(5,tlkKhSpxxEntity.getItemSpzjsy());
            preparedStatement.setDouble(6,tlkKhSpxxEntity.getItemSppgjz());
            preparedStatement.setString(7,tlkKhSpxxEntity.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }
}
