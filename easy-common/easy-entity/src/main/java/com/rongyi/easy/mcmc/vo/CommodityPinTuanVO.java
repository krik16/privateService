package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 拼团商品VO
 *
 * @author yaoyiwei
 * @date 2016-10-19
 * @version 1.0
 *
 */
public class CommodityPinTuanVO implements Serializable {

    private String commodityId;
    private String commodityName;
    private Double originalPrice;
    private Double activityPrice;
    private Integer groupPeopleLimit;
    private String picUrl;
    // 拼团剩余库存
    private Integer remainStock;
    private String commodityCode;
    private List<Double> currentPriceList;
    // 商品基本库存
    private Integer stock;
    private List<String> categoryNames;
    private boolean  isActivityCommodity;


    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

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

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public List<Double> getCurrentPriceList() {
        return currentPriceList;
    }

    public void setCurrentPriceList(List<Double> currentPriceList) {
        this.currentPriceList = currentPriceList;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        this.categoryNames = categoryNames;
    }

    public boolean isActivityCommodity() {
        return isActivityCommodity;
    }

    public void setIsActivityCommodity(boolean isActivityCommodity) {
        this.isActivityCommodity = isActivityCommodity;
    }
}
