package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuying on 2016/10/27.
 */
public class PingTuanViewConUpParams implements Serializable{

    private Integer activityId;

    private Integer flag;//(0全部 1当天 2昨天）

    private Integer currentPageUp;

    private  Integer pageSizeUp;

    private Date startAt;

    private Date endAt;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getPageSizeUp() {
        return pageSizeUp;
    }

    public void setPageSizeUp(Integer pageSizeUp) {
        this.pageSizeUp = pageSizeUp;
    }

    public Integer getCurrentPageUp() {
        return currentPageUp;
    }

    public void setCurrentPageUp(Integer currentPageUp) {
        this.currentPageUp = currentPageUp;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }
}
