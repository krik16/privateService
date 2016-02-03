package com.rongyi.easy.tradecenter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeUserCode implements Serializable {
    private BigDecimal rate = new BigDecimal(100);

    private Integer id;

    private String activityId;

    private String activityName;

    private String couponId;

    private String couponSource;

    private String couponCode;

    private Integer orderId;

    private Integer subOrderId;

    private String type;

    private String title;

    private String thumbnail;

    private String userId;

    private String userPhone;

    private String useDescription;

    private String recommend;

    private Integer origPrice;

    private Integer unitPrice;

    private Date payTime;

    private Date useTime;

    private Date startTime;

    private Date endTime;

    private Byte status;

    private String mallId;

    private String shopId;

    private Integer checkedUserId;

    private Integer refundAmount;

    private Integer validId;

    private Integer refundId;

    private String validType;

    private Byte isDelete;

    private Date createAt;

    private Date updateAt;

    private Integer couponChannel;

    private Byte couponShowType;


    public Double getOrigPrice_Y() {
        return new BigDecimal(this.origPrice).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getUnitPrice_Y() {
        return new BigDecimal(this.unitPrice).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getRefundAmount_Y() {
        return new BigDecimal(this.refundAmount).divide(rate, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getCouponSource() {
        return couponSource;
    }

    public void setCouponSource(String couponSource) {
        this.couponSource = couponSource;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getValidId() {
        return validId;
    }

    public void setValidId(Integer validId) {
        this.validId = validId;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public String getValidType() {
        return validType;
    }

    public void setValidType(String validType) {
        this.validType = validType;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
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

    public Integer getCouponChannel()
    {
        return couponChannel;
    }

    public void setCouponChannel(Integer couponChannel)
    {
        this.couponChannel = couponChannel;
    }

    public Byte getCouponShowType()
    {
        return couponShowType;
    }

    public void setCouponShowType(Byte couponShowType)
    {
        this.couponShowType = couponShowType;
    }
}