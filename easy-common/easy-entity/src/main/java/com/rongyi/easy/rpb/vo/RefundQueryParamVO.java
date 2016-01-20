package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/1/20 11:48
 **/
public class RefundQueryParamVO  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4210085071379422435L;

    /**
     * 订单号
     */
    public String orderNo;

    /**
     * 退款单号
     */
    public String refundNo;

    /**
     * 付款方式（0:支付宝，1:微信）
     */
    public  Integer paychannel;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public Integer getPaychannel() {
        return paychannel;
    }

    public void setPaychannel(Integer paychannel) {
        this.paychannel = paychannel;
    }
}
