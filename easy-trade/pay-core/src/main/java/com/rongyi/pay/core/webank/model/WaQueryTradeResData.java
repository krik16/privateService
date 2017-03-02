package com.rongyi.pay.core.webank.model;

import com.alipay.api.domain.TradeFundBill;

import java.util.List;

/**
 * 微众支付宝查询订单响应参数
 * Created by sujuan on 2017/3/1.
 */
public class WaQueryTradeResData extends AlipayCommonResData{
    //支付宝交易号
    private String tradeNo ;

    //商户订单号
    private String outTradeNo ;

    //交易状态
    private String tradeStatus ;

    //买家支付宝账号
    private String buyerLogonId ;

    //交易金额
    private String totalAmount ;

    //实收金额
    private String receiptAmount;

    //买家付款金额
    private String buyerPayAmount ;

    //使用积分宝付款的金额
    private String pointAmount ;

    //交易中可给用户开具发票的金额
    private String invoiceAmount ;

    //交易支付的时间
    private String sendPayDate ;

    //支付宝店铺编号
    private String alipayStoreId;

    //商户门店编号
    private String storeId;

    //商户机具终端编号
    private String terminalId;

    //交易支付使用的渠道号
    private List<TradeFundBill> fundBillList ;

    //发生支付交易的商户门店名称
    private String storeName ;

    //买家在支付宝的用户Id
    private String buyerUserId ;

    //本次交易支付所使用的单品券优惠的商品优惠信息
    private String discountGoodsDetail ;

    //扩展信息
    private String externalInfo;

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

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
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

    public String getSendPayDate() {
        return sendPayDate;
    }

    public void setSendPayDate(String sendPayDate) {
        this.sendPayDate = sendPayDate;
    }

    public String getAlipayStoreId() {
        return alipayStoreId;
    }

    public void setAlipayStoreId(String alipayStoreId) {
        this.alipayStoreId = alipayStoreId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public List<TradeFundBill> getFundBillList() {
        return fundBillList;
    }

    public void setFundBillList(List<TradeFundBill> fundBillList) {
        this.fundBillList = fundBillList;
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
