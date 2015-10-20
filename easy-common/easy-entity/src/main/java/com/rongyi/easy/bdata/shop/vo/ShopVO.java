package com.rongyi.easy.bdata.shop.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ShopVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 店铺id
	 */
	private String id;
	/**
	 * 活动数量
	 */
	private int activityCount;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 会员卡类型id列表
	 */
	private List<String> appliedCardTypeIds;
	/**
	 * 平均消费
	 */
	private String averageConsumption;
	/**
	 * 品牌id
	 */
	private String brandId;
	/**
	 * 状态
	 */
	private int businessStatus;
	/**
	 * 分类id列表
	 */
	private List<String> categoryIds;
	/**
	 * 自定义分类id列表
	 */
	private List<String> customCategoryIds;

	/**
	 * 点评数
	 */
	private int commentCount;
	/**
	 * 内部坐标
	 */
	private List<Double> coordinate;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 描述
	 */
	private String description;

	private List<Double> doorCoordinate;
	/**
	 * 坐标
	 */
	private List<Double> location;
	/**
	 * 名称
	 */
	private String name;

	private String nameTemp;
	/**
	 * 操作人id
	 */
	private int operatorId;
	/**
	 * 评分
	 */
	private int rank;
	/**
	 * 店铺类型 0：普通店，1：免税店，2：专柜,3:折扣店，4：旗舰店
	 */
	private int shopNature;
	/**
	 * 铺位号
	 */
	private String shopNumber;
	/**
	 * 铺位号(旧)
	 */
	private String shopNumble;
	/**
	 * 店铺性质 0: 商场商铺 1: 商场专柜 2：街边店
	 */
	private String shopType;
	/**
	 * 拼音
	 */
	private String slug;
	/**
	 * 子标题
	 */
	private String subtitle;
	/**
	 * 标签
	 */
	private String tags;
	/**
	 * 手机
	 */
	private String telephone;
	private String terminalShop;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 有效状态
	 */
	private int valid;
	/**
	 * 地址上一级id
	 */
	private String zoneId;
	/**
	 * 地理位置层级id数组
	 */
	private List<String> zoneIds;
	/**
	 * 商场id
	 */
	private String mallId;

	private List<PhotoVO> photos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getActivityCount() {
		return activityCount;
	}

	public void setActivityCount(int activityCount) {
		this.activityCount = activityCount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getAppliedCardTypeIds() {
		return appliedCardTypeIds;
	}

	public void setAppliedCardTypeIds(List<String> appliedCardTypeIds) {
		this.appliedCardTypeIds = appliedCardTypeIds;
	}

	public String getAverageConsumption() {
		return averageConsumption;
	}

	public void setAverageConsumption(String averageConsumption) {
		this.averageConsumption = averageConsumption;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public int getBusinessStatus() {
		return businessStatus;
	}

	public void setBusinessStatus(int businessStatus) {
		this.businessStatus = businessStatus;
	}

	public List<String> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public List<String> getCustomCategoryIds() {
		return customCategoryIds;
	}

	public void setCustomCategoryIds(List<String> customCategoryIds) {
		this.customCategoryIds = customCategoryIds;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public List<Double> getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(List<Double> coordinate) {
		this.coordinate = coordinate;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Double> getDoorCoordinate() {
		return doorCoordinate;
	}

	public void setDoorCoordinate(List<Double> doorCoordinate) {
		this.doorCoordinate = doorCoordinate;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameTemp() {
		return nameTemp;
	}

	public void setNameTemp(String nameTemp) {
		this.nameTemp = nameTemp;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getShopNature() {
		return shopNature;
	}

	public void setShopNature(int shopNature) {
		this.shopNature = shopNature;
	}

	public String getShopNumber() {
		return shopNumber;
	}

	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}

	public String getShopNumble() {
		return shopNumble;
	}

	public void setShopNumble(String shopNumble) {
		this.shopNumble = shopNumble;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTerminalShop() {
		return terminalShop;
	}

	public void setTerminalShop(String terminalShop) {
		this.terminalShop = terminalShop;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public List<String> getZoneIds() {
		return zoneIds;
	}

	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public List<PhotoVO> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoVO> photos) {
		this.photos = photos;
	}
}
