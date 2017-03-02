package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众支付宝订单查询请求参数
 * Created by sujuan on 2017/3/1.
 */
public class WaQueryTradeReqData extends BaseData{
    //商户号
    private String wbMerchantId;

    //订单号 跟tradeNo不能同时为空
    private String orderId;

    //支付宝交易号
    private String tradeNo;

    public WaQueryTradeReqData(String merchatId, String orderId) {
        setWbMerchantId(merchatId);
        setOrderId(orderId);
    }

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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
