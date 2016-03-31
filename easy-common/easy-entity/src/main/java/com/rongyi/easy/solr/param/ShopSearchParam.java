package com.rongyi.easy.solr.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShopSearchParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String keyword;   //关键词
	private Integer distance;     //距离筛选,废弃
	private String coord_x;   //坐标x
	private String coord_y;   //坐标y
	private String cat_id;    //0店铺1商场2品牌3分类（类似于美食）
	/** 自定义分类id */
	private String custom_cat_id;
	private String city_name; //城市名（如  上海&上海市）
	private String city_id;
	private String sort;      //排序规则（distance，null，couponRequired（commodityRequired），date）
	private int from;         //页
	private int size = 50;         //一页数量
	private String brand_id;  //品牌id
	private String zone_id;   //区域id(长度24),或者距离(长度小于24，单位 米)
	private String shop_id;   //店铺id
	private boolean commodityRequired; //是否只看有商品的店铺
	private String mall_id;  //商场id
	private String poi_type; //店铺：0 商场：1
	private List<String> keywordList = new ArrayList<>();

	public List<String> getKeywordList() {
		return keywordList;
	}

	public void setKeywordList(List<String> keywordList) {
		this.keywordList = keywordList;
	}

	public void addKeywordList(String keyword) {
		this.keywordList.add(keyword);
	}

	public String getPoi_type() {
		return poi_type;
	}
	public void setPoi_type(String poi_type) {
		this.poi_type = poi_type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
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
	public boolean isCommodityRequired() {
		return commodityRequired;
	}
	public void setCommodityRequired(boolean commodityRequired) {
		this.commodityRequired = commodityRequired;
	}
	public String getMall_id() {
		return mall_id;
	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}

	/**
	 * @return the custom_cat_id
	 */
	public String getCustom_cat_id() {
		return custom_cat_id;
	}
	/**
	 * @param custom_cat_id the custom_cat_id to set
	 */
	public void setCustom_cat_id(String custom_cat_id) {
		this.custom_cat_id = custom_cat_id;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	@Override
	public String toString() {
		return "ShopSearchParam{" +
				"brand_id='" + brand_id + '\'' +
				", keyword='" + keyword + '\'' +
				", distance=" + distance +
				", coord_x='" + coord_x + '\'' +
				", coord_y='" + coord_y + '\'' +
				", cat_id='" + cat_id + '\'' +
				", custom_cat_id='" + custom_cat_id + '\'' +
				", city_name='" + city_name + '\'' +
				", city_id='" + city_id + '\'' +
				", sort='" + sort + '\'' +
				", from=" + from +
				", size=" + size +
				", zone_id='" + zone_id + '\'' +
				", shop_id='" + shop_id + '\'' +
				", commodityRequired=" + commodityRequired +
				", mall_id='" + mall_id + '\'' +
				", poi_type='" + poi_type + '\'' +
				", keywordList=" + keywordList +
				'}';
	}
}
