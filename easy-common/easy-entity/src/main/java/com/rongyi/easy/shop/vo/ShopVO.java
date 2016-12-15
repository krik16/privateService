package com.rongyi.easy.shop.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.roa.vo.BrandVO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 商家后台店铺管理实体类
 * 
 * @author wzh
 *
 */
public class ShopVO implements Serializable {

	private String id;
	
	private String name;// 店铺名称
	private Integer shopNature;// 店铺类型 0普通店 1免税店 2专柜 3折扣店 4旗舰店
	private String shopType;// 店铺性质 0商场店铺 1商场专柜 2街边店 
	private String number;// 店铺编号
	private BrandVO brand;// 主品牌
	private List<BrandVO> brands;// 兼营品牌
	private String icon;// logo
	private List<CategoryVO> categories;// 店铺所属分类
	private List<CategoryVO> exclusiveCategories;// 店铺所属专属分类
	private String tags;// 标签 自定义分类

	private String mallName;
	private String mallId;
	private String businessDistrictId;//商圈id
	private String businessDistrictName;
	private List<AreaVO> areaVOs;// 所在地区 省 市区 商圈 商场
	private String address;// 详细地址
	private int moreFloors;// 0不跨楼，1跨楼

	private String shopNumber;// 铺位号
	private String businessStatus;// 营业状态0正常营业 1即将营业 2暂停营业 3停止营业
	private String businessHours;// 营业时间
	private List<String> photoUrls;//图片url集合
	private String openedTime;// 开业时间
	private String telephone;// 店铺电话
	private String headName;// 店铺负责人名字
	private String headTelephone;// 店铺负责人电话
	private String description;// 店铺描述
	private Integer valid;// 0正常显示1已隐藏2删除3待处理  4系统下架
	
	private String reason;//停业原因
	private String createdAt;//创建时间
	private String updateBy;//修改人
	private String updatedAt;//修改时间
	private String filialeName;//分公司名字
	private boolean changeAble;//不同的角色在店铺详情页面能否修改
	private String nameEn;      //店铺英文名
	private String descriptionEn;  //英文描述
	private Integer isEdit = 1; //是否可编译  0否 1是
	
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
	
	public Integer getShopNature() {
		return shopNature;
	}
	
	public void setShopNature(Integer shopNature) {
		this.shopNature = shopNature;
	}
	
	public String getShopType() {
		return shopType;
	}
	
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public BrandVO getBrand() {
		return brand;
	}
	
	public void setBrand(BrandVO brand) {
		this.brand = brand;
	}
	
	public List<BrandVO> getBrands() {
		return brands;
	}
	
	public void setBrands(List<BrandVO> brands) {
		this.brands = brands;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public List<CategoryVO> getCategories() {
		return categories;
	}
	
	public void setCategories(List<CategoryVO> categories) {
		this.categories = categories;
	}
	
	public List<CategoryVO> getExclusiveCategories() {
		return exclusiveCategories;
	}
	
	public void setExclusiveCategories(List<CategoryVO> exclusiveCategories) {
		this.exclusiveCategories = exclusiveCategories;
	}
	
	public String getTags() {
		return tags;
	}
	
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	public List<AreaVO> getAreaVOs() {
		return areaVOs;
	}
	
	public void setAreaVOs(List<AreaVO> areaVOs) {
		this.areaVOs = areaVOs;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getMoreFloors() {
		return moreFloors;
	}
	
	public void setMoreFloors(int moreFloors) {
		this.moreFloors = moreFloors;
	}
	
	public String getShopNumber() {
		return shopNumber;
	}
	
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}
	
	public String getBusinessStatus() {
		return businessStatus;
	}
	
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	
	public String getBusinessHours() {
		return businessHours;
	}
	
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	
	public String getOpenedTime() {
		return openedTime;
	}
	
	public void setOpenedTime(String openedTime) {
		this.openedTime = openedTime;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getHeadName() {
		return headName;
	}
	
	public void setHeadName(String headName) {
		this.headName = headName;
	}
	
	public String getHeadTelephone() {
		return headTelephone;
	}
	
	public void setHeadTelephone(String headTelephone) {
		this.headTelephone = headTelephone;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getValid() {
		return valid;
	}
	
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getUpdateBy() {
		return updateBy;
	}
	
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	
	public String getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String getFilialeName() {
		return filialeName;
	}
	
	public void setFilialeName(String filialeName) {
		this.filialeName = filialeName;
	}
	
	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getBusinessDistrictId() {
		return businessDistrictId;
	}

	public void setBusinessDistrictId(String businessDistrictId) {
		this.businessDistrictId = businessDistrictId;
	}

	public String getBusinessDistrictName() {
		return businessDistrictName;
	}

	public void setBusinessDistrictName(String businessDistrictName) {
		this.businessDistrictName = businessDistrictName;
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

	public boolean isChangeAble() { return changeAble; }

	public void setChangeAble(boolean changeAble) { this.changeAble = changeAble; }

	public Integer getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Integer isEdit) {
		this.isEdit = isEdit;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("name", name)
				.append("shopNature", shopNature)
				.append("shopType", shopType)
				.append("number", number)
				.append("brand", brand)
				.append("brands", brands)
				.append("icon", icon)
				.append("categories", categories)
				.append("exclusiveCategories", exclusiveCategories)
				.append("tags", tags)
				.append("mallName", mallName)
				.append("mallId", mallId)
				.append("businessDistrictId", businessDistrictId)
				.append("businessDistrictName", businessDistrictName)
				.append("areaVOs", areaVOs)
				.append("address", address)
				.append("moreFloors", moreFloors)
				.append("shopNumber", shopNumber)
				.append("businessStatus", businessStatus)
				.append("businessHours", businessHours)
				.append("photoUrls", photoUrls)
				.append("openedTime", openedTime)
				.append("telephone", telephone)
				.append("headName", headName)
				.append("headTelephone", headTelephone)
				.append("description", description)
				.append("valid", valid)
				.append("reason", reason)
				.append("createdAt", createdAt)
				.append("updateBy", updateBy)
				.append("updatedAt", updatedAt)
				.append("filialeName", filialeName)
				.append("nameEn",nameEn)
				.append("descriptionEn",descriptionEn)
				.toString();
	}
}
