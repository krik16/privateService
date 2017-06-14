package com.rongyi.easy.activitymanage.param;


import com.google.inject.internal.Lists;
import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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
    private String columnValues;
    private String strStock;//库存统计：秒杀中剩余库存/总库存






    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }


    public String getStrStock() {
        return strStock;
    }

    public void setStrStock(String strStock) {
        this.strStock = strStock;
    }

    public String getColumnValues() {
        return columnValues;
    }

    public void setColumnValues(String columnValues) {
        this.columnValues = columnValues;
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
