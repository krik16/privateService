package com.rongyi.easy.merchantactivity.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/5/25.
 */
public class MerchantActivityTemplate implements Serializable {

    //1翻牌购2转盘抽奖
    private Integer activityForm;
    //活动id
    private Integer activityId;
    //活动模版类型：1互动屏，2：微信
    private Integer type;

    public Integer getActivityForm() {
        return activityForm;
    }

    public void setActivityForm(Integer activityForm) {
        this.activityForm = activityForm;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("activityForm", activityForm)
                .append("type",type)
                .toString();
    }
}
