package com.rongyi.easy.mcmc.param;


import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

public class CommoditySpecParam implements  Serializable {
	
	private static final long serialVersionUID = -3491400779856182500L;
	
	private String id;
	private String originalPrice;//原价
	private String currentPrice;//现价
	private List<ObjectId> columnIds;//规格id
	private List<String> columnValues;//规格属性
	private List<String> columnNotes;//规格备注
	private String shopId;//对应商品所属店铺
	private String filialeId;//店铺对应分公司
	private String pictureUrl;//规格图片
	private int stock;//库存
	private int remain;//剩余量
	private int userId;//用户id
	
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
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getFilialeId() {
		return filialeId;
	}
	public void setFilialeId(String filialeId) {
		this.filialeId = filialeId;
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
	
	
}
