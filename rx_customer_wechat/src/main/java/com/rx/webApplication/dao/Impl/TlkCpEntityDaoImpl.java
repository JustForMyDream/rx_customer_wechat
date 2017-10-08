package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkCpEntityDao;
import com.rx.webApplication.entities.TlkCpEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李静 on 2017/7/26.
 */
public class TlkCpEntityDaoImpl implements TlkCpEntityDao {
    @Override
    public  List<TlkCpEntity> findallcp(){
        List<TlkCpEntity> tlkCpEntityList = new ArrayList<TlkCpEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT id,ITEM_CPMC,ITEM_HKZDLL,ITEM_FKZGJE,ITEM_ZDQS FROM tlk_cp";
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                TlkCpEntity tlkCpEntity = new TlkCpEntity(
                        resultSet.getString("id"),
                        resultSet.getString("ITEM_CPMC"),
                        resultSet.getDouble("ITEM_HKZDLL"),
                        resultSet.getDouble("ITEM_FKZGJE"),
                        resultSet.getDouble("ITEM_ZDQS")
                );
                tlkCpEntityList.add(tlkCpEntity);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return  tlkCpEntityList;
    }
    @Override
    public  List<TlkCpEntity>  findallcp(Integer page, Integer pagesize){
        List<TlkCpEntity> tlkCpEntityList = new ArrayList<TlkCpEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        int star=(page-1)*pagesize;
        int end=pagesize;
        String sql="SELECT id,ITEM_CPMC,ITEM_HKZDLL,ITEM_FKZGJE,ITEM_ZDQS FROM tlk_cp LIMIT ?,?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,star);
            preparedStatement.setInt(2,end);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TlkCpEntity tlkCpEntity = new TlkCpEntity(
                        resultSet.getString("id"),
                        resultSet.getString("ITEM_CPMC"),
                        resultSet.getDouble("ITEM_HKZDLL"),
                        resultSet.getDouble("ITEM_FKZGJE"),
                        resultSet.getDouble("ITEM_ZDQS")
                );
                tlkCpEntityList.add(tlkCpEntity);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }
        return  tlkCpEntityList;
    }
    @Override
    public  List<TlkCpEntity> findallcpBylx(String cplx){
        List<TlkCpEntity> tlkCpEntityList = new ArrayList<TlkCpEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="SELECT id,ITEM_CPMC,ITEM_HKZDLL,ITEM_FKZGJE,ITEM_ZDQS FROM tlk_cp WHERE ITEM_CPLX=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cplx);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TlkCpEntity tlkCpEntity = new TlkCpEntity(
                        resultSet.getString("id"),
                        resultSet.getString("ITEM_CPMC"),
                        resultSet.getDouble("ITEM_HKZDLL"),
                        resultSet.getDouble("ITEM_FKZGJE"),
                        resultSet.getDouble("ITEM_ZDQS")
                );
                tlkCpEntityList.add(tlkCpEntity);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBFactory.closeConn(connection);
        }
        return  tlkCpEntityList;
    }
    @Override
    public  List<TlkCpEntity> findallcpBylx(Integer page, Integer pagesize,String cplx){
        List<TlkCpEntity> tlkCpEntityList = new ArrayList<TlkCpEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        int star=(page-1)*pagesize;
        int end=pagesize;
        String sql="SELECT id,ITEM_CPMC,ITEM_HKZDLL,ITEM_FKZGJE,ITEM_ZDQS FROM tlk_cp WHERE ITEM_CPLX= ? LIMIT ?,?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cplx);
            preparedStatement.setInt(2, star);
            preparedStatement.setInt(3,end);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                TlkCpEntity tlkCpEntity = new TlkCpEntity(
                        resultSet.getString("id"),
                        resultSet.getString("ITEM_CPMC"),
                        resultSet.getDouble("ITEM_HKZDLL"),
                        resultSet.getDouble("ITEM_FKZGJE"),
                        resultSet.getDouble("ITEM_ZDQS")
                );
                tlkCpEntityList.add(tlkCpEntity);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return  tlkCpEntityList;
    }
    @Override
    public TlkCpEntity findCpDetailInforById(String cpid) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        TlkCpEntity tlkCpEntity = null;
        String sql = "select ITEM_CPJJ,ITEM_JJYQ,ITEM_CPMC from tlk_cp where ID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cpid);
            ResultSet resultSet =  preparedStatement.executeQuery();
            while (resultSet.next()){
                String cpjj = resultSet.getString(1);
                String jjyq = resultSet.getString(2);
                String cpmc = resultSet.getString(3);
                tlkCpEntity = new TlkCpEntity(cpmc,jjyq,cpjj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkCpEntity;
    }
}
