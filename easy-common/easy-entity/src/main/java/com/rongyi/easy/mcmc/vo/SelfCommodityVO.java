package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
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
