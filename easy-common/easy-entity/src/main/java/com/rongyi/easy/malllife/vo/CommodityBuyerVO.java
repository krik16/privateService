package com.rongyi.easy.malllife.vo;


import java.io.Serializable;
import java.util.List;

public class CommodityBuyerVO implements Serializable{
    private List<String> commodityPicList;
    private String commodityId;
    private String commodityOPriceMax;//我是最高原价”,
    private String commodityOPriceMin;//我是最低原价”,
    private String commodityCPriceMax;//我是最高现价”,
    private String commodityCPriceMin;//我是最低现价”,
    private String commodityPostage;//我是商品邮费”,
    private String commodityDescription;//我是商品描述”,
    private String commodityName;//我是商品名称”,
    private boolean supportCourierDeliver;//支持快递发货    导购：true是   false否；买手：默认true   
	private boolean supportSelfPickup;//支持到店自提  true 是    false否
    private String shopId;//123”,
    private boolean isCollected;  //是否被收藏
    private String commodityCode;//商品编码
    private String shopMid;//店铺mongoId
	public CommodityBuyerVO(){
        
    }
    public CommodityBuyerVO(Commodity commodity){
        this.commodityId = commodity.getId().toString();
        this.commodityPicList = commodity.getPicList();
        this.commodityOPriceMax = commodity.getoPriceMax();
        this.commodityOPriceMin = commodity.getoPriceMin();
        this.commodityCPriceMax = commodity.getcPriceMax();
        this.commodityCPriceMin = commodity.getcPriceMin();
        this.commodityPostage = commodity.getPostage();
        this.commodityDescription = commodity.getDescription();
        this.supportCourierDeliver = commodity.isSupportCourierDeliver();
		this.supportSelfPickup = commodity.isSupportSelfPickup();
        this.commodityName = commodity.getName();
        this.shopId = commodity.getShopId();
        this.commodityCode=commodity.getCode();
        this.shopMid = commodity.getShopMid();
    }
    
    public List<String> getCommodityPicList() {
        return commodityPicList;
    }
    
    public void setCommodityPicList(List<String> commodityPicList) {
        this.commodityPicList = commodityPicList;
    }
    
    public String getCommodityId() {
        return commodityId;
    }
    
    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
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
    
    public String getCommodityCode() {
        return commodityCode;
    }
    
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
    
}
