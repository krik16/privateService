package com.rongyi.easy.roa.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 秒杀参数
 * @author chenjun
 * @date 2017/4/27 17:08
 */
public class SecKillActivityParam implements Serializable{

    private static final long serialVersionUID = 586602480431552942L;

    private Integer activityId;//拼团活动id
    private List<Integer> activityCommodityIds;//秒杀活动商品主键id集合
    private String commodityId;//商品id
    private String specId;//商品规格id

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public List<Integer> getActivityCommodityIds() {
        return activityCommodityIds;
    }

    public void setActivityCommodityIds(List<Integer> activityCommodityIds) {
        this.activityCommodityIds = activityCommodityIds;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
