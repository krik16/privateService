package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品劵码表
 *
 * @author wangjh7
 * @date 2016-11-24
 */
public class OrderCommodityCodeEntity implements Serializable {
    private int id;
    private String commodityId;
    private String mallMId;
    private String shopMId;
    private String orderNo;
    private String orderItemNo;
    // 券码（自提码）
    private String couponCode;
    // 商品标题
    private String title;
    private Date startTime;
    private Date endTime;
    // 使用时间
    private Date useTime;
    // 验劵卖家ID
    private int checkedUserId;
    // 1:未使用,2:已使用,3:已过期
    private int status;
    // 商品 类型
    private int commodityType;

    public int getCheckedUserId() {
        return checkedUserId;
    }

    public void setCheckedUserId(int checkedUserId) {
        this.checkedUserId = checkedUserId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMallMId() {
        return mallMId;
    }

    public void setMallMId(String mallMId) {
        this.mallMId = mallMId;
    }

    public String getOrderItemNo() {
        return orderItemNo;
    }

    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getShopMId() {
        return shopMId;
    }

    public void setShopMId(String shopMId) {
        this.shopMId = shopMId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public int getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(int commodityType) {
        this.commodityType = commodityType;
    }

    @Override
    public String toString() {
        return "OrderCommodityCodeEntity{" +
                "checkedUserId=" + checkedUserId +
                ", id=" + id +
                ", commodityId='" + commodityId + '\'' +
                ", mallMId='" + mallMId + '\'' +
                ", shopMId='" + shopMId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderItemNo='" + orderItemNo + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", useTime=" + useTime +
                ", status=" + status +
                ", commodityType=" + commodityType +
                '}';
    }
}
