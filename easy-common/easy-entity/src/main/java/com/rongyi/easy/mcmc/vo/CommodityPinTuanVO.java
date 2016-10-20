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
    private List<String> picUrls;
    // 拼团剩余库存
    private Integer remainStock;

    /*后台使用参数*/
    private String commodityCode;
    private List<Double> currentPriceList;
    // 商品基本库存
    private Integer stock;
    private List<String> categoryNames;
    private boolean  isActivityCommodity=false;

    public CommodityPinTuanVO(){}

    public CommodityPinTuanVO(Builder builder) {
        this.commodityId = builder.commodityId;
        this.commodityName = builder.commodityName;
        this.commodityCode = builder.commodityCode;
        this.stock = builder.stock;
        this.categoryNames = builder.categoryNames;
        this.currentPriceList = builder.currentPriceList;
    }

    public static class Builder {
        private String commodityId;
        private String commodityName;
        private String commodityCode;
        private List<Double> currentPriceList;
        private Integer stock;
        private List<String> categoryNames;

        public Builder() {}

        public Builder(String id, String name) {
            this.commodityId = id;
            this.commodityName = name;
        }

        public Builder code(String val) {
            this.commodityCode = val;
            return this;
        }

        public Builder stock(Integer val) {
            this.stock = val;
            return this;
        }

        public Builder categoryNames(List vals) {
            categoryNames = vals;
            return this;
        }

        public Builder currentPriceList(List vals) {
            currentPriceList = vals;
            return this;
        }

        public CommodityPinTuanVO build() {
            return new CommodityPinTuanVO(this);
        }
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

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public List<String> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
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
