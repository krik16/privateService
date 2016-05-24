package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

/**
 * 潮人攻略APP vo
 * @author sj
 *
 */
public class RaidersAppVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title; //文章title
	private Integer type =7 ;  //类型 7
	private Integer artType; //文章类型   0文章 1同城
	private String description; //文章描述
	private String picUrl; //图片地址
	private String url;    //跳转地址
	private String typeVal;  //文章ID
	private String shareUrl ; //分享链接 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getArtType() {
		return artType;
	}
	public void setArtType(Integer artType) {
		this.artType = artType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTypeVal() {
		return typeVal;
	}
	public void setTypeVal(String typeVal) {
		this.typeVal = typeVal;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getShareUrl() {
		return shareUrl;
	}
	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}
}
