package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  张争平
 * Description:  容易逛用户对店铺公告点赞,取消点赞参数
 * time:  2015/9/7
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 *   张争平                             2015/9/7              1.0            创建文件
 *
 */
public class PariseShopNoticeParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;//容易逛用户id
	private String noticeId;//店铺公告id
	private Integer type;//0 点赞  1 取消点赞
	private String jsessionid;//
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	@Override
	public String toString() {
		return "PariseShopNoticeParam [userId=" + userId + ", noticeId="
				+ noticeId + ", type=" + type + ", jsessionid=" + jsessionid
				+ "]";
	}
	
}
