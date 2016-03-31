package com.rongyi.easy.mcmc.vo;


import java.io.Serializable;
import java.util.List;

public class CommoditySpecVO1 implements  Serializable {
	
	private static final long serialVersionUID = -3491400779856182500L;
	
	private String originalPrice;//原价
	private String currentPrice;//现价
	private List<String> columnNames;//规格名字
	private List<String> columnValues;//规格属性
	private List<String> columnNotes;//规格备注
	private int stock;//初始库存
	private int remain;//剩余量
	private int locked;//锁定库存
	private String systemNumber;//系统编号
	private String pictureUrl;//规格图片
	private String sku;
	
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
	
	
	public List<String> getColumnNames() {
		return columnNames;
	}
	public void setColumnNames(List<String> columnNames) {
		this.columnNames = columnNames;
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
	public List<String> getColumnNotes() {
		return columnNotes;
	}
	public void setColumnNotes(List<String> columnNotes) {
		this.columnNotes = columnNotes;
	}
	public int getLocked() {
		return locked;
	}
	public void setLocked(int locked) {
		this.locked = locked;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	
}
