package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 
 * @author rongyi
 */
public class BailianCategoryOptionParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String channelSid;// 渠道ID
	
	private String parentSid;// 分类ID

	private String lev;// 级别
	
	private String categoryType ; //目录类型
	
	private String categorySid ;
	
	private String pageNo ;
	
	private String pageSize ;
	
	

	public String getCategorySid() {
		return categorySid;
	}

	public void setCategorySid(String categorySid) {
		this.categorySid = categorySid;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getChannelSid() {
		return channelSid;
	}

	public void setChannelSid(String channelSid) {
		this.channelSid = channelSid;
	}

	public String getParentSid() {
		return parentSid;
	}

	public void setParentSid(String parentSid) {
		this.parentSid = parentSid;
	}

	public String getLev() {
		return lev;
	}

	public void setLev(String lev) {
		this.lev = lev;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	
}
