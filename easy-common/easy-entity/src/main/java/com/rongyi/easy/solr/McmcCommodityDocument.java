package com.rongyi.easy.solr;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rongyi.core.constant.Identity;
import com.rongyi.core.enumerate.mcmc.CommodityType;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityCategory;
import com.rongyi.easy.mcmc.CommodityShopInfo;
import com.rongyi.easy.mcmc.CommoditySpec;
import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.apache.solr.common.SolrDocument;
import org.bson.types.ObjectId;

public class McmcCommodityDocument implements java.io.Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -6516058338575306587L;
	@Field
	private String id;
	@Field("category1")
	private String category1;
	@Field("category2")
	private String category2;
	@Field("category3")
	private String category3;
	@Field("category4")
	private String category4;
	@Field("commodityName")
	private String commodityName;
	@Field("commodityCode")
	private String commodityCode;
	@Field("commodityShopId")
	private String commodityShopId;
	@Field("zone_ids")
	private List<String> zone_ids;
	@Field("status")
	private Integer status;
	@Field("sold")
	private Integer sold;
	@Field("public_start")
	private Date public_start;
	@Field("position")
	private String position;
	@Field("brand_id")
	private String brand_id;
	@Field("category_ids")
	private List<String> category_ids;
	@Field("category1_id")
	private String category1_id;
	@Field("category2_id")
	private String category2_id;
	@Field("category3_id")
	private String category3_id;
	@Field("commodityMallId")
	private String commodityMallId;
	@Field("commodityBrandId")
	private String commodityBrandId;
	@Field("price")
	private Double price;
	@Field("currentPriceList")
	private List<Double> currentPriceList;//商品价格（不同规格现价列表，用于商品价格筛选区间）
	@Field("spot")
	private Boolean spot;
	@Field("type")
	private Integer type;
	@Field("liveId")
	private String liveId;
	@Field("liveStartTime")
	private Date liveStartTime;
	@Field("liveEndTime")
	private Date liveEndTime;
	@Field("createBy")
	private String createBy;
	@Field("commodityNameSubdiv")
	private String commodityNameSubdiv;
	@Field("saleId")
	private Integer saleId;
	@Field("flashSaleId")
	private Integer flashSaleId;
	@Field("activityStartTime")
	private Date activityStartTime;
	@Field("activityEndTime")
	private Date activityEndTime;
	@Field("sortPosition")
	private Integer sortPosition;
	@Field("flashSortPosition")
	private Integer flashSortPosition;
	@Field("terminalType")
	private Integer terminalType;// com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
	@Field("systemNumber")
	private String systemNumber;
	@Field("discount")
	private Double discount;
	@Field("weAndTeStatus")
	private String weAndTeStatus;
	@Field("brandName")
	private String brandName;
	@Field("updateAt")
	private Date updateAt;
    @Field("galleryPosition")
	private Integer galleryPosition;

	@Field("shopName")
	private String shopName; ///< 店铺名称
	@Field("mallName")
	private String mallName;  ///< 商场名称
	@Field("hotAreaName")
	private String hotAreaName; ///< 商圈名称
	@Field("top")
	private Integer top; ///< 置顶排序
	@Field("secKillSign")
	private String secKillSign;
	@Field("extend")
	private String extend;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Double> getCurrentPriceList() {
		return currentPriceList;
	}
	public void setCurrentPriceList(List<Double> currentPriceList) {
		this.currentPriceList = currentPriceList;
	}
	public String getCommodityMallId() {
		return commodityMallId;
	}

	public void setCommodityMallId(String commodityMallId) {
		this.commodityMallId = commodityMallId;
	}

	public String getCommodityBrandId() {
		return commodityBrandId;
	}

	public void setCommodityBrandId(String commodityBrandId) {
		this.commodityBrandId = commodityBrandId;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public List<String> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<String> category_ids) {
		this.category_ids = category_ids;
		// 三级分类拆分成三个字段
		if(CollectionUtils.isNotEmpty(category_ids)&&category_ids.size()>=3){
			this.setCategory1_id(category_ids.get(0));
			this.setCategory2_id(category_ids.get(1));
			this.setCategory3_id(category_ids.get(2));
		}
	}

	public String getCategory1_id() {
		return category1_id;
	}

	public void setCategory1_id(String category1_id) {
		this.category1_id = category1_id;
	}

	public String getCategory2_id() {
		return category2_id;
	}

	public void setCategory2_id(String category2_id) {
		this.category2_id = category2_id;
	}

	public String getCategory3_id() {
		return category3_id;
	}

	public void setCategory3_id(String category3_id) {
		this.category3_id = category3_id;
	}

	public List<String> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSold() {
		return sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}

	public Date getPublic_start() {
		return public_start;
	}

	public void setPublic_start(Date public_start) {
		this.public_start = public_start;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityShopId() {
		return commodityShopId;
	}

	public void setCommodityShopId(String commodityShopId) {
		this.commodityShopId = commodityShopId;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getGalleryPosition() {
		return galleryPosition;
	}

	public void setGalleryPosition(Integer galleryPosition) {
		this.galleryPosition = galleryPosition;
	}

	public McmcCommodityDocument(){

	}

	public McmcCommodityDocument(SolrDocument doc){
		this.id = doc.getFieldValue("id").toString();
		this.category1 = doc.getFieldValue("category1").toString();
		this.category2 = doc.getFieldValue("category2").toString();
		this.category3 = doc.getFieldValue("category3").toString();
//		this.category4 = doc.getFieldValue("category4").toString();
		this.commodityName = doc.getFieldValue("commodityName").toString();
		this.commodityCode = doc.getFieldValue("commodityCode").toString();
		this.commodityShopId = doc.getFieldValue("commodityShopId").toString();
		this.commodityNameSubdiv = doc.getFieldValue("commodityNameSubdiv").toString();
		this.saleId=(Integer)doc.getFieldValue("saleId");
		this.flashSaleId=(Integer)doc.getFieldValue("flashSaleId");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory1() {
		return category1;
	}
	public void setCategory1(String category1) {
		this.category1 = category1;
	}
	public String getCategory2() {
		return category2;
	}
	public void setCategory2(String category2) {
		this.category2 = category2;
	}
	public String getCategory3() {
		return category3;
	}
	public void setCategory3(String category3) {
		this.category3 = category3;
	}
	public String getCategory4() {
		return category4;
	}
	public void setCategory4(String category4) {
		this.category4 = category4;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityNameSubdiv() {
		return commodityNameSubdiv;
	}
	public void setCommodityNameSubdiv(String commodityNameSubdiv) {
		this.commodityNameSubdiv = commodityNameSubdiv;
	}

	public Boolean getSpot() {
		return spot;
	}

	public void setSpot(Boolean spot) {
		this.spot = spot;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public Integer getSortPosition() {
		return sortPosition;
	}

	public void setSortPosition(Integer sortPosition) {
		this.sortPosition = sortPosition;
	}

	public Integer getFlashSortPosition() {
		return flashSortPosition;
	}

	public void setFlashSortPosition(Integer flashSortPosition) {
		this.flashSortPosition = flashSortPosition;
	}

	public Integer getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}

	public String getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}

	public String getWeAndTeStatus() {
		return weAndTeStatus;
	}

	public void setWeAndTeStatus(String weAndTeStatus) {
		this.weAndTeStatus = weAndTeStatus;
	}

	public String getSecKillSign() {
		return secKillSign;
	}

	public void setSecKillSign(String secKillSign) {
		this.secKillSign = secKillSign;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getHotAreaName() {
		return hotAreaName;
	}

	public void setHotAreaName(String hotAreaName) {
		this.hotAreaName = hotAreaName;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public void wrapDocumentInfo(Commodity commodity, CommodityVO commodityVo,
								 long brandId, long mallId, CommodityShopInfo shopInfo,
								 List<Double> positions, List<String> zoneIds, String brandMid) {
		this.setId(commodity.getId().toString());
		this.setCommodityName(commodity.getName());
		this.setCommodityNameSubdiv(commodity.getName());
		this.setCommodityCode(commodity.getCode());
		this.setCommodityShopId(commodity.getShopId());
		this.setPublic_start(new Date());
		this.setSold(0);
		this.setType(CommodityType.GUIDE.getValue());
		this.setCreateBy(commodity.getCreate_by());
		this.setPrice(commodity.getPrice());
		this.setStatus(commodity.getStatus());
		this.setTerminalType(commodity.getTerminalType());
		this.setWeAndTeStatus(commodity.getWeAndTeStatus());
		List<String> category_ids = new ArrayList<>();
		for (ObjectId categoryObjectId : commodity.getCategoryIds()) {
			category_ids.add(categoryObjectId.toString());
		}
		this.setCategory_ids(category_ids);
		this.setBrandName(commodity.getBrandName());
		this.setUpdateAt(commodity.getUpdateAt());

		if (commodity.getSaleId() != null && commodity.getSaleId() != 0) {
			this.setSaleId(commodity.getSaleId());
			this.setSortPosition(9999);
		}

		if(commodity.getSource() == 0){//商家后台发布商品，默认下架
			this.setStatus(CommodityDataStatus.STATUS_COMMODITY_UNSHELVE);
		}
		this.setSystemNumber(commodity.getSystemNumber());
		this.setDiscount(commodity.getDiscount());

		this.setCommodityBrandId(String.valueOf(brandId));
		this.setCommodityMallId(String.valueOf(mallId));

		if(shopInfo != null) {
			this.setZone_ids(shopInfo.getZoneIds());
			this.setPosition(shopInfo.getPositon());
			this.setBrand_id(shopInfo.getBrandMid());
		}

		if(StringUtils.isNotBlank(commodityVo.getWeAndTeStatus())){
			this.setWeAndTeStatus(commodityVo.getWeAndTeStatus());
		}

		if(commodityVo.getProcessIdentity() == Identity.BUYER) {
			// 买手相关字段
			this.setSpot(commodity.isSpot());
			this.setType(CommodityType.BULL.getValue()); // 0：商家 1：买手
			this.setTerminalType(commodity.getTerminalType());
			this.setWeAndTeStatus(commodity.getWeAndTeStatus());
			if(commodity.isSpot()) {
				this.setStatus(commodity.getStatus());
			} else {
				// 买手&非现货 商品 临时状态: -1
				this.setStatus(CommodityDataStatus.STATUS_COMMODITY_NOT_SPORT_CONTRACT);
			}
			if (zoneIds != null && !zoneIds.isEmpty()) {
				this.setZone_ids(zoneIds);
			}
			if (positions != null && positions.size() == 2) {
				this.setPosition(positions.get(0) + "," + positions.get(1));
			}
			this.setBrand_id(brandMid);
		}


	}
}
