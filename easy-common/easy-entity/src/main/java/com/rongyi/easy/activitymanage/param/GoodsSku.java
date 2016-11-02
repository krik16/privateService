package com.rongyi.easy.activitymanage.param;


import com.google.inject.internal.Lists;
import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;
import com.rongyi.easy.mcmc.vo.CommoditySpecSimpleVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/9/21.
 */
public class GoodsSku implements Serializable {



    private Integer id;
    private Integer activityGoodsId;//活动商品表主键
    private String currentPrice;//当前价
    private String activityPrice;//活动价
    private Integer joinCount;//提报数量
    private Integer stockCount;//拼团剩余数量
    private Integer addCount;//新增数量
    private String sku;//sku
    private String spec;//规格信息
    private Integer allocationCount;//可分配数量
    private String specId;//规格id
    private List<CommoditySpecColumnVO> specColumns = Lists.newArrayList();
    private Integer remainStock;//商品中剩余库存（非活动）


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentPrice", currentPrice)
                .append("joinCount", joinCount)
                .append("sku", sku)
                .append("spec", spec)
                .append("allocationCount", allocationCount)
                .append("specId", specId)
                .append("activityPrice", activityPrice)
                .append("activityGoodsId", activityGoodsId)
                .append("specSimpleVOs", specColumns)
                .append("remainStock", remainStock)
                .append("addCount", addCount)
                .append("stockCount", stockCount)
                .append("id", id)
                .toString();
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddCount() {
        return addCount;
    }

    public void setAddCount(Integer addCount) {
        this.addCount = addCount;
    }

    public Integer getRemainStock() {
        return remainStock;
    }

    public void setRemainStock(Integer remainStock) {
        this.remainStock = remainStock;
    }

    public List<CommoditySpecColumnVO> getSpecColumns() {
        return specColumns;
    }

    public void setSpecColumns(List<CommoditySpecColumnVO> specColumns) {
        this.specColumns = specColumns;
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

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
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
