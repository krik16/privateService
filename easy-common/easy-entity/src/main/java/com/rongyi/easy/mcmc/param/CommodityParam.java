package com.rongyi.easy.mcmc.param;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import com.rongyi.easy.mcmc.mvc.DateJson.JsonDateSerializer;



public class CommodityParam {
	
	private String id;//系统编号
	
	private String name;//商品名称
	
	private String category;//商品品类id
	
	private String shopId;//店铺id
	
	private int status;//状态 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理 
	
	private String code;//商品编码
	
	private String description;//商品描述
	
	private double postage;//商品邮费
	
	private double originalPrice;//商品原价
	
	private double currentPrice;//商品现价
	
	private List<String> picList;//商品图片列表
	
	//private List<ObjectId> specList;//商品规格列表
	
	private List<ObjectId> categoryIds;//商品所属的品类列表
	
	private List<String> customCategory;//自定义分类
	
	private int distribution;//配送方式 1表示到店自提2快递3表示支持两种方式
	
	private int freight;//1表示商家承担运费,0表示买家承担运费
	
	private int terminalType;//上架终端：1.表示容易逛2.表示互动屏3.表示容易逛和互动屏4.表示微商5.微商,容易逛6.微商,互动屏7.容易逛, 互动屏, 微商(转换成二进制数个位1有容易逛第二位1有 互动屏第三位1有 微商)
	
	
	/*@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
	//@JsonSerialize(using=JsonDateSerializer.class)	
	@JsonDeserialize(using=DateJsonDeserializer.class)
	//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")  
	private Date registerAt;//上架时间
	/*@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	 */
	//@JsonSerialize(using=JsonDateSerializer.class)
	@JsonDeserialize(using=DateJsonDeserializer.class)
	//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date soldOutAt;//下架时间
	
	private int source;//来源
	
	private int stockStatus;//0表示统一库存1表示分管库存
	
	private List<CommoditySpecParam> commoditySpeceParams;
	
	private int userId;//用户id
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public double getPostage() {
		return postage;
	}

	public void setPostage(double postage) {
		this.postage = postage;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public List<String> getPicList() {
		return picList;
	}

	public void setPicList(List<String> picList) {
		this.picList = picList;
	}

	public List<ObjectId> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<ObjectId> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public List<String> getCustomCategory() {
		return customCategory;
	}

	public void setCustomCategory(List<String> customCategory) {
		this.customCategory = customCategory;
	}

	public int getDistribution() {
		return distribution;
	}

	public void setDistribution(int distribution) {
		this.distribution = distribution;
	}
	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
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

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public List<CommoditySpecParam> getCommoditySpeceParams() {
		return commoditySpeceParams;
	}

	public void setCommoditySpeceParams(
			List<CommoditySpecParam> commoditySpeceParams) {
		this.commoditySpeceParams = commoditySpeceParams;
	}

	public int getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(int terminalType) {
		this.terminalType = terminalType;
	}

	public int getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(int stockStatus) {
		this.stockStatus = stockStatus;
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
}
