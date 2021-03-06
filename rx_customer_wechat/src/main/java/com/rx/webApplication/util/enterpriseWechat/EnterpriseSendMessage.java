package com.rx.webApplication.util.enterpriseWechat;

import com.rx.webApplication.dao.Impl.TlkEnterpriseWeChatTokenDaoImpl;
import com.rx.webApplication.dao.TlkEnterpriseWeChatTokenDao;

import java.util.HashMap;
import java.util.Map;

/**
 * 发送企业消息
 */
public class EnterpriseSendMessage {
    private final int agentid = 1000006;   //企业应用的id

    EnterpriseMessage enterpriseMessage = new EnterpriseMessageImpl();

    TlkEnterpriseWeChatTokenDao tlkEnterpriseWeChatTokenDao = new TlkEnterpriseWeChatTokenDaoImpl();

    EnterpriseMessageTemplate enterpriseMessageTemplate = new EnterpriseMessageTemplate();

    Map<String,String> map = new HashMap<>();
    /**
     * 发送企业消息给坐席
     * @param userId
     * @param name
     * @param productName
     * @param phone
     */
    public  void sendToStaff(String userId,String name, String productName, String phone){
        String msgtype = "text";
        String value = "你所跟踪的客户有了新的产品意向!客户姓名:"+name+",客户电话："+phone+",产品名称："+productName+",请及时联系！";
        map.put("content",value);
        enterpriseMessageTemplate.setTouser(userId);
        enterpriseMessageTemplate.setToparty("@all");
        enterpriseMessageTemplate.setTotag("@all");
        enterpriseMessageTemplate.setMsgtype(msgtype);
        enterpriseMessageTemplate.setAgentid(agentid);
        enterpriseMessageTemplate.setText(map);
        enterpriseMessageTemplate.setSafe(1);
        String result = enterpriseMessage.send(enterpriseMessageTemplate,tlkEnterpriseWeChatTokenDao.getToken());
        System.out.println("enterpriseResult:"+result);
    }

    /**
     * 发送消息给电销团队主管
     * @param userId
     * @param name
     * @param productName
     * @param phone
     */
    public void sendToDirector(String userId,String name, String productName, String phone){
        String msgtype = "text";
        String value = "你团队所跟踪的客户有了新的产品意向!客户姓名:"+name+",客户电话："+phone+",产品名称："+productName+",请及时联系！";
        map.put("content",value);
        enterpriseMessageTemplate.setTouser(userId);
        enterpriseMessageTemplate.setToparty("@all");
        enterpriseMessageTemplate.setTotag("@all");
        enterpriseMessageTemplate.setMsgtype(msgtype);
        enterpriseMessageTemplate.setAgentid(agentid);
        enterpriseMessageTemplate.setText(map);
        enterpriseMessageTemplate.setSafe(1);
        String result = enterpriseMessage.send(enterpriseMessageTemplate,tlkEnterpriseWeChatTokenDao.getToken());
        System.out.println("enterpriseResult:"+result);
    }

    /**
     * 通用模板消息
     * @param userId
     * @param content
     */
    public void sendGlobalTemplateMessage(String userId,String content,int isSafe){
        String msgtype = "text";
        map.put("content",content);
        enterpriseMessageTemplate.setTouser(userId);
        enterpriseMessageTemplate.setToparty("@all");
        enterpriseMessageTemplate.setTotag("@all");
        enterpriseMessageTemplate.setMsgtype(msgtype);
        enterpriseMessageTemplate.setAgentid(agentid);
        enterpriseMessageTemplate.setText(map);
        enterpriseMessageTemplate.setSafe(isSafe);
        String result = enterpriseMessage.send(enterpriseMessageTemplate,tlkEnterpriseWeChatTokenDao.getToken());
        System.out.println("enterpriseResult:"+result);
    }



}
