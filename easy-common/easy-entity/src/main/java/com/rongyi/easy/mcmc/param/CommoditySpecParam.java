package com.rongyi.easy.mcmc.param;


import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.CommoditySpec;
import org.bson.types.ObjectId;

public class CommoditySpecParam implements  Serializable {

	private static final long serialVersionUID = -3491400779856182500L;

	private String id;
	private String originalPrice;//原价
	private String currentPrice;//现价
	private List<ObjectId> columnIds;//规格id
	private List<String> columnValues;//规格属性
	private List<String> columnNotes;//规格备注
	private String shopMid;//对应商品所属店铺MongoId
	private String filialeMid;//店铺对应分公司
	private String pictureUrl;//规格图片
	private String sku;
	private int stock;//库存
	private int remain;//剩余量
	private int userId;//用户id
	private String groupMid;
	private String mallMid;
	private Integer type; //0:集团 1:商场 4:店铺
	private String referencePrice;//参考价
	private List<String> serviceIds; //公众号


	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getGroupMid() {
		return groupMid;
	}

	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
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

	public List<ObjectId> getColumnIds() {
		return columnIds;
	}

	public void setColumnIds(List<ObjectId> columnIds) {
		this.columnIds = columnIds;
	}

	public List<String> getColumnValues() {
		return columnValues;
	}

	public void setColumnValues(List<String> columnValues) {
		this.columnValues = columnValues;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public String getFilialeMid() {
		return filialeMid;
	}

	public void setFilialeMid(String filialeMid) {
		this.filialeMid = filialeMid;
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

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<String> getColumnNotes() {
		return columnNotes;
	}

	public void setColumnNotes(List<String> columnNotes) {
		this.columnNotes = columnNotes;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(String referencePrice) {
		this.referencePrice = referencePrice;
	}

	public List<String> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	@Override
	public String toString() {
		return "CommoditySpecParam{" +
				"id='" + id + '\'' +
				", originalPrice='" + originalPrice + '\'' +
				", currentPrice='" + currentPrice + '\'' +
				", columnIds=" + columnIds +
				", columnValues=" + columnValues +
				", columnNotes=" + columnNotes +
				", shopMid='" + shopMid + '\'' +
				", filialeMid='" + filialeMid + '\'' +
				", pictureUrl='" + pictureUrl + '\'' +
				", sku='" + sku + '\'' +
				", stock=" + stock +
				", remain=" + remain +
				", userId=" + userId +
				", groupMid='" + groupMid + '\'' +
				", mallMid='" + mallMid + '\'' +
				", type=" + type +
				", referencePrice='" + referencePrice + '\'' +
				", serviceIds=" + serviceIds +
				'}';
	}
}
