package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

public class ShopVO implements Serializable {

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
    private String filiale_id;
    private String brand_id;
    private List<ObjectId> zone_ids;
    private String filialeId;
	private String filialeName;
	private List<ObjectId> custom_category_ids;

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

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public String getFiliale_id() {
        return filiale_id;
    }

    public void setFiliale_id(String filiale_id) {
        this.filiale_id = filiale_id;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public List<ObjectId> getZone_ids() {
        return zone_ids;
    }

    public void setZone_ids(List<ObjectId> zone_ids) {
        this.zone_ids = zone_ids;
    }
	
	
	public String getFilialeId() {
		return filialeId;
	}
	public void setFilialeId(String filialeId) {
		this.filialeId = filialeId;
	}
	public String getFilialeName() {
		return filialeName;
	}
	public void setFilialeName(String filialeName) {
		this.filialeName = filialeName;
	}

    /**
	 * @return the custom_category_ids
	 */
	public List<ObjectId> getCustom_category_ids() {
		return custom_category_ids;
	}

	/**
	 * @param custom_category_ids the custom_category_ids to set
	 */
	public void setCustom_category_ids(List<ObjectId> custom_category_ids) {
		this.custom_category_ids = custom_category_ids;
	}

	@Override
	public String toString() {
		return "ShopVO [id=" + id + ", name=" + name + ", iconUrl=" + iconUrl + ", shopType=" + shopType
				+ ", shopNature=" + shopNature + ", status=" + status + ", recommend=" + recommend + ", valid=" + valid
				+ ", position=" + position + ", address=" + address + ", telephone=" + telephone
				+ ", averageConsumption=" + averageConsumption + ", businessHours=" + businessHours + ", description="
				+ description + ", brandId=" + brandId + ", brandName=" + brandName + ", categories=" + categories
				+ ", terminalImgs=" + terminalImgs + ", hasCoupons=" + hasCoupons + ", location=" + location
				+ ", filiale_id=" + filiale_id + ", brand_id=" + brand_id + ", zone_ids=" + zone_ids + ", filialeId="
				+ filialeId + ", filialeName=" + filialeName + ", custom_category_ids=" + custom_category_ids + "]";
	}
}
