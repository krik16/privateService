package com.rongyi.easy.activitymanage.entity;

import com.google.inject.internal.Lists;
import com.rongyi.easy.activitymanage.param.ActivityGoodsDetail;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yangyang on 2017/5/3.
 */
public class SecKillVo implements Serializable {

    private String sessionId;//场次id

    private String sessionName;//场次名称

    private Date startAt;

    private Date endAt;

    private Integer limitNum;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }


    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    private List<ActivityGoodsDetail> activityGoodsDetailList = Lists.newArrayList();

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public List<ActivityGoodsDetail> getActivityGoodsDetailList() {
        return activityGoodsDetailList;
    }

    public void setActivityGoodsDetailList(List<ActivityGoodsDetail> activityGoodsDetailList) {
        this.activityGoodsDetailList = activityGoodsDetailList;
    }
}
