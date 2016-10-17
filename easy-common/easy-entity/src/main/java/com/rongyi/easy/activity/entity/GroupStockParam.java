package com.rongyi.easy.activity.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/10/17.
 */
public class GroupStockParam implements Serializable {
    private Integer activityId;
    private String goodsId;
    private String specId;
    private Integer operatorStock;//操作数


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("specId", specId)
                .append("operatorStock", operatorStock)
                .toString();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public Integer getOperatorStock() {
        return operatorStock;
    }

    public void setOperatorStock(Integer operatorStock) {
        this.operatorStock = operatorStock;
    }


}
