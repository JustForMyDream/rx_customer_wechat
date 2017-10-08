import com.google.gson.Gson;
import com.rx.webApplication.dao.Impl.TlkKhFcxxEntityDaoImpl;
import com.rx.webApplication.dao.Impl.TlkKhQdxxEntityDaoImpl;
import com.rx.webApplication.dao.TlkKhQdxxEntityDao;
import com.rx.webApplication.entities.TlkKhFcxxEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 1010 on 2017-07-02.
 */
public class TestQdxxConnection {
    public static void main(String []args){
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        String khid = "11e7-4b65-78f40f54-bf3c-41af9a58bf20";
        List<TlkKhFcxxEntity> tlkKhFcxxEntityList = new TlkKhFcxxEntityDaoImpl().findHouseByKhid(khid);
        map.put("tlkKhFcxxEntityList",tlkKhFcxxEntityList);
        for(int i = 0;i < tlkKhFcxxEntityList.size(); i++){
            System.out.println(tlkKhFcxxEntityList.get(i));
        }
    }
}
