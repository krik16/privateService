package com.rongyi.pay.core.webank.model;


/**
 * 微众支付宝退款查询返回结果
 * Created by sujuan on 2017/3/2.
 */
public class WaRefundQueryResData extends AlipayCommonResData{
    //支付宝交易号
    private String tradeNo ;

    //微众订单号
    private String outTradeNo ;

    //退款请求号
    private String outRequestNo ;

    //退款原因
    private String refundReason ;

    //该笔退款对应的原订单的总金额
    private String totalAmount ;

    //退款金额
    private String refundAmount ;

    //订单号
    private String orderId ;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
