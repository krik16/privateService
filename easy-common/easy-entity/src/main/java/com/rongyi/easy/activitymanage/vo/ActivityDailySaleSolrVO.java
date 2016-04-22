package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.vo easy-api :author lijing
 * User:lijing
 * DATE : 2016/4/18
 * TIME : 10:54
 * easy-api.
 */
public class ActivityDailySaleSolrVO  implements Serializable{

    private Integer activityId;

    private String couponId;

    private String commodityId;

    /**
     * 类型 1 是卡券  2是商品
     */
    private Integer type;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("couponId", couponId)
                .append("commodityId", commodityId)
                .append("type", type)
                .toString();
    }
}
