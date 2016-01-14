package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by xgq on 2015/11/23.
 */
public class ActivityCommodityParam implements Serializable {
    private String commodityId; //商品Id
    private Integer sortPosition; //排序数

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

    @Override
    public String toString() {
        return "ActivityCommodityParam{" +
                "commodityId='" + commodityId + '\'' +
                ", sortPosition=" + sortPosition +
                '}';
    }
}
