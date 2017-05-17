package com.rongyi.pay.core.webank.param;

import com.rongyi.pay.core.util.BaseData;

import java.math.BigDecimal;

/**
 * 微众支付宝条码支付参数
 * Created by sujuan on 2017/2/28.
 */
public class WaPunchCardPayParam extends BaseData {
    //商户号  必传
    private String wbMerchantId;

    //商户订单号 必传
    private String orderId ;

    //支付宝授权码 必传
    private String authCode ;

    //商户支付宝用户ID 如果为空 默认为商户签约账号对应的支付宝用户ID
    private String sellerId ;

    //订单总金额 元 必传
    private BigDecimal totalAmount ;

    //参与优惠计算的金额
    private BigDecimal discountableAmount ;

    //不参与优惠计算的金额
    private BigDecimal undiscountableAmount ;

    //订单标题 必传
    private String subject ;

    //订单描述
    private String body ;

    private String mchInfoId;//商户id

    private String storeId;//门店id

    private String posNo;//设备号


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

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDiscountableAmount() {
        return discountableAmount;
    }

    public void setDiscountableAmount(BigDecimal discountableAmount) {
        this.discountableAmount = discountableAmount;
    }

    public BigDecimal getUndiscountableAmount() {
        return undiscountableAmount;
    }

    public void setUndiscountableAmount(BigDecimal undiscountableAmount) {
        this.undiscountableAmount = undiscountableAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMchInfoId() {
        return mchInfoId;
    }

    public void setMchInfoId(String mchInfoId) {
        this.mchInfoId = mchInfoId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }
}
