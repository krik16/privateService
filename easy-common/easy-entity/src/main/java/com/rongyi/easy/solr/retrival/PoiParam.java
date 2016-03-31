package com.rongyi.easy.solr.retrival;

import java.io.Serializable;

public class PoiParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6821819654302601770L;
	private String keyword;
	private int distance;

	public void setMallId(String mallId) {
		this.mall_id = mallId;
	}

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

	public String getHolder_id() {
		return holder_id;
	}

	public void setHolder_id(String holder_id) {
		this.holder_id = holder_id;
	}

	public String getMallids() {
		return mallids;
	}

	public void setMallids(String mallids) {
		this.mallids = mallids;
	}

	private String coord_x;
	private String coord_y;
	private String cat_id;
	private String mall_id;
	private String city_name;
	private String sort;
	private int from;
	private int size;
	private String key_tags;
	private String production_id;
	private String brand_id;
	private String cate_id;
	private String zone_id;
	private String shop_id;
	private String holder_id;
	private String mallids;
	private String startLetter;

	public String getStartLetter() {
		return startLetter;
	}

	public void setStartLetter(String startLetter) {
		this.startLetter = startLetter;
	}

	private boolean commodityRequired;
	private boolean couponRequired;

	public boolean isCouponRequired() {
		return couponRequired;
	}

	public void setCouponRequired(boolean couponRequired) {
		this.couponRequired = couponRequired;
	}

	public boolean isCommodityRequired() {
		return commodityRequired;
	}

	public void setCommodityRequired(boolean commodityRequired) {
		this.commodityRequired = commodityRequired;
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

	public String getKey_tags() {
		return key_tags;
	}

	public void setKey_tags(String key_tags) {
		this.key_tags = key_tags;
	}

	public String getProduction_id() {
		return production_id;
	}

	public void setProduction_id(String production_id) {
		this.production_id = production_id;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getCate_id() {
		return cate_id;
	}

	public void setCate_id(String cate_id) {
		this.cate_id = cate_id;
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

	public String getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}

	private String activity_id;

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

	public String getMall_id() {
		return mall_id;
	}

	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
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
}
