package com.rongyi.pay.core.webank.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * 支付宝扫码支付请求参数 （C扫B）
 * Created by sujuan on 2017/3/28.
 */
public class WaScanPayParam extends BaseData{
    //商户号 必传
    private String wbMerchantId;

    //订单号 必传
    private String orderId;

    //卖家支付宝用户ID
    private String sellerId;

    //订单总金额 元 必传
    private String totalAmount ;

    //可打折金额 元
    private String discountableAmount ;

    //不可打折金额 元
    private String undiscountableAmount ;

    //买家支付宝账号
    private String buyerLogonId ;

    //订单标题 必传
    private String subject ;

    //对交易或者商品的描述
    private String body ;

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

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDiscountableAmount() {
        return discountableAmount;
    }

    public void setDiscountableAmount(String discountableAmount) {
        this.discountableAmount = discountableAmount;
    }

    public String getUndiscountableAmount() {
        return undiscountableAmount;
    }

    public void setUndiscountableAmount(String undiscountableAmount) {
        this.undiscountableAmount = undiscountableAmount;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
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
}
