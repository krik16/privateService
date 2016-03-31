package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class BrandWallVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id; // 品牌id
	private String sortLetters; // 显示的首字母（特殊字段）
	private String name; // 品牌名
	private String description; // 品牌描述
	private String logo; // 品牌logo
	private String[] tags;// 品牌标签
	private String cooperationBrandId;// mysql表中的主键id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSortLetters() {
		return sortLetters;
	}

	public void setSortLetters(String sortLetters) {
		this.sortLetters = sortLetters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String getCooperationBrandId() {
		return cooperationBrandId;
	}

	public void setCooperationBrandId(String cooperationBrandId) {
		this.cooperationBrandId = cooperationBrandId;
	}

}
