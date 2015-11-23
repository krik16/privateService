package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.Commodity;

public class CommodityBuyerVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1461107119422444629L;

	private String shopName;//店铺名称
	private List<String> commodityPicList;
	private String commodityId;
	private String commodityCode;
	private String commodityStock;
	private int commodityStatus;
	private int commodityType;//渠道  1商家，2买手
	private boolean supportCourierDeliver;//导购：true是   false否；买手：默认true   

	private List<String> shopIM;// 店铺可用IM账号
	
	private String bullId;//创建人
	
	private Double distance = 0.0; //距离
	
	
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
	private String commodityOPriceMax;//我是最高原价”,
	private String commodityOPriceMin;//我是最低原价”,
	private String commodityCPriceMax;//我是最高现价”,
	private String commodityCPriceMin;//我是最低现价”,
	private String commodityOPOfLCP;//我是最低现价对应的原价
	private String commodityBrandName;//商品所属的品牌名字
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
	private String commodityPostage;//我是商品邮费”,
	private String commodityDescription;//我是商品描述”,
	private String commodityName;//我是商品名称”,
	private String shopId;//123”,
	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	private String shopMid;
	private boolean isCollected;  //是否被收藏
	
	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
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
//		this.commodityPostage = commodity.getPostage();
		this.commodityDescription = commodity.getDescription();
		this.commodityName = commodity.getName();
		this.shopId = commodity.getShopId();
		this.shopMid = "";
		if(commodity.getShopMid() != null ){
			this.shopMid = commodity.getShopMid();
		}
		this.commodityOPOfLCP = commodity.getoPriceOfLowestCPrice();
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
		
	}
	
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
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

	public List<String> getShopIM() {
		return shopIM;
	}

	public void setShopIM(List<String> shopIM) {
		this.shopIM = shopIM;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public boolean isSupportCourierDeliver() {
		return supportCourierDeliver;
	}

	public void setSupportCourierDeliver(boolean supportCourierDeliver) {
		this.supportCourierDeliver = supportCourierDeliver;
	}
	
}
