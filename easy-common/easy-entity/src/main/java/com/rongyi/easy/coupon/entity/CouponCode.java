package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 卡券券码
 *
 * @author Breggor
 */

public class CouponCode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 券码ID
     */
    private Integer id;

    /**
     * 券码
     */
    private String code;

    /**
     * 卡券ID
     */
    private String couponId;

    /**
     * 券码类型
     */
    private String type;

    /**
     * 状态 0:待发码 1:已发码
     */
    private Integer status;

    /**
     * 第三导入码渠道
     */
    private String inChannel;

    /**
     * 是否第三方码
     */
    private Boolean isThrid;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 逻辑删除：N-未删除 Y-已删除
     */
    private String isDelete;

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * 商场ID
     */
//    @Deprecated
//    private String mallId;

    /**
     * 店铺ID
     */
//    @Deprecated
//    private String shopId;

    /**
     * 领用券码用户ID
     */
//    @Deprecated
//    private String userId;

    /**
     * 领用券码用户类型
     */
//    @Deprecated
//    private String userType;

    /**
     * 领用券码用户手机
     */
//    @Deprecated
//    private String mobile;


    /**
     * 用户渠道：(废弃)
     */
//    @Deprecated
//    private String userSrc;

    /**
     * 有效期开始时间(废弃)
     */
//    @Deprecated
//    private Date validBeginDate;

    /**
     * 有效期结束时间(废弃)
     */
//    @Deprecated
//    private Date validEndDate;

    /**
     * 抵扣金额 (废弃)
     */
//    @Deprecated
//    private Double discount;
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

//    @Deprecated
//    public Date getValidBeginDate() {
//        return validBeginDate;
//    }
//
//    @Deprecated
//    public void setValidBeginDate(Date validBeginDate) {
//        this.validBeginDate = validBeginDate;
//    }
//
//    @Deprecated
//    public Date getValidEndDate() {
//        return validEndDate;
//    }
//
//    @Deprecated
//    public void setValidEndDate(Date validEndDate) {
//        this.validEndDate = validEndDate;
//    }
//
//    @Deprecated
//    public Double getDiscount() {
//        return discount;
//    }
//
//    @Deprecated
//    public void setDiscount(Double discount) {
//        this.discount = discount;
//    }
//
//    @Deprecated
//    public String getUserSrc() {
//        return userSrc;
//    }
//
//    @Deprecated
//    public void setUserSrc(String userSrc) {
//        this.userSrc = userSrc;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

//    @Deprecated
//    public String getMallId() {
//        return mallId;
//    }
//
//    @Deprecated
//    public void setMallId(String mallId) {
//        this.mallId = mallId;
//    }
//
//    @Deprecated
//    public String getShopId() {
//        return shopId;
//    }
//
//    @Deprecated
//    public void setShopId(String shopId) {
//        this.shopId = shopId;
//    }

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

//    @Deprecated
//    public String getUserId() {
//        return userId;
//    }
//
//    @Deprecated
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    @Deprecated
//    public String getMobile() {
//        return mobile;
//    }
//
//    @Deprecated
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }

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

//    @Deprecated
//    public String getUserType() {
//        return userType;
//    }
//
//    @Deprecated
//    public void setUserType(String userType) {
//        this.userType = userType;
//    }

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

    public CouponCode(String code, String couponId, String inChannel, String version) {
        this.code = code;
        this.couponId = couponId;
        this.inChannel = inChannel;
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CouponCode that = (CouponCode) o;
        return Objects.equals(code, that.code) && Objects.equals(inChannel, that.inChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, inChannel);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("code", code)
                .append("couponId", couponId)
                .append("type", type)
                .append("status", status)
                .append("inChannel", inChannel)
                .append("isThrid", isThrid)
                .append("createdTime", createdTime)
                .append("updatedTime", updatedTime)
                .append("isDelete", isDelete)
                .toString();
    }
}
