package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户抵扣券
 */
public class UserRebate implements Serializable {
    private Integer id;

    /**
     * 领用人id
     */
    private String userId;

    /**
     * 领用人姓名
     */
    private String userName;

    /**
     * 抵扣券id
     */
    private String couponId;

    /**
     * 抵扣券券码
     */
    private String couponCode;

    /**
     * 抵扣金额
     */
    private Double discount;

    /**
     * 未使用[0], 已使用[1]
     */
    private Integer status;

    /**
     * 用户领用账号
     */
    private String userAccount;

    /**
     * 用户领取抵扣券时间
     */
    private Date receiveAt;

    /**
     * 使用抵扣券时间
     */
    private Date useAt;

    /**
     * 领取渠道:容易逛[0] 互动屏[1] 微信[2]
     */
    private Integer channel;

    /**
     * 抵扣券使用购买商品的商品订单
     */
    private String orderNo;

    /**
     * 过期时间
     */
    private Date validAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt(Date receiveAt) {
        this.receiveAt = receiveAt;
    }

    public Date getUseAt() {
        return useAt;
    }

    public void setUseAt(Date useAt) {
        this.useAt = useAt;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getValidAt() {
        return validAt;
    }

    public void setValidAt(Date validAt) {
        this.validAt = validAt;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserRebate{");
        sb.append("id=").append(id);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", couponId=").append(couponId);
        sb.append(", couponCode='").append(couponCode).append('\'');
        sb.append(", discount=").append(discount);
        sb.append(", status=").append(status);
        sb.append(", userAccount='").append(userAccount).append('\'');
        sb.append(", receiveAt=").append(receiveAt);
        sb.append(", useAt=").append(useAt);
        sb.append(", channel=").append(channel);
        sb.append(", orderNo='").append(orderNo).append('\'');
        sb.append(", validAt=").append(validAt);
        sb.append('}');
        return sb.toString();
    }
}
