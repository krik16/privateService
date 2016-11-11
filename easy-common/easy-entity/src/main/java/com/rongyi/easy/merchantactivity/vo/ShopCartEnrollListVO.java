package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/10
 * TIME : 16:32
 * ideaworkspace.
 */
public class ShopCartEnrollListVO implements Serializable {
    /**活动id*/
    private Integer activityId;
    /**活动名称*/
    private String name;
    /**活动规则*/
    private String activityRule;
    /**活动时间*/
    private Date startAt;
    /**活动时间*/
    private Date endAt;
    /**发送时间*/
    private Date createAt;
    /**活动状态*/
    private String status;
    /**活动状态码*/
    private Integer statusCode;
    
    /**
     * 活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖7秒杀' 7'10月版本新增的秒杀'
     * @return
     */
    private Integer type;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    
    
    

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ShopCartEnrollListVO [activityId=" + activityId + ", name=" + name + ", activityRule=" + activityRule
				+ ", startAt=" + startAt + ", endAt=" + endAt + ", createAt=" + createAt + ", status=" + status
				+ ", statusCode=" + statusCode + ", type=" + type + "]";
	}


    
    
}
