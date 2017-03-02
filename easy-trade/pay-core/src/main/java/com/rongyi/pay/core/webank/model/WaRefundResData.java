package com.rongyi.pay.core.webank.model;

import com.alipay.api.domain.TradeFundBill;

import java.util.List;

/**
 * 微众支付宝退款返回结果
 * Created by sujuan on 2017/3/2.
 */
public class WaRefundResData extends AlipayCommonResData{
    //结果码
    private String retCode ;

    //结果信息
    private String retMsg ;

    //业务返回码
    private String subCode ;

    //业务返回描述
    private String subMsg ;

    //支付宝交易号
    private String tradeNo;

    //商户订单号
    private String outTradeNo ;

    //买家支付宝用户号
    private String openId ;

    //用户登录ID
    private String buyerLogonId ;

    //本次是否发生了资金变化
    private String fundChange ;

    //退款总金额
    private String refundFee ;

    //退款支付时间
    private String gmtRefundPay ;

    //退款使用的资金渠道
    private List<TradeFundBill> refundDetailItemList ;

    //交易支付时的门店名称
    private String storeName ;

    //买家在支付宝的用户ID
    private String buyerUserId ;

    //本次商户实际退回金额
    private String sendBackFee ;

    //扩展信息
    private String externalInfo ;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getFundChange() {
        return fundChange;
    }

    public void setFundChange(String fundChange) {
        this.fundChange = fundChange;
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public String getGmtRefundPay() {
        return gmtRefundPay;
    }

    public void setGmtRefundPay(String gmtRefundPay) {
        this.gmtRefundPay = gmtRefundPay;
    }

    public List<TradeFundBill> getRefundDetailItemList() {
        return refundDetailItemList;
    }

    public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList) {
        this.refundDetailItemList = refundDetailItemList;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getSendBackFee() {
        return sendBackFee;
    }

    public void setSendBackFee(String sendBackFee) {
        this.sendBackFee = sendBackFee;
    }

    public String getExternalInfo() {
        return externalInfo;
    }

    public void setExternalInfo(String externalInfo) {
        this.externalInfo = externalInfo;
    }
}
