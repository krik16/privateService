package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.mcmc.Commodity;
import org.apache.commons.lang.StringUtils;
public class CommodityBuyerVO implements Serializable{
	private static final long serialVersionUID = -1461107119422444629L;

	private String shopName;//店铺名称
	private List<String> commodityPicList;
	private String commodityId;
	private String commodityCode;
	private String commodityStock;
	private int commodityStatus;
	private int commodityAppStatus;// 商品APP显示状态 (0下架  1上架  3待上架 4秒杀结束)
	private int commodityType;//渠道  1商家，2买手
	private boolean supportCourierDeliver;//支持快递发货    导购：true是   false否；买手：默认true   
	private boolean supportSelfPickup;//支持到店自提  true 是    false否
	private boolean offlinePayment;// 线下支付
	private boolean onlinePayment;// 线上支付
	private boolean offlineRefund;// 线下退款
	private boolean onlineRefund;// 线上退款
	private List<String> shopIM;// 店铺可用IM账号
	private String bullId;//创建人
	private Double distance = 0.0; //距离
	private int saleShopCount; //销售店铺数，小于等于1为单店销售，大于1为多店销售
	private boolean watching = false; //是否正在看
	private List<Double> location; //经纬度
	private String systemNumber; //商品SPU
	private String activityType = "0";	//活动类型[0其他 闪购1、特卖2、秒杀3]
	private String easyOrder;//容易令
	private int isSpot;//是否现货	0 非现货 1现货
	private String commodityOPriceMax;//我是最高原价”,
	private String commodityOPriceMin;//我是最低原价”,
	private String commodityCPriceMax;//我是最高现价”,
	private String commodityCPriceMin;//我是最低现价”,
	private String commodityOPOfLCP;//我是最低现价对应的原价
	private String commodityBrandName;//商品所属的品牌名字
	private String commodityPostage;//我是商品邮费”,
	private String commodityDescription;//我是商品描述”,
	private String commodityName;//我是商品名称”,
	private String shopId;//123”,
	private String shopMid;
	private boolean isCollected;  //是否被收藏
	private String mallName;//商场名称
	private String mallMid;//商场mongoId
	private String goodsParam;//商品参数
	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public boolean isWatching() {
		return watching;
	}

	public void setWatching(boolean watching) {
		this.watching = watching;
	}

	public int getSaleShopCount() {
		return saleShopCount;
	}

	public void setSaleShopCount(int saleShopCount) {
		this.saleShopCount = saleShopCount;
	}

	public boolean isOfflinePayment() {
		return offlinePayment;
	}

	public void setOfflinePayment(boolean offlinePayment) {
		this.offlinePayment = offlinePayment;
	}

	public boolean isOnlinePayment() {
		return onlinePayment;
	}

