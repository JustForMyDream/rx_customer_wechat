package com.rx.webApplication.dao;


import com.rx.webApplication.entities.TlkQdcpEntity;
import com.rx.webApplication.entities.TlkZdjlEntity;

import java.util.List;

/**
 * Created by 1010 on 2017-07-02.
 */
public interface TlkKhQdxxEntityDao {
    List findKhZtqdBykhid(String khid) ;
    //qdcp.qdid = qdxx.id
    TlkQdcpEntity  findKhQdxqBykhid(String khid);

    List findKhQdlbByQdxxid(String qdid) ;

    String findFgsByID(String fgsId) ;

    List<TlkZdjlEntity> findzdjlByQdcpId(String qdcpId);


}
