package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by xuying on 2016/1/25.
 */
public class SaleParamSolr implements Serializable{
    private String id;
    private long startTime; //开始时间
    private long endTime; //结束时间
    private String type;//coupon为卡卷，commodity为商品

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

	@Override
	public String toString() {
		return "SaleParamSolr [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", type=" + type + "]";
	}
}
