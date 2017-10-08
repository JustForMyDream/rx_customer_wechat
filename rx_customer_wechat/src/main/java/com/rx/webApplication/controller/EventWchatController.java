package com.rx.webApplication.controller;

import com.rx.webApplication.util.PrintUtil;
import com.rx.webApplication.util.WeChatMessageUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by 王玉粮 on 2017/6/27.
 */
@Controller
public class EventWchatController {

    Log log = LogFactory.getLog("REQUEST");
    int i = 0;

    @RequestMapping(path = "EventWchat",method = RequestMethod.POST)
    public void receviceWchatMessage( HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException {
        String userIp = request.getRemoteHost();
        try {
            HashMap<String, String> message = new WeChatMessageUtil().parseXml(request);
            /**
             * 判断消息类型
             */
            String messageType = message.get("MsgType");
            if (messageType.equals("text")) {
                System.out.println("------text-------");
            } else if (messageType.equals("image")) {
                System.out.println("------image-------");
            } else if (messageType.equals("voice")) {
                System.out.println("------voice-------");
            } else if (messageType.equals("video")) {
                System.out.println("------video-------");
            } else if (messageType.equals("shortvideo")) {
                System.out.println("------shortvideo-------");
            } else if (messageType.equals("location")) {
                System.out.println("------location-------");
            } else if (messageType.equals("link")) {
                System.out.println("------link-------");
            } else if(messageType.equals("event")) {
                System.out.println("------区分接受事件-------");
                String eventType = message.get("Event");
                if(eventType!=null&&eventType!=""){
                    if(eventType.equals("subscribe")){
                        System.out.println("------用户未关注时，进行关注后的事件推送-------");
                    }else if(eventType.equals("SCAN")){
                        System.out.println("------用户已关注时的事件推送-------");
                    }else if(eventType.equals("LOCATION")){
                        System.out.println("------上报地理位置事件------");
                    }else if(eventType.equals("CLICK")){
                        System.out.println("------点击菜单拉取消息时的事件推送------");
                    }else if(eventType.equals("VIEW")){
                        System.out.println("------点击菜单跳转链接时的事件推送------");
                    }
                }else {
                    System.out.println("------关注/取消关注事件-------");
                }
            }else {
                System.out.println("-------------未取得-----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new PrintUtil().StringPrint(response, "");
    }


}
