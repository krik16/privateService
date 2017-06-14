package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动请求参数-统计
 *
 * @author wangjh7
 * @date 2017-05-02
 **/
public class StatisticalForActivityParam implements Serializable {

    // 活动ID
    private Integer activityId;
    // 活动类型，参考（普通0、闪购1、特卖2、秒杀3、拼团4、超级团教育版5、断码好货6）
    private Integer activityType;
    // 开始时间（日期）
    private Date startDate;
    // 结束时间（日期）
    private Date endDate;

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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "StatisticalForActivityParam{" +
                "activityId=" + activityId +
                ", activityType=" + activityType +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
