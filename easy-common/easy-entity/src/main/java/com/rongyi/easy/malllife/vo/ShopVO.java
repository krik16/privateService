package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 类ShopVO.java的实现描述：TODO 类实现描述
 * 
 * @author Lc 2014年7月25日 上午10:39:07
 */

public class ShopVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String address;
	private double coord_x;
	private double coord_y;
	private Integer city_branch_num; // 同城同类型商铺数量
	private String tags; // 标签
	private String telephone; // 电话号码
	private String transport_information; // 交通信息
	private String icon; // logo图

	private List<String> location_pic; // 商铺底图

	private String business_hours; // 营业时间
	private List<Map<String, String>> brand; // brand 集合 包含ID name
	private String mall_id; // 店铺所在商场ID
	private String floorId; // 店铺所在楼层ID

	private List<String> parking;

	private String rank_avg; // 评分
	private Integer attention_count; // 关注数量
	private Boolean is_attention; // 当前用户是否关注
	private String shop_own;// 所属商场名称

	private Boolean has_activity; // 判断是否有优惠

	private String key_tags; // 关键标签

	// private Integer shop_nature; 0是默认普通店(0,1,2,3,4)
	private String shop_nature; //picture only for 3 and 4
	
	private String description;

	private List<String> zones_ids; // 楼层ID集合

	private String brandId;
	
	private String brandName;//品牌id

	private String business_district;
	
	private String cityId;//城市ID
	private String cityName;//城市名称
	
	private List<String> categoryIds;
	
	private String distance;

    private String floorName; //店铺所在楼层名称

    private String shop_number; //店铺号
    private int collectionNum; //收藏数
    private String avg_cost;//平均消费

	private List<String> im_id;//环信Id
	private boolean hasWonderFulAct; //精彩活动
    private boolean hasDiscountAct; //优惠资讯
    private boolean hasRaiders;//潮人攻略
    
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public List<String> getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getCoord_x() {
		return coord_x;
	}
	public double getCoord_y() {
		return coord_y;
	}
	public Integer getCity_branch_num() {
		return city_branch_num;
	}
	public String getTags() {
		return tags;
	}
	public String getTelephone() {
		return telephone;
	}
	public String getTransport_information() {
		return transport_information;
	}
	public Boolean getHas_activity() {
		return has_activity;
	}
	public void setHas_activity(Boolean has_activity) {
		this.has_activity = has_activity;
	}
	public String getIcon() {
		return icon;
	}
	public List<String> getLocation_pic() {
		return location_pic;
	}
	public String getBusiness_hours() {
		return business_hours;
	}
	public List<Map<String, String>> getBrand() {
		return brand;
	}
	public String getMall_id() {
		return mall_id;
	}
	public String getFloorId() {
		return floorId;
	}
	public Integer getAttention_count() {
		return attention_count;
	}
	public Boolean getIs_attention() {
		return is_attention;
	}
	public String getShop_own() {
		return shop_own;
	}
	public String getKey_tags() {
		return key_tags;
	}
	public String getDescription() {
		return description;
	}
	public List<String> getZones_ids() {
		return zones_ids;
	}
	public String getShop_nature() {
		return shop_nature;
	}
	public void setShop_nature(String shop_nature) {
		this.shop_nature = shop_nature;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCoord_x(double coord_x) {
		this.coord_x = coord_x;
	}
	public void setCoord_y(double coord_y) {
		this.coord_y = coord_y;
	}
	public void setCity_branch_num(Integer city_branch_num) {
		this.city_branch_num = city_branch_num;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setTransport_information(String transport_information) {
		this.transport_information = transport_information;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public void setLocation_pic(List<String> location_pic) {
		this.location_pic = location_pic;
	}
	public void setBusiness_hours(String business_hours) {
		this.business_hours = business_hours;
	}
	public void setBrand(List<Map<String, String>> brand) {
		this.brand = brand;
	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public String getRank_avg() {
		return rank_avg;
	}
	public void setRank_avg(String rank_avg) {
		this.rank_avg = rank_avg;
	}
	public List<String> getParking() {
		return parking;
	}
	public void setParking(List<String> parking) {
		this.parking = parking;
	}
	public void setAttention_count(Integer attention_count) {
		this.attention_count = attention_count;
	}
	public void setIs_attention(Boolean is_attention) {
		this.is_attention = is_attention;
	}
	public void setShop_own(String shop_own) {
		this.shop_own = shop_own;
	}

	public void setKey_tags(String key_tags) {
		this.key_tags = key_tags;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setZones_ids(List<String> zones_ids) {
		this.zones_ids = zones_ids;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBusiness_district() {
		return business_district;
	}
	public void setBusiness_district(String business_district) {
		this.business_district = business_district;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getFloorName() {
		return floorName;
	}
	public String getShop_number() {
		return shop_number;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public void setShop_number(String shop_number) {
		this.shop_number = shop_number;
	}
    public int getCollectionNum() {
        return collectionNum;
    }
    public void setCollectionNum(int collectionNum) {
        this.collectionNum = collectionNum;
    }
    public String getAvg_cost() {
        return avg_cost;
    }
    public void setAvg_cost(String avg_cost) {
        this.avg_cost = avg_cost;
    }

	public List<String> getIm_id() {
		return im_id;
	}
	public void setIm_id(List<String> im_id) {
		this.im_id = im_id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public boolean isHasWonderFulAct() {
		return hasWonderFulAct;
	}

	public void setHasWonderFulAct(boolean hasWonderFulAct) {
		this.hasWonderFulAct = hasWonderFulAct;
	}
	public boolean isHasDiscountAct() {
		return hasDiscountAct;
	}
	public void setHasDiscountAct(boolean hasDiscountAct) {
		this.hasDiscountAct = hasDiscountAct;
	}
	public boolean isHasRaiders() {
		return hasRaiders;
	}
	public void setHasRaiders(boolean hasRaiders) {
		this.hasRaiders = hasRaiders;
	}
	@Override
	public String toString() {
		return "ShopVO [id=" + id + ", name=" + name + ", address=" + address
				+ ", coord_x=" + coord_x + ", coord_y=" + coord_y
				+ ", city_branch_num=" + city_branch_num + ", tags=" + tags
				+ ", telephone=" + telephone + ", transport_information="
				+ transport_information + ", icon=" + icon + ", location_pic="
				+ location_pic + ", business_hours=" + business_hours
				+ ", brand=" + brand + ", mall_id=" + mall_id + ", floorId="
				+ floorId + ", parking=" + parking + ", rank_avg=" + rank_avg
				+ ", attention_count=" + attention_count + ", is_attention="
				+ is_attention + ", shop_own=" + shop_own + ", has_activity="
				+ has_activity + ", key_tags=" + key_tags + ", shop_nature="
				+ shop_nature + ", description=" + description + ", zones_ids="
				+ zones_ids + ", brandId=" + brandId + ", brandName="
				+ brandName + ", business_district=" + business_district
				+ ", cityId=" + cityId + ", cityName=" + cityName
				+ ", categoryIds=" + categoryIds + ", distance=" + distance
				+ ", floorName=" + floorName + ", shop_number=" + shop_number
				+ ", collectionNum=" + collectionNum + ", avg_cost=" + avg_cost
				+ ", im_id=" + im_id + ", hasWonderFulAct=" + hasWonderFulAct
				+ ", hasDiscountAct=" + hasDiscountAct + ", hasRaiders="
				+ hasRaiders + "]";
	}
	
}
