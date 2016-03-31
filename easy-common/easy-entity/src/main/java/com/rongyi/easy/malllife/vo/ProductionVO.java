package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

public class ProductionVO implements Serializable{
	private String id;
	private String icon;
	private String mallID; // 所在店铺所属商场ID
	private String description;

	private String name;
	private String tags;
	private String shopId; // 所在店铺Id
	private String createDate;
	private Integer rank; // 评分

	private String shopName;

	private Integer totalCount;// 新品总数

	public String getId() {
		return id;
	}

	public String getMallID() {
		return mallID;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public String getTags() {
		return tags;
	}

	public String getShopId() {
		return shopId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public Integer getRank() {
		return rank;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMallID(String mallID) {
		this.mallID = mallID;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

}
