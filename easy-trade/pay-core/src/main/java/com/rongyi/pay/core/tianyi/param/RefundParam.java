package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class RefundParam extends BaseData{

    //商户代码-M
    private String merchantId;

    //商户字代码-O
    private String subMerchantId;

    //商户key
    private String key;

    //商户调用密码-M
    private String merchantPwd;

    //原扣款订单号-M
    private String oldOrderNo;

    //原订单请求交易支付流水号-M
    private String oldOrderReqNo;

    //退款流水号-M
    private String refundReqNo;

    //退款请求日期-M
    private String refundReqDate;

    //退款交易金额-M
    private String transAmt;

    //分账明细-O
    private String ledgerDetail;

    //渠道-M
    private String channel;

    //Mac校验域-M
    private String mac;

    //退款回调地址-O
    private String bgUrl;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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

    public String getMerchantPwd() {
        return merchantPwd;
    }

    public void setMerchantPwd(String merchantPwd) {
        this.merchantPwd = merchantPwd;
    }

    public String getOldOrderNo() {
        return oldOrderNo;
    }

    public void setOldOrderNo(String oldOrderNo) {
        this.oldOrderNo = oldOrderNo;
    }

    public String getOldOrderReqNo() {
        return oldOrderReqNo;
    }

    public void setOldOrderReqNo(String oldOrderReqNo) {
        this.oldOrderReqNo = oldOrderReqNo;
    }

    public String getRefundReqNo() {
        return refundReqNo;
    }

    public void setRefundReqNo(String refundReqNo) {
        this.refundReqNo = refundReqNo;
    }

    public String getRefundReqDate() {
        return refundReqDate;
    }

    public void setRefundReqDate(String refundReqDate) {
        this.refundReqDate = refundReqDate;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getLedgerDetail() {
        return ledgerDetail;
    }

    public void setLedgerDetail(String ledgerDetail) {
        this.ledgerDetail = ledgerDetail;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getBgUrl() {
        return bgUrl;
    }

    public void setBgUrl(String bgUrl) {
        this.bgUrl = bgUrl;
    }
}
