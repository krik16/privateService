package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class MallAndShopVO implements Serializable{
    private String id;//
    private String name;//
    private String type;//
    
    
    private String pic_url;//
    private String key_tags;//
    private String shop_nature; //
    private boolean any_coupon; //

    private String mall_id; //
    private String shop_own;//
    private String business_district;//商圈
    private Double[] location;//
    private String label; //标签 字符串
    private List<Integer> tip; ///< 店铺标签（格式：[0，0，0] 对应：[货，惠、劵]）
    private String address;//地址
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPic_url() {
		return pic_url;
	}
	public String getKey_tags() {
		return key_tags;
	}
	public String getShop_nature() {
		return shop_nature;
	}
	public boolean isAny_coupon() {
		return any_coupon;
	}
	public String getType() {
		return type;
	}
	public String getMall_id() {
		return mall_id;
	}
	public String getShop_own() {
		return shop_own;
	}
	public String getBusiness_district() {
		return business_district;
	}
	public Double[] getLocation() {
		return location;
	}
	public String getLabel() {
		return label;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public void setKey_tags(String key_tags) {
		this.key_tags = key_tags;
	}
	public void setShop_nature(String shop_nature) {
		this.shop_nature = shop_nature;
	}
	public void setAny_coupon(boolean any_coupon) {
		this.any_coupon = any_coupon;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}
	public void setShop_own(String shop_own) {
		this.shop_own = shop_own;
	}
	public void setBusiness_district(String business_district) {
		this.business_district = business_district;
	}
	public void setLocation(Double[] location) {
		this.location = location;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<Integer> getTip() {
		return tip;
	}
	public void setTip(List<Integer> tip) {
		this.tip = tip;
	}
	@Override
	public String toString() {
		return "MallAndShopVO [id=" + id + ", name=" + name + ", type=" + type
				+ ", pic_url=" + pic_url + ", key_tags=" + key_tags
				+ ", shop_nature=" + shop_nature + ", any_coupon=" + any_coupon
				+ ", mall_id=" + mall_id + ", shop_own=" + shop_own
				+ ", business_district=" + business_district + ", location="
				+ Arrays.toString(location) + ", label=" + label + ", tip="
				+ tip + ", address=" + address + "]";
	}
	
}
