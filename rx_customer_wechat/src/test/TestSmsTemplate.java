import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.rx.webApplication.util.SendMessageUtil;

/**
 * Created by 王玉粮 on 2017/7/18.
 */
public class TestSmsTemplate {
    public static void main(String args[]){
        try {
            SendSmsResponse sendSmsResponse = SendMessageUtil.sendTemplateMessage("18328069024","融祥普惠","SMS_78390008","{\'qdh\':\'3002100\',\'time\':\'2014\',\'zdbz\':\'完成\'}");
            System.out.println("sendSmsResponse:"+sendSmsResponse.getMessage());
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
