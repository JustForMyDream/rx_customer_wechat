


package com.rx.webApplication.dao.Impl;

import com.rx.webApplication.dao.TlkKhQdxxEntityDao;
import com.rx.webApplication.entities.TlkQdcpEntity;
import com.rx.webApplication.entities.TlkZdjlEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 1010 on 2017-07-02.
 */
public class TlkKhQdxxEntityDaoImpl implements TlkKhQdxxEntityDao {

    @Override
    public List findKhZtqdBykhid(String khid) {
        List list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();

//        SELECT ITEM_QDH,ITEM_QDSJ,ITEM_DKJE,ITEM_QDR,t_user.NAME, ITEM_DKLX FROM obpm_crm_new.tlk_qdxx AS tlk_qdxx
//        " +
//        "\tINNER \tJOIN obpm.t_user  AS t_user ON  tlk_qdxx.ITEM_QDR = t_user.ID \t\n" +
//                "	WHERE tlk_qdxx.STATELABEL = '做单中'and tlk_qdxx.ITEM_KHID =  ?

        String qdcpsql = "SELECT ITEM_CPMC , tlk_qdcp.ITEM_FGS , ITEM_CPZXID , tlk_qdxx.ITEM_KHID AS 客户Id , ITEM_CPJLID FROM tlk_qdcp , tlk_qdxx WHERE\n" +
                " tlk_qdxx.ID = tlk_qdcp.ITEM_QDID AND tlk_qdxx.ITEM_KHID = ?";

        String sql = "SELECT DISTINCT ITEM_QDH, ITEM_QDSJ, ITEM_DKJE, ITEM_QDR, kh_user.NAME , ITEM_DKLX ,\n" +
                "obpm.t_department.NAME   ,obpm_crm_new.tlk_qdxx.ID \n" +
                "\tFROM obpm_crm_new.tlk_qdxx AS tlk_qdxx \n" +
                "\tINNER \tJOIN obpm.t_user  AS kh_user ON  tlk_qdxx.ITEM_QDR = kh_user.ID \t\n" +
                "\t\tAND  tlk_qdxx.STATELABEL = '做单中' AND  tlk_qdxx.ITEM_KHID =  ? \n" +
                "\tJOIN obpm_crm_new.tlk_qdcp AS tlk_qdcp ON tlk_qdcp.ITEM_QDID = tlk_qdxx.ID \n" +
                "\tJOIN obpm.t_department ON tlk_qdcp.ITEM_CPZXID = obpm.t_department.ID";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String qdh = resultSet.getString(1);
                Timestamp qdsj = resultSet.getTimestamp(2);
                Double dkje = resultSet.getDouble(3);
                String qdr = resultSet.getString(4);
                String khname = resultSet.getString(5);
                String dklx = resultSet.getString(6);
                String cpmc = resultSet.getString(7);  // 产品中心
                String qdxxid = resultSet.getString(8);
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                map.put("qdh", qdh);
                map.put("qdsj", df.format(qdsj));
                map.put("dkje", dkje);
                map.put("qdr",qdr );
                map.put("khname", khname);
                map.put("khdklx", dklx);  // 贷款类型
                map.put("cpmc", cpmc);
                map.put("qdxxid", qdxxid);
                list.add(map);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return list;
    }


