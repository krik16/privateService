package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 卡券订单项
 * 老订单项
 * 下步废弃，移到交易中心
 *
 * @author Breggor
 */
@Deprecated
public class CouponOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 订单id 用于外键
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 卡券Id
     */
    private String couponId;

    /**
     * 暂时不用
     * 优惠券码(多个以逗号分隔)
     */
    @Deprecated
    private String couponCode;

    /**
     * 卡券名称
     */
    private String name;

    /**
     * 卡券类型: 优惠券[02] 红包[03]
     */
    private String couponType;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 下单数量
     */
    private Integer unitCount;

    /**
     * 实售数量
     */
    private Integer realCount;

    /**
     * 实售总价
     */
    private Double realPrice;

    /**
     * 目前不用
     * 退款状态：未退款[0], 已退款[1]
     */
    @Deprecated
    private Integer refundStatus = Integer.valueOf(0);

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 销售时间开始 对应发布时间
     */
    private Date saleStartTime;

    /**
     * 销售时间结束 对应发布时间
     */
    private Date saleEndTime;

    /**
     * 使用开始日期  对应验证时间
     */
    private Date startTime;

    /**
     * 使用截止日期 对应验证时间
     */
    private Date endTime;

    /**
     * 缩略图
     */
    private String thumbnail;

    private Double refundAmount;

    public CouponOrderItem() {

    }


    public CouponOrderItem(Long orderId, String orderNo, String couponId, String name, String couponType, Double unitPrice,
                           Integer unitCount, Date updateTime,
                           Date saleStartTime, Date saleEndTime, Date startTime, Date endTime, String thumbnail, Double refundAmount) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.couponId = couponId;
        this.name = name;
        this.couponType = couponType;
        this.unitPrice = unitPrice;
        this.unitCount = unitCount;
        this.updateTime = updateTime;
        this.saleStartTime = saleStartTime;
        this.saleEndTime = saleEndTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.thumbnail = thumbnail;
        this.refundAmount = refundAmount;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return unitPrice
     */
    public Double getUnitPrice() {
        return (unitPrice == null) ? Double.valueOf(0.00D) : this.unitPrice;
    }

    /**
     * @param unitPrice
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return unitCount
     */
    public Integer getUnitCount() {
        return (unitCount == null) ? Integer.valueOf(0) : this.unitCount;
    }

    /**
     * @param unitCount
     */
    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    /**
     * @return realCount
     */
    public Integer getRealCount() {
        return (realCount == null) ? Integer.valueOf(0) : this.realCount;
    }

    /**
     * @param realCount
     */
    public void setRealCount(Integer realCount) {
        this.realCount = realCount;
    }

    /**
     * @return realPrice
     */
    public Double getRealPrice() {
        return (realPrice == null) ? Double.valueOf(0D) : this.realPrice;
    }

    /**
     * @param realPrice
     */
    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    /**
     * @return refundStatus
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * @param refundStatus
     */
    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return saleStartTime
     */
    public Date getSaleStartTime() {
        return saleStartTime;
    }

    /**
     * @param saleStartTime
     */
    public void setSaleStartTime(Date saleStartTime) {
        this.saleStartTime = saleStartTime;
    }

    /**
     * @return saleEndTime
     */
    public Date getSaleEndTime() {
        return saleEndTime;
    }

    /**
     * @param saleEndTime
     */
    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    /**
     * @return startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponType() {
        return couponType;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("orderId", orderId)
                .append("orderNo", orderNo)
                .append("couponId", couponId)
                .append("couponCode", couponCode)
                .append("name", name)
                .append("unitPrice", unitPrice)
                .append("unitCount", unitCount)
                .append("realCount", realCount)
                .append("realPrice", realPrice)
                .append("refundStatus", refundStatus)
                .append("updateTime", updateTime)
                .append("saleStartTime", saleStartTime)
                .append("saleEndTime", saleEndTime)
                .append("startTime", startTime)
                .append("endTime", endTime)
                .append("thumbnail", thumbnail)
                .append("refundAmount", refundAmount)
                .toString();
    }
}