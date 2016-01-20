package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 活动商品规格实体
 * Created by Leon on 2016/1/20.
 */
public class ActivityGoodsSpec implements Serializable {
    private Integer id;

    private Integer activityGoodsId;

    private String specId;

    private Integer currCount;

    private Integer partinCount;

    private Integer stockCount;

    private Integer currPrice;

    private Integer activityPrice;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public Integer getCurrCount() {
        return currCount;
    }

    public void setCurrCount(Integer currCount) {
        this.currCount = currCount;
    }

    public Integer getPartinCount() {
        return partinCount;
    }

    public void setPartinCount(Integer partinCount) {
        this.partinCount = partinCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Integer currPrice) {
        this.currPrice = currPrice;
    }

    public Integer getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Integer activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityGoodsId", activityGoodsId)
                .append("specId", specId)
                .append("currCount", currCount)
                .append("partinCount", partinCount)
                .append("stockCount", stockCount)
                .append("currPrice", currPrice)
                .append("activityPrice", activityPrice)
                .append("version", version)
                .toString();
    }
}