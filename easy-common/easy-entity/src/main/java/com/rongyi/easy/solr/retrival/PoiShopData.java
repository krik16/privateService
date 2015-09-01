/** 
* @Title: PoiShopData.java 
* @Package com.rongyi.easy.solr.retrival 
* @Description: 店铺POI检索结果
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年8月18日 下午3:14:34 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.retrival;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author ZhengYl
 *
 */
public class PoiShopData extends SolrBaseData implements Serializable {
	/**  */
	private static final long serialVersionUID = 3980407600682258979L;

	/** 品牌logo */
	private String pic_url;

	/** 坐标 */
	private double[] location;

	/** 描述 */
	private String description;

	/** 城市名 */
	private String city_name;

	/** 所属店铺名 */
	private String shop_own;

	/** 标签，逗号分开 */
	private String label;

	/** 类型 shop/mall */
	private String type;

	/** 商圈名 */
	private String business_district;

	/** 店铺类型 折扣/旗舰店 */
	private String shop_nature;

	/** 是否有优惠 */
	private boolean any_activity;

	/** 是否有优惠券 */
	private boolean any_coupon;

	/** 合作商铺状态，0初始，1合作，2有货 */
	private int rmmmShopStatus = 0;

	/** 标签2 */
	private ArrayList<String> tags;

	/** 活动数量 */
	private int activityNum;

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public double[] getLocation() {
		return location;
	}

	public void setLocation(double[] location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getShop_own() {
		return shop_own;
	}

	public void setShop_own(String shop_own) {
		this.shop_own = shop_own;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public int getRmmmShopStatus() {
		return rmmmShopStatus;
	}

	public void setRmmmShopStatus(int rmmmShopStatus) {
		this.rmmmShopStatus = rmmmShopStatus;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	public int getActivityNum() {
		return activityNum;
	}

	public void setActivityNum(int activityNum) {
		this.activityNum = activityNum;
	}

}
