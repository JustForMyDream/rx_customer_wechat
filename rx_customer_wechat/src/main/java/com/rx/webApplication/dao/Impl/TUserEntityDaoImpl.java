package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TUserEntityDao;
import com.rx.webApplication.entities.TUserEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by aria on 2017/7/17.
 */
public class TUserEntityDaoImpl implements TUserEntityDao {

    @Override
    public TUserEntity getByUserId(String userId) {
        String sql = "SELECT id,telephone,loginno,loginpwd,field6 FROM T_USER WHERE FIELD6=?";
        return getBySql(sql,userId);
    }

    @Override
    public TUserEntity getByPhone(String phone) {
        String sql = "SELECT id,telephone,loginno,loginpwd,field6 FROM T_USER WHERE telephone=?";
        return getBySql(sql,phone);
    }

    @Override
    public int updateByPhone(TUserEntity tUserEntity){
        int resultSet =0;
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection2();
        String sql="UPDATE T_USER SET FIELD6 =? WHERE telephone=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tUserEntity.getField6());
            preparedStatement.setString(2, tUserEntity.getTelephone());
            resultSet = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return resultSet;
    }

    public TUserEntity getBySql(String sql, String para) {
        TUserEntity tUserEntity = null;
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection2();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, para);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                tUserEntity = new TUserEntity();
                tUserEntity.setId(resultSet.getString("id"));
                tUserEntity.setLoginno(resultSet.getString("loginno"));
                tUserEntity.setLoginpwd(resultSet.getString("loginpwd"));
                tUserEntity.setTelephone(resultSet.getString("telephone"));
                tUserEntity.setField6(resultSet.getString("field6"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBFactory.closeConn(connection);
        }
        return tUserEntity;
    }

}
