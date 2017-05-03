package com.rongyi.easy.tradecenter.vo;

import com.rongyi.easy.osm.entity.SubStatisticalForActivityEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 活动返回参数
 *
 * @author wangjh7
 * @date 2017-05-02
 **/
public class StatisticalForActivityVO implements Serializable {
    // 活动ID
    private Integer activityId;
    // 活动类型，参考（普通0、闪购1、特卖2、秒杀3、拼团4、超级团教育版5、断码好货6）
    private Integer activityType;
    // 总下单数
    private Integer totalCount;
    // 总成交数
    private Integer totalVolume;
    // 总成交额
    private BigDecimal totalPayAmount;
    // 子项统计
    private List<SubStatisticalForActivityEntity> list;

    public BigDecimal getTotalPayAmount() {
        return totalPayAmount;
    }

    public void setTotalPayAmount(BigDecimal totalPayAmount) {
        this.totalPayAmount = totalPayAmount;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }


    public List<SubStatisticalForActivityEntity> getList() {
        return list;
    }

    public void setList(List<SubStatisticalForActivityEntity> list) {
        this.list = list;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Integer totalVolume) {
        this.totalVolume = totalVolume;
    }

    @Override
    public String toString() {
        return "StatisticalForActivityVO{" +
                "activityId=" + activityId +
                ", activityType=" + activityType +
                ", totalCount=" + totalCount +
                ", totalVolume=" + totalVolume +
                ", totalPayAmount=" + totalPayAmount +
                ", list=" + list +
                '}';
    }
}
