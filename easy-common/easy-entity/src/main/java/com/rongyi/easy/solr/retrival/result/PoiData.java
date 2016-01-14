package com.rongyi.easy.solr.retrival.result;


import java.io.Serializable;
import java.util.ArrayList;


public class PoiData extends Data  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3957431176870255236L;
	private String type;
	private String business_district;
	private String shop_nature;
	private boolean any_activity;
	private boolean any_coupon;
	private String cooperationShopId="-1";
	public String getCooperationShopId() {
		return cooperationShopId;
	}
	public void setCooperationShopId(String cooperationShopId) {
		this.cooperationShopId = cooperationShopId;
	}

	private int rmmmShopStatus=0;

	
	public int getRmmmShopStatus() {
		return rmmmShopStatus;
	}
	public void setRmmmShopStatus(int rmmmShopStatus) {
		this.rmmmShopStatus = rmmmShopStatus;
	}
	private ArrayList<String> tags;
	
	private ArrayList<ActivityData> activity;//商场下活动
	private int activityNum; //活动个数
	private String brandId;
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public boolean isAny_activity() {
		return any_activity;
	}
	public void setAny_activity(boolean any_activity) {
		this.any_activity = any_activity;
	}
	public boolean isAny_coupon() {
		return any_coupon;
	}
	public void setAny_coupon(boolean any_coupon) {
		this.any_coupon = any_coupon;
	}
	public String getBusiness_district() {
		return business_district;
	}
	public void setBusiness_district(String business_district) {
		this.business_district = business_district;
	}
	
	public String getShop_nature() {
		return shop_nature;
	}
	public void setShop_nature(String shop_nature) {
		this.shop_nature = shop_nature;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<ActivityData> getActivity() {
		return activity;
	}
	public void setActivity(ArrayList<ActivityData> activity) {
		this.activity = activity;
	}
	public int getActivityNum() {
		return activityNum;
	}
	public void setActivityNum(int activityNum) {
		this.activityNum = activityNum;
	}
	
}
