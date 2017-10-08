package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhGjjxxEntityDao;
import com.rx.webApplication.entities.TlkKhGjjxxEntity;
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
public class TlkKhGjjxxEntityDaoImpl implements TlkKhGjjxxEntityDao {
    @Override
    public List<TlkKhGjjxxEntity> findGjjByKhid(String khid){
        List<TlkKhGjjxxEntity> tlkKhGjjxxEntityList = new ArrayList<TlkKhGjjxxEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_GJJJCKSSJ,ITEM_GJJJCJSSJ,ITEM_ZHZT,ITEM_BZ,ITEM_ZHYE,ITEM_YJCJE,ID FROM tlk_kh_gjjxx WHERE ITEM_KHID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TlkKhGjjxxEntity tlkKhGjjxxEntity = new TlkKhGjjxxEntity(
                        resultSet.getDate(1),
                        resultSet.getDate(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDouble(5),
                        resultSet.getDouble(6),
                        resultSet.getString(7));
                tlkKhGjjxxEntityList.add(tlkKhGjjxxEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }

        return tlkKhGjjxxEntityList;
    }
    @Override
    public TlkKhGjjxxEntity findGjjByid(String id){
        TlkKhGjjxxEntity tlkKhGjjxxEntity = new TlkKhGjjxxEntity();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_GJJJCKSSJ,ITEM_GJJJCJSSJ,ITEM_ZHZT,ITEM_BZ,ITEM_ZHYE,ITEM_YJCJE FROM tlk_kh_gjjxx WHERE ID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                tlkKhGjjxxEntity. TlkKhGjjxxEntitybyid(
                        resultSet.getDate(1),
                        resultSet.getDate(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDouble(5),
                        resultSet.getDouble(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhGjjxxEntity;
    }
    @Override
    public void addGjjByKhid(TlkKhGjjxxEntity tlkKhGjjxxEntity){
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "INSERT INTO tlk_kh_gjjxx (id,ITEM_GJJJCKSSJ,ITEM_GJJJCJSSJ,ITEM_ZHZT,ITEM_BZ,ITEM_ZHYE,ITEM_YJCJE,ITEM_KHID,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?,?) ";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhGjjxxEntity.getId());
            preparedStatement.setDate(2,tlkKhGjjxxEntity.getItemGjjjckssj());
            preparedStatement.setDate(3,tlkKhGjjxxEntity.getItemGjjjcjssj());
            preparedStatement.setString(4,tlkKhGjjxxEntity.getItemZhzt());
            preparedStatement.setString(5,tlkKhGjjxxEntity.getItemBz());
            preparedStatement.setDouble(6,tlkKhGjjxxEntity.getItemZhye());
            preparedStatement.setDouble(7,tlkKhGjjxxEntity.getItemYjcje());
            preparedStatement.setString(8,tlkKhGjjxxEntity.getItemKhid());
            preparedStatement.setString(9,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(10,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(11,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, tlkKhGjjxxEntity.getId());
            preparedStatement.setString(2,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkKhGjjxxEntity.getId());
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
    public void UpdateGjjById(TlkKhGjjxxEntity tlkKhGjjxxEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_kh_gjjxx set ITEM_GJJJCKSSJ = ?,ITEM_GJJJCJSSJ = ?,ITEM_ZHZT = ?,ITEM_BZ = ?,ITEM_ZHYE = ?,ITEM_YJCJE = ? where ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1,tlkKhGjjxxEntity.getItemGjjjckssj());
            preparedStatement.setDate(2,tlkKhGjjxxEntity.getItemGjjjcjssj());
            preparedStatement.setString(3,tlkKhGjjxxEntity.getItemZhzt());
            preparedStatement.setString(4,tlkKhGjjxxEntity.getItemBz());
            preparedStatement.setDouble(5,tlkKhGjjxxEntity.getItemZhye());
            preparedStatement.setDouble(6,tlkKhGjjxxEntity.getItemYjcje());
            preparedStatement.setString(7,tlkKhGjjxxEntity.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }
}
