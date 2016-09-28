package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/9/21.
 */
public class GoodsSku implements Serializable {


    private Integer activityGoodsId;//活动商品表主键
    private String currentPrice;//当前价
    private String activityPrice;//活动价
    private Integer joinCount;//提报数量
    private String sku;//sku
    private String spec;//规格信息
    private Integer allocationCount;//可分配数量
    private String skuId;//规格id



    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentPrice", currentPrice)
                .append("joinCount", joinCount)
                .append("sku", sku)
                .append("spec", spec)
                .append("allocationCount", allocationCount)
                .append("skuId", skuId)
                .append("activityPrice", activityPrice)
                .append("activityGoodsId", activityGoodsId)
                .toString();
    }

    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
    }

    public String getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Integer getAllocationCount() {
        return allocationCount;
    }

    public void setAllocationCount(Integer allocationCount) {
        this.allocationCount = allocationCount;
    }
}
