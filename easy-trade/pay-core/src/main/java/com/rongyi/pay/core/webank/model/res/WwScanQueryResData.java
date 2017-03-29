package com.rongyi.pay.core.webank.model.res;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众微信公众号支付订单查询返回结果
 * Created by sujuan on 2017/3/28.
 */
public class WwScanQueryResData extends BaseData{
    //版本号
    private String version ;

    //字符集
    private String charset ;

    //签名方式
    private String sign_type ;

    //返回状态0表示成功 非0表示失败 此字段是通信标识
    private String status ;

    //返回信息
    private String message ;

    /* 以下字段在statuc为0时有返回 */
    //业务结果 0表示成功
    private String result_code ;

    //商户号
    private String mch_id ;

    //设备号
    private String device_info ;

    //随机字符串
    private String nonce_str ;

    //错误代码
    private String err_code ;

    //错误代码描述
    private String err_msg ;

    //签名
    private String sign ;

    /* 以下字段在status和result_code都为0时有返回 */
    //交易状态 SUCCESS—支付成 REFUND—转入退款 NOTPAY—未支付 CLOSED—已关闭REVERSE—已冲正 REVOK—已撤销
    private String trade_state ;

    /* 以下字段在trade_state 为success是有返回 */
    //用户在商户appid下的唯一标识
    private String openid ;

    //是否关注 Y/N
    private String is_subscribe ;

    //微众银行订单号
    private String orderid ;

    //微信订单号
    private String transaction_id ;

    //商户订单号
    private String out_trade_no ;

    //总金额 以分为单位
    private int total_fee ;

    //现金券金额 以分为单位
    private int coupon_fee ;

    //货币各类
    private String fee_type ;

    //附加信息
    private String attach ;

    //付款银行
    private String bank_type ;

    //支付完成时间 格式为yyyyMMddHHmmss
    private String time_end ;

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

    public String getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public int getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(int coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }
}
