package com.rongyi.pay.core.webank.param;

import com.rongyi.pay.core.util.BaseData;

import java.math.BigDecimal;

/**
 * 微众微信扫码支付参数
 * Created by sujuan on 2017/2/15.
 */
public class WwPunchCardPayParam extends BaseData{

    //商户号 必填
    private String merchantCode ;

    //终端号 必填
    private String terminalCode = "web";

    //商户订单号 必填
    private String orderNo;
    
    //金额（元）必填
    private BigDecimal amount;

    //产品   必填
    private String product;

    //授权码 必填
    private String authCode;

    //用户OpendId
    private String openid;

    //商户appid
    private String subAppid;

    //商品标记
    private String goodsTag;

    //订单标题
    private String subject;

    //订单描述
    private String body;
    //附加信息
    private String attach ;

    private String mchInfoId;//商户号

    private String storeId;//门店号

    private String posNo;//设备号

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
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
