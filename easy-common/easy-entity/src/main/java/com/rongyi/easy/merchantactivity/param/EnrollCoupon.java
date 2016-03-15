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
    private Integer activityId;

    private String couponId;

    private Date joinStartAt;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("relevanType", relevanType)
                .append("relevanId", relevanId)
                .append("joinEndAt", joinEndAt)
                .append("joinStartAt", joinStartAt)
                .append("couponId", couponId)
                .append("activityId", activityId)
                .toString();
    }
}
