package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.UserRedenvelope;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 红包
 * 兼容现金券代码
 *
 * @author Breggor
 */
public class UserRedenvelopeVO implements Serializable {

    private Long id;

    /**
     * 活动Id：目前只有翻牌购
     */
    private String activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 卡券Id
     */
    private String couponId;


    /**
     * 卡券码
     */
    private String couponCode;

    /**
     * 卡券名称
     */
    private String title;

    /**
     * 卡券缩略图
     */
    private String thumbnail;

    /**
     * 买家Id
     */
    private String userId;


    /**
     * 券类型:   红包[03]
     */
    private String couponType = "03";

    /**
     * 红包: 0: 全场 1: 商品
     */
    private String type;

    /**
     * 使用说明
     */
    private String useDescription;

    /**
     * 推荐说明
     */
    private String recommend;

    /**
     * 使用状态: 未使用[1],已使用[2],已过期[3]
     */
    private Integer status;

    /**
     * 红包 商品ids，多个以逗号分隔
     */
    private String productIds;


    /**
     * 折扣价
     */
    private Double discount;


    /**
     * 发放时间
     */
    private Date provideTime;

    /**
     * 使用(验码)时间
     */
    private Date useTime;

    /**
     * 有效期始
     */
    private Date startTime;

    /**
     * 有效起止
     */
    private Date endTime;

    // 券状态 0:未激活 1:已领用 2:已使用 3:已过期
    public void setConvertStatus(Integer status, Date validEndAt) {
        if (UserRedenvelope.STATUS_UNUSE.equals(status))
            this.setStatus(1);
        else if (UserRedenvelope.STATUS_USED.equals(status))
            this.setStatus(2);
        else if (new Date().after(validEndAt))
            this.setStatus(3);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getProvideTime() {
        return provideTime;
    }

    public void setProvideTime(Date provideTime) {
        this.provideTime = provideTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("activityName", activityName)
                .append("couponId", couponId)
                .append("couponCode", couponCode)
                .append("title", title)
                .append("thumbnail", thumbnail)
                .append("userId", userId)
                .append("couponType", couponType)
                .append("type", type)
                .append("useDescription", useDescription)
                .append("recommend", recommend)
                .append("status", status)
                .append("productIds", productIds)
                .append("discount", discount)
                .append("provideTime", provideTime)
                .append("useTime", useTime)
                .append("startTime", startTime)
                .append("endTime", endTime)
                .toString();
    }
}
