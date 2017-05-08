package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class PayQueryParam extends BaseData {

    //商户号-M
    private String merchantId;

    //订单号-M
    private String orderNo;

    //订单请求交易流水号-M
    private String orderReqNo;

    //订单日期-M
    private String orderDate;

    //mac校验域-M
    private String mac;

    //商户key
    private String key;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderReqNo() {
        return orderReqNo;
    }

    public void setOrderReqNo(String orderReqNo) {
        this.orderReqNo = orderReqNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
