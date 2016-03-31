package com.rongyi.easy.malllife.vo;

import java.io.Serializable;


public class MyActivityVo implements Serializable{
	private Integer id;

    private String activityCode;

    private String title;
    
    private String thumbnail;
    
    private Integer status;
    
    private String useTime;

    private String startTime;

    private String endTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
