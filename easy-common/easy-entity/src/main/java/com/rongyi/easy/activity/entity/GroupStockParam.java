package com.rongyi.easy.activity.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/10/17.
 */
public class GroupStockParam implements Serializable {
    private Integer activityId;//活动id,必填
    private String goodsId;//商品id,必填
    private String specId;//规格id,必填
    private Integer operatorStock;//操作数
    private Integer activityGoodsId;


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("specId", specId)
                .append("operatorStock", operatorStock)
                .append("activityGoodsId", activityGoodsId)
                .toString();
    }


    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
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
