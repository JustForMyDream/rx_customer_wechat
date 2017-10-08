package com.rx.webApplication.controller;

import com.aliyun.mns.model.Message;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.rx.webApplication.entities.bean.SmsTemplateEntity;
import com.rx.webApplication.util.SendMessageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by 王玉粮 on 2017/7/15.
 */
@Controller
@RequestMapping("smsTemplate")
public class SmsTemplateController {

    /**
     * 发送短信模板消息
     * @param request
     * @param response
     */
    @RequestMapping("sendTemplateMessage")
    public void sendTemplateMessage(HttpServletRequest request, HttpServletResponse response){
        String toPhoneNumber = request.getParameter("toPhoneNumber");//取得发送的手机号码
        String signName = request.getParameter("signName");//获得短信签名
        String templateCode = request.getParameter("templateCode");//获得模板ID
        String templateContent = request.getParameter("templateContent");
        System.out.println("toPhoneNumber:"+request.getParameter("toPhoneNumber"));
        System.out.println("templateContent:"+request.getParameter("templateContent"));
        System.out.println("signName:"+request.getParameter("signName"));
        System.out.println("templateCode:"+request.getParameter("templateCode"));
        if(toPhoneNumber!=null&&signName!=null&&templateCode!=null&&templateContent!=null){
            if(toPhoneNumber.matches("^1\\d{10}$")){
                try {
                    SendSmsResponse sendSmsResponse = SendMessageUtil.sendTemplateMessage(toPhoneNumber,signName,templateCode,templateContent);
                    String message = sendSmsResponse.getMessage();
                    System.out.println("短信返回message："+message);
                    if(sendSmsResponse.getCode() == "OK" || sendSmsResponse.getCode().equals("OK")){
                        System.out.println("短信发送成功！");
                    }else {
                        System.out.println("短信发送失败！");
                    }
                } catch (ClientException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("请输入正确的电话号码！");
            }
        }else {
            System.out.println("未取得必要参数！");
        }
    }


    /**
     * 解析发送过来的流
     * @param in
     * @return
     * @throws IOException
     */
    public static SmsTemplateEntity analyticFlow(InputStream in) throws IOException{
        JsonReader reader = new JsonReader(new InputStreamReader(in,"UTF-8"));
        System.out.println("reader:"+reader);
        Gson gson = new Gson();
        SmsTemplateEntity smsTemplateEntity = gson.fromJson(reader,SmsTemplateEntity.class);
        return smsTemplateEntity;
    }
}


