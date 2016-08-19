package com.rongyi.easy.bsoms.entity;

import com.rongyi.easy.bsoms.entity.TaskInfo;

import java.io.Serializable;

/**
 * 任务详情
 */
public class TaskInfoWithBLOBs extends TaskInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String content;

    private String rewardContent;

    private String agreeContent;

    @Override
    public String toString(){
        return "TaskInfoWithBLOBs [id="+getId()+",name="+getName()+",startAt="+getStartAt()+",endAT="+getEndAt()
                +",agreeTitle="+getAgreeTitle()+",content="+content+",rewardContent="+rewardContent+",agreeContent="+agreeContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRewardContent() {
        return rewardContent;
    }

    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent;
    }

    public String getAgreeContent() {
        return agreeContent;
    }

    public void setAgreeContent(String agreeContent) {
        this.agreeContent = agreeContent;
    }
}