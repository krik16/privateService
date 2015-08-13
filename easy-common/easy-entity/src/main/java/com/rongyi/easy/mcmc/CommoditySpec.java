package com.rongyi.easy.mcmc;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("mcmc_commodity_spec")
public class CommoditySpec implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3600412246221700037L;

	@Id
	private ObjectId id;
	private String stock;
	private String originalPrice;
	private String currentPrice;
	private List<ObjectId> columnIds;
	private List<String> columnValues;
	private String extendColums;
	private Date createAt;
	private Date updateAt;
	private String code;//商品编码
	private String systemNumber;//系统编号
	private String shopId;//对应商品所属店铺
	public List<ObjectId> getColumnIds() {
		return columnIds;
	}
	public void setColumnIds(List<ObjectId> columnIds) {
		this.columnIds = columnIds;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getExtendColums() {
		return extendColums;
	}
	public void setExtendColums(String extendColums) {
		this.extendColums = extendColums;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSystemNumber() {
		return systemNumber;
	}
	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	
}
