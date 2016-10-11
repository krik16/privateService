package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaoyiwei on 2016/9/21.
 */
public class SelfCommodityVO implements Serializable {
    private String commodityName;
    private String commodityCode;
    private List<String> categoryNames;
    private List<Double> currentPrices;
    private Integer stock;

    private SelfCommodityVO(Builder builder) {
        this.commodityName = builder.commodityName;
        this.commodityCode = builder.commodityCode;
        this.stock = builder.stock;
        this.categoryNames = builder.categoryNames;
        this.currentPrices = builder.currentPrices;
    }

    public static class Builder implements Serializable {
        private String commodityName = "";
        private String commodityCode = "";
        private List<String> categoryNames = new ArrayList<>();
        private List<Double> currentPrices = new ArrayList<>();
        private Integer stock = 0;

        public Builder(String name, String code, Integer stock) {
            this.commodityName = name;
            this.commodityCode = code;
            this.stock = stock;
        }

        public Builder categoryNames(List vals) {
            categoryNames = vals;
            return this;
        }

        public Builder currentPrices(List vals) {
            currentPrices = vals;
            return this;
        }

        public SelfCommodityVO build() {
            return new SelfCommodityVO(this);
        }
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        this.categoryNames = categoryNames;
    }

    public List<Double> getCurrentPrices() {
        return currentPrices;
    }

    public void setCurrentPrices(List<Double> currentPrices) {
        this.currentPrices = currentPrices;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
