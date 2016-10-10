package com.rongyi.easy.activitymanage.entity;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 活动基础信息
 */
public class ActivityRoundInfo implements Serializable {

	private static final long serialVersionUID = -423735565956132383L;

	/**
     * PK
     */
    private Integer id;
    
    private Integer activityId;//活动id
    
    private Integer goodsNum;//分配的商品数目

    /**
     * 场次名称
     */
    private String roundName;

    /**
     * 活动开始时间
     */
    private Date startAt;

    /**
     * 活动结束时间
     */
    private Date endAt;

    /**
     * 场次状态 0:已删除1:未开始2进行中3已结束
     */
    private Integer status;


    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updateAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getRoundName() {
		return roundName;
	}

	public void setRoundName(String roundName) {
		this.roundName = roundName;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "ActivityRoundInfo [id=" + id + ", activityId=" + activityId + ", goodsNum=" + goodsNum + ", roundName="
				+ roundName + ", startAt=" + startAt + ", endAt=" + endAt + ", status=" + status + ", createUser="
				+ createUser + ", createAt=" + createAt + ", updateUser=" + updateUser + ", updateAt=" + updateAt + "]";
	}

    
    
    

}
