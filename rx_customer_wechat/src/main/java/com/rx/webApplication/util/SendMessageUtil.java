package com.rx.webApplication.util;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 发送短信工具类
 * Created by 王玉粮 on 2017/6/29.
 */
public class SendMessageUtil {
    //保证这个类的申请对象的唯一性
    private SendMessageUtil(){}

    public static SendSmsResponse send(String phoneNumbers, String signName, int code,String templateCode) throws ClientException {
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        IClientProfile profile = DefaultProfile.getProfile("cn-chengdu", SmsServerConfig.accessKeyId,SmsServerConfig.accessKeySecret);
        DefaultProfile.addEndpoint("cn-chengdu", "cn-chengdu",SmsServerConfig.product,SmsServerConfig.domain );
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象
        SendSmsRequest sendSmsRequest = new SendSmsRequest();
        //必填:待发送手机号
        sendSmsRequest.setPhoneNumbers(phoneNumbers);
        //必填:短信签名-可在短信控制台中找到
        sendSmsRequest.setSignName(signName);
        //必填:短信模板-可在短信控制台中找到
        sendSmsRequest.setTemplateCode(templateCode);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        sendSmsRequest.setTemplateParam("{ \"code\":\""+code+"\",\"product\":\"融祥普惠\"}");
        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        sendSmsRequest.setOutId("yourOutId");

        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(sendSmsRequest);
        return sendSmsResponse;
    }

    public static SendSmsResponse sendTemplateMessage(String phoneNumber, String signName,String templateCode,String templateData) throws ClientException {
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        IClientProfile profile = DefaultProfile.getProfile("cn-chengdu", SmsServerConfig.accessKeyId,SmsServerConfig.accessKeySecret);
        DefaultProfile.addEndpoint("cn-chengdu", "cn-chengdu",SmsServerConfig.product,SmsServerConfig.domain );
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象
        SendSmsRequest sendSmsRequest = new SendSmsRequest();
        //必填:待发送手机号
        sendSmsRequest.setPhoneNumbers(phoneNumber);
        //必填:短信签名-可在短信控制台中找到
        sendSmsRequest.setSignName(signName);
        //必填:短信模板-可在短信控制台中找到
        sendSmsRequest.setTemplateCode(templateCode);
        //将单引号替换成双引号

        templateData = templateData.replaceAll("\'","\"");

        sendSmsRequest.setTemplateParam(templateData);

        sendSmsRequest.setOutId("yourOutId");

        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(sendSmsRequest);
        return sendSmsResponse;
    }

    /**
     * 生成随机吗
     * @param min
     * @param max
     * @return
     */
    public static int getRandnNum(int min,int max){
        int randNum = min + (int)(Math.random() * ((max - min) + 1));
        return randNum;
    }

    /**
     * 解析模板参数
     * @param templateData
     * @return
     */
    public static String getTemplateContent(String templateData){
        Map<String,Object> map = new HashMap<>();
        //转换json数据
        JSONObject jsonObject = JSONObject.fromObject(templateData);

        Iterator<String> keys = jsonObject.keys();
        String key = null;
        Object value = null;
        while (keys.hasNext()){
            key = keys.next();
            value = jsonObject.get(key);
            map.put(key,value);
        }

        String templateContent = "{";
        Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Object> entry = iterator.next();
            templateContent += ""+entry.getKey()+":"+""+entry.getValue()+",";
            if(!iterator.hasNext()){
                templateContent += ""+entry.getKey()+":"+""+entry.getValue()+"}";
            }
        }
        return templateContent;
    }
}
