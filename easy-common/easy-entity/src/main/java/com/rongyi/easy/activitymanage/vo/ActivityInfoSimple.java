package com.rongyi.easy.activitymanage.vo;

import java.io.Serializable;
import java.util.Date;

public class ActivityInfoSimple implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4898214819991104424L;

	/**
     * PK
     */
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动开始时间
     */
    private Date startAt;

    /**
     * 活动结束时间
     */
    private Date endAt;
    
    
    /**描述:
    0未开始、1已开始、2已结束、3已下线
    */
   private Integer status;
    
    
    
    
    /**
     * 活动报名开始时间
     */
    private Date enrollStartAt;
    /**
     * 活动报名结束时间
     */
    private Date enrollEndAt;
    /**
     * 描述
     */
    private String description;//描述
	
    /**当前是否已报名*/
	private boolean isJoined;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getEnrollStartAt() {
		return enrollStartAt;
	}

	public void setEnrollStartAt(Date enrollStartAt) {
		this.enrollStartAt = enrollStartAt;
	}

	public Date getEnrollEndAt() {
		return enrollEndAt;
	}

	public void setEnrollEndAt(Date enrollEndAt) {
		this.enrollEndAt = enrollEndAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isJoined() {
		return isJoined;
	}

	public void setJoined(boolean isJoined) {
		this.isJoined = isJoined;
	}

	@Override
	public String toString() {
		return "ActivityInfoSimple [id=" + id + ", name=" + name + ", startAt=" + startAt + ", endAt=" + endAt
				+ ", status=" + status + ", enrollStartAt=" + enrollStartAt + ", enrollEndAt=" + enrollEndAt
				+ ", description=" + description + ", isJoined=" + isJoined + "]";
	}
	
	
	
	
	
	
	
}
