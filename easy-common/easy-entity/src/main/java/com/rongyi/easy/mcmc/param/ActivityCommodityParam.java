package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.List;

/**
 * 活动商品Param
 *
 * @author yaoyiwei
 * @date 2016-10-13
 * @version 1.0
 *
 */
public class ActivityCommodityParam implements Serializable {
    private String commodityId; //商品Id
    private Integer sortPosition; //排序数
    private Integer stock; //商品库存
    private List<ActivitySpecParam> specParamList;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getSortPosition() {
        return sortPosition;
    }

    public void setSortPosition(Integer sortPosition) {
        this.sortPosition = sortPosition;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<ActivitySpecParam> getSpecParamList() {
        return specParamList;
    }

    public void setSpecParamList(List<ActivitySpecParam> specParamList) {
        this.specParamList = specParamList;
    }

    @Override
    public String toString() {
        return "ActivityCommodityParam{" +
                "commodityId='" + commodityId + '\'' +
                ", sortPosition=" + sortPosition +
                ", stock=" + stock +
                ", specParamList=" + specParamList +
                '}';
    }
}
