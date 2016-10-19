package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * 拼团商品VO
 *
 * @author yaoyiwei
 * @date 2016-10-18
 * @version 1.0
 *
 */
public class CommodityPinTuanVO implements Serializable {
    private String commodityName;
    private Double originalPrice;
    private Double activityPrice;
    private Integer groupPeopleLimit;
    private String picUrl;
    private Integer remainStock;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Double activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Integer getGroupPeopleLimit() {
        return groupPeopleLimit;
    }

    public void setGroupPeopleLimit(Integer groupPeopleLimit) {
        this.groupPeopleLimit = groupPeopleLimit;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getRemainStock() {
        return remainStock;
    }

    public void setRemainStock(Integer remainStock) {
        this.remainStock = remainStock;
    }
}
