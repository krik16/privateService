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
	private Integer artType; //类型:0文章  1同城
	private String title;//文章标题
	private String picUrl;//文章封面图
	private String detailUrl;//文章详情跳转路径
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
	public Integer getArtType() {
		return artType;
	}
	public void setArtType(Integer artType) {
		this.artType = artType;
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
	public String getDetailUrl() {
		return detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	@Override
	public String toString() {
		return "HipsterStrategyVO [id=" + id + ", description=" + description
				+ ", artType=" + artType + ", title=" + title + ", picUrl="
				+ picUrl + ", detailUrl=" + detailUrl + "]";
	}
	
}
