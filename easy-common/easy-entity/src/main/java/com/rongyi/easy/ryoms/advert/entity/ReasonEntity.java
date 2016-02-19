package com.rongyi.easy.ryoms.advert.entity;

/**
 * @Description: 理由实类
 * @author wangjh
 * @date 2016年2月19日
 */
public class ReasonEntity {
	public int getSrcType() {
		return srcType;
	}

	public void setSrcType(int srcType) {
		this.srcType = srcType;
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

	public int getSrcId() {
		return srcId;
	}

	public void setSrcId(int srcId) {
		this.srcId = srcId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// ID
	private int id = 0;
	// 来源ID
	private int srcId = 0;
	// 来源类型
	private int srcType = 0;
	// 内容/理由
	private String content = "";
	// 用户ID
	private int userId = 0;
}
