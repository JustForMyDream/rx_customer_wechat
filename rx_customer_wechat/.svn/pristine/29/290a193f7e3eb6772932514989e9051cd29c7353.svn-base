package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhClxxEntityDao;
import com.rx.webApplication.dao.TlkKhFcxxEntityDao;
import com.rx.webApplication.entities.TLkKhClxxEntity;
import com.rx.webApplication.entities.TlkKhFcxxEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2017/7/4.
 */
public class TlkKhFcxxEntityDaoImpl implements TlkKhFcxxEntityDao {
    @Override
    public List<TlkKhFcxxEntity> findHouseByKhid(String khid){
        List<TlkKhFcxxEntity> tlkKhFcxxEntityDaoList = new ArrayList<TlkKhFcxxEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql=" SELECT ID,ITEM_FCXZ , ITEM_JZLX , ITEM_SZSFQQ,ITEM_GFSJ,ITEM_JZMJ,ITEM_YGJE ,ITEM_SCDJ,ITEM_FCDZ FROM  tlk_kh_fcxx WHERE ITEM_KHID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TlkKhFcxxEntity tlkKhFcxxEntity = new TlkKhFcxxEntity(
                        resultSet.getString("ITEM_FCXZ"),
                        resultSet.getDouble("ITEM_YGJE"),
                        resultSet.getString("ITEM_JZLX"),
                        resultSet.getString("ITEM_SZSFQQ"),
                        resultSet.getDate("ITEM_GFSJ"),
                        resultSet.getString("ITEM_JZMJ"),
                        resultSet.getDouble("ITEM_SCDJ"),
                        resultSet.getString("ID"),
                        resultSet.getString("ITEM_FCDZ"));
                tlkKhFcxxEntityDaoList.add(tlkKhFcxxEntity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhFcxxEntityDaoList;
    }
    @Override
    public  TlkKhFcxxEntity findHouseByid(String id){
        TlkKhFcxxEntity tlkKhFcxxEntity = new TlkKhFcxxEntity();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql=" SELECT ITEM_FCXZ,ITEM_JZLX,ITEM_SZSFQQ,ITEM_GFSJ,ITEM_JZMJ,ITEM_YGJE ,ITEM_SCDJ,ITEM_FCDZ FROM  tlk_kh_fcxx WHERE ID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                tlkKhFcxxEntity.TlkKhFcxxEntitybyid(
                        resultSet.getString("ITEM_FCXZ"),
                        resultSet.getDouble("ITEM_YGJE"),
                        resultSet.getString("ITEM_JZLX"),
                        resultSet.getString("ITEM_SZSFQQ"),
                        resultSet.getDate("ITEM_GFSJ"),
                        resultSet.getString("ITEM_JZMJ"),
                        resultSet.getDouble("ITEM_SCDJ"),
                        resultSet.getString("ITEM_FCDZ"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhFcxxEntity;
    }


    @Override
    public void  addHouseByKhid(TlkKhFcxxEntity tlkKhFcxxEntity){
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "insert into tlk_kh_fcxx (ID,ITEM_FCXZ,ITEM_YGJE,ITEM_JZLX,ITEM_SZSFQQ,ITEM_GFSJ,ITEM_JZMJ,ITEM_SCDJ,ITEM_KHID,ITEM_FCDZ,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhFcxxEntity.getId());
            preparedStatement.setString(2,tlkKhFcxxEntity.getItemFcxz());
            preparedStatement.setDouble(3,tlkKhFcxxEntity.getItemYgje());
            preparedStatement.setString(4,tlkKhFcxxEntity.getItemJzlx());
            preparedStatement.setString(5,tlkKhFcxxEntity.getItemSzsfqq());
            preparedStatement.setDate(6,tlkKhFcxxEntity.getItemGfsj());
            preparedStatement.setString(7,tlkKhFcxxEntity.getItemJzmj());
            preparedStatement.setDouble(8,tlkKhFcxxEntity.getItemScdj());
            preparedStatement.setString(9,tlkKhFcxxEntity.getItemKhid());
            preparedStatement.setString(10,tlkKhFcxxEntity.getItemFcdz());
            preparedStatement.setString(11,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(12,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(13,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, tlkKhFcxxEntity.getId());
            preparedStatement.setString(2,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkKhFcxxEntity.getId());
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
    public void updateFcxxById(TlkKhFcxxEntity tlkKhFcxxEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_kh_fcxx set ITEM_FCXZ = ?,ITEM_YGJE = ?,ITEM_JZLX = ?,ITEM_SZSFQQ = ?,ITEM_GFSJ = ?,ITEM_JZMJ = ?,ITEM_SCDJ = ?,ITEM_FCDZ= ? where ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhFcxxEntity.getItemFcxz());
            preparedStatement.setDouble(2,tlkKhFcxxEntity.getItemYgje());
            preparedStatement.setString(3,tlkKhFcxxEntity.getItemJzlx());
            preparedStatement.setString(4,tlkKhFcxxEntity.getItemSzsfqq());
            preparedStatement.setDate(5,tlkKhFcxxEntity.getItemGfsj());
            preparedStatement.setString(6,tlkKhFcxxEntity.getItemJzmj());
            preparedStatement.setDouble(7,tlkKhFcxxEntity.getItemScdj());
            preparedStatement.setString(8,tlkKhFcxxEntity.getItemFcdz());
            preparedStatement.setString(9,tlkKhFcxxEntity.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }
}
