package com.rongyi.easy.pos.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 满减活动查询结果实体
 *
 * @author wangjh7
 * @date 2017-02-04
 */
public class ReductionActivityEntity implements Serializable {
    private String orderNo;
    private String orderChannel;
    private String buyerId;
    private String phone;
    private String shopId;
    private String shopName;
    private Integer realAmount;
    private Integer payAmount;
    private Integer reductionFee;
    private Date createAt;
    private String activityId;
    private Integer goodsCount;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Integer realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getReductionFee() {
        return reductionFee;
    }

    public void setReductionFee(Integer reductionFee) {
        this.reductionFee = reductionFee;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Override
    public String toString() {
        return "ReductionActivityEntity{" +
                "activityId='" + activityId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderChannel='" + orderChannel + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", phone='" + phone + '\'' +
                ", shopId='" + shopId + '\'' +
                ", shopName='" + shopName + '\'' +
                ", realAmount=" + realAmount +
                ", payAmount=" + payAmount +
                ", reductionFee=" + reductionFee +
                ", createAt=" + createAt +
                ", goodsCount=" + goodsCount +
                '}';
    }
}
