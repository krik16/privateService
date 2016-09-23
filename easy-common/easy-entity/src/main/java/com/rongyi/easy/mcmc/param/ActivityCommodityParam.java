package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/11/23.
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

    public List<ActivitySpecParam> getSpecParamList() {
        return specParamList;
    }

    public void setSpecParamList(List<ActivitySpecParam> specParamList) {
        this.specParamList = specParamList;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ActivityCommodityParam{" +
                "commodityId='" + commodityId + '\'' +
                ", sortPosition=" + sortPosition +
                '}';
    }
}
