package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/6.
 */
public class TianyiTradeQueryRes extends BaseData {

    // 商户号
    private String merchantId;
    // 商户总订单号
    private String orderNo;
    //商户总订单请求流水号
    private String orderReqNo;
    //商户下单时间
    private String orderDate;
    //网关平台流水号
    private String ourTransNo;
    //交易金额
    private String transAmt;
    //交易状态
    private String transStatus;
    //加密方式
    private String encodeType;
    //sign 校验域
    private String sign;
    //退款标识
    private String refundFlag;
    //客户支付手机号
    private String customerID;
    //优惠金额
    private String coupon;
    //商户营销优惠成本
    private String scValue;
    //付款人帐号
    private String payerAccout;
    //收款人帐号
    private String payeeAccout;
    //付款明细
    private String payChannel;
    //备注
    private String productDesc;


    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderReqNo() {
        return orderReqNo;
    }

    public void setOrderReqNo(String orderReqNo) {
        this.orderReqNo = orderReqNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOurTransNo() {
        return ourTransNo;
    }

    public void setOurTransNo(String ourTransNo) {
        this.ourTransNo = ourTransNo;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus;
    }

    public String getEncodeType() {
        return encodeType;
    }

    public void setEncodeType(String encodeType) {
        this.encodeType = encodeType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getRefundFlag() {
        return refundFlag;
    }

    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getScValue() {
        return scValue;
    }

    public void setScValue(String scValue) {
        this.scValue = scValue;
    }

    public String getPayerAccout() {
        return payerAccout;
    }

    public void setPayerAccout(String payerAccout) {
        this.payerAccout = payerAccout;
    }

    public String getPayeeAccout() {
        return payeeAccout;
    }

    public void setPayeeAccout(String payeeAccout) {
        this.payeeAccout = payeeAccout;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}
