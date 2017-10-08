package com.rx.webApplication.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by 王玉粮 on 2017/6/22.
 */
public class DBFactory implements ServletContextListener {

    private ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
    //连接方式
    private static String url = null;
    private static String username = null;
    private static String password = null;
    private static String driver = null;

    private static String url2 = null;
    private static String username2= null;
    private static String password2 = null;
    //微信配置
    public static final String APPID = "";
    public static final String  SECRITE = "";

    private static Connection conn = null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;


    static {
        try {
            Properties props = new Properties();
            InputStream inputStream = DBFactory.class.getResourceAsStream("../../../../config.properties");
            props.load(inputStream);
            url = props.getProperty("url");
            username = props.getProperty("username");
            password = props.getProperty("password");
            driver = props.getProperty("driver");
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            Properties props = new Properties();
            InputStream inputStream = DBFactory.class.getResourceAsStream("../../../../config.properties");
            props.load(inputStream);
            url2 = props.getProperty("url2");
            username2 = props.getProperty("username2");
            password2 = props.getProperty("password2");
            driver = props.getProperty("driver");
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取链接
    public static  Connection getConnection() {
        try {
            Connection conn1 = DriverManager.getConnection(url, username, password);
            return conn1;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    //获取第二个链接
    public static Connection getConnection2(){
        try {
            Connection conn1  = DriverManager.getConnection(url2, username2, password2);
            return conn1;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    //关闭数据库
    public static void closeConn(Connection connection){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //专门用于发送增删改语句的方法
    public static int execOther(PreparedStatement pstmt){
        try {
            //1、使用Statement对象发送SQL语句
            int affectedRows = pstmt.executeUpdate();
            //2、返回结果
            return affectedRows;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }


    //专门用于发送查询语句
    public static ResultSet execQuery(PreparedStatement pstmt){
        try {
            //1、使用Statement对象发送SQL语句
            rs = pstmt.executeQuery();
            //2、返回结果
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }




    public void contextInitialized(ServletContextEvent servletContextEvent) {
        executeTranslateTimer();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        if (!scheduled.isShutdown()) {
            scheduled.shutdown();
        }
    }

    public void executeTranslateTimer() {
//        Runnable task = new Runnable() {
//            public void run() {
//                HttpUtil httpUtil = new HttpUtil();
//                String result = "";
//                try{
//                    result = httpUtil.getHttpsGet(WChatInterface.TOKEN.replace("APPID", APPID).replace("APPSECRET", SECRITE));
//                    Map<String,String> map = new Gson().fromJson(result,new TypeToken<Map<String,String>>(){
//                    }.getType());
//                    WeChatConfig.setAccess_token(map.get("access_token"));
//                    System.out.println(map.get("access_token"));
//                    System.out.println("定时器执行。。。。。。。。。。。。。");
//
//                }catch (IOException e){
//                    System.out.println();
//                    e.printStackTrace();
//                }
//                System.out.println("定时器执行。。。。。。。。。。。。。");
//            }
//        };
//        if(scheduled.isShutdown()){
//            scheduled = Executors.newScheduledThreadPool(1);
//            scheduled.scheduleAtFixedRate(task,0,20, TimeUnit.SECONDS);
//        }else {
//            scheduled.scheduleAtFixedRate(task, 0, 20, TimeUnit.SECONDS);
//        }
    }
}
