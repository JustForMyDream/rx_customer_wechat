import com.rx.webApplication.dao.Impl.TlkAccesstokenEntityDaoImpl;
import com.rx.webApplication.dao.TlkAccesstokenEntityDao;
import com.rx.webApplication.entities.TlkAccesstokenEntity;

/**
 * Created by 王玉粮 on 2017/7/16.
 */
public class TestPerson {
    public static void main(String []args){
        TlkAccesstokenEntityDao tlkAccesstokenEntityDao = new TlkAccesstokenEntityDaoImpl();
        TlkAccesstokenEntity tlkAccesstokenEntity =  tlkAccesstokenEntityDao.findTlkAccesstokenEntityByLastTime();
        System.out.println(tlkAccesstokenEntity.getItem_access_token());
    }
}
