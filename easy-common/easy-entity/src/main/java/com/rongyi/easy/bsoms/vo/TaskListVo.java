package com.rongyi.easy.bsoms.vo;

import java.util.Date;

/**
 * 摩店任务列表
 * Created by user on 2016/7/28.
 */
public class TaskListVo {
    private int id  ;
    private String name;         //任务标题
    private String rewardContent;  //奖励内容
    private Date startAt;          //任务有效期开始时间
    private Date endAt;            //任务有效期结束时间
    private int status ;// 任务状态   5进行中 3||6已结束
    private int receiveStatus ;//用户领取状态  0未领取 1已领取

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRewardContent() {
        return rewardContent;
    }

    public Date getStartAt() {
        return startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public int getStatus() {
        return status;
    }

    public int getReceiveStatus() {
        return receiveStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setReceiveStatus(int receiveStatus) {
        this.receiveStatus = receiveStatus;
    }
}
