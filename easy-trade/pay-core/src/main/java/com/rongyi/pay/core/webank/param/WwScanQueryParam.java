package com.rongyi.pay.core.webank.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众微信公众号支付请求参数
 * Created by sujuan on 2017/3/28.
 */
public class WwScanQueryParam extends BaseData{
    //商户号 必传
    private String mchId;

    //商户订单号 （商户订单号 微众银行订单号 微信订单号必传其一）
    private String outTradeNo;

    //微众银行订单号
    private String orderid ;

    //微信支付订单号
    private String transactionId ;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
