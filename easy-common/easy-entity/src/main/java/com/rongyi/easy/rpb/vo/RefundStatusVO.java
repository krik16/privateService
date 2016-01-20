package com.rongyi.easy.rpb.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/1/20 11:35
 **/
public class RefundStatusVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4210085071379425435L;

    /**
     *  容易网是否处理
     **/
    public boolean isRongyiProcess;
    /**
     * 容易网处理时间
     */
    public Date rongyiDate;

    /**
     * 支付平台是否处理
     */
    public boolean isPayPlatformProcess;

    /**
     * 支付平台处理时间
     */
    public Date payPlatformDate;

    /**
     * 是否退款完成
     */
    public boolean isRefund;

    /**
     *退款完成时间
     */
    public boolean refundDate;

    public boolean isRongyiProcess() {
        return isRongyiProcess;
    }

    public void setIsRongyiProcess(boolean isRongyiProcess) {
        this.isRongyiProcess = isRongyiProcess;
    }

    public Date getRongyiDate() {
        return rongyiDate;
    }

    public void setRongyiDate(Date rongyiDate) {
        this.rongyiDate = rongyiDate;
    }

    public boolean isPayPlatformProcess() {
        return isPayPlatformProcess;
    }

    public void setIsPayPlatformProcess(boolean isPayPlatformProcess) {
        this.isPayPlatformProcess = isPayPlatformProcess;
    }

    public Date getPayPlatformDate() {
        return payPlatformDate;
    }

    public void setPayPlatformDate(Date payPlatformDate) {
        this.payPlatformDate = payPlatformDate;
    }

    public boolean isRefund() {
        return isRefund;
    }

    public void setIsRefund(boolean isRefund) {
        this.isRefund = isRefund;
    }

    public boolean isRefundDate() {
        return refundDate;
    }

    public void setRefundDate(boolean refundDate) {
        this.refundDate = refundDate;
    }
}
