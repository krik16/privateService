package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.*;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.constant.Identity;
import com.rongyi.easy.activitymanage.vo.CommodityVO;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.param.CommoditySpecParam;
import com.rongyi.easy.ryoms.entity.WechatInfoVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.springframework.util.Assert;

/**
 * 商品总表 商家后台商品对象
 */
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
	private List<Integer> customCategoryIds;//自定义分类集合;

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


	private String commodityModelNo;//商品款号
	private List<String> goodsParam;//商品参数

	private boolean supportCourierDeliver=true;//支持快递发货字段  true 是    false否

	private boolean supportSelfPickup=true;//支持到店自提  true 是    false否

	private Integer identity = 4;//0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购,6买手

	private boolean immediateOn = false;//true表示设置是立即上架

	private List<String> skus;//规格sku集合

	private Integer purchaseCount;//商品的限购数量
	private String weAndTeStatus;//商品在终端机与App上的隐藏与显示  1表示APP端展示，2表示微信端展示，3表示都展示，4表示都不展示

	private Integer templateId;//邮费模版id
	private boolean goodsSec = true;//正品保障

	private String subheading;  //副标题

	private String commodityDetails; //商品详情

	private Double discount; // 折扣

	private List<String> locationIds;//商品记录发到所有集团或者单个商场或者单个店铺集合
	private List<Integer> serviceIds;//微信公众号ids
	private Integer accountType;
	private String merchantId;  //商户id
	private List<WechatInfoVo> wechatInfoVos;


	public List<WechatInfoVo> getWechatInfoVos() {
		return wechatInfoVos;
	}

	public void setWechatInfoVos(List<WechatInfoVo> wechatInfoVos) {
		this.wechatInfoVos = wechatInfoVos;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public List<String> getLocationIds() {
		return locationIds;
	}

	public void setLocationIds(List<String> locationIds) {
		this.locationIds = locationIds;
	}

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

	public List<Integer> getCustomCategoryIds() {
		return customCategoryIds;
	}

	public void setCustomCategoryIds(List<Integer> customCategoryIds) {
		this.customCategoryIds = customCategoryIds;
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

	public String getCommodityModelNo() {
		return commodityModelNo;
	}

	public void setCommodityModelNo(String commodityModelNo) {
		this.commodityModelNo = commodityModelNo;
	}

	public List<String> getGoodsParam() {
		return goodsParam;
	}

	public void setGoodsParam(List<String> goodsParam) {
		this.goodsParam = goodsParam;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	@Override
	public String toString() {
		return "TotalCommodity{" +
				"brandMid='" + brandMid + '\'' +
				", id=" + id +
				", name='" + name + '\'' +
				", category='" + category + '\'' +
				", status=" + status +
				", code='" + code + '\'' +
				", description='" + description + '\'' +
				", postage='" + postage + '\'' +
				", stock=" + stock +
				", createAt=" + createAt +
				", updateAt=" + updateAt +
				", originalPrice='" + originalPrice + '\'' +
				", currentPrice='" + currentPrice + '\'' +
				", updateBy=" + updateBy +
				", createBy=" + createBy +
				", picList=" + picList +
				", categoryIds=" + categoryIds +
				", customCategoryIds=" + customCategoryIds +
				", freight=" + freight +
				", terminalType=" + terminalType +
				", registerAt=" + registerAt +
				", soldOutAt=" + soldOutAt +
				", source=" + source +
				", stockStatus=" + stockStatus +
				", commodityIds=" + commodityIds +
				", specList=" + specList +
				", reason='" + reason + '\'' +
				", filialeMids=" + filialeMids +
				", shopMids=" + shopMids +
				", supportCourierDeliver=" + supportCourierDeliver +
				", supportSelfPickup=" + supportSelfPickup +
				", identity=" + identity +
				", immediateOn=" + immediateOn +
				", skus=" + skus +
				", purchaseCount=" + purchaseCount +
				", weAndTeStatus='" + weAndTeStatus + '\'' +
				", templateId=" + templateId +
				", goodsSec=" + goodsSec +
				", discount=" + discount +
				", commodityModelNo=" + commodityModelNo +
				", goodsParam=" + goodsParam +
				", subheading=" + subheading+
				", commodityDetails=" + commodityDetails+
				'}';
	}

	public void wrapTotalCommodityInfo(Commodity commodity, com.rongyi.easy.mcmc.vo.CommodityVO vo) {
		this.setName(commodity.getName());
		this.setCategory(commodity.getCategory());
		this.setStatus(commodity.getStatus());
		this.setCode(commodity.getCode());
		this.setDescription(commodity.getDescription());
		this.setPostage(commodity.getPostage());
		this.setStock(commodity.getStock());
		this.setCommodityModelNo(commodity.getCommodityModelNo());
		this.setGoodsParam(commodity.getGoodsParam());

		if(CollectionUtils.isNotEmpty(vo.getCommoditySpecList())) {
			//totalCommodity总表显示时间区域
			this.setOriginalPrice(commodity.getoPriceMin() +
					(commodity.getoPriceMax().equals(commodity.getoPriceMin()) ?
							"-" + commodity.getoPriceMax() : ""));
			this.setCurrentPrice(commodity.getcPriceMin() +
					(commodity.getcPriceMax().equals(commodity.getcPriceMin()) ?
							"-" + commodity.getcPriceMax() : ""));
		} else {
			this.setCurrentPrice(commodity.getCurrentPrice());
			this.setOriginalPrice(commodity.getOriginalPrice());
		}

		this.setCreateAt(new Date());
		this.setUpdateAt(new Date());
		this.setCategoryIds(commodity.getCategoryIds());

		this.setPicList(commodity.getPicList());
		this.setFreight(0);//app默认买家承担运费
		this.setTerminalType(commodity.getTerminalType());
		this.setWeAndTeStatus(commodity.getWeAndTeStatus());
		this.setRegisterAt(commodity.getRegisterAt());
		this.setSoldOutAt(commodity.getSoldOutAt());
		this.setSource(commodity.getSource());
		this.setStockStatus(commodity.getStockStatus());
		this.setCommodityIds(new ArrayList<ObjectId>());
		this.getCommodityIds().add(commodity.getId());
		this.setBrandMid(commodity.getBrandMid());
		this.setFilialeMids(new ArrayList<String>());
		this.getFilialeMids().add(commodity.getFilialeMid());
		this.setShopMids(new ArrayList<String>());
		this.getShopMids().add(commodity.getShopMid());

		if (StringUtils.isNotBlank(vo.getCreate_by()) && vo.getCreate_by().matches("\\d+")) {
			this.setUpdateBy(Integer.valueOf(vo.getCreate_by()));
			this.setCreateBy(Integer.valueOf(vo.getCreate_by()));
		}
		this.setSupportCourierDeliver(commodity.isSupportCourierDeliver());
		this.setSupportSelfPickup(commodity.isSupportSelfPickup());
		this.setIdentity(commodity.getIdentity());
		this.setTemplateId(commodity.getTemplateId());//总表写入模版id
		if(CollectionUtils.isNotEmpty(commodity.getCustomCategoryIds())){
			this.setCustomCategoryIds((commodity.getCustomCategoryIds()));
		}
		this.setReason(commodity.getReason());
		this.setSubheading(commodity.getSubheading());
		this.setCommodityDetails(commodity.getCommodityDetails());

		this.setLocationIds(commodity.getLocationIds());
		this.setAccountType(commodity.getIdentity());
		this.setServiceIds(commodity.getServiceIds());
		this.setMerchantId(commodity.getMerchantId());
	}

	public String getSubheading() {
		return subheading;
	}

	public void setSubheading(String subheading) {
		this.subheading = subheading;
	}

	public String getCommodityDetails() {
		return commodityDetails;
	}

	public void setCommodityDetails(String commodityDetails) {
		this.commodityDetails = commodityDetails;
	}

	public void setTotalCommodityFromParam(CommodityParam param, SessionUserInfo userInfo, Map<String, Object> skus) {
		try {
			//老的商家后台数据默认是店长发布的商品
			if(this.getIdentity() == null) {
				this.setIdentity(Identity.SHOP);
			}
            this.id=StringUtils.isNotBlank(param.getId())?new ObjectId(param.getId()):null;
			this.setName(param.getName());
			this.setCode(param.getCode());
			this.setCategory(param.getCategory());
			this.setCategoryIds(param.getCategoryIds());
			this.setCustomCategoryIds(param.getCustomCategoryIds());
			this.setDescription(param.getDescription());
			this.setPostage(param.getPostage());
			this.setOriginalPrice(param.getOriginalPrice());
			this.setCurrentPrice(param.getCurrentPrice());
			this.setPicList(param.getPicList());
			this.setSupportCourierDeliver(true);
			this.setSupportSelfPickup(true);
			switch(param.getDistribution()){
				//配送方式 1表示到店自提2快递3表示支持两种方式
				//supportCourierDeliver支持快递发货字段  true 是    false否
				// supportSelfPickup支持到店自提  true 是    false否
				case 2:this.setSupportSelfPickup(false);break;
				case 1:this.setSupportCourierDeliver(false);break;
				case 0:this.setSupportCourierDeliver(false);this.setSupportSelfPickup(false);
			}
			this.setFreight(param.getFreight());
			this.setTerminalType(param.getTerminalType());
			if(param.getStatus() != null && param.getStatus() == 5) {// 立即上架
				this.setRegisterAt(DateTool.addTime(new Date(), 3));
				this.setSoldOutAt(DateTool.addYears(this.getRegisterAt(), 1));
				this.setImmediateOn(true);//表示前端是立即上架修改页面展示使用
			} else {
				this.setRegisterAt(param.getRegisterAt());
				this.setSoldOutAt(param.getSoldOutAt());
			}
			this.setStatus(CommodityDataStatus.STATUS_COMMODITY_SHELVE_WAITING);//上架状态
			//商家后台修改商品不能改变来源
			if(this.getId() == null) {
				this.setSource(0);
			}
			this.setStockStatus(param.getStockStatus());
			if(this.getId() == null) {
				this.setCreateAt(new Date());
			}
			this.setUpdateAt(new Date());
			this.setPurchaseCount(param.getPurchaseCount());
			this.setWeAndTeStatus(StringUtils.isNotBlank(param.getWeAndTeStatus()) ?
										param.getWeAndTeStatus() : CommodityTerminalType.weAndTeStatus.STATUS_4);
			this.setTemplateId(param.getTemplateId());
			this.setReason(param.getReason());

			setFilialeMids(param.getCommoditySpeceParams(), this);
			setShopMids(param.getCommoditySpeceParams(), this);

			this.setUpdateBy(userInfo.getId());
			if(param.getId() == null) {
				this.setCreateBy(userInfo.getId());
			}

			//老的app数据identity为-100
			if(!(this != null && this.getIdentity() != null && this.getIdentity() == -100)) {
				this.setIdentity(userInfo.getIdentity());
			}

			if(CollectionUtils.isNotEmpty(skus.keySet())) {
				this.setSkus(new ArrayList<>(skus.keySet()));
			}

			//保存商品关联店铺的分公司品牌店铺信息
			this.setBrandMid(userInfo.getBrandMid());

			//老的app数据identity为-100
			if(!(this != null && this.getIdentity() != null
					&& this.getIdentity() == -100)) {
				this.setIdentity(userInfo.getIdentity());
			}

			this.setAccountType(userInfo.getIdentity());
			this.setServiceIds(param.getServiceIds());
			this.setMerchantId(userInfo.getBindingMid());
			this.setSource(param.getSource());
			this.setSubheading(param.getSubheading());
			this.setCommodityDetails(param.getCommodityDetails());

			if(param.getCreateBy() != null) {
				this.setCreateBy(param.getCreateBy());
			}
		} catch (Exception e) {
			throw new RuntimeException("参数错误");
		}
	}

	private boolean isEffectiveMongoId(String id) {
		return StringUtils.isNotBlank(id) && id.matches("[\\da-zA-Z]{24}");
	}

	private void setFilialeMids(List<CommoditySpecParam> commoditySpecParams, TotalCommodity totalCommodity) {
		if(CollectionUtils.isNotEmpty(commoditySpecParams)){
			Set<String> set = new HashSet<>();

			for(CommoditySpecParam commoditySpecParam : commoditySpecParams){
				if(isEffectiveMongoId(commoditySpecParam.getFilialeMid())) {
					set.add(commoditySpecParam.getFilialeMid());
				}
			}

			totalCommodity.setFilialeMids(new ArrayList<>(set));
		}
	}

	private void setShopMids(List<CommoditySpecParam> commoditySpecParams, TotalCommodity totalCommodity) {
		if(CollectionUtils.isNotEmpty(commoditySpecParams)){
			Set<String> set = new HashSet<>();

			for(CommoditySpecParam commoditySpecParam : commoditySpecParams){
				if(isEffectiveMongoId(commoditySpecParam.getShopMid())) {
					set.add(commoditySpecParam.getShopMid());
				}
			}

			totalCommodity.setShopMids(new ArrayList<>(set));
		}
	}
}
