package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class BrandDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String brandId; // 品牌id
	private String logo; // 品牌logo
	private String brandName; // 品牌名称
	private long collectionCount; // 收藏数量
	private String isCollection = "1"; // 是否收藏
	private String brandDescription; // 品牌描述
	private String[] pictureList; // 顶图列表
	private String[] brandTag; // 品牌标签
	private String cooperationBrandId;// mysql表中的主键id
	private Integer shopNum;//品牌店铺数量
	
	public Integer getShopNum() {
		return shopNum;
	}

	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getCollectionCount() {
		return collectionCount;
	}

	public void setCollectionCount(long collectionCount) {
		this.collectionCount = collectionCount;
	}

	public String getIsCollection() {
		return isCollection;
	}

	public void setIsCollection(String isCollection) {
		this.isCollection = isCollection;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public String[] getPictureList() {
		return pictureList;
	}

	public void setPictureList(String[] pictureList) {
		this.pictureList = pictureList;
	}

	public String[] getBrandTag() {
		return brandTag;
	}

	public void setBrandTag(String[] brandTag) {
		this.brandTag = brandTag;
	}

	public String getCooperationBrandId() {
		return cooperationBrandId;
	}

	public void setCooperationBrandId(String cooperationBrandId) {
		this.cooperationBrandId = cooperationBrandId;
	}

}
