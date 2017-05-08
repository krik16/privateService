package com.rongyi.easy.mcmc.vo;


import java.io.Serializable;
import java.util.List;

public class CommoditySpecHaiXinVO implements  Serializable {

	private static final long serialVersionUID = -3491400779856182500L;

	private String originalPrice;//原价
	private String currentPrice;//现价
	private List<String> columnValues;//规格属性
	private int stock;//初始库存
	private int remain;//剩余量
	private int locked;//锁定库存
	private String systemNumber;//系统编号
	private String pictureUrl;//规格图片
	private String id;
	private String referencePrice;

	private String commodityId;
	private String groupMid;
	private String groupName;
	private String mallMid;
	private String mallName;
	private String shopMid;//对应商品所属店铺
	private String shopName;//对应商品所属店铺
	private String shopParentMid;//总店mongoID
	private String shopParentName;//总店名称
	private Integer merchantType;
	private List<String> serviceIds; // 服务号

	public String getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(String referencePrice) {
		this.referencePrice = referencePrice;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public List<String> getColumnValues() {
		return columnValues;
	}
	public void setColumnValues(List<String> columnValues) {
		this.columnValues = columnValues;
	}
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	public String getSystemNumber() {
		return systemNumber;
	}
	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getLocked() {
		return locked;
	}
	public void setLocked(int locked) {
		this.locked = locked;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getGroupMid() {
		return groupMid;
	}
	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(Integer merchantType) {
		this.merchantType = merchantType;
	}

	public String getShopParentMid() {
		return shopParentMid;
	}

	public void setShopParentMid(String shopParentMid) {
		this.shopParentMid = shopParentMid;
	}

	public String getShopParentName() {
		return shopParentName;
	}

	public void setShopParentName(String shopParentName) {
		this.shopParentName = shopParentName;
	}

	public List<String> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	@Override
	public String toString() {
		return "CommoditySpecHaiXinVO{" +
				"originalPrice='" + originalPrice + '\'' +
				", currentPrice='" + currentPrice + '\'' +
				", columnValues=" + columnValues +
				", stock=" + stock +
				", remain=" + remain +
				", locked=" + locked +
				", systemNumber='" + systemNumber + '\'' +
				", pictureUrl='" + pictureUrl + '\'' +
				", id='" + id + '\'' +
				", referencePrice='" + referencePrice + '\'' +
				", commodityId='" + commodityId + '\'' +
				", groupMid='" + groupMid + '\'' +
				", groupName='" + groupName + '\'' +
				", mallMid='" + mallMid + '\'' +
				", mallName='" + mallName + '\'' +
				", shopMid='" + shopMid + '\'' +
				", shopName='" + shopName + '\'' +
				", shopParentMid='" + shopParentMid + '\'' +
				", shopParentName='" + shopParentName + '\'' +
				", merchantType=" + merchantType +
				", serviceIds=" + serviceIds +
				'}';
	}
}
