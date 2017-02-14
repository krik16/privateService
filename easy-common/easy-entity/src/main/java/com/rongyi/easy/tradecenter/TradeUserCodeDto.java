package com.rongyi.easy.tradecenter;

import java.io.Serializable;
import java.util.Date;

public class TradeUserCodeDto implements Serializable {

    private Integer id;

    private String couponId;

    private String couponCode;

    private Integer orderId;

    private String orderNo;

    private Integer subOrderId;

    private Byte status;

    private String userId;

    private String userName;

    private String userPhone;

    private String source;

    private Date payTime;

    private Date useTime;

    private Date refundTime;

    private Date endTime;

    /**
     * 作废时间
     */
    private Date obsoleteTime;

    public Date getObsoleteTime() {
        return obsoleteTime;
    }

    public void setObsoleteTime(Date obsoleteTime) {
        this.obsoleteTime = obsoleteTime;
    }

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TradeUserCodeDto{");
        sb.append("id=").append(id);
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append(", couponCode='").append(couponCode).append('\'');
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo='").append(orderNo).append('\'');
        sb.append(", subOrderId=").append(subOrderId);
        sb.append(", status=").append(status);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", userPhone='").append(userPhone).append('\'');
        sb.append(", source='").append(source).append('\'');
        sb.append(", payTime=").append(payTime);
        sb.append(", useTime=").append(useTime);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", obsoleteTime=").append(obsoleteTime);
        sb.append('}');
        return sb.toString();
    }
}
