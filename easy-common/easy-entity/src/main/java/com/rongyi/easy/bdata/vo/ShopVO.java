package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.bdata.dto.CustomCategoryDto;

public class ShopVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String iconUrl;            //主品牌logo
	private String shopType;
	private String shopNature;
	private String status;
	private String recommend;
	private String valid;
	private ShopPositionVO position;
	private String address;
	private String telephone;
	private String averageConsumption;   //平均消费
	private String businessHours;
	private String description;
	private String brandId;
	private String brandName;
	private String brandEname;
	private List<BrandsCategoryVO> categories;
	private List<String> terminalImgs;
	private List<Double> location;
	private String filialeId;
	private List<String> customCateIds;
	private List<String> coordinate;
	private List<String> doorCoordinate;
	private String slug;
	private String tags;
	private Date createdAt;
	private Date updateAt;
	private String qrcodePic;
	private String valiReason;
	private Integer businessStatus;
	private List<CustomCategoryDto> customCategorys ;
	private String filialeName ; //分公司名称
	private List<BrandVO> brands ; //兼营品牌
	private Date openAt ; //开业时间
	private List<String> appImgs ; //app店铺图片
	private String icon ;        //店铺自定义Logo
	private String businessStatusReason;
	private String operatorUser;  //创建者
	private String updateUser ;   //最后修改者
	private String nameEn;  //店铺英文名
	private String descriptionEn; //英文描述
	private String FID;

	public String getFID() {
		return FID;
	}

	public void setFID(String FID) {
		this.FID = FID;
	}
	private List<ObjectId> zone_ids;//

	
	public List<ObjectId> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<ObjectId> zone_ids) {
		this.zone_ids = zone_ids;

	}

	public String getBusinessStatusReason() {
		return businessStatusReason;
	}

	public void setBusinessStatusReason(String businessStatusReason) {
		this.businessStatusReason = businessStatusReason;
	}
	
	
	public Integer getBusinessStatus() {
		return businessStatus;
	}

	public void setBusinessStatus(Integer businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getValiReason() {
		return valiReason;
	}

	public void setValiReason(String valiReason) {
		this.valiReason = valiReason;
	}

	public String getBrandEname() {
		return brandEname;
	}

	public void setBrandEname(String brandEname) {
		this.brandEname = brandEname;
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

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public String getFilialeId() {
		return filialeId;
	}

	public void setFilialeId(String filialeId) {
		this.filialeId = filialeId;
	}

	public List<String> getCustomCateIds() {
		return customCateIds;
	}

	public void setCustomCateIds(List<String> customCateIds) {
		this.customCateIds = customCateIds;
	}

	public List<String> getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(List<String> coordinate) {
		this.coordinate = coordinate;
	}

	public List<String> getDoorCoordinate() {
		return doorCoordinate;
	}

	public void setDoorCoordinate(List<String> doorCoordinate) {
		this.doorCoordinate = doorCoordinate;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getQrcodePic() {
		return qrcodePic;
	}

	public void setQrcodePic(String qrcodePic) {
		this.qrcodePic = qrcodePic;
	}

	public List<CustomCategoryDto> getCustomCategorys() {
		return customCategorys;
	}

	public void setCustomCategorys(List<CustomCategoryDto> customCategorys) {
		this.customCategorys = customCategorys;
	}

	public String getFilialeName() {
		return filialeName;
	}

	public void setFilialeName(String filialeName) {
		this.filialeName = filialeName;
	}

	public List<BrandVO> getBrands() {
		return brands;
	}

	public void setBrands(List<BrandVO> brands) {
		this.brands = brands;
	}

	public Date getOpenAt() {
		return openAt;
	}

	public void setOpenAt(Date openAt) {
		this.openAt = openAt;
	}

	public List<String> getAppImgs() {
		return appImgs;
	}

	public void setAppImgs(List<String> appImgs) {
		this.appImgs = appImgs;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getOperatorUser() {
		return operatorUser;
	}

	public void setOperatorUser(String operatorUser) {
		this.operatorUser = operatorUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getDescriptionEn() {
		return descriptionEn;
	}

	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
	}
}
