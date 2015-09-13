package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券现金劵生成的券码
 *
 * @author Breggor
 */

public class CouponCode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 券码ID
     */
    private Long id;

    /**
     * 券码
     */
    private String code;

    /**
     * 优惠、现金券ID
     */
    private String couponId;

    /**
     * 商场ID
     */
    private String mallId;

    /**
     * 店铺ID
     */
    private String shopId;

    /**
     * 券码类型
     */
    private String type;

    /**
     * 状态 0:待领取 1:已领取 2:已使用 3:已过期。
     */
    private Integer status;

    /**
     * 领用券码用户ID
     */
    private String userId;

    /**
     * 领用券码用户类型
     */
    private String userType;

    /**
     * 领用券码用户手机
     */
    private String mobile;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间（验证时间）(废弃)
     */
    private Date updatedTime;

    /**
     * 编码是否被删除：n-没有删除 y-已删除
     */
    private String isDelete;

    /**
     * 用户渠道：(废弃)
     */
    private String userSrc;

    /**
     * 有效期开始时间(废弃)
     */
    private Date validBeginDate;

    /**
     * 有效期结束时间(废弃)
     */
    private Date validEndDate;

    /**
     * 抵扣金额 (废弃)
     */
    private Double discount;

    private String inChannel;

    private Boolean isThrid;

    public Boolean getIsThrid() {
        return isThrid;
    }

    public void setIsThrid(Boolean isThrid) {
        this.isThrid = isThrid;
    }

    public String getInChannel() {
        return inChannel;
    }

    public void setInChannel(String inChannel) {
        this.inChannel = inChannel;
    }

    public Date getValidBeginDate() {
        return validBeginDate;
    }

    public void setValidBeginDate(Date validBeginDate) {
        this.validBeginDate = validBeginDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getUserSrc() {
        return userSrc;
    }

    public void setUserSrc(String userSrc) {
        this.userSrc = userSrc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public CouponCode() {
    }

    public CouponCode(String code, String couponId) {
        this.code = code;
        this.couponId = couponId;
    }

    public CouponCode(String code, String couponId, String inChannel) {
        this.code = code;
        this.couponId = couponId;
        this.inChannel = inChannel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("code", code).append("couponId", couponId).append("mallId", mallId).append("shopId", shopId).append("type", type).append("status", status).append("userId", userId).append("userType", userType).append("mobile", mobile).append("createdTime", createdTime).append("updatedTime", updatedTime).append("isDelete", isDelete).append("userSrc", userSrc).append("validBeginDate", validBeginDate).append("validEndDate", validEndDate).append("discount", discount).append("inChannel", inChannel).toString();
    }
}
