package com.rongyi.easy.merchantactivity.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/15
 * TIME : 11:07
 * ideaworkspace.
 */
public class EnrollCoupon implements Serializable {
    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 活动券id
     */
    private String couponId;

    /**
     * 参与时间
     */
    private Date joinStartAt;

    /**
     * 参与结束时间
     */
    private Date joinEndAt;

    /**
     * 类型对应的  id
     */
    private String relevanId;

    /**
     *  0 代表大运营  1代表商场 2达标店铺 3代表品牌 4代表集团
     */
    private Integer relevanType;
    /**
     * 创建人
     */
    private String createUserName;
    /**
     * 创建人id
     */
    private String createUserId;

    private Integer joinCount;

    private Integer stockCount;

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

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
    }

    public String getRelevanId() {
        return relevanId;
    }

    public void setRelevanId(String relevanId) {
        this.relevanId = relevanId;
    }

    public Integer getRelevanType() {
        return relevanType;
    }

    public void setRelevanType(Integer relevanType) {
        this.relevanType = relevanType;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("couponId", couponId)
                .append("joinStartAt", joinStartAt)
                .append("joinEndAt", joinEndAt)
                .append("relevanId", relevanId)
                .append("relevanType", relevanType)
                .append("createUserName", createUserName)
                .append("createUserId", createUserId)
                .append("joinCount", joinCount)
                .append("stockCount", stockCount)
                .toString();
    }
}
