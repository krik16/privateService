package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动返回参数
 *
 * @author wangjh7
 * @date 2017-05-02
 **/
public class QueryForActivityVO implements Serializable {
    // 活动ID
    private Integer activityId;
    // 活动类型，参考（普通0、闪购1、特卖2、秒杀3、拼团4、超级团教育版5、断码好货6）
    private Integer activityType;
    // 活动名称
    private String activityName;
    // 订单ID
    private Integer orderId;
    // 订单号
    private String orderNo;
    // 订单状态 1:待支付 2：待发货 3：待收货 4：已完成 5：已关闭
    private String orderStatus;
    // 买家手机号码
    private String buyerPhone;
    // 商品ID
    private String commodityId;
    // 商品名称
    private String commodityName;
    // 规格ID
    private String commoditySpecId;
    // 规格名称
    private String commoditySpecName;
    // 商品数量
    private Integer number;
    // 支付金额
    private float payAmount;
    // 下单时间
    private long createDate;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommoditySpecId() {
        return commoditySpecId;
    }

    public void setCommoditySpecId(String commoditySpecId) {
        this.commoditySpecId = commoditySpecId;
    }

    public String getCommoditySpecName() {
        return commoditySpecName;
    }

    public void setCommoditySpecName(String commoditySpecName) {
        this.commoditySpecName = commoditySpecName;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(float payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public String toString() {
        return "QueryForActivityVO{" +
                "activityId=" + activityId +
                ", activityType=" + activityType +
                ", activityName='" + activityName + '\'' +
                ", orderId=" + orderId +
                ", orderNo='" + orderNo + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", commodityId='" + commodityId + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", commoditySpecId='" + commoditySpecId + '\'' +
                ", commoditySpecName='" + commoditySpecName + '\'' +
                ", number=" + number +
                ", payAmount=" + payAmount +
                ", createDate=" + createDate +
                '}';
    }
}
