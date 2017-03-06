package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

import java.math.BigDecimal;

/**
 * 微众微信刷卡支付退款返回结果
 * Created by sujuan on 2017/2/27.
 */
public class WwPunchCardRefundResData extends BaseData{

    //结果集
    private Result result;

    //微众银行退款单号
    private String refundid;

    //签名
    private String sign;

    //微众银行订单号 （以下参数只有查询退款结果才会返回）
    private String orderid ;

    //退款结果 0退款失败 1退款成功
    private String refundment ;

    //总金额 元
    private BigDecimal total_fee ;

    //退款金额 元
    private BigDecimal refund_fee ;

    //退款渠道
    private String refund_channel ;

    //容易网交易号
    private String payNo;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getRefundid() {
        return refundid;
    }

    public void setRefundid(String refundid) {
        this.refundid = refundid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getRefundment() {
        return refundment;
    }

    public void setRefundment(String refundment) {
        this.refundment = refundment;
    }

    public BigDecimal getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(BigDecimal total_fee) {
        this.total_fee = total_fee;
    }

    public BigDecimal getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(BigDecimal refund_fee) {
        this.refund_fee = refund_fee;
    }

    public String getRefund_channel() {
        return refund_channel;
    }

    public void setRefund_channel(String refund_channel) {
        this.refund_channel = refund_channel;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
}
