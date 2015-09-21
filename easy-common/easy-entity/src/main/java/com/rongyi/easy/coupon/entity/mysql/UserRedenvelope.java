package com.rongyi.easy.coupon.entity.mysql;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户抵扣券
 */
public class UserRedenvelope implements Serializable {
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
     * 红包id
     */
    private Integer couponId;

    /**
     * 红包券码
     */
    private String couponCode;

    /**
     * 抵扣价格
     */
    private Double amount;

    /**
     * 未使用[0], 已使用[1]
     */
    private Integer status;

    /**
     * 用户领用账号
     */
    private String userAccount;

    /**
     * 用户领取红包时间
     */
    private Date receiveAt;

    /**
     * 使用红包时间
     */
    private Date useAt;

    /**
     * 领取渠道:容易逛[0] 互动屏[1] 微商[2]
     */
    private Integer channel;

    /**
     * 使用红包购买商品时的商品订单号
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

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
}