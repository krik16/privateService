package com.rongyi.easy.malllife.domain;

import java.io.Serializable;

/**
 * 外部导入码相关bean类
 * 
 * @author LiuChao
 */
public class AppImportCode implements Serializable{
	private Integer id;

	private String activityId;

	private String activityCode;

	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId == null ? null : activityId.trim();
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode == null ? null : activityCode.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}