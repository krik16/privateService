package com.rongyi.easy.solr.retrival;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class PoiInput implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6818842094776010111L;
	
	private String q = "" ;// keyword);
	private String r = "0"; // radius distance 
	private String g = "0"; // genre cat_id 
	private String s = "001"; // sort 
	private int start = 0;// start from  
	private int count = 50; //count size 
	private int lon = 111992927; // lon coord_y 
	private int lat = 28851343; // lat coord_x 
	private String cityid = "-1";// cityid city_name 
	private String keyTag; // keyTag key_tags
	private String productionId; //productionId production_id	
	private String brandId; //brandId brand_id	
	private String categoryId; //categoryId cate_id	
	private String zoneId; //zoneId zone_id
	private String shopId; //shopId shop_id
	private String mallId; // mallId mall_id	map.put("mallId", mallId);
	private String holder_id;//holder_id
	private String activityId = "-1";//activityId activity_id
	private String mallids = "-1" ; //malllids
	private boolean commodityRequired = false;
	private boolean couponRequired = false;
	private List<String> shopList =  new ArrayList<String>();
	public List<String> getShopList() {
		return shopList;
	}
	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

	public boolean isCouponRequired() {
		return couponRequired;
	}
	public void setCouponRequired(boolean couponRequired) {
		this.couponRequired = couponRequired;
	}
	public PoiInput(){
		
	}
	public PoiInput(PoiParam param){
		if(param.getKeyword() != null){
			this.q = param.getKeyword();
		} 
		if(param.getDistance() != 0){
			this.r = String.valueOf(param.getDistance());
		}
		if(param.getMall_id() != null){
			this.mallId = param.getMall_id();
		}
		if(param.getSort() != null){
			this.s = param.getSort();
		}
		if(param.getFrom() != 0){
			this.start = param.getFrom();
		}
		if(param.getSize() != 0){
			this.count  = param.getSize();
		}
		if(param.getKey_tags() != null){
			this.keyTag = param.getKey_tags();
		}
		if(param.getProduction_id() != null){
			this.productionId = param.getProduction_id();
		}
		if(param.getBrand_id() != null){
			this.brandId = param.getBrand_id();
		}
		if(param.getCate_id() != null){
			this.categoryId = param.getCate_id();
		}
		if(param.getZone_id() != null){
			this.zoneId = param.getZone_id();
		}
		if(param.getShop_id() != null){
			this.shopId = param.getShop_id();
		}
		if(param.getHolder_id() != null){
			this.holder_id = param.getHolder_id();
		}
		if(param.getMallids() != null){
			this.mallids = param.getMallids();
		}
		if(param.isCommodityRequired()){
			this.commodityRequired = true;
		}
		if(param.isCouponRequired()){
			this.couponRequired = true;
		}
		
	}
	public String getKeyTag() {
		return keyTag;
	}
	public void setKeyTag(String keyTag) {
		this.keyTag = keyTag;
	}
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	public String getG() {
		return g;
	}
	public void setG(String g) {
		this.g = g;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLon() {
		return lon;
	}
	public void setLon(int lon) {
		this.lon = lon;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	
	public String getProductionId() {
		return productionId;
	}
	public void setProductionId(String productionId) {
		this.productionId = productionId;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getZoneId() {
		return zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getHolder_id() {
		return holder_id;
	}
	public void setHolder_id(String holder_id) {
		this.holder_id = holder_id;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getMallids() {
		return mallids;
	}
	public void setMallids(String mallids) {
		this.mallids = mallids;
	}
	public boolean isCommodityRequired() {
		return commodityRequired;
	}
	public void setCommodityRequired(boolean commodityRequired) {
		this.commodityRequired = commodityRequired;
	}
	
	
	
}
