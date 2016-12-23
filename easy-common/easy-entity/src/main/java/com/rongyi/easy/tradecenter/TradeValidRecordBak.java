package com.rongyi.easy.tradecenter;

import java.io.Serializable;
import java.util.Date;

public class TradeValidRecordBak implements Serializable{
    
	private static final long serialVersionUID = -7117994062598703587L;

	private Integer id;

    private Integer orderId;

    private Integer subOrderId;

    private Integer validCount;

    private String couponId;

    private String couponCode;

    private String mallId;

    private String shopId;

    private Integer checkedUserId;

    private String userId;

    private String userPhone;

    private Integer origPrice;

    private Integer unitPrice;

    private Date payTime;

    private Date useTime;

    private String title;

    private String mongoId;

    private Date createAt;

    private Date updateAt;

    private Date correctTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(Integer subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Integer getValidCount() {
        return validCount;
    }

    public void setValidCount(Integer validCount) {
        this.validCount = validCount;
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

    public Integer getCheckedUserId() {
        return checkedUserId;
    }

    public void setCheckedUserId(Integer checkedUserId) {
        this.checkedUserId = checkedUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCorrectTime() {
        return correctTime;
    }

    public void setCorrectTime(Date correctTime) {
        this.correctTime = correctTime;
    }
}