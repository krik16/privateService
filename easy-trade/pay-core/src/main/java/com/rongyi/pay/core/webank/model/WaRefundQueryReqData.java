package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众支付宝退款查询请求参数
 * Created by sujuan on 2017/3/2.
 */
public class WaRefundQueryReqData extends BaseData{
    //商户号
    private String wbMerchantId ;

    //订单号 跟tradeNo不能同时为空
    private String orderId ;

    //支付宝交易号
    private String tradeNo ;

    //退款请求号
    private String outRequestNo ;

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

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }
}
