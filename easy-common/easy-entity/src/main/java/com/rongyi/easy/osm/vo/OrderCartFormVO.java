package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.OrderCartFormEntity;

import java.util.Date;

/**
 * Created by kejun on 2015/12/22.
 */
public class OrderCartFormVO extends OrderCartFormEntity {

    /**
     * 是否是购物车订单
     */
    private boolean isCartOrder;
    /**
     * 支付时间
     */
    private Date payAt;
    /**
     * 时间类型
     */
    private String eventType;

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public boolean isCartOrder() {
        return isCartOrder;
    }

    public void setIsCartOrder(boolean isCartOrder) {
        this.isCartOrder = isCartOrder;
    }
}