	public void setOnlinePayment(boolean onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

	public boolean isOfflineRefund() {
		return offlineRefund;
	}

	public void setOfflineRefund(boolean offlineRefund) {
		this.offlineRefund = offlineRefund;
	}

	public boolean isOnlineRefund() {
		return onlineRefund;
	}

	public void setOnlineRefund(boolean onlineRefund) {
		this.onlineRefund = onlineRefund;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getBullId() {
		return bullId;
	}

	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	public int getCommodityType() {
		return commodityType;
	}

	public void setCommodityType(int commodityType) {
		this.commodityType = commodityType;
	}

	public String getCommodityStock() {
		return commodityStock;
	}

	public void setCommodityStock(String commodityStock) {
		this.commodityStock = commodityStock;
	}

	public int getCommodityStatus() {
		return commodityStatus;
	}

	public void setCommodityStatus(int commodityStatus) {
		this.commodityStatus = commodityStatus;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	
	public String getCommodityBrandName() {
		return commodityBrandName;
	}

	public void setCommodityBrandName(String commodityBrandName) {
		this.commodityBrandName = commodityBrandName;
	}

	public String getCommodityOPOfLCP() {
		return commodityOPOfLCP;
	}

	public void setCommodityOPOfLCP(String commodityOPOfLCP) {
		this.commodityOPOfLCP = commodityOPOfLCP;
	}
	
	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	
	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<String> getCommodityPicList() {
		return commodityPicList;
	}

	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}

	public int getCommodityAppStatus() {
		return commodityAppStatus;
	}

	public void setCommodityAppStatus(int commodityAppStatus) {
		this.commodityAppStatus = commodityAppStatus;
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

	public List<String> getShopIM() {
		return shopIM;
	}

	public void setShopIM(List<String> shopIM) {
		this.shopIM = shopIM;
	}

	public String getEasyOrder() {
		return easyOrder;
	}

	public void setEasyOrder(String easyOrder) {
		this.easyOrder = easyOrder;
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

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public String getCommodityDescription() {
		return commodityDescription;
	}

	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public boolean isCollected() {
		return isCollected;
	}

	public void setCollected(boolean isCollected) {
		this.isCollected = isCollected;
	}
	
	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	
	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	
	public String getGoodsParam() {
		return goodsParam;
	}

	public void setGoodsParam(String goodsParam) {
		this.goodsParam = goodsParam;
	}

	public CommodityBuyerVO(){
		
	}

	public CommodityBuyerVO(Commodity commodity){
		this.commodityId = commodity.getId().toString();
		this.commodityPicList = commodity.getPicList();
		this.commodityOPriceMax = commodity.getoPriceMax();
		this.commodityOPriceMin = commodity.getoPriceMin();
		this.commodityCPriceMax = commodity.getcPriceMax();
		this.commodityCPriceMin = commodity.getcPriceMin();
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
		if(commodity.isSpot()){
			this.isSpot = 1;//现货
		}else{
			this.isSpot = 0;//非现货
		}
//		this.commodityPostage = commodity.getPostage();
		this.commodityDescription = commodity.getDescription();
		this.commodityName = commodity.getName();
		this.shopId = commodity.getShopId();
		this.shopMid = "";
		if(commodity.getShopMid() != null ){
			this.shopMid = commodity.getShopMid();
		}
		this.mallMid = "";
		if(StringUtils.isNotBlank(commodity.getMallMid())){
			this.mallMid = commodity.getMallMid();
		}
		this.commodityOPOfLCP = commodity.getoPriceOfLowestCPrice();
		if (StringUtils.isBlank(this.commodityOPOfLCP)) {
			this.commodityOPOfLCP = "0.0";
		}
		this.commodityCode = commodity.getCode();
		this.commodityStatus = commodity.getStatus();
		this.commodityStock = String.valueOf(commodity.getStock());
		this.commodityBrandName = "";
		if(commodity.getBrandName() != null){
			this.commodityBrandName = commodity.getBrandName();
		}
		if(commodity.getCreate_by() != null){
			this.bullId = commodity.getCreate_by();//商品创建人
		}
		// 买手版渠道  0商家，1买手
		this.commodityType = commodity.getType();
		this.supportCourierDeliver = commodity.isSupportCourierDeliver();
		this.supportSelfPickup = commodity.isSupportSelfPickup();

		// 商品待上架且上架时间大于当前时间，app商品状态为 待上架
		//商品上架或待上架，且上架时间小于当前时间，且下架时间大于当前时间，app商品状态为 上架
		//其他 下架
		//状态 -1：非现货初始化(直播使用） 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理5待审核 6审核失败
		if (this.commodityStatus == 3 && (commodity.getRegisterAt() != null && commodity.getRegisterAt().getTime() - new Date().getTime() > 0)) {
			this.commodityAppStatus = 3;
		} else if ((commodityStatus == 1 || commodityStatus == 3)
				&& (commodity.getRegisterAt() != null && commodity.getRegisterAt().getTime() - new Date().getTime() <= 0)
				&& (commodity.getSoldOutAt() != null && commodity.getSoldOutAt().getTime() - new Date().getTime() > 0)) {
			this.commodityAppStatus = 1;
		} else if (commodityAppStatus != 0 && commodityAppStatus != 1 && commodityAppStatus != 3) {
			this.commodityAppStatus = 0;
		} else {
			this.commodityAppStatus = this.commodityStatus;
		}
		this.systemNumber = commodity.getSystemNumber();
		
		//活动类型[0其他 闪购1、特卖2、秒杀3]
		if (StringUtils.isNotBlank(commodity.getSecKillSign())) {
			this.activityType = "3";
		} else if (commodity.getSaleId() != null) {
			this.activityType = "2";
		} else if (commodity.getFlashSaleId() != null) {
			this.activityType = "1";
		} else if (StringUtils.isNotBlank(commodity.getSecKillSign())) {
			this.activityType = "3";
		} else {
			//其他
			this.activityType = "0";
		}
		
		// 当前是秒杀商品
		if ("3".equals(this.activityType)) {
			long nowTime = new Date().getTime();
			// 商品处于上架状态
			if (this.commodityAppStatus == 1) {
				if (commodity.getActivityStartTime() != null && commodity.getActivityStartTime().getTime() > nowTime) {
					// 秒杀未开始
					this.commodityAppStatus = 3;
				} else if (commodity.getActivityEndTime() != null && commodity.getActivityEndTime().getTime() <= nowTime) {
					// 秒杀已结束
					this.commodityAppStatus = 4;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "CommodityBuyerVO [shopName=" + shopName + ", commodityPicList="
				+ commodityPicList + ", commodityId=" + commodityId
				+ ", commodityCode=" + commodityCode + ", commodityStock="
				+ commodityStock + ", commodityStatus=" + commodityStatus
				+ ", commodityAppStatus=" + commodityAppStatus
				+ ", commodityType=" + commodityType
				+ ", supportCourierDeliver=" + supportCourierDeliver
				+ ", supportSelfPickup=" + supportSelfPickup
				+ ", offlinePayment=" + offlinePayment + ", onlinePayment="
				+ onlinePayment + ", offlineRefund=" + offlineRefund
				+ ", onlineRefund=" + onlineRefund + ", shopIM=" + shopIM
				+ ", bullId=" + bullId + ", distance=" + distance
				+ ", saleShopCount=" + saleShopCount + ", watching=" + watching
				+ ", location=" + location + ", systemNumber=" + systemNumber
				+ ", activityType=" + activityType + ", easyOrder=" + easyOrder
				+ ", isSpot=" + isSpot + ", commodityOPriceMax="
				+ commodityOPriceMax + ", commodityOPriceMin="
				+ commodityOPriceMin + ", commodityCPriceMax="
				+ commodityCPriceMax + ", commodityCPriceMin="
				+ commodityCPriceMin + ", commodityOPOfLCP=" + commodityOPOfLCP
				+ ", commodityBrandName=" + commodityBrandName
				+ ", commodityPostage=" + commodityPostage
				+ ", commodityDescription=" + commodityDescription
				+ ", commodityName=" + commodityName + ", shopId=" + shopId
				+ ", shopMid=" + shopMid + ", isCollected=" + isCollected
				+ ", mallName=" + mallName + ", mallMid=" + mallMid
				+ ", goodsParam=" + goodsParam + "]";
	}
	
}
