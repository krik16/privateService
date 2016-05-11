package com.rongyi.easy.content_v2.entity;

import java.io.Serializable;

/**
 * 板块设置标签(mapper)
 * 
 * @author wangjh7
 * @date 2016年4月1日
 */
public class ActivityModuleEntity implements Serializable {
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "ActivityModuleEntity [id=" + id + ", title=" + title + ", picUrl=" + picUrl + ", sortIdx=" + sortIdx
				+ ", isVisible=" + isVisible + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public int getSortIdx() {
		return sortIdx;
	}

	public void setSortIdx(int sortIdx) {
		this.sortIdx = sortIdx;
	}

	public int getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(int isVisible) {
		this.isVisible = isVisible;
	}


	public int getHomepageId() {
		return homepageId;
	}

	public void setHomepageId(int homepageId) {
		this.homepageId = homepageId;
	}

	public String getSelectedPicUrl() {
		return selectedPicUrl;
	}

	public void setSelectedPicUrl(String selectedPicUrl) {
		this.selectedPicUrl = selectedPicUrl;
	}
	
	public int getIsSingle() {
		return isSingle;
	}

	public void setIsSingle(int isSingle) {
		this.isSingle = isSingle;
	}

	public int getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(int isChecked) {
		this.isChecked = isChecked;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7098545401577775796L;
	private int homepageId = 0;
	private int id = 0;
	private String title = "";
	private String picUrl = "";
	private String selectedPicUrl = "";
	private int sortIdx = 0;
	private int isVisible = 0;
	private int userId = 0;
	private String userName = "";
	private int isSingle ;
	private int isChecked ;
}
