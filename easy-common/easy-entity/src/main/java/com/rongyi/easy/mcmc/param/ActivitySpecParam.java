package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2016/9/20.
 */
public class ActivitySpecParam implements Serializable {

    private String id;
    // 提报库存
    private Integer joinCount;
    // 活动价
    private Double activityPrice;

    public ActivitySpecParam(String id, Integer joinCount) {
        this.id = id;
        this.joinCount = joinCount;
    }

    public ActivitySpecParam() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Double getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Double activityPrice) {
        this.activityPrice = activityPrice;
    }
}
