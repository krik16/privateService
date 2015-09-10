package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  张争平
 * Description:  新建，修改，删除店铺公告参数
 * time:  2015/9/7
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 *   张争平                             2015/9/7              1.0            创建文件
 *
 */
public class ShopNoticeParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//公告id(修改公告时候使用)
	private String content;//公告内容
	private Date beginAt;//发布开始时间
	private Date endAt;//发布结束时间
	private List<String> picList;//图片集合
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getBeginAt() {
		return beginAt;
	}
	public void setBeginAt(Date beginAt) {
		this.beginAt = beginAt;
	}
	public Date getEndAt() {
		return endAt;
	}
	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}
	public List<String> getPicList() {
		return picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}
	
}
