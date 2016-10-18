package com.rongyi.easy.activitymanage.param;

import java.util.List;

/**
 * Created by xuying on 2016/10/17.
 */
public class PingtuanCommodityVo {

    private String commodityCode;

    private String commodityName;

    private List<String> commodityCategorys;

    private List<String>  currentPrinceList;

    private Integer stock;

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public List<String> getCommodityCategorys() {
        return commodityCategorys;
    }

    public void setCommodityCategorys(List<String> commodityCategorys) {
        this.commodityCategorys = commodityCategorys;
    }

    public List<String> getCurrentPrinceList() {
        return currentPrinceList;
    }

    public void setCurrentPrinceList(List<String> currentPrinceList) {
        this.currentPrinceList = currentPrinceList;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
