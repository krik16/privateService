package com.rongyi.easy.mcmc.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by xuying on 2016/8/9.
 */
public class CommoditySortVo implements Serializable{

    private String commodityId;

    private Integer sort;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("commodityId", commodityId)
                .append("sort", sort)
                .toString();
    }
}
