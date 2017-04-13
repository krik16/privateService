package com.rongyi.easy.rpb.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 微众支付宝扫码支付签名
 * conan
 * 2017/3/6 14:15
 **/
public class WaScanPaySignVo implements Serializable{
    private static final long serialVersionUID = -5841080118584970083L;
    //商户号 必传
    private String wbMerchantId;

    //订单号 必传
    private String orderNo;

    //卖家支付宝用户ID
    private String sellerId;

    //订单总金额 分 必传
    private Integer totalAmount ;

    //买家支付宝账号
    private String buyerLogonId ;

    //订单标题 必传
    private String subject ;

    //对交易或者商品的描述
    private String body ;

    //订单类型 6:福利订单,7:开放平台
    private Integer orderType;

    public String getWbMerchantId() {
        return wbMerchantId;
    }

    public void setWbMerchantId(String wbMerchantId) {
        this.wbMerchantId = wbMerchantId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
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

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
