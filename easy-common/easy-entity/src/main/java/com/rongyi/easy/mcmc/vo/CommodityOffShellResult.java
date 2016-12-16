package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xuying on 2016/11/15.
 */
public class CommodityOffShellResult implements Serializable{

    private String commodityId;

    private boolean success;

    private String failReason;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
