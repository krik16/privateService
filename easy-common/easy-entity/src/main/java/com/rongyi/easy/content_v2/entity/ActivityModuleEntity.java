package com.rongyi.easy.content_v2.entity;

import java.io.Serializable;

/**
 * 板块设置标签(mapper)
 * 
 * @author wangjh7
 * @date 2016年4月1日
 */
public class ActivityModuleEntity implements Serializable {
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 7098545401577775796L;
	private int id = 0;
	private String title = "";
	private String picUrl = "";
	private int sortIdx = 0;
	private int isVisible = 0;
}
