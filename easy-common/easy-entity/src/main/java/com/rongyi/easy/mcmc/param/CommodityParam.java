package com.rongyi.easy.mcmc.param;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;



public class CommodityParam {
	
	private Integer type;//类型0表示只修改库存1表示修改山商品所有信息
	
	private String id;//系统编号
	
	private String name;//商品名称
	
	private String category;//商品品类id
	
	//private String shopId;//店铺id
	
	private Integer status;//状态 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理 5立即上架
	
	private String code;//商品编码
	
	private String description;//商品描述
	
	private String postage;//商品邮费
	
	private String originalPrice;//商品原价
	
	private String currentPrice;//商品现价
	
	private List<String> picList;//商品图片列表
	
	//private List<ObjectId> specList;//商品规格列表
	
	private List<ObjectId> categoryIds;//商品所属的品类列表
	
	private List<String> customCategory;//自定义分类
	
	private Integer distribution;//配送方式 1表示到店自提2快递3表示支持两种方式
	
	private Integer freight;//1表示商家承担运费,0表示买家承担运费
	
	private Integer terminalType;//上架终端：1.表示容易逛2.表示互动屏3.表示容易逛和互动屏4.表示微商5.微商,容易逛6.微商,互动屏7.容易逛, 互动屏, 微商(转换成二进制数个位1有容易逛第二位1有 互动屏第三位1有 微商)
	
	
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
	
	//private Integer source;//来源
	
	private Integer stockStatus;//0表示统一库存1表示分管库存
	
	private List<CommoditySpecParam> commoditySpeceParams;
	
	private Integer stock;//总库存
	
	private Integer remain;//剩余总量
	
	private int hasSpec;//0表示无规格 1表示有规格

	private Integer templateId;//商城运费模版id

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	/*public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
*/
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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

	public String getPostage() {
		return postage;
	}

	public void setPostage(String postage) {
		this.postage = postage;
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

	public Integer getDistribution() {
		return distribution;
	}

	public void setDistribution(Integer distribution) {
		this.distribution = distribution;
	}

	public Integer getFreight() {
		return freight;
	}

	public void setFreight(Integer freight) {
		this.freight = freight;
	}

	public Integer getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
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

	/*public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}*/

	public Integer getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(Integer stockStatus) {
		this.stockStatus = stockStatus;
	}

	public List<CommoditySpecParam> getCommoditySpeceParams() {
		return commoditySpeceParams;
	}

	public void setCommoditySpeceParams(
			List<CommoditySpecParam> commoditySpeceParams) {
		this.commoditySpeceParams = commoditySpeceParams;
	}

	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public int getHasSpec() {
		return hasSpec;
	}

	public void setHasSpec(int hasSpec) {
		this.hasSpec = hasSpec;
	}

	public Integer getRemain() {
		return remain;
	}

	public void setRemain(Integer remain) {
		this.remain = remain;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
}
