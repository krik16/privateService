package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

import java.math.BigDecimal;

/**
 * 微众支付宝退款请求参数
 * Created by sujuan on 2017/3/2.
 */
public class WaRefundReqData extends BaseData{
    //商户号 必传
    private String wbMerchantId;

    //订单号 跟tradeNo不能同时为空
    private String orderId;

    //支付宝交易号
    private String tradeNo;

    //退款金额 元 必传
    private BigDecimal refundAmount ;

    //退款原因
    private String refundReason ;

    //退款请求号 每次退款需保证唯一 必传
    private String outRequestNo ;

    public String getWbMerchantId() {
        return wbMerchantId;
    }

    public void setWbMerchantId(String wbMerchantId) {
        this.wbMerchantId = wbMerchantId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }
}
