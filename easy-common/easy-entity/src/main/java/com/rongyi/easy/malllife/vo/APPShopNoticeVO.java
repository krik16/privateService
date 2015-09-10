package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class APPShopNoticeVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//公告id
	private String content;//公告内容
	private List<String> picList;//图片集合
	private Date beginTime;//发布开始时间
	private Date endTime;//结束时间
	private Date createTime;//创建时间
	private Integer praiseCount;//点赞总数量
	private String userIm;//创建人IM账号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getPicList() {
		return picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(Integer praiseCount) {
		this.praiseCount = praiseCount;
	}
	public String getUserIm() {
		return userIm;
	}
	public void setUserIm(String userIm) {
		this.userIm = userIm;
	}
	
}
