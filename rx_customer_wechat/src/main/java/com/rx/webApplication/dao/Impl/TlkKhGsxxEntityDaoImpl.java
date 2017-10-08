package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhGsxxEntityDao;
import com.rx.webApplication.entities.TlkKhGjjxxEntity;
import com.rx.webApplication.entities.TlkKhGsxxEntity;
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
public class TlkKhGsxxEntityDaoImpl implements TlkKhGsxxEntityDao {
    @Override
    public List<TlkKhGsxxEntity> findGsxxByKhid(String khid){
        List<TlkKhGsxxEntity> tlkKhGsxxEntityList =new ArrayList<TlkKhGsxxEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_DWMC,ITEM_DWDZ,ITEM_DWXZ,ITEM_JYMS,ITEM_ZW,ID,ITEM_YWYYZZ FROM tlk_kh_gsxx WHERE ITEM_KHID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TlkKhGsxxEntity tlkKhGsxxEntity = new TlkKhGsxxEntity(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7));
                tlkKhGsxxEntityList.add(tlkKhGsxxEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }

        return tlkKhGsxxEntityList;

    }

    @Override
    public TlkKhGsxxEntity findGsxxByid(String id){
        TlkKhGsxxEntity tlkKhGsxxEntity = new TlkKhGsxxEntity();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT ITEM_DWMC,ITEM_DWDZ,ITEM_DWXZ,ITEM_JYMS,ITEM_ZW,ITEM_JYCS,ITEM_NYYE,ITEM_DWDH,ITEM_YSZK,ITEM_CLSJ,ITEM_FZQK,ITEM_CHJZ,ITEM_YWYYZZ FROM tlk_kh_gsxx WHERE ID =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                 tlkKhGsxxEntity.TlkKhGsxxEntitybyid(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                         resultSet.getString(6),
                         resultSet.getDouble(7),
                         resultSet.getString(8),
                         resultSet.getDouble(9),
                         resultSet.getDate(10),
                         resultSet.getDouble(11),
                         resultSet.getDouble(12),
                         resultSet.getString(13));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkKhGsxxEntity;
    }


    @Override
    public void addGsxxByKhid(TlkKhGsxxEntity tlkKhGsxxEntity){
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "INSERT INTO tlk_kh_gsxx (id,ITEM_DWMC,ITEM_JYCS,ITEM_DWDZ, ITEM_DWXZ,ITEM_DWDH, ITEM_JYMS,ITEM_CLSJ, ITEM_ZW,\n" +
                "ITEM_NYYE,ITEM_YSZK,ITEM_FZQK,ITEM_CHJZ,ITEM_KHID,ITEM_YWYYZZ,FORMID,APPLICATIONID,DOMAINID) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhGsxxEntity.getId());
            preparedStatement.setString(2,tlkKhGsxxEntity.getItemDwmc());
            preparedStatement.setString(3,tlkKhGsxxEntity.getItemJycs());
            preparedStatement.setString(4,tlkKhGsxxEntity.getItemDwdz());
            preparedStatement.setString(5,tlkKhGsxxEntity.getItemDwxz());
            preparedStatement.setString(6,tlkKhGsxxEntity.getItemDwdh());
            preparedStatement.setString(7,tlkKhGsxxEntity.getItemJyms());
            preparedStatement.setDate(8,tlkKhGsxxEntity.getItemClsj());
            preparedStatement.setString(9,tlkKhGsxxEntity.getItemZw());
            preparedStatement.setDouble(10,tlkKhGsxxEntity.getItemNyye());
            preparedStatement.setDouble(11,tlkKhGsxxEntity.getItemYszk());
            preparedStatement.setDouble(12,tlkKhGsxxEntity.getItemFzqk());
            preparedStatement.setDouble(13,tlkKhGsxxEntity.getItemChjz());
            preparedStatement.setString(14,tlkKhGsxxEntity.getItemKhid());
            preparedStatement.setString(15,tlkKhGsxxEntity.getItemYwyyzz());
            preparedStatement.setString(16,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(17,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(18,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, tlkKhGsxxEntity.getId());
            preparedStatement.setString(2,"11e7-60be-31b38229-9c01-154e3e59e308");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,tlkKhGsxxEntity.getId());
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
    public void updateGsxxById(TlkKhGsxxEntity tlkKhGsxxEntity) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_kh_gsxx set ITEM_DWMC = ?,ITEM_JYCS = ?,ITEM_DWDZ = ?, ITEM_DWXZ = ?,ITEM_DWDH = ?, ITEM_JYMS = ?," +
                "ITEM_CLSJ = ?,ITEM_ZW = ?,ITEM_NYYE = ?,ITEM_YSZK = ?,ITEM_FZQK = ?,ITEM_CHJZ = ?,ITEM_YWYYZZ = ? where ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tlkKhGsxxEntity.getItemDwmc());
            preparedStatement.setString(2,tlkKhGsxxEntity.getItemJycs());
            preparedStatement.setString(3,tlkKhGsxxEntity.getItemDwdz());
            preparedStatement.setString(4,tlkKhGsxxEntity.getItemDwxz());
            preparedStatement.setString(5,tlkKhGsxxEntity.getItemDwdh());
            preparedStatement.setString(6,tlkKhGsxxEntity.getItemJyms());
            preparedStatement.setDate(7,tlkKhGsxxEntity.getItemClsj());
            preparedStatement.setString(8,tlkKhGsxxEntity.getItemZw());
            preparedStatement.setDouble(9,tlkKhGsxxEntity.getItemNyye());
            preparedStatement.setDouble(10,tlkKhGsxxEntity.getItemYszk());
            preparedStatement.setDouble(11,tlkKhGsxxEntity.getItemFzqk());
            preparedStatement.setDouble(12,tlkKhGsxxEntity.getItemChjz());
            preparedStatement.setString(13,tlkKhGsxxEntity.getItemYwyyzz());
            preparedStatement.setString(14,tlkKhGsxxEntity.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }

}
