package com.rongyi.easy.solr.param;

import java.io.Serializable;
import java.util.List;

public class ActivitySearchParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 578059263593575051L;
	
	private String keyword;   //关键词
	private int distance;     //距离筛选
	private String coord_x;   //坐标x
	private String coord_y;   //坐标y
	private String cat_id;           //0店铺1商场2品牌3分类（类似于美食）
	private String city_name; //城市名（如  上海&上海市）
	private String sort;      //排序规则（distance，null，couponRequired（commodityRequired），date）
	private int from;         //页
	private int size;         //一页数量
	private String brand_id;  //品牌id
	private String zone_id;   //区域id
	private String shop_id;   //店铺id
	private String holder_id;       //优惠券持有者id
	private boolean couponRequired; //是否只看优惠券
	private List<String> shopList;    //终端机参数 店铺id List
	
	private String mallId; // mall Id for 终端屏
	private String startLetter;  // 首字母 for 终端屏

	private String showChannel;//展示渠道  APP：4，互动屏：5, 微信：6    不填时默认app
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(String coord_x) {
		this.coord_x = coord_x;
	}
	public String getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(String coord_y) {
		this.coord_y = coord_y;
	}
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	public String getZone_id() {
		return zone_id;
	}
	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getHolder_id() {
		return holder_id;
	}
	public void setHolder_id(String holder_id) {
		this.holder_id = holder_id;
	}
	public boolean isCouponRequired() {
		return couponRequired;
	}
	public void setCouponRequired(boolean couponRequired) {
		this.couponRequired = couponRequired;
	}
	public List<String> getShopList() {
		return shopList;
	}
	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}
	/**
	 * @return the mallId
	 */
	public String getMallId() {
		return mallId;
	}
	/**
	 * @param mallId the mallId to set
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	/**
	 * @return the startLetter
	 */
	public String getStartLetter() {
		return startLetter;
	}
	/**
	 * @param startLetter the startLetter to set
	 */
	public void setStartLetter(String startLetter) {
		this.startLetter = startLetter;
	}

	public String getShowChannel() {
		return showChannel;
	}

	public void setShowChannel(String showChannel) {
		this.showChannel = showChannel;
	}

	@Override
	public String toString() {
		return "ActivitySearchParam{" +
				"keyword='" + keyword + '\'' +
				", distance=" + distance +
				", coord_x='" + coord_x + '\'' +
				", coord_y='" + coord_y + '\'' +
				", cat_id='" + cat_id + '\'' +
				", city_name='" + city_name + '\'' +
				", sort='" + sort + '\'' +
				", from=" + from +
				", size=" + size +
				", brand_id='" + brand_id + '\'' +
				", zone_id='" + zone_id + '\'' +
				", shop_id='" + shop_id + '\'' +
				", holder_id='" + holder_id + '\'' +
				", couponRequired=" + couponRequired +
				", shopList=" + shopList +
				", mallId='" + mallId + '\'' +
				", startLetter='" + startLetter + '\'' +
				", showChannel='" + showChannel + '\'' +
				'}';
	}
}
