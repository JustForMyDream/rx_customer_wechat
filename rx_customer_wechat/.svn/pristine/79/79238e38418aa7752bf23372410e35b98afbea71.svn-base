package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkEnterpriseWeChatTokenDao;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by aria on 2017/7/29.
 */
public class TlkEnterpriseWeChatTokenDaoImpl implements TlkEnterpriseWeChatTokenDao{

    @Override
    public String getToken() {
        String token=null;
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = "SELECT ITEM_ACCESSTOKEN FROM  obpm_crm_new.tlk_enterprisewechattoken ORDER BY CREATED DESC LIMIT 1";
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                token=resultSet.getString(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return token;
    }
}
