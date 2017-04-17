package com.rongyi.pay.core.webank.model.res;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众微信公众号支付返回结果
 * Created by sujuan on 2017/3/24.
 */
public class WwScanPayResData extends BaseData{
    private static final long serialVersionUID = 3035968424978617666L;
    //公众账号ID
    private String appid;

    //版本号
    private String version ;

    //字符集
    private String charset ;

    //签名方式
    private String sign_type ;

    //返回状态码 0表示成功 非0失败
    private String status ;

    //返回信息
    private String message ;

    /* 以下字段在status为0时有返回 */
    //业务结果 0表示成功 非0失败
    private String result_code ;

    //商户号
    private String mch_id ;

    //设备号
    private String device_info ;

    //随机字符串
    private String nonce_str;

    //错误代码
    private String err_code ;

    //错误代码描述
    private String err_msg ;

    //签名
    private String sign ;

    /* 以下字段在status 和result_code都为0时有返回 */
    //动态口令
    private String token_id ;

    //原生态js支付信息

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
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

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    public String getPay_info() {
        return pay_info;
    }

    public void setPay_info(String pay_info) {
        this.pay_info = pay_info;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    private String pay_info ;

    //订单超时时间
    private String time_expire ;

    //商品标记
    private String goods_tag ;

    //微众银行订单号
    private String orderid ;

    //商户订单号
    private String out_trade_no ;
}
