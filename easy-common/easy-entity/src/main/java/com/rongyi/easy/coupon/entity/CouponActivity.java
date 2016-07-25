package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lqy on 2015/10/17.
 */
public class CouponActivity implements Serializable {
    /**
     * PK
     */
    private Integer id;

    /**
     * 卡券ID
     */
    private String couponId;

    /**
     * 活动ID
     */
    private String activityId;

    /**
     * 活动类型: 翻牌购[0] 推送[1] 大运营推送卡券[2] 终端屏活动 [3] 促销推广码[4]
     */
    private Integer activityType;

    /**
     * 关联时间
     */
    private Date relatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getRelatedAt() {
        return relatedAt;
    }

    public void setRelatedAt(Date relatedAt) {
        this.relatedAt = relatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("couponId", couponId)
                .append("activityId", activityId)
                .append("activityType", activityType)
                .append("relatedAt", relatedAt)
                .toString();
    }
}
