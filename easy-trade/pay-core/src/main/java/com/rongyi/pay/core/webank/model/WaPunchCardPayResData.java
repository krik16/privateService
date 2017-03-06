package com.rongyi.pay.core.webank.model;

import com.alipay.api.domain.TradeFundBill;

import java.util.List;

/**
 * 微众支付宝条码支付返回参数
 * Created by sujuan on 2017/3/1.
 */
public class WaPunchCardPayResData extends AlipayCommonResData{
    //结果码
    private String retCode;

    //结果信息
    private String retMsg ;

    //状态码
    private String subCode;

    //状态码描述
    private String subMsg ;

    //支付宝交易 号
    private String tradeNo ;

    //商户订单号
    private String outTradeNo ;

    //买家支付宝账号
    private String buyerLogonId ;

    //交易金额
    private String totalAmount ;

    //实收金额
    private String receiptAmount ;

    //买家付款金额
    private String buyerPayAmount;

    //使用积分宝付款的金额
    private String pointAmount ;

    //交易 中可给用户开具发票的金额
    private String invoiceAmount ;

    //交易支付的时间
    private String gmtPayment;

    //交易支付使用的资金渠道
   // private List<TradeFundBill> fundBillList ;

    //支付宝卡余额
    private String cardBalance ;

    //发生支付交易的商户门店名称
    private String storeName;

    //买家在支付的用户ID
    private String buyerUserId;

    //本次交易 支付所使用的单品券优惠的商品优惠信息
    private String discountGoodsDetail ;

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

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(String buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    public String getPointAmount() {
        return pointAmount;
    }

    public void setPointAmount(String pointAmount) {
        this.pointAmount = pointAmount;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getGmtPayment() {
        return gmtPayment;
    }

    public void setGmtPayment(String gmtPayment) {
        this.gmtPayment = gmtPayment;
    }

    public String getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(String cardBalance) {
        this.cardBalance = cardBalance;
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

    public String getDiscountGoodsDetail() {
        return discountGoodsDetail;
    }

    public void setDiscountGoodsDetail(String discountGoodsDetail) {
        this.discountGoodsDetail = discountGoodsDetail;
    }

    public String getExternalInfo() {
        return externalInfo;
    }

    public void setExternalInfo(String externalInfo) {
        this.externalInfo = externalInfo;
    }
}
