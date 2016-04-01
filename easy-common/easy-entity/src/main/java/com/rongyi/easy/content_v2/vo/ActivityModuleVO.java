package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

/**
 * 板块设置标签(vo)
 * 
 * @author wangjh7
 * @date 2016年4月1日
 */
public class ActivityModuleVO implements Serializable {
	@Override
	public String toString() {
		return "ActivityModuleEntity [id=" + id + ", homePageId=" + homePageId + ", title=" + title + ", picUrl="
				+ picUrl + ", sortIdx=" + sortIdx + ", isVisible=" + isVisible + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHomePageId() {
		return homePageId;
	}

	public void setHomePageId(int homePageId) {
		this.homePageId = homePageId;
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
	private int homePageId = 0;
	private String title = "";
	private String picUrl = "";
	private int sortIdx = 0;
	private int isVisible = 0;
}
