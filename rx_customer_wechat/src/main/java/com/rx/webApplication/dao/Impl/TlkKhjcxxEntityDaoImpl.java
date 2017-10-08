package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhjcxxEntityDao;
import com.rx.webApplication.entities.TLkKhjcxxEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by 王玉粮 on 2017/7/1.
 */
public class TlkKhjcxxEntityDaoImpl implements TlkKhjcxxEntityDao {


    @Override
    public String findByPhone(String phone) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String khid = "";
        String sql = "select id from tlk_khjcxx where item_sjhm = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                 khid = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return khid;
    }

    @Override
    public TLkKhjcxxEntity getById(String id) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        TLkKhjcxxEntity tLkKhjcxxEntity = null;
        String sql = "select item_khxm,item_khxb,item_sjhm,item_zjhm,item_sfzhm" +
                ",item_zxxx,item_ywzxyq, item_yqbs,item_zylb,item_gznx,item_gzfffs," +
                "item_ygzsr from tlk_khjcxx where id = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                tLkKhjcxxEntity = new TLkKhjcxxEntity(
                        id,
                        resultSet.getString("item_khxm"),
                        resultSet.getString("item_khxb"),
                        resultSet.getString("item_sfzhm"),
                        resultSet.getString("item_zxxx"),
                        resultSet.getString("item_ywzxyq"),
                        resultSet.getString("item_yqbs"),
                        resultSet.getString("item_zylb"),
                        resultSet.getDouble("item_ygzsr"),
                        resultSet.getString("item_gznx"),
                        resultSet.getString("item_gzfffs"),
                        resultSet.getString("item_zjhm"),
                        resultSet.getString("item_sjhm")
                        );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBFactory.closeConn(connection);
        }
        return tLkKhjcxxEntity;
    }

    @Override
    public int updateById(TLkKhjcxxEntity tLkKhjcxxEntity) {
        int resultSet =0;
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql="UPDATE TLK_KHJCXX SET ITEM_KHXM =? ,ITEM_KHXB=?,ITEM_ZJHM=?,ITEM_SFZHM=?,ITEM_ZXXX=?," +
                "ITEM_YWZXYQ=?,ITEM_YQBS=?,ITEM_ZYLB=?,ITEM_GZNX=?,ITEM_GZFFFS=?,ITEM_YGZSR=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tLkKhjcxxEntity.getItemKhxm());
            preparedStatement.setString(2, tLkKhjcxxEntity.getItemKhxb());
            preparedStatement.setString(3, tLkKhjcxxEntity.getItemZjhm());
            preparedStatement.setString(4, tLkKhjcxxEntity.getItemSfzhm());
            preparedStatement.setString(5, tLkKhjcxxEntity.getItemZxxx());
            preparedStatement.setString(6, tLkKhjcxxEntity.getItemYwzxyq());
            preparedStatement.setString(7, tLkKhjcxxEntity.getItemYqbs());
            preparedStatement.setString(8, tLkKhjcxxEntity.getItemZylb());
            preparedStatement.setString(9, tLkKhjcxxEntity.getItemGznx());
            preparedStatement.setString(10, tLkKhjcxxEntity.getItemGzfffs());
            preparedStatement.setDouble(11, tLkKhjcxxEntity.getItemYgzsr());
            preparedStatement.setString(12, tLkKhjcxxEntity.getId());
            resultSet = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return resultSet;
    }

    @Override
    public int insert(String phone) {
        return 0;
    }

    @Override
    public void insertIntoIdAndPhone(String id, String phone,String openid,String item_sjly) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "insert into tlk_khjcxx (ID,ITEM_SJHM,FORMID,APPLICATIONID,DOMAINID,ITEM_ZXZT,ITEM_SJLY,ITEM_SSZX,ITEM_SSBM,ITEM_SSR) values(?,?,?,?,?,?,?,?,?,?)";
        String sql2 = "insert into t_document (ID,FORMID,APPLICATIONID,DOMAINID,MAPPINGID) values(?,?,?,?,?)";
        String sql3 = "update tlk_wechatuser set ITEM_KHID = ?,ITEM_PHONE = ? where ITEM_OPENID = ?";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,phone);
            preparedStatement.setString(3,"11e7-092a-d4f9db26-8cc3-197c3ff9a909");
            preparedStatement.setString(4,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(5,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(6,"未呼叫");
            preparedStatement.setString(7,item_sjly);
            preparedStatement.setString(8,"11e7-3524-74bac05f-88b6-fd27e676f615");
            preparedStatement.setString(9,"11e7-3524-74bac05f-88b6-fd27e676f615");
            preparedStatement.setString(10,"11e7-0a26-b045f8a7-8cc3-197c3ff9a909");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1,UUID.randomUUID().toString());
            preparedStatement.setString(2,"11e7-092a-d4f9db26-8cc3-197c3ff9a909");
            preparedStatement.setString(3,"11e7-0623-fac31391-a5a3-c506aa970905");
            preparedStatement.setString(4,"11e1-81e2-37f74759-9124-47aada6b7467");
            preparedStatement.setString(5,id);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql3);
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,phone);
            preparedStatement.setString(3,openid);
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
    public String judgeByPhone(String phone) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "select ITEM_SJHM from tlk_khjcxx where ITEM_SJHM = ?";
        String phoneNumber = "";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                phoneNumber = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return phoneNumber;
    }

    @Override
    public TLkKhjcxxEntity findByOpenId(String openid) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        TLkKhjcxxEntity tLkKhjcxxEntity = null;
        String sql = "SELECT k.ITEM_KHXM,k.ITEM_SJHM from tlk_khjcxx as k INNER JOIN tlk_wechatuser w WHERE k.ID = w.ITEM_KHID AND w.ITEM_OPENID = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,openid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                tLkKhjcxxEntity = new TLkKhjcxxEntity(resultSet.getString(1),resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tLkKhjcxxEntity;
    }

    @Override
    public void UpdateNameByPhone(String name,String phone) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "update tlk_khjcxx set ITEM_KHXM = ? where ITEM_SJHM = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,phone);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
    }

    @Override
    public String judgeSSRBYPhone(String phone) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "select ITEM_SSR from tlk_khjcxx where ITEM_SJHM = ?";
        String ssr = "";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,phone);
            ResultSet resultSet =  preparedStatement.executeQuery();
            while (resultSet.next()){
                ssr = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ssr;
    }

    @Override
    public String findSSRIdByPhone(String phone) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "select ITEM_SSR from tlk_khjcxx where ITEM_SJHM = ? ";
        String ssr = "";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                ssr = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return ssr;
    }

    @Override
    public String findSSROpenidById(String id) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection2();
       String sql = "select FIELD6 from t_user where ID = ?";
        String openid = "";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                openid = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return openid;
    }

    @Override
    public List findAllUserOpenidByRoleName(String roleName) {
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection2();
        List list = new ArrayList();
        String sql = "SELECT FIELD6 from t_user u ,t_user_role_set ur,t_role r WHERE u.ID = ur.USERID and ur.ROLEID = r.ID AND r.NAME = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,roleName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return list;
    }


}
