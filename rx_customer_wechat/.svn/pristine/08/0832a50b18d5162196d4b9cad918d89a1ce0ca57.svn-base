package com.rx.webApplication.util.refresh;

import com.cxt.wechat.oauth2.Oauth2;
import com.google.gson.Gson;
import com.rx.webApplication.dao.Impl.TlkAccesstokenEntityDaoImpl;
import com.rx.webApplication.dao.TlkAccesstokenEntityDao;
import com.rx.webApplication.entities.TlkAccesstokenEntity;
import com.rx.webApplication.entities.bean.AccessTokenEntity;
import com.rx.webApplication.entities.bean.PlatformAccessTokenEntity;
import com.rx.webApplication.util.DBFactory;

import javax.servlet.ServletContext;
import java.sql.Timestamp;
import java.util.Date;
import java.util.TimerTask;
import java.util.UUID;

import com.cxt.wechat.token.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 王玉粮 on 2017/7/16.
 */
public class MyTask extends TimerTask {
    private static Logger log = LoggerFactory.getLogger(MyTask.class);

    private static boolean isRunning = false;
    private ServletContext context = null;

    // 第三方用户唯一凭证
    public static String appid = DBFactory.APPID;
    // 第三方用户唯一凭证密钥
    public static String appsecret = DBFactory.SECRITE;

    PlatformAccessTokenEntity platformAccessTokenEntity = PlatformAccessTokenEntity.getPlatformAccessTokenEntity();

    Gson gson = new Gson();

    public MyTask(ServletContext context){
        this.context = context ;
    }
    @Override
    public void run() {
        if (!isRunning){
            int i = 0;
            System.out.println("开始执行指定任务.") ;
            //if (C_SCHEDULE_HOUR == c.get(Calendar.HOUR_OF_DAY)) {
            isRunning = true ;
            context.log("开始执行指定任务.") ;
            //TODO 添加自定义的详细任务，以下只是示例
            String accessToken = new Token().getAccessToken(appid,appsecret);
            System.out.println("平台accessToken:"+accessToken);
            platformAccessTokenEntity = gson.fromJson(accessToken,PlatformAccessTokenEntity.class);

            if(platformAccessTokenEntity.getAccess_token()!=null){
                TlkAccesstokenEntity tlkAccesstokenEntity = new TlkAccesstokenEntity();
                tlkAccesstokenEntity.setId(UUID.randomUUID().toString());
                tlkAccesstokenEntity.setItem_access_token(platformAccessTokenEntity.getAccess_token());
                tlkAccesstokenEntity.setItem_expires_in(platformAccessTokenEntity.getExpires_in());
                tlkAccesstokenEntity.setItem_update_time(new Timestamp(new Date().getTime()));
                TlkAccesstokenEntityDao tlkAccesstokenEntityDao = new TlkAccesstokenEntityDaoImpl();
                tlkAccesstokenEntityDao.save(tlkAccesstokenEntity);

            }else {
                System.out.println("未取得platformAccessTokenEntity");
            }


            isRunning = false;
            context.log("指定任务执行结束");
            System.out.println("指定任务执行结束") ;

            //}
        }else{
            context.log("上一次任务执行还未结束");
        }
    }
}
