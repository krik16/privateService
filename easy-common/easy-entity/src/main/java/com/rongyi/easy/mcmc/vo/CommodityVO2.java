package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.mongodb.morphia.annotations.Entity;

import com.rongyi.easy.mcmc.mvc.DateJson.JsonDateSerializer;

@Entity("mcmc_commodity")
public class CommodityVO2 implements  Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -3022699601318372490L;
	
	private String id;//系统编号
	private String name;//商品名称
	
	private int status;//状态 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理 
	private String code;//商品编码
	private int stock;//商品库存（包括卖出的商品和锁定的商品）
	private int remain;//商品剩余量
	private int isNormalized;//0表示没有规格1表示有规格的
	private String originalPrice;//商品原价
	private String currentPrice;//商品现价
	private List<String> picList;//商品图片列表
	private List<CommoditySpecVO1> specList;//商品规格列表
	private List<CommoditySpecVO2> specVO2List;//商品规格列表
	private List<String> categoryNames;//商品所属的品类列表
	private List<String> customCategory;//自定义分类列表
	private String description;//商品描述
	private int distribution;//配送方式 1表示到店自提2快递3表示支持两种方式
	@JsonSerialize(using=JsonDateSerializer.class)
	private Date updateAt;//数据更新日期
	@JsonSerialize(using=JsonDateSerializer.class)
	private Date registerAt;//上架时间
	@JsonSerialize(using=JsonDateSerializer.class)
	private Date soldOutAt;//下架时间
	private int stockStatus;//0表示统一库存1表示分管库存
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public int getIsNormalized() {
		return isNormalized;
	}
	public void setIsNormalized(int isNormalized) {
		this.isNormalized = isNormalized;
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
	public List<CommoditySpecVO1> getSpecList() {
		return specList;
	}
	public void setSpecList(List<CommoditySpecVO1> specList) {
		this.specList = specList;
	}
	
	public List<String> getCategoryNames() {
		return categoryNames;
	}
	public void setCategoryNames(List<String> categoryNames) {
		this.categoryNames = categoryNames;
	}
	public List<String> getCustomCategory() {
		return customCategory;
	}
	public void setCustomCategory(List<String> customCategory) {
		this.customCategory = customCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getDistribution() {
		return distribution;
	}
	public void setDistribution(int distribution) {
		this.distribution = distribution;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Date getRegisterAt() {
		return registerAt;
	}
	public void setRegisterAt(Date registerAt) {
		this.registerAt = registerAt;
	}
	public Date getSoldOutAt() {
		return soldOutAt;
	}
	public void setSoldOutAt(Date soldOutAt) {
		this.soldOutAt = soldOutAt;
	}
	public int getStockStatus() {
		return stockStatus;
	}
	public void setStockStatus(int stockStatus) {
		this.stockStatus = stockStatus;
	}
	public List<CommoditySpecVO2> getSpecVO2List() {
		return specVO2List;
	}
	public void setSpecVO2List(List<CommoditySpecVO2> specVO2List) {
		this.specVO2List = specVO2List;
	}
	public List<String> getPicList() {
		return picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}
}