    @Override
    public List  findKhQdlbByQdxxid(String khid) {
        List list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();

        String qdcpsql = "SELECT ITEM_CPMC , tlk_qdcp.ITEM_FGS , ITEM_CPZXID , tlk_qdxx.ITEM_KHID AS 客户Id , ITEM_CPJLID FROM tlk_qdcp , tlk_qdxx WHERE\n" +
                " tlk_qdxx.ID = tlk_qdcp.ITEM_QDID AND tlk_qdxx.ITEM_KHID = ?";

        String sql = "SELECT DISTINCT ITEM_QDH, ITEM_QDSJ, ITEM_DKJE, ITEM_QDR, kh_user.NAME , ITEM_DKLX ,\n" +
                "obpm.t_department.NAME   ,obpm_crm_new.tlk_qdxx.ID FROM obpm_crm_new.tlk_qdxx AS tlk_qdxx \n" +
                "INNER JOIN obpm.t_user  AS kh_user ON  tlk_qdxx.ITEM_QDR = kh_user.ID \n" +
                "AND  tlk_qdxx.ITEM_KHID =  ?" +
                "JOIN obpm_crm_new.tlk_qdcp AS tlk_qdcp ON tlk_qdcp.ITEM_QDID = tlk_qdxx.ID \n" +
                "JOIN obpm.t_department ON tlk_qdcp.ITEM_CPZXID = obpm.t_department.ID";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String qdh = resultSet.getString(1);
                Timestamp qdsj = resultSet.getTimestamp(2);
                Double dkje = resultSet.getDouble(3);
                String qdr = resultSet.getString(4);
                String khname = resultSet.getString(5);
                String dklx = resultSet.getString(6);
                String cpmc = resultSet.getString(7);  // 产品中心
                String qdxxid = resultSet.getString(8);
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

                map.put("qdh", qdh);
                map.put("qdsj", df.format(qdsj));
                map.put("dkje", dkje);
                map.put("qdr", qdr);
                map.put("khname", khname);
                map.put("khdklx", dklx);  // 贷款类型
                map.put("cpmc", cpmc);
                map.put("qdxxid", qdxxid);
                list.add(map);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return list;
    }

    @Override
    public TlkQdcpEntity findKhQdxqBykhid(String qdid) {
        TlkQdcpEntity tlkQdcpEntity = new TlkQdcpEntity();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();


        String sql = "SELECT obpm.t_department.SUPERIOR , obpm.t_department.NAME  , ITEM_CPMC ,  obpm.t_user.NAME ,obpm_crm_new.tlk_qdcp.ID \n" +
                "FROM obpm_crm_new.tlk_qdcp JOIN obpm.t_department ON obpm.t_department.ID = obpm_crm_new.tlk_qdcp.ITEM_CPZXID AND\n" +
                " obpm_crm_new.tlk_qdcp.ITEM_QDID  = ? \n" +
                " JOIN obpm.t_user ON obpm_crm_new.tlk_qdcp.ITEM_CPJLID = obpm.t_user.ID";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, qdid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String fgsName = findFgsByID(resultSet.getString(1));
                tlkQdcpEntity = new TlkQdcpEntity(fgsName, resultSet.getString(3), resultSet.getString(2)
                        , resultSet.getString(4), qdid);
                //!!!!!!!!!!!!!!!!!!map.put("fgsName", findFgsByID(fgsid));  // fgs信息
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return tlkQdcpEntity;
    }

    @Override
    public String findFgsByID(String fgsId) {
        List list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String fgsName = "";

        String sql = "SELECT obpm.t_department.NAME FROM obpm.t_department WHERE obpm.t_department.ID = ? ";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fgsId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                fgsName = resultSet.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return fgsName;
    }

    @Override
    public List<TlkZdjlEntity> findzdjlByQdcpId(String qdcpId) {
        List<TlkZdjlEntity> list = new ArrayList<TlkZdjlEntity>();
        PreparedStatement preparedStatement = null;
        Connection connection = DBFactory.getConnection();
        String sql = " SELECT  DISTINCT obpm_crm_new.tlk_zdjl.ITEM_FPSJ  ,obpm.t_user.NAME  ,obpm_crm_new.tlk_czbz.ITEM_CZBZ \n" +
                "FROM obpm_crm_new.tlk_czbz JOIN obpm_crm_new.tlk_zdjl  ON obpm_crm_new.tlk_zdjl.ITEM_CZBZ = obpm_crm_new.tlk_czbz.ID \n" +
                "AND obpm_crm_new.tlk_zdjl.ITEM_QDCPID = ? " +
                "JOIN obpm.t_user ON obpm_crm_new.tlk_zdjl.ITEM_CZRY = obpm.t_user.ID";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, qdcpId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
                list.add(new TlkZdjlEntity(resultSet.getTimestamp(1), resultSet.getString(2), resultSet.getString(3)));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBFactory.closeConn(connection);
        }
        return list;
    }
}