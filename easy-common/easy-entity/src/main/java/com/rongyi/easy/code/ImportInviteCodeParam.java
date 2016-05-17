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
     * 活动类型，0：商家后台活动
     */
    private Integer activityTpye;

    /**
     * 页数
     */
    private Integer pageNo;

    /**
     * 码长度
     */
    private Integer length;

    public Integer getCount() {
        return count==null?5000:count;
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

    public Integer getLength() {
        return length==null?6:length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getActivityTpye() {
        return activityTpye;
    }

    public void setActivityTpye(Integer activityTpye) {
        this.activityTpye = activityTpye;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ImportInviteCodeParam{");
        sb.append("count=").append(count);
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", activityName='").append(activityName).append('\'');
        sb.append(", activityTpye=").append(activityTpye);
        sb.append(", pageNo=").append(pageNo);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
