package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;

/**
 * Created by xuying on 2016/10/27.
 */
public class PingTuanViewConUpParams implements Serializable{

    private Integer activityId;

    private Integer flag;//(0全部 1当天 2昨天）

    private Integer currentPageUp;

    private  Integer pageSizeUp;

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
}
