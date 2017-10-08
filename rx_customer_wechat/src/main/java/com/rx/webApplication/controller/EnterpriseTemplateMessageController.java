package com.rx.webApplication.controller;

import com.rx.webApplication.util.enterpriseWechat.EnterpriseSendMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("enterprise")
public class EnterpriseTemplateMessageController {

    EnterpriseSendMessage enterpriseSendMessage = new EnterpriseSendMessage();

    @RequestMapping("sendEnterpriseMessage")
    public void sendEnterpriseMessage(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println("发送企业微信模板消息");
        String userId = request.getParameter("userId");
        String content = request.getParameter("content");
        int isSafe = Integer.parseInt(request.getParameter("isSafe"));
        System.out.println("-----------userId----------:"+userId);
        System.out.println("-----------content---------:"+content);
        System.out.println("-----------isSafe---------:"+isSafe);
        if(userId!=null&&content!=null){
            enterpriseSendMessage.sendGlobalTemplateMessage(userId,content,isSafe);
        }
    }
}
