import com.google.gson.Gson;
import com.rx.webApplication.dao.Impl.TlkEnterpriseWeChatTokenDaoImpl;
import com.rx.webApplication.dao.TlkEnterpriseWeChatTokenDao;
import com.rx.webApplication.util.enterpriseWechat.EnterpriseMessage;
import com.rx.webApplication.util.enterpriseWechat.EnterpriseMessageImpl;
import com.rx.webApplication.util.enterpriseWechat.EnterpriseMessageTemplate;

import java.util.HashMap;
import java.util.Map;

public class TestSendEnterpriseMessage {
    public static void main(String []args){
        Gson gson = new Gson();
        EnterpriseMessage enterpriseMessage = new EnterpriseMessageImpl();
        TlkEnterpriseWeChatTokenDao tlkEnterpriseWeChatTokenDao = new TlkEnterpriseWeChatTokenDaoImpl();
        EnterpriseMessageTemplate enterpriseMessageTemplate = new EnterpriseMessageTemplate();
        Map<String,String> map = new HashMap<>();
        String value = "哈哈哈,我是测试";
        map.put("content",value);
        enterpriseMessageTemplate.setTouser("changweiwei");
        enterpriseMessageTemplate.setToparty("@all");
        enterpriseMessageTemplate.setTotag("@all");
        enterpriseMessageTemplate.setMsgtype("text");
        enterpriseMessageTemplate.setAgentid(1000004);
        enterpriseMessageTemplate.setText(map);
        enterpriseMessageTemplate.setSafe(0);
        System.out.println(gson.toJson(enterpriseMessageTemplate));
        System.out.println("tlkEnterpriseWeChatTokenDao.getToken():"+tlkEnterpriseWeChatTokenDao.getToken());
        String result = enterpriseMessage.send(enterpriseMessageTemplate,"844a142yga0LZG8bEP4uvU2kx1hWfpkXe4dgCdL-WuxqVVriPOs18Cc9AveT2Io25wNal34xwjiKYZwiC7oAeGD306RNgG814b3DIMJ32pi0ZgswLhnfrQ1Yd9VNQowqaoYf33-MHB8Vt4IqMZwcsjd8QPvA1O-9OGmaZi0VFPvAxatpwocAVCVMXTzsotIIK7zOXfzaalc6uwhVFRwSGMf0oo1jUDGUMMwS4F_v5sLZs2QQ3d_iDjuW47hHb_OCG7tkBDxyTqB0duEBhShyf5wWC1ElputG8bsCKYczd_M");
        System.out.println("enterpriseResult:"+result);
    }
}
