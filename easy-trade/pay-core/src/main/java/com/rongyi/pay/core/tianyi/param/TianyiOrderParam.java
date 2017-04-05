package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/1.
 */
public class TianyiOrderParam extends BaseData {

    //商户代码-M
    private String merchantId;

    //商户字代码-O
    private String subMerchantId;

    //订单号-M
    private String orderSeq;

    //订单请求流水号-M
    private String orderReqTranseq;

    //订单请求时间-M
    private String orderReqTime;

    //交易代码-M
    private String transCode;

    //订单金额-M
    private String orderAmt;

    //订单币种-O
    private String orderCcy;

    //接入渠道-O
    private String serviceCode;

    //商品代码-M
    private String productId;

    //商品描述-M
    private String productDesc;

    //翼支付登录帐号-O
    private String loginNo;

    //省份---O>
    private String provinceCode;

    //城市-O
    private String cityCode;

    //分账信息-O
    private String divDetails;

    //MAC字段的加密方式-M
    private String encodeType;

    //MAC验证信息-M
    private String mac;

    //登录密串-O
    private String sessionKey;

    //加密因子索引-O
    private String encode;

    //附加信息-O
    private String accach;

    //请求来源-M
    private String requestSystem;

    //风控信息-M
    private String riskControlInfo;


    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getSubMerchantId() {
        return subMerchantId;
    }

    public void setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
    }

    public String getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(String orderSeq) {
        this.orderSeq = orderSeq;
    }

    public String getOrderReqTranseq() {
        return orderReqTranseq;
    }

    public void setOrderReqTranseq(String orderReqTranseq) {
        this.orderReqTranseq = orderReqTranseq;
    }

    public String getOrderReqTime() {
        return orderReqTime;
    }

    public void setOrderReqTime(String orderReqTime) {
        this.orderReqTime = orderReqTime;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getOrderCcy() {
        return orderCcy;
    }

    public void setOrderCcy(String orderCcy) {
        this.orderCcy = orderCcy;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getLoginNo() {
        return loginNo;
    }

    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDivDetails() {
        return divDetails;
    }

    public void setDivDetails(String divDetails) {
        this.divDetails = divDetails;
    }

    public String getEncodeType() {
        return encodeType;
    }

    public void setEncodeType(String encodeType) {
        this.encodeType = encodeType;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }

    public String getAccach() {
        return accach;
    }

    public void setAccach(String accach) {
        this.accach = accach;
    }

    public String getRequestSystem() {
        return requestSystem;
    }

    public void setRequestSystem(String requestSystem) {
        this.requestSystem = requestSystem;
    }

    public String getRiskControlInfo() {
        return riskControlInfo;
    }

    public void setRiskControlInfo(String riskControlInfo) {
        this.riskControlInfo = riskControlInfo;
    }
}
