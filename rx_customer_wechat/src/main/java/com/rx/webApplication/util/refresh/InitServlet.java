package com.rx.webApplication.util.refresh;

import com.cxt.wechat.token.Token;
import com.rx.webApplication.util.DBFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;
import java.util.Timer;


/**
 * Created by 王玉粮 on 2017/7/15.
 */
public class InitServlet implements ServletContextListener{
    private static final long serialVersionUID = 1L;
    private static Logger log = LoggerFactory.getLogger(Token.class);
    private Timer timer = null;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        timer = new Timer(true);
        System.out.println("定时器已启动。");
        servletContextEvent.getServletContext().log("定时器已启动。") ;
        timer.schedule(new MyTask(servletContextEvent.getServletContext()),0,7000*1000) ;
        servletContextEvent.getServletContext().log("已经添加任务调度表。" ) ;
        System.out.println("已经添加任务调度表.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
