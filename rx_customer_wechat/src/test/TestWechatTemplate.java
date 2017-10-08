import com.cxt.wechat.Template.TemplateMessageBussiness;
import com.cxt.wechat.Template.TemplateMessageBussinessImpl;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateItem;
import com.cxt.wechat.entity.WechatTemplate.WechatTemplateMessage;
import com.google.gson.Gson;
import com.rx.webApplication.dao.Impl.TlkAccesstokenEntityDaoImpl;
import com.rx.webApplication.dao.TlkAccesstokenEntityDao;
import com.rx.webApplication.entities.TlkAccesstokenEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王玉粮 on 2017/7/19.
 */
public class TestWechatTemplate {
    public static void main(String []args){
        TemplateMessageBussiness templateMessageBussiness = new TemplateMessageBussinessImpl();
        TlkAccesstokenEntityDao tlkAccesstokenEntityDao = new TlkAccesstokenEntityDaoImpl();
        TlkAccesstokenEntity tlkAccesstokenEntity=  tlkAccesstokenEntityDao.findTlkAccesstokenEntityByLastTime();
        String templateId = "GDLpVaM1ik0JJVDh4QrlRpREhtvfPomEqSE5gcMaNa0";//模板id
        WechatTemplateMessage wechatTemplateMessage = new WechatTemplateMessage();
        wechatTemplateMessage.setTemplate_id(templateId);
        Map<String,WechatTemplateItem> data = new HashMap<>();
        data.put("first",new WechatTemplateItem("做单有新进度了！","#173177"));
        data.put("keyword1",new WechatTemplateItem("312002215335","#173177"));
        data.put("keyword2",new WechatTemplateItem("汽车维修","#173177"));
        data.put("keyword3",new WechatTemplateItem("2014年7月21日","#173177"));
        data.put("remark",new WechatTemplateItem("感谢你的使用！"));
        wechatTemplateMessage.setData(data);
        wechatTemplateMessage.setTouser("oyaYgt4WnzPfhW5aSA8g87ktBvfI");
        System.out.println(new Gson().toJson(wechatTemplateMessage));
        System.out.println(tlkAccesstokenEntity.getItem_access_token());
       String reslut =  templateMessageBussiness.send(wechatTemplateMessage,tlkAccesstokenEntity.getItem_access_token());
        System.out.println(new Gson().toJson(reslut));

    }
}
