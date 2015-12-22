package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xgq on 2015/11/19.
 */
public class SaleParam implements Serializable {
    private Integer id; //特卖/闪购ID
    private List<String> shopIds = new ArrayList<>(); //特卖关联特卖店铺MONGO ID列表
    private long startTime; //特卖开始时间
    private long endTime; //特卖结束时间
    private int activityType; //活动类型 1为特卖  2为闪购
    private List<ActivityCommodityParam> commodityParams = new ArrayList<>(); // 闪购或特卖关联商品及排序数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getActivityType() {
        return activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    public List<ActivityCommodityParam> getCommodityParams() {
        return commodityParams;
    }

    public void setCommodityParams(List<ActivityCommodityParam> commodityParams) {
        this.commodityParams = commodityParams;
    }

    @Override
    public String toString() {
        return "SaleParam{" +
                "id=" + id +
                ", shopIds=" + shopIds +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", activityType=" + activityType +
                ", commodityParams=" + commodityParams +
                '}';
    }
}
