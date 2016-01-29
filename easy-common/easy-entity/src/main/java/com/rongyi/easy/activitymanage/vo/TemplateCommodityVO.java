package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.vo easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/28
 * TIME : 19:09
 * easy-api.
 */
public class TemplateCommodityVO implements Serializable {
    /***/
    private Integer id;
    /***/
    private Integer labelId;
    /**卡券*/
    private String couponId;
    /**商品id*/
    private String commodityId;
    /**标题*/
    private String title;
    /**原标题*/
    private String currentTitle;
    /**卡券类型 卡券类型 代金券[0], 抵扣券[1], 红包[2]*/
    private Integer couponType;
    /**排序信息*/
    private Integer orderPosition;
    /**库存*/
    private Integer stockCount;
    /**图片*/
    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrentTitle() {
        return currentTitle;
    }

    public void setCurrentTitle(String currentTitle) {
        this.currentTitle = currentTitle;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(Integer orderPosition) {
        this.orderPosition = orderPosition;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("labelId", labelId)
                .append("couponId", couponId)
                .append("commodityId", commodityId)
                .append("title", title)
                .append("currentTitle", currentTitle)
                .append("couponType", couponType)
                .append("orderPosition", orderPosition)
                .append("stockCount", stockCount)
                .append("pic", pic)
                .toString();
    }
}
