package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuying on 2016/10/20.
 */
public class PingTuanViewConParams implements Serializable{

    private Integer activityId;

    private Integer flag;//(0全部 1当天 2昨天）

    private Integer currentPageUp;

    private  Integer pageSizeUp;

    private String phone;

    private Integer groupId;

    private Date startAt;

    private Date endAt;

    private String status;

    private Integer currentPageDown;

    private  Integer pageSizeDown;

    private String commodityName;

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

    public Integer getCurrentPageUp() {
        return currentPageUp;
    }

    public void setCurrentPageUp(Integer currentPageUp) {
        this.currentPageUp = currentPageUp;
    }

    public Integer getPageSizeUp() {
        return pageSizeUp;
    }

    public void setPageSizeUp(Integer pageSizeUp) {
        this.pageSizeUp = pageSizeUp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCurrentPageDown() {
        return currentPageDown;
    }

    public void setCurrentPageDown(Integer currentPageDown) {
        this.currentPageDown = currentPageDown;
    }

    public Integer getPageSizeDown() {
        return pageSizeDown;
    }

    public void setPageSizeDown(Integer pageSizeDown) {
        this.pageSizeDown = pageSizeDown;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
