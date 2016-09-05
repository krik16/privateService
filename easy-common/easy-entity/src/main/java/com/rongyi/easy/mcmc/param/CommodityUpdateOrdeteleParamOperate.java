package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/9/5.
 */
public class CommodityUpdateOrdeteleParamOperate implements Serializable{

    private String reason="";//原因

    private String commodityId;//商品id

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }
}
