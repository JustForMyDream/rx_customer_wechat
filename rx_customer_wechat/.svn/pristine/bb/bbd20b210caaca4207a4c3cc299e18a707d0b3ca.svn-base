package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TLkKhCbxxEntityDao;
import com.rx.webApplication.entities.TLkKhCbxxEntity;
import com.rx.webApplication.entities.TlkKhGjjxxEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/5.
 */
public class TLkKhCbxxEntityDaoImpl implements TLkKhCbxxEntityDao {
    @Override
    public List<TLkKhCbxxEntity> findCbxxByKhid(String khid){
        List<TLkKhCbxxEntity> tLkKhCbxxEntityList = new ArrayList<TLkKhCbxxEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_CBZL,ITEM_SBBH,ITEM_DWMC,ITEM_RYSSQY,ITEM_SFTX,ITEM_CBKSSJ,ITEM_DQZT,ID FROM tlk_kh_cbxx WHERE ITEM_KHID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TLkKhCbxxEntity tLkKhCbxxEntity = new TLkKhCbxxEntity(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getDate(6),
                        resultSet.getString(7),
                        resultSet.getString(8));
                tLkKhCbxxEntityList.add(tLkKhCbxxEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }


        return tLkKhCbxxEntityList;
    }
    @Override
    public TLkKhCbxxEntity findCbxxByid(String id){
        TLkKhCbxxEntity tLkKhCbxxEntity = new TLkKhCbxxEntity();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_CBZL,ITEM_SBBH,ITEM_DWMC,ITEM_RYSSQY,ITEM_SFTX,ITEM_CBKSSJ,ITEM_DQZT FROM tlk_kh_cbxx WHERE ID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            while (resultSet.next()){
                tLkKhCbxxEntity.TLkKhCbxxEntitybyid(
                        resultSet.getString("ITEM_CBZL"),
                        resultSet.getString("ITEM_SBBH"),
                        resultSet.getString("ITEM_DWMC"),
                        resultSet.getString("ITEM_RYSSQY"),
                        resultSet.getString("ITEM_SFTX"),
                        resultSet.getDate("ITEM_CBKSSJ"),
                        resultSet.getString("ITEM_DQZT"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tLkKhCbxxEntity;
    }

    public void addCbxxByKhid(TLkKhCbxxEntity tLkKhCbxxEntity){
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "INSERT INTO tlk_kh_cbxx (id,ITEM_CBZL,ITEM_SBBH,ITEM_DWMC,ITEM_RYSSQY,ITEM_SFTX,ITEM_CBKSSJ,ITEM_DQZT,ITEM_KHID,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?,?,?) ";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tLkKhCbxxEntity.getId());
            preparedStatement.setString(2,tLkKhCbxxEntity.getItemCbzl());
            preparedStatement.setString(3,tLkKhCbxxEntity.getItemSsbh());
            preparedStatement.setString(4,tLkKhCbxxEntity.getItemDwmc());
            preparedStatement.setString(5,tLkKhCbxxEntity.getItemRyssqy());
            preparedStatement.setString(6,tLkKhCbxxEntity.getItemSftx());
            preparedStatement.setDate(7,tLkKhCbxxEntity.getItemCbkssj());
            preparedStatement.setString(8,tLkKhCbxxEntity.getItemDqzt());
            preparedStatement.setString(9,tLkKhCbxxEntity.getItemKhid());
            preparedStatement.setString(10,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(11,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(12,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, tLkKhCbxxEntity.getId());
            preparedStatement.setString(2,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tLkKhCbxxEntity.getId());
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
    public void updateCbxxById(TLkKhCbxxEntity tLkKhCbxxEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_kh_cbxx set ITEM_CBZL = ?,ITEM_SBBH = ?,ITEM_DWMC = ?,ITEM_RYSSQY = ?,ITEM_SFTX = ?,ITEM_CBKSSJ = ?,ITEM_DQZT = ?where ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tLkKhCbxxEntity.getItemCbzl());
            preparedStatement.setString(2,tLkKhCbxxEntity.getItemSsbh());
            preparedStatement.setString(3,tLkKhCbxxEntity.getItemDwmc());
            preparedStatement.setString(4,tLkKhCbxxEntity.getItemRyssqy());
            preparedStatement.setString(5,tLkKhCbxxEntity.getItemSftx());
            preparedStatement.setDate(6,tLkKhCbxxEntity.getItemCbkssj());
            preparedStatement.setString(7,tLkKhCbxxEntity.getItemDqzt());
            preparedStatement.setString(8,tLkKhCbxxEntity.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }
}
