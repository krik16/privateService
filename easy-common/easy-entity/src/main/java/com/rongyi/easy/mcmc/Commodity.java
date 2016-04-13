package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.springframework.util.Assert;

@Entity(value="mcmc_commodity",noClassnameStored=true)
public class Commodity implements  Serializable,Cloneable{

	private static final long serialVersionUID = -3022699601318372490L;
	
	@Id
	private ObjectId id;

	private int type; // 渠道  0商家，1买手
	private String liveId; // 直播Id
	private boolean isSpot; // 是否现货	0 否  1是
	private Date liveStartTime; // 直播开始时间
	private Date liveEndTime; // 直播结束时间
	private String create_by; // 创建人

	private Integer saleId; //特卖mysql id
	private Integer flashSaleId; // 闪购mysql id
	private Date activityStartTime; //特卖、闪购、秒杀开始时间
	private Date activityEndTime; //特卖、闪购、秒杀结束时间
	private String secKillSign; //秒杀标记
	
	private String name;//商品名称
	private String category;//商品品类id
	private String shopId;//店铺id
	private String shopMid;//店铺的mongoid
	private int status;//状态 -1：非现货初始化(直播使用） 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理5待审核 6审核失败

	private String code;//商品编码
	private String description;//商品描述
	private String postage;//商品邮费
	private Integer stock;//商品库存
	private Integer sold;//商品销量
	private Integer lockedStock;//锁定库存
	private Date createAt;//数据创建日期
	private Date updateAt;//数据更新日期
	private String originalPrice;//商品原价
	private String currentPrice;//商品现价
	private String oPriceOfLowestCPrice;//商品现价最低值
	private String brandName;//品牌名
	private String mallMid;//商城mongoId
	private String shopNum;//店铺铺位号
	private String filialeMid;//分公司mongoId
	private String update_by;//修改人

	
	private String brandMid;//品牌mongoId
	
	private boolean supportCourierDeliver=true;//支持快递发货字段  true 是    false否
	
	private boolean supportSelfPickup=true;//支持到店自提  true 是    false否

	private int identity = -100;//-100 默认值，老数据，不处理权限 0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购6买手

	private Integer templateId;//邮费模版id

