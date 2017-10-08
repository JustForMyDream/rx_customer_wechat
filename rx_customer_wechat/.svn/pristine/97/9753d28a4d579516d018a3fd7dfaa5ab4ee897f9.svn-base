package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TlkCpEntity;

import java.util.List;

/**
 * Created by 李静 on 2017/7/26.
 */
public interface TlkCpEntityDao {
    /**
     * 查询所有的产品信息
     * @return
     */
    List<TlkCpEntity> findallcp();
    /**
     * 查询所有的产品信息通过分页
     * * @param page
     * * @param pagesize
     * @return
     */
    List<TlkCpEntity> findallcp(Integer page, Integer pagesize);
    /**
     * 通过产品类型查询所属产品
     * @param cplx
     * @return
     */
    List<TlkCpEntity> findallcpBylx(String cplx);
    /**
     * 通过产品类型查询所属产品进行分页查询
     * * @param page
     * * @param pagesize
     * @param cplx
     * @return
     */
    List<TlkCpEntity> findallcpBylx(Integer page, Integer pagesize,String cplx);

    /**
     * 通过产品id查找产品详情
     * @param cpid
     * @return
     */
    TlkCpEntity findCpDetailInforById(String cpid);
}
