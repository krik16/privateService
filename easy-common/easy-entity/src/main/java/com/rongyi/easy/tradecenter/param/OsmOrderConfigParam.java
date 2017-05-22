package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * 支付/交易配置（请求参数）
 *
 * @author wangjh7
 * @date 2017-05-22
 **/
public class OsmOrderConfigParam implements Serializable {
    // 主账号关联的店铺/商城ID
    private String chiefId;
    // 订单确认收货到交易成功时间
    private int maxTimeoutForOrderClose;
    // 系统默认订单确认收货时间
    private int maxTimeoutForOrderCofirm;
    // 卖家超时未发货订单关闭时间
    private int maxTimeoutForOrderDelivery;
    // 买家逾期未支付订单关闭时间
    private int maxTimeoutForOrderPayment;

    public String getChiefId() {
        return chiefId;
    }

    public void setChiefId(String chiefId) {
        this.chiefId = chiefId;
    }

    public int getMaxTimeoutForOrderClose() {
        return maxTimeoutForOrderClose;
    }

    public void setMaxTimeoutForOrderClose(int maxTimeoutForOrderClose) {
        this.maxTimeoutForOrderClose = maxTimeoutForOrderClose;
    }

    public int getMaxTimeoutForOrderCofirm() {
        return maxTimeoutForOrderCofirm;
    }

    public void setMaxTimeoutForOrderCofirm(int maxTimeoutForOrderCofirm) {
        this.maxTimeoutForOrderCofirm = maxTimeoutForOrderCofirm;
    }

    public int getMaxTimeoutForOrderDelivery() {
        return maxTimeoutForOrderDelivery;
    }

    public void setMaxTimeoutForOrderDelivery(int maxTimeoutForOrderDelivery) {
        this.maxTimeoutForOrderDelivery = maxTimeoutForOrderDelivery;
    }

    public int getMaxTimeoutForOrderPayment() {
        return maxTimeoutForOrderPayment;
    }

    public void setMaxTimeoutForOrderPayment(int maxTimeoutForOrderPayment) {
        this.maxTimeoutForOrderPayment = maxTimeoutForOrderPayment;
    }

    @Override
    public String toString() {
        return "OsmOrderConfigParam{" +
                "chiefId='" + chiefId + '\'' +
                ", maxTimeoutForOrderClose=" + maxTimeoutForOrderClose +
                ", maxTimeoutForOrderCofirm=" + maxTimeoutForOrderCofirm +
                ", maxTimeoutForOrderDelivery=" + maxTimeoutForOrderDelivery +
                ", maxTimeoutForOrderPayment=" + maxTimeoutForOrderPayment +
                '}';
    }
}
