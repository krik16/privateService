package com.rongyi.easy.ryoms.advert.entity;

/**
 * @Description: 理由实类
 * @author wangjh
 * @date 2016年2月19日
 */
public class ReasonEntity {
	public int getSrclId() {
		return srclId;
	}

	public void setSrclId(int srclId) {
		this.srclId = srclId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	// 来源ID
	private int srclId = 0;
	// 内容/理由
	private String content = "";
	// 用户ID
	private int userId = 0;
}
