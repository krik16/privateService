package com.rongyi.easy.ryoms.param;

import java.io.Serializable;
import java.util.List;

/**
 * 新建、修改店铺的参数
 * @author user
 *
 */
public class ShopParam implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name ;       //店铺名称 
	private Integer shopNature ;//店铺类型   0普通店   1免税店  2专柜  3折扣  4旗舰
	private Integer shopType ;//店铺性质    0商场商铺  1商场专柜  2街边店 3特卖店
	private String qrcodePic;  //二维码
	private Integer recommend = 0;  //0不置顶  1置顶
	private ShopPositionParam position ;  //位置信息
	private String shopNumber;  //铺位号
	private String address; //详情地址
	private String customCategoryIds;  //商场自定义分类  （多个分类,号分隔）
	private Integer businessStatus ;//商场营业状态  0正常营业  1即将营业  2暂停营业  3停止营业   4待处理
	private List<Double> location ;   //经纬度  
	private String tags = "" ;    //店铺标签  （多个标签 ,号分隔 ）
	private String telephone;  //店铺电话
	private String businessHours ; //营业时间
	private String openAt ;     //开业时间
	private String description;  //店铺描述
	private String brandId;  //主营品牌
	private String brandIds ;//兼营品牌 （多个,号分隔）
	private String filialeId; //分公司ID
	private String appPhotosUrl ;  //app店铺详情图片
	private String photosUrl ;  //终端机店铺详情图片 
	List<String> coordinate  ;  //室内座标
	private Integer isImport = 1 ;  // 是否是导入  （0是 1否）
	private Integer optId ;  //操作者ID
	private Integer createSource = 0 ; //创建来源  0大运营  1商家后台  其它crm
	private String averageConsumption;  //平均消费
	private String icon ;             //店铺自定义Logo
	private Integer valid ;    //店铺状态
	
	@Override
	public String toString(){
		return "ShopParam [id="+id+",name="+name+",shopNature="+shopNature+",shopType="+shopType+",qrcodePic="+qrcodePic
				+",recommend="+recommend+",shopNumber="+shopNumber+",address="+address+",customCategoryIds="+customCategoryIds
				+"businessStatus="+businessStatus+",location="+location+",tags="+tags+",telephone="+telephone+",businessHours"+businessHours
				+",openAt="+openAt+",description="+description+",brandId="+brandId+",brandIds="+brandIds+",filialeId="+filialeId
				+",appPhotosUrl="+appPhotosUrl+",photosUrl="+photosUrl+",coordinate="+coordinate+",icon:"+icon +",position="+position.toString()+"]";
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
	public Integer getShopNature() {
		return shopNature;
	}
	public void setShopNature(Integer shopNature) {
		this.shopNature = shopNature;
	}
	public Integer getShopType() {
		return shopType;
	}
	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}
	public String getQrcodePic() {
		return qrcodePic;
	}
	public void setQrcodePic(String qrcodePic) {
		this.qrcodePic = qrcodePic;
	}
	public Integer getRecommend() {
		return recommend;
	}
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	public ShopPositionParam getPosition() {
		return position;
	}
	public void setPosition(ShopPositionParam position) {
		this.position = position;
	}
	public String getShopNumber() {
		return shopNumber;
	}
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomCategoryIds() {
		return customCategoryIds;
	}
	public void setCustomCategoryIds(String customCategoryIds) {
		this.customCategoryIds = customCategoryIds;
	}
	public Integer getBusinessStatus() {
		return businessStatus;
	}
	public void setBusinessStatus(Integer businessStatus) {
		this.businessStatus = businessStatus;
	}
	
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getOpenAt() {
		return openAt;
	}
	public void setOpenAt(String openAt) {
		this.openAt = openAt;
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
	public String getBrandIds() {
		return brandIds;
	}
	public void setBrandIds(String brandIds) {
		this.brandIds = brandIds;
	}
	public String getFilialeId() {
		return filialeId;
	}
	public void setFilialeId(String filialeId) {
		this.filialeId = filialeId;
	}
	public String getAppPhotosUrl() {
		return appPhotosUrl;
	}
	public void setAppPhotosUrl(String appPhotosUrl) {
		this.appPhotosUrl = appPhotosUrl;
	}
	public String getPhotosUrl() {
		return photosUrl;
	}
	public void setPhotosUrl(String photosUrl) {
		this.photosUrl = photosUrl;
	}
	
	public List<String> getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(List<String> coordinate) {
		this.coordinate = coordinate;
	}

	public Integer getIsImport() {
		return isImport;
	}
	public void setIsImport(Integer isImport) {
		this.isImport = isImport;
	}
	public Integer getOptId() {
		return optId;
	}
	public void setOptId(Integer optId) {
		this.optId = optId;
	}
	public Integer getCreateSource() {
		return createSource;
	}
	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}

	public String getAverageConsumption() {
		return averageConsumption;
	}

	public void setAverageConsumption(String averageConsumption) {
		this.averageConsumption = averageConsumption;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}
}
