package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.springframework.util.Assert;

@Entity(value="mcmc_total_commodity",noClassnameStored=true)
public class TotalCommodity implements  Serializable,Cloneable{
	
	private static final long serialVersionUID = -3022699601318372490L;
	
	@Id
	private ObjectId id;
	
	private String name;//商品名称
	private String category;//商品品类id
	private Integer status;//状态  0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理5待审核 6审核失败

	private String code;//商品编码
	private String description;//商品描述
	private String postage;//商品邮费
	private Integer stock;//商品库存
	
	private Date createAt;//数据创建日期
	private Date updateAt;//数据更新日期
	private String originalPrice;//商品原价
	private String currentPrice;//商品现价
	private Integer updateBy;//修改人
	private Integer createBy;//创建者
	
	private List<String> picList;//商品图片列表
	
	private List<ObjectId> categoryIds;//商品所属的品类列表
	
	//private Integer distribution;//配送方式 1表示到店自提2快递3表示支持两种方式
	private Integer freight;//1表示商家承担运费,0表示买家承担运费
	private Integer terminalType;//上架终端：com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
	private Date registerAt;//上架时间
	private Date soldOutAt;//下架时间
	private Integer source;//来源
	private Integer stockStatus;//0表示统一库存1表示分管库存
	private List<ObjectId> commodityIds;
	private List<ObjectId> specList;//商品规格列表
	private String reason;//下架原因
	
	private String brandMid;//品牌id
	private List<String> filialeMids;//分公司id
	private List<String> shopMids;//店铺id
	//private String brandId;//品牌mysqlId
	
	private boolean supportCourierDeliver=true;//支持快递发货字段  true 是    false否
	
	private boolean supportSelfPickup=true;//支持到店自提  true 是    false否

	private Integer identity = 4;//0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购,6买手

	private boolean immediateOn = false;//true表示设置是立即上架

	private List<String> skus;//规格sku集合

	private Integer purchaseCount;//商品的限购数量
	private String weAndTeStatus;//商品在终端机与App上的隐藏与显示  1表示APP端展示，2表示微信端展示，3表示都展示，4表示都不展示

	private Integer templateId;//邮费模版id
	private boolean goodsSec = true;//正品保障

	private Double discount; // 折扣

	public ObjectId getId() {
		return id;
	}
	
	public void setId(ObjectId id) {
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
	
	public Integer getStock() {
		return stock;
	}
	
	public void setStock(Integer stock) {
		this.stock = stock;
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

	/*public Integer getDistribution() {
		return distribution;
	}
	public void setDistribution(Integer distribution) {
		this.distribution = distribution;
	}*/
	
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
	
	public Integer getSource() {
		return source;
	}
	
	public void setSource(Integer source) {
		this.source = source;
	}
	
	public Integer getStockStatus() {
		return stockStatus;
	}
	
	public void setStockStatus(Integer stockStatus) {
		this.stockStatus = stockStatus;
	}
	
	public List<ObjectId> getCommodityIds() {
		return commodityIds;
	}
	
	public void setCommodityIds(List<ObjectId> commodityIds) {
		this.commodityIds = commodityIds;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public List<ObjectId> getSpecList() {
		return specList;
	}
	
	public void setSpecList(List<ObjectId> specList) {
		this.specList = specList;
	}
	
	public String getBrandMid() {
		return brandMid;
	}
	
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	
	public List<String> getFilialeMids() {
		return filialeMids;
	}
	
	public void setFilialeMids(List<String> filialeMids) {
		this.filialeMids = filialeMids;
	}
	
	public List<String> getShopMids() {
		return shopMids;
	}
	
	public void setShopMids(List<String> shopMids) {
		this.shopMids = shopMids;
	}
	
	public Integer getUpdateBy() {
		return updateBy;
	}
	
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}
	
	public Integer getCreateBy() {
		return createBy;
	}
	
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	
	public boolean isSupportCourierDeliver() {
		return supportCourierDeliver;
	}
	
	public void setSupportCourierDeliver(boolean supportCourierDeliver) {
		this.supportCourierDeliver = supportCourierDeliver;
	}
	
	public boolean isSupportSelfPickup() {
		return supportSelfPickup;
	}
	
	public void setSupportSelfPickup(boolean supportSelfPickup) {
		this.supportSelfPickup = supportSelfPickup;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public boolean isImmediateOn() {
		return immediateOn;
	}

	public void setImmediateOn(boolean immediateOn) {
		this.immediateOn = immediateOn;
	}

	public List<String> getSkus() {
		return skus;
	}

	public void setSkus(List<String> skus) {
		this.skus = skus;
	}

	public Integer getPurchaseCount() {
		return purchaseCount==null || purchaseCount < 0 ? 0:purchaseCount;
	}

	public void setPurchaseCount(Integer purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public String getWeAndTeStatus() {
		return StringUtils.isBlank(weAndTeStatus)?"3":weAndTeStatus;
	}

	public void setWeAndTeStatus(String weAndTeStatus) {
		this.weAndTeStatus = weAndTeStatus;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public boolean isGoodsSec() {
		return goodsSec;
	}

	public void setGoodsSec(boolean goodsSec) {
		this.goodsSec = goodsSec;
	}

	public Double getDiscount() {
		try {
			if(StringUtils.isNotBlank(this.currentPrice) && StringUtils.isNotBlank(this.originalPrice)) {
				NumberFormat ddf1 = NumberFormat.getNumberInstance() ;
				ddf1.setMaximumFractionDigits(2);
				Double currentPrice = Double.valueOf(this.currentPrice);
				Double originalPrice = Double.valueOf(this.originalPrice);

				return (originalPrice == 0) ? 10.0 : Double.valueOf(ddf1.format(currentPrice / originalPrice)) * 10;
			}
			return 10.0;
		} catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
