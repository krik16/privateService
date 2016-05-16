package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/5/16 16:30
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public class ImportInviteCodeParam implements Serializable{
    private final static Long serialVersionUID=1L;

    //数量
    private Integer count;
    /**
     * 活动id
     */
    private String activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 页数
     */
    private Integer pageNo;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
}
