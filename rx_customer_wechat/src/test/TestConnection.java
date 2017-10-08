import com.google.gson.Gson;
import com.rx.webApplication.dao.Impl.TlkCpEntityDaoImpl;
import com.rx.webApplication.dao.TlkCpEntityDao;
import com.rx.webApplication.entities.TlkCpEntity;
import com.rx.webApplication.util.DBFactory;

import java.sql.Connection;

/**
 * Created by 王玉粮 on 2017/6/22.
 */
public class TestConnection {
    public static void main(String []args){
        TlkCpEntityDao tlkCpEntityDao = new TlkCpEntityDaoImpl();
        TlkCpEntity tlkCpEntity = tlkCpEntityDao.findCpDetailInforById("11e7-7339-855a0a4c-bf94-a9594c487d42");
        System.out.println(new Gson().toJson(tlkCpEntity));

    }
}
