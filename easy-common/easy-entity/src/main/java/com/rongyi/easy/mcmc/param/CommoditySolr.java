package com.rongyi.easy.mcmc.param;

/**
 * Created by xuying on 2016/1/25.
 */
public class CommoditySolr {
    private String commodityId;
    private long startTime; //开始时间
    private long endTime; //结束时间

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
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
}
