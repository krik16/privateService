package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.mcmc.Commodity;


public class CommodityVO  implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8138633144546500349L;
	private String commodityId;
	private String commodityName;
	private String commodityCategory;
	private String commodityDescription;
	private String commodityPostage;
	private String commodityStock;
	private String commoditySold;
	private String commodityPubDate;
	private int commodityStatus;

	private String commodityOPriceMax;//我是最高原价”,
	private String commodityOPriceMin;//我是最低原价”,
	private String commodityCPriceMax;//我是最高现价”,
	private String commodityCPriceMin;//我是最低现价”,
	private String commodityOPOfLCP;//我是最低现价对应的原价
	
	private int commodityType;//渠道  0商家，1买手
	private int isSpot;//是否现货	
	private Date liveStartTime; // 直播开始时间
	private Date liveEndTime; // 直播结束时间
	private String create_by; // 创建人 
	private String liveId; // 直播Id
	private String commodityOriginalPrice;
	private String commodityCurrentPrice;
	private String shopId;
	private String shopMid; // shop mongo id
	private String commodityShopNumber;
	private List<String> commodityPicList;
	private List<CommoditySpecVO> commoditySpecList;
	private String commodityCode;
	private String commodityCommission;
	private String brandMid;//品牌mongoId
	private String mallMid;//商场mongoId
	private String shopName;//店铺名称
	private boolean supportCourierDeliver=true;//true是  false否
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getBrandMid() {
		return brandMid;
	}
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
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
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public int getCommodityType() {
		return commodityType;
	}
	public void setCommodityType(int commodityType) {
		this.commodityType = commodityType;
	}
	
	public int getIsSpot() {
		return isSpot;
	}
	public void setIsSpot(int isSpot) {
		this.isSpot = isSpot;
	}
	public String getCommodityOPriceMax() {
		return commodityOPriceMax;
	}
	public void setCommodityOPriceMax(String commodityOPriceMax) {
		this.commodityOPriceMax = commodityOPriceMax;
	}
	public String getCommodityOPriceMin() {
		return commodityOPriceMin;
	}
	public void setCommodityOPriceMin(String commodityOPriceMin) {
		this.commodityOPriceMin = commodityOPriceMin;
	}
	public String getCommodityCPriceMax() {
		return commodityCPriceMax;
	}
	public void setCommodityCPriceMax(String commodityCPriceMax) {
		this.commodityCPriceMax = commodityCPriceMax;
	}
	public String getCommodityCPriceMin() {
		return commodityCPriceMin;
	}
	public void setCommodityCPriceMin(String commodityCPriceMin) {
		this.commodityCPriceMin = commodityCPriceMin;
	}
	public String getCommodityOPOfLCP() {
		return commodityOPOfLCP;
	}
	public void setCommodityOPOfLCP(String commodityOPOfLCP) {
		this.commodityOPOfLCP = commodityOPOfLCP;
	}
	public String getCommodityShopNumber() {
		return commodityShopNumber;
	}
	public void setCommodityShopNumber(String commodityShopNumber) {
		this.commodityShopNumber = commodityShopNumber;
	}
	public int getCommodityStatus() {
		return commodityStatus;
	}
	public void setCommodityStatus(int commodityStatus) {
		this.commodityStatus = commodityStatus;
	}
	
	
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getCommodityCommission() {
		return commodityCommission;
	}
	public void setCommodityCommission(String commodityCommission) {
		this.commodityCommission = commodityCommission;
	}

	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public CommodityVO(){
		
	}
	public CommodityVO(Commodity commodity){
		this.commodityType = commodity.getType();
		this.shopId = commodity.getShopId();
		this.shopMid = commodity.getShopMid();//店铺mongoId
		this.create_by = commodity.getCreate_by();//创建人
		this.liveId = commodity.getLiveId();//直播id
		this.liveStartTime = commodity.getLiveStartTime();//直播开始时间
		this.liveEndTime = commodity.getLiveEndTime();//直播结束时间
		this.commodityId = commodity.getId().toString();
		this.commodityName = commodity.getName();
		this.commodityCategory = commodity.getCategory();
		this.commodityDescription = commodity.getDescription();
		this.brandMid = commodity.getBrandMid();//品牌mongoId
		this.mallMid = commodity.getMallMid();//商场mongoId
		if(commodity.isSpot()){
			this.isSpot = 1;//现货
		}else{
			this.isSpot = 0;//非现货
		}
		

		if(commodity.getPostage() != null && !commodity.getPostage().isEmpty()){
			try{
				double postage = Double.parseDouble(commodity.getPostage());
				this.commodityPostage = commodity.getPostage();
			}catch(Exception e){
				this.commodityPostage = "0.0";
			}
		}else{
			this.commodityPostage = "0.0";
		}

//		this.commodityPostage = commodity.getPostage();
		this.commodityStock = String.valueOf(commodity.getStock());
		this.commoditySold = String.valueOf(commodity.getSold());
		this.commodityPubDate = commodity.getCreateAt().toString();
		this.commodityOriginalPrice = commodity.getOriginalPrice();
		this.commodityCurrentPrice = commodity.getCurrentPrice();
		this.commodityPicList = commodity.getPicList();
		if(commodity.getCode() !=null){
			this.commodityCode = commodity.getCode();
		}else{
			this.commodityCode = "";
		}
		this.commodityStatus = commodity.getStatus();
		this.commodityShopNumber = "";
		if(commodity.getShopNum() != null){
			this.commodityShopNumber = commodity.getShopNum();
		}

		this.commodityOPriceMax = commodity.getoPriceMax();
		this.commodityOPriceMin = commodity.getoPriceMin();
		this.commodityCPriceMax = commodity.getcPriceMax();
		this.commodityCPriceMin = commodity.getcPriceMin();
		this.commodityOPOfLCP = commodity.getoPriceOfLowestCPrice();
		this.supportCourierDeliver = commodity.isSupportCourierDeliver();

	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityCategory() {
		return commodityCategory;
	}
	public void setCommodityCategory(String commodityCategory) {
		this.commodityCategory = commodityCategory;
	}
	public String getCommodityDescription() {
		return commodityDescription;
	}
	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
	}
	public String getCommodityPostage() {
		return commodityPostage;
	}
	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}
	public String getCommodityStock() {
		return commodityStock;
	}
	public void setCommodityStock(String commodityStock) {
		this.commodityStock = commodityStock;
	}
	public String getCommoditySold() {
		return commoditySold;
	}
	public void setCommoditySold(String commoditySold) {
		this.commoditySold = commoditySold;
	}
	public String getCommodityPubDate() {
		return commodityPubDate;
	}
	public void setCommodityPubDate(String commodityPubDate) {
		this.commodityPubDate = commodityPubDate;
	}
	public String getCommodityOriginalPrice() {
		return commodityOriginalPrice;
	}
	public void setCommodityOriginalPrice(String commodityOriginalPrice) {
		this.commodityOriginalPrice = commodityOriginalPrice;
	}
	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}
	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public List<CommoditySpecVO> getCommoditySpecList() {
		return commoditySpecList;
	}
	public void setCommoditySpecList(List<CommoditySpecVO> commoditySpecList) {
		this.commoditySpecList = commoditySpecList;
	}
	public boolean isSupportCourierDeliver() {
		return supportCourierDeliver;
	}
	public void setSupportCourierDeliver(boolean supportCourierDeliver) {
		this.supportCourierDeliver = supportCourierDeliver;
	}
	
}
