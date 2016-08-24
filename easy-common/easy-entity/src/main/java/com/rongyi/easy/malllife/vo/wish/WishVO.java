package com.rongyi.easy.malllife.vo.wish;

import java.io.Serializable;
import java.util.List;

public class WishVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;//商品名称
	private String brandName;//品牌名称
	private String comment;//备注
	private List<String> picList;//图片集合
	private String createAt;//提交时间
	private String replyContent;//官方回复内容
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public List<String> getPicList() {
		return picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	@Override
	public String toString() {
		return "WishVO [name=" + name + ", brandName=" + brandName
				+ ", comment=" + comment + ", picList=" + picList
				+ ", createAt=" + createAt + ", replyContent=" + replyContent
				+ "]";
	}
	
}
