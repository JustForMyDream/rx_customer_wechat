package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TlkKhGsxxEntity;

import java.util.List;

/**
 * Created by Administrator on 2017/7/5.
 */
public interface TlkKhGsxxEntityDao {
    /**
     * 通过客户id查询车辆信息
     * @param khid
     * @return
     */
    List<TlkKhGsxxEntity> findGsxxByKhid(String khid);
    /**
     * 通过id查询公司信息
     * @param id
     * @return
     */
    TlkKhGsxxEntity findGsxxByid(String id);


    /**
     * 增加客户公司信息
     * @param tlkKhGsxxEntity
     * @return
     */
    void addGsxxByKhid(TlkKhGsxxEntity tlkKhGsxxEntity);

    void updateGsxxById(TlkKhGsxxEntity tlkKhGsxxEntity);
}
