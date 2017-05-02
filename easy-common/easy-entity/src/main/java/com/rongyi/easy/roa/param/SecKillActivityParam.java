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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
