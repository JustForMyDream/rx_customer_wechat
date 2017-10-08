package com.rx.webApplication.dao;

import com.rx.webApplication.entities.TLkKhjcxxEntity;

import java.util.List;
import java.util.Map;


/**
 * Created by 王玉粮 on 2017/7/1.
 * @author aria 2017/7/6
 */
public interface  TlkKhjcxxEntityDao {
    /**
     * 通过电话号码查询客户
     * @param phone
     * @return
     */
    String findByPhone(String phone);

    TLkKhjcxxEntity getById(String id);

    int updateById(TLkKhjcxxEntity tLkKhjcxxEntity);//根据id更新客户信息

    int insert(String phone);//向客户表插入记录同时更新微信表关联

    /**
     * 保存电话号码到数据库
     * @param id
     * @param phone
     */
     void insertIntoIdAndPhone(String id,String phone,String openid,String item_sjly);

    /**
     * 通过电话号码找到客户ID
     * @param phone
     * @return
     */
    String judgeByPhone(String phone);

    /**
     * 通过openid查询客户
     * @param openid
     * @return
     */
    TLkKhjcxxEntity findByOpenId(String openid);

    /**
     * 通过电话号码更新用户姓名
     * @param phone
     */
    void UpdateNameByPhone(String name,String phone);

    /**
     * 查询改用户是否有所属人
     * @param phone
     * @return
     */
    String judgeSSRBYPhone(String phone);

    /**
     * 通过电话号码找到所属人id
     * @param phone
     * @return
     */
    String findSSRIdByPhone(String phone);

    /**
     * 通过所属人的id找到openid
     * @param id
     * @return
     */
    String findSSROpenidById(String id);

    /**
     * 通过roleName找到企业所属员工的openid
     * @param roleName
     * @return
     */
    List findAllUserOpenidByRoleName(String roleName);



}
