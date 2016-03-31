package com.rongyi.easy.redi.vo;

import java.io.Serializable;

public class BailianCategoryVo implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 4389787820338036311L;

    /**  分类id */
    private String   categorySid;

    /** 分类名称 */
    private String categoryName;
    /** 分类编码*/
    private String categoryCode ;
    /** 渠道id*/
    private String channelSid ;
    /** 级别 1 一级 2 二级 */
    private String   lev;

    /** 父级id -1没有父级 */
    private Long   parentId;
    /** */
    private String sortOrder ;
    /***/
    private String flag ;
	public String getCategorySid() {
		return categorySid;
	}
	public void setCategorySid(String categorySid) {
		this.categorySid = categorySid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getChannelSid() {
		return channelSid;
	}
	public void setChannelSid(String channelSid) {
		this.channelSid = channelSid;
	}
	public String getLev() {
		return lev;
	}
	public void setLev(String lev) {
		this.lev = lev;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

    
}
