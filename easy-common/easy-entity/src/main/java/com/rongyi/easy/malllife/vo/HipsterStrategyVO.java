package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
/**
 * 潮人攻略返回VO
 * @author user
 *
 */
public class HipsterStrategyVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;//文章id
	private String description;//文章描述
	private Integer type; //类型:0文章  1同城
	private String title;//文章标题
	private String picUrl;//文章封面图
	private String articleUrl;//文章详情跳转路径
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
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
	public String getArticleUrl() {
		return articleUrl;
	}
	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}
	@Override
	public String toString() {
		return "HipsterStrategyVO [id=" + id + ", description=" + description
				+ ", type=" + type + ", title=" + title + ", picUrl="
				+ picUrl + ", articleUrl=" + articleUrl + "]";
	}
	
}
