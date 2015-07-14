package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;

public class ShopVO implements Serializable{
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;//
	private String name;
	private String iconUrl;
	private String shopType;
	private String shopNature;
	private String status;
	private String recommend;
	private String valid;
	private ShopPositionVO position;
	private String address;
	private String telephone;
	private String averageConsumption;
	private String businessHours;
	private String description;
	private String brandId;
	private String brandName;
	private List<BrandsCategoryVO> categories;
	private List<String> terminalImgs;
	private Boolean hasCoupons;
	private List<Double> location;
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopNature() {
		return shopNature;
	}
	public void setShopNature(String shopNature) {
		this.shopNature = shopNature;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public ShopPositionVO getPosition() {
		return position;
	}
	public void setPosition(ShopPositionVO position) {
		this.position = position;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAverageConsumption() {
		return averageConsumption;
	}
	public void setAverageConsumption(String averageConsumption) {
		this.averageConsumption = averageConsumption;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<BrandsCategoryVO> getCategories() {
		return categories;
	}
	public void setCategories(List<BrandsCategoryVO> categories) {
		this.categories = categories;
	}
	public List<String> getTerminalImgs() {
		return terminalImgs;
	}
	public void setTerminalImgs(List<String> terminalImgs) {
		this.terminalImgs = terminalImgs;
	}
	public Boolean getHasCoupons() {
		return hasCoupons;
	}
	public void setHasCoupons(Boolean hasCoupons) {
		this.hasCoupons = hasCoupons;
	}
	
}
