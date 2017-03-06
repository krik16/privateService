package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

import java.math.BigDecimal;

/**
 * 微众微信刷卡支付返回参数
 * Created by sujuan on 2017/2/22.
 */
public class WwPunchCardResData extends BaseData{

    //请求结果
    private Result result ;

    //支付结果 0未支付 1已支付
    private String payment;

    //用户标识
    private String openid;

    //是否关注公众账号 Y关注 N未关注
    private String is_subscribe;

    //交易类型  JSAPI 、NATIVE NATIVE 、APP 、MICROPAY MICROPAY
    private String trade_type ;

    //付款银行
    private String bank_type;

    //总金额
    private String total_fee ;

    //现金券金额
    private String coupon_fee ;

    //货币类型
    private String fee_type ;

    //商户订单号
    private String terminal_serialno ;

    //微众银行订单号
    private String orderid;

    //微信支付订单号
    private String transaction_id ;

    //支付完成时间 时间格式为 yyyyMMddhhmmss
    private String time_end ;

    //签名
    private String sign ;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
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

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(String coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getTerminal_serialno() {
        return terminal_serialno;
    }

    public void setTerminal_serialno(String terminal_serialno) {
        this.terminal_serialno = terminal_serialno;
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

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
