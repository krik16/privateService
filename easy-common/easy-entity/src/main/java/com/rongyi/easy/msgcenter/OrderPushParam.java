package com.rongyi.easy.msgcenter;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/13 14:55
 * Package:com.rongyi.easy.msgcenter
 * Project:message-center
 */
public class OrderPushParam {

    /**
     * 通知类型：
     * 1：下单成功；
     * 2：订单付款；
     * 3：订单发货；
     * 25：交易完成；
     * 5：买家指定时间未付款，订单取消；
     * 21：卖家关闭订单，订单取消；
     * 8：退款申请；
     * //退款结果
     */
    private Integer type;
    private String userId;
    private String orderNo;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderUpdatePushParam{");
        sb.append("type=").append(type);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", orderNo='").append(orderNo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
