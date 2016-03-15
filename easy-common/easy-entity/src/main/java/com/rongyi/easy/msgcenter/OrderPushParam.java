package com.rongyi.easy.msgcenter;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/13 14:55
 * Package:com.rongyi.easy.msgcenter
 * Project:message-center
 */
public class OrderPushParam implements Serializable {

    /**
     * 通知类型：
     * 1：下单成功；
     * 2：订单付款；
     * 3：订单发货；
     * 25：交易完成；
     * // 5：买家指定时间未付款，订单取消；暂不支持
     * 21：卖家关闭订单，订单取消；
     * //8：退款申请；暂不支持
     * //退款结果；暂不支持
     */
    private Integer type;

    private String userId;

    private Integer orderId;

    private Integer isCartOrder;//是否购物车订单     0 ：不是    1：是

    private String orderNo;

    private String openId;//对象的微信用户id

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderPushParam{");
        sb.append("type=").append(type);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", orderId=").append(orderId);
        sb.append(", isCartOrder=").append(isCartOrder);
        sb.append(", orderNo='").append(orderNo).append('\'');
        sb.append(", openId='").append(openId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getIsCartOrder() {
        return isCartOrder;
    }

    public void setIsCartOrder(Integer isCartOrder) {
        this.isCartOrder = isCartOrder;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