	public boolean isSupportCourierDeliver() {
		return supportCourierDeliver;
	}
	public void setSupportCourierDeliver(boolean supportCourierDeliver) {
		this.supportCourierDeliver = supportCourierDeliver;
	}
	public String getBrandMid() {
		return brandMid;
	}
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public boolean isSpot() {
		return isSpot;
	}
	public void setSpot(boolean isSpot) {
		this.isSpot = isSpot;
	}
	public Date getLiveStartTime() {
		return liveStartTime;
	}
	public void setLiveStartTime(Date liveStartTime) {
		this.liveStartTime = liveStartTime;
	}
	public Date getLiveEndTime() {
		return liveEndTime;
	}
	public void setLiveEndTime(Date liveEndTime) {
		this.liveEndTime = liveEndTime;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public String getShopNum() {
		return shopNum;
	}
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getoPriceOfLowestCPrice() {
		return oPriceOfLowestCPrice;
	}
	public void setoPriceOfLowestCPrice(String oPriceOfLowestCPrice) {
		this.oPriceOfLowestCPrice = oPriceOfLowestCPrice;
	}

	private List<String> picList;//商品图片列表
	private List<ObjectId> specList;//商品规格列表

	
	private Double price;//商品价格（现价最低价，用于排序）
	private String brandId;//商品所属品牌id
	private String mallId;//商品所属商场id
	private List<ObjectId> categoryIds;//商品所属的品类列表
	private List<String> customCategory;//自定义分类
	
	//private Integer distribution;//配送方式 1表示到店自提2快递3表示支持两种方式
	private Integer freight;//1表示商家承担运费,0表示买家承担运费
	private Integer terminalType;//上架终端：com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
	private Date registerAt;//上架时间
	private Date soldOutAt;//下架时间
	private Integer source;//来源0表示页面添加1表示批量导入2app创建商品
	private Integer stockStatus;//0表示统一库存1表示分管库存
	private String systemNumber;//系统编号
	private String reason;//下架原因
//	private int commentCount;
//	private int highCommentCount;
//	private int mediumCommentCount;
//	private int lowCommentCount;
	private String oPriceMax;//商品原最高价（用于买家版）
	private String oPriceMin;//商品原最低价（用于买家版）
	private String cPriceMax;//商品现最高价（用于买家版）
	private String cPriceMin;//商品现最高价（用于买家版）
	private Integer purchaseCount;//商品的限购数量
	private String weAndTeStatus;//商品在终端机与App上的隐藏与显示
	public Integer getPurchaseCount() {
		return this.purchaseCount==null || this.purchaseCount < 0 ? 0:this.purchaseCount;
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
	private Double discount ;//商品的折扣
	private Integer sort;//直播商品的排序
	private boolean goodsSec = true;//正品保障

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
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
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
	public Integer getSold() {
		return sold;
	}
	public void setSold(Integer sold) {
		this.sold = sold;
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
	public List<ObjectId> getSpecList() {
		return specList;
	}
	public void setSpecList(List<ObjectId> specList) {
		this.specList = specList;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
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

	public Double getDiscount() {
		try {
			if(StringUtils.isNotBlank(this.currentPrice) && StringUtils.isNotBlank(this.originalPrice)) {
				BigDecimal currentPrice = new BigDecimal(this.currentPrice);
				BigDecimal originalPrice = new BigDecimal(this.originalPrice);
				if (originalPrice.compareTo(new BigDecimal(0)) != 0)
					return currentPrice.divide(originalPrice, 2, BigDecimal.ROUND_HALF_UP)
							.multiply(new BigDecimal(10)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				return new BigDecimal(0).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			}
			/*if(StringUtils.isNotBlank(this.currentPrice) && StringUtils.isNotBlank(this.originalPrice)) {
				NumberFormat ddf1 = NumberFormat.getNumberInstance() ;
				ddf1.setMaximumFractionDigits(2);
				Double currentPrice = Double.valueOf(this.currentPrice);
				Double originalPrice = Double.valueOf(this.originalPrice);

				return (originalPrice == 0) ? 10.0 : Double.valueOf(ddf1.format(currentPrice / originalPrice)) * 10;
			}*/
			return 10.0;
		} catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public Commodity clone() throws CloneNotSupportedException {
		Commodity commodity=new Commodity();
		commodity.setCategory(category);
		commodity.setCategoryIds(categoryIds);
		commodity.setCode(code);
		commodity.setCurrentPrice(currentPrice);
		commodity.setCustomCategory(customCategory);
		commodity.setDescription(description);
		//commodity.setDistribution(distribution);
		commodity.setFreight(freight);
		commodity.setBrandName(brandName);
		commodity.setBrandId(brandId);
		commodity.setcPriceMax(cPriceMax);
		commodity.setcPriceMin(cPriceMin);
		commodity.setCreateAt(createAt);
		commodity.setId(id);
		commodity.setMallId(mallId);
		commodity.setMallMid(mallMid);
		commodity.setName(name);
		commodity.setoPriceMax(oPriceMax);
		commodity.setoPriceMin(oPriceMin);
		commodity.setoPriceOfLowestCPrice(oPriceOfLowestCPrice);
		commodity.setOriginalPrice(originalPrice);
		commodity.setPicList(picList);
		commodity.setPostage(postage);
		commodity.setPrice(price);
		commodity.setRegisterAt(registerAt);
		commodity.setShopId(shopId);
		commodity.setShopMid(shopMid);
		commodity.setShopNum(shopNum);
		commodity.setSold(sold);
		commodity.setSource(source);
		commodity.setSpecList(specList);
		commodity.setStatus(status);
		commodity.setStock(stock);
		commodity.setStockStatus(stockStatus);
		commodity.setTerminalType(terminalType);
		commodity.setUpdate_by(update_by);
		commodity.setUpdateAt(updateAt);
		commodity.setSaleId(saleId);
		commodity.setFlashSaleId(flashSaleId);
		commodity.setSecKillSign(secKillSign);
		commodity.setDiscount(discount);
//		commodity.setActivityStartTime(activityStartTime);
//		commodity.setActivityEndTime(activityEndTime);
		commodity.setPurchaseCount(purchaseCount);
		commodity.setWeAndTeStatus(weAndTeStatus);
		commodity.setSort(sort);
		return commodity;
	}
	
	public String getSystemNumber() {
		return systemNumber;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(Integer flashSaleId) {
		this.flashSaleId = flashSaleId;
	}

	public Date getActivityStartTime() {
		return activityStartTime;
	}

	public void setActivityStartTime(Date activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public Date getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(Date activityEndTime) {
		this.activityEndTime = activityEndTime;
	}
	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}
	public String getoPriceMax() {
		return oPriceMax;
	}
	public void setoPriceMax(String oPriceMax) {
		this.oPriceMax = oPriceMax;
	}
	public String getoPriceMin() {
		return oPriceMin;
	}
	public void setoPriceMin(String oPriceMin) {
		this.oPriceMin = oPriceMin;
	}
	public String getcPriceMax() {
		return cPriceMax;
	}
	public void setcPriceMax(String cPriceMax) {
		this.cPriceMax = cPriceMax;
	}
	public String getcPriceMin() {
		return cPriceMin;
	}
	public void setcPriceMin(String cPriceMin) {
		this.cPriceMin = cPriceMin;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getFilialeMid() {
		return filialeMid;
	}
	public void setFilialeMid(String filialeMid) {
		this.filialeMid = filialeMid;
	}

	public Integer getLockedStock() {
		return lockedStock;
	}

	public void setLockedStock(Integer lockedStock) {
		this.lockedStock = lockedStock;
	}

	public boolean isSupportSelfPickup() {
		return supportSelfPickup;
	}

	public void setSupportSelfPickup(boolean supportSelfPickup) {
		this.supportSelfPickup = supportSelfPickup;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public String getSecKillSign() {
		return secKillSign;
	}

	public void setSecKillSign(String secKillSign) {
		this.secKillSign = secKillSign;
	}

	public Integer getSort() {
		return null==sort?0:sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
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
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", type=" + type + ", liveId=" + liveId
				+ ", isSpot=" + isSpot + ", liveStartTime=" + liveStartTime
				+ ", liveEndTime=" + liveEndTime + ", create_by=" + create_by
				+ ", saleId=" + saleId + ", flashSaleId=" + flashSaleId
				+ ", activityStartTime=" + activityStartTime
				+ ", activityEndTime=" + activityEndTime + ", secKillSign="
				+ secKillSign + ", name=" + name + ", category=" + category
				+ ", shopId=" + shopId + ", shopMid=" + shopMid + ", status="
				+ status + ", code=" + code + ", description=" + description
				+ ", postage=" + postage + ", stock=" + stock + ", sold="
				+ sold + ", lockedStock=" + lockedStock + ", createAt="
				+ createAt + ", updateAt=" + updateAt + ", originalPrice="
				+ originalPrice + ", currentPrice=" + currentPrice
				+ ", oPriceOfLowestCPrice=" + oPriceOfLowestCPrice
				+ ", brandName=" + brandName + ", mallMid=" + mallMid
				+ ", shopNum=" + shopNum + ", filialeMid=" + filialeMid
				+ ", update_by=" + update_by + ", brandMid=" + brandMid
				+ ", supportCourierDeliver=" + supportCourierDeliver
				+ ", supportSelfPickup=" + supportSelfPickup + ", identity="
				+ identity + ", templateId=" + templateId + ", picList="
				+ picList + ", specList=" + specList + ", price=" + price
				+ ", brandId=" + brandId + ", mallId=" + mallId
				+ ", categoryIds=" + categoryIds + ", customCategory="
				+ customCategory + ", freight=" + freight + ", terminalType="
				+ terminalType + ", registerAt=" + registerAt + ", soldOutAt="
				+ soldOutAt + ", source=" + source + ", stockStatus="
				+ stockStatus + ", systemNumber=" + systemNumber + ", reason="
				+ reason + ", oPriceMax=" + oPriceMax + ", oPriceMin="
				+ oPriceMin + ", cPriceMax=" + cPriceMax + ", cPriceMin="
				+ cPriceMin + ", discount=" + discount + ", sort=" + sort
				+ ", goodsSec=" + goodsSec+",purchaseCount="+purchaseCount+",weAndTeStatus="+weAndTeStatus + "]";
	}
}
