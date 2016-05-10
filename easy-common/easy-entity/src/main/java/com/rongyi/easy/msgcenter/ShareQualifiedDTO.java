package com.rongyi.easy.msgcenter;

import com.rongyi.easy.coupon.entity.CouponCode;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/5/6 10:40
 * Package:com.rongyi.easy.msgcenter
 * Project:easy-market
 */
public class ShareQualifiedDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 是否具有分享资格  有 true  没有false;
     */
    private boolean hasQualify;
    /**
     * 锁定的券码
     */
    private List<CouponCode> couponCode;
    /**
     * 分享活动id
     */
    private Integer activityId;
    /**
     * 分享活动名称
     */
    private String activityName;
    /**
     * 该分享中最大红包数
     */
    private Integer obtainTimes;

    public boolean isHasQualify() {
        return hasQualify;
    }

    public void setHasQualify(boolean hasQualify) {
        this.hasQualify = hasQualify;
    }

    public List<CouponCode> getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(List<CouponCode> couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getObtainTimes() {
        return obtainTimes;
    }

    public void setObtainTimes(Integer obtainTimes) {
        this.obtainTimes = obtainTimes;
    }

    public ShareQualifiedDTO(){
        this.hasQualify=Boolean.FALSE;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ShareQualifiedDTO{");
        sb.append("hasQualify=").append(hasQualify);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", activityId=").append(activityId);
        sb.append(", activityName='").append(activityName).append('\'');
        sb.append(", obtainTimes=").append(obtainTimes);
        sb.append('}');
        return sb.toString();
    }
}
