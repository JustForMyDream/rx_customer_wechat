package com.cxt.wechat.pay.unifiedorder.Entity;

import java.util.Map;

/**
 *
 * Created by cccxt on 2016/4/5.
 */
public class UnifiedorderResponseEntity {
    private String return_code;
    private String return_msg;
    //以下字段在return_code为SUCCESS的时候有返回
    private String appid;
    private String mch_id;
    private String device_info;
    private String nonce_str;
    private String sign;
    private String result_code;
    private String err_code;
    private String err_code_des;
    //以下字段在return_code 和result_code都为SUCCESS的时候有返回
    private String trade_type;
    private String prepay_id;
    private String code_url;

    public UnifiedorderResponseEntity() {
    }

    public UnifiedorderResponseEntity(Map<String,String> map) {
        this.return_code = map.get("return_code");
        this.return_msg = map.get("return_msg");
        this.appid = map.get("appid");
        this.mch_id = map.get("mch_id");
        this.device_info = map.get("device_info");
        this.nonce_str = map.get("nonce_str");
        this.result_code = map.get("result_code");
        this.err_code = map.get("err_code");
        this.err_code_des = map.get("err_code_des");
        this.trade_type = map.get("trade_type");
        this.prepay_id = map.get("prepay_id");
        this.code_url = map.get("code_url");
    }

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }


    /**
     *
     NOAUTH                  商户无此接口权限 商户未开通此接口权限 请商户前往申请此接口权限
     NOTENOUGH               余额不足 用户帐号余额不足 用户帐号余额不足，请用户充值或更换支付卡后再支付
     ORDERPAID               商户订单已支付 商户订单已支付，无需重复操作 商户订单已支付，无需更多操作
     ORDERCLOSED             订单已关闭 当前订单已关闭，无法支付 当前订单已关闭，请重新下单
     SYSTEMERROR             系统错误 系统超时 系统异常，请用相同参数重新调用
     APPID_NOT_EXIST         APPID不存在 参数中缺少APPID 请检查APPID是否正确
     MCHID_NOT_EXIST MCHID   不存在 参数中缺少MCHID 请检查MCHID是否正确
     APPID_MCHID_NOT_MATCH   appid和mch_id不匹配 appid和mch_id不匹配 请确认appid和mch_id是否匹配
     LACK_PARAMS             缺少参数 缺少必要的请求参数 请检查参数是否齐全
     OUT_TRADE_NO_USED       商户订单号重复 同一笔交易不能多次提交 请核实商户订单号是否重复提交
     SIGNERROR               签名错误 参数签名结果不正确 请检查签名参数和方法是否都符合签名算法要求
     XML_FORMAT_ERROR XML    格式错误 XML格式错误 请检查XML参数格式是否正确
     REQUIRE_POST_METHOD     请使用post方法 未使用post传递参数  请检查请求参数是否通过post方法提交
     POST_DATA_EMPTY post    数据为空 post数据不能为空 请检查post数据是否为空
     NOT_UTF8                编码格式错误 未使用指定编码格式 请使用NOT_UTF8编码格式

     */
}
