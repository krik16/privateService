package com.rongyi.easy.solr.retrival;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * 返回数据格式
 * @author 宫叶云
 * @version 1.0
 * 复旦大学多媒体实验室
 */
public final class DBData implements Serializable {
	
	private static final long serialVersionUID = 8744775314468998345L;

	/**
	 * 目标类型
	 */
	public enum TargetType	{
		INTEREST, ADDRESS, CROSS, AROUND
	}
	
	public enum EntryType {
		CROSS, STREET, POINT, CITY, MISC
	}
	
	/**
	 * 数据条目ID信息
	 * 改动int->string
	 */
	public String id;
	/**
	 * 数据条目Lon信息
	 */
	public double lon;
	/**
	 * 数据条目Lat信息
	 */
	public double lat;
	/**
	 * 数据条目名称，默认为NULL
	 */
	public String name = null;
	/**
	 * 数据条目地址，默认为NULL
	 */
	public String addr = null;
	/**
	 * 数据电话号码，默认为NULL
	 */
	public String tel = null;
	/**
	 * 数据条目的种类，默认为-1，表示未知种类
	 */
	public int genre = -1;
	/**
	 * 数据条目
	 */
	public String area = null;
//	public String first_road_name = null;
//	public String second_road_name = null;
	/**
	 * 数据条目的距离，默认为-1，表示距离未定义
	 */
	public double dist = -1;
	/**
	 * 数据条目的拼音，默认为NULL
	 */
	public String yomi = null;
	/**
	 * 是否为推荐搜索
	 */
	public boolean suggest;
	
	public TargetType type;
	public EntryType enType;
	public double score;
	
	public DBData(int id) {this.num = id;}
	public DBData(EntryType type)	{
		this.enType = type;
	}
	
	public TargetType getType()	{
		return type;
	}
	
	private String holderId;
	private String holderType;
	private ArrayList<String> mallId;
	private ArrayList<String> shopId;
	private String pic_url;
	private boolean hasCoupon;
	private boolean hasActivity;
	private String typeName;
	private double[] location;
	private ArrayList<String> zoneList;
	private ArrayList<String> categoryList;
	private ArrayList<String> tags;
	private String brandId;
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	private String rank;
	private String description;
	private String label;
	private String title;
	private String shop_nature;
	private String shop_type;
	private Date created_at;
	private Date start_time;
	private Date end_time;

	private String city;
	private String businessDistrict;
	private String mall;
	
	private String keyTag;
	
	private int num;//设置相同类型的数量
	
	//优惠新字段
	private String thumbnail; //缩略图
	private ArrayList<String> carouselImg; //轮播图片
	private String vistedNum; //访问次数
	
	private String appearance_pic;//商场APP外景图
	
	//团购新增
	private String userQuota; // 用户限购数量
	private String grouponPrice; // 团购价格
	private String grouponOriginal; // 团购原价
	private String grouponNum; // 团购数量
	private String buyedAmount; // 已购买数量
	private String restAmount; // 剩余数量
	private String useRestriction; // 使用限制
	private String useMode; // 使用方式
	private String grouponStyle; // 使用方式 暂时只有0.以后有了在往后加。没有的就是最普通的优惠
	
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public ArrayList<String> getCarouselImg() {
		return carouselImg;
	}
	public void setCarouselImg(ArrayList<String> carouselImg) {
		this.carouselImg = carouselImg;
	}
	public String getVistedNum() {
		return vistedNum;
	}
	public void setVistedNum(String vistedNum) {
		this.vistedNum = vistedNum;
	}
	public String getBuyedAmount() {
		return buyedAmount;
	}
	public void setBuyedAmount(String buyedAmount) {
		this.buyedAmount = buyedAmount;
	}
	public String getRestAmount() {
		return restAmount;
	}
	public void setRestAmount(String restAmount) {
		this.restAmount = restAmount;
	}
	public String getUseRestriction() {
		return useRestriction;
	}
	public void setUseRestriction(String useRestriction) {
		this.useRestriction = useRestriction;
	}
	public String getKeyTag() {
		return keyTag;
	}
	public void setKeyTag(String keyTag) {
		this.keyTag = keyTag;
	}
	public String getShop_type() {
		return shop_type;
	}
	public void setShop_type(String shop_type) {
		this.shop_type = shop_type;
	}
	
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBusinessDistrict() {
		return businessDistrict;
	}
	public void setBusinessDistrict(String businessDistrict) {
		this.businessDistrict = businessDistrict;
	}
	public String getMall() {
		return mall;
	}
	public void setMall(String mall) {
		this.mall = mall;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getShop_nature() {
		return shop_nature;
	}
	public void setShop_nature(String shop_nature) {
		this.shop_nature = shop_nature;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getHolderId() {
		return holderId;
	}

	public void setHolderId(String holderId) {
		this.holderId = holderId;
	}

	public String getHolderType() {
		return holderType;
	}

	public void setHolderType(String holderType) {
		this.holderType = holderType;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	

	public boolean isHasCoupon() {
		return hasCoupon;
	}
	public void setHasCoupon(boolean hasCoupon) {
		this.hasCoupon = hasCoupon;
	}
	public boolean isHasActivity() {
		return hasActivity;
	}
	public void setHasActivity(boolean hasActivity) {
		this.hasActivity = hasActivity;
	}
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public double[] getLocation() {
		return location;
	}

	public void setLocation(double[] lonlat) {
		this.location = lonlat;
	}

	public ArrayList<String> getZoneList() {
		return zoneList;
	}

	public void setZoneList(ArrayList<String> zoneList) {
		this.zoneList = zoneList;
	}

	public ArrayList<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList<String> categoryList) {
		this.categoryList = categoryList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ArrayList<String> getMallId() {
		return mallId;
	}
	public void setMallId(ArrayList<String> mallId) {
		this.mallId = mallId;
	}
	public ArrayList<String> getShopId() {
		return shopId;
	}
	public void setShopId(ArrayList<String> shopId) {
		this.shopId = shopId;
	}
	public String getAppearance_pic() {
		return appearance_pic;
	}
	public void setAppearance_pic(String appearance_pic) {
		this.appearance_pic = appearance_pic;
	}
	public String getGrouponStyle() {
		return grouponStyle;
	}
	public void setGrouponStyle(String grouponStyle) {
		this.grouponStyle = grouponStyle;
	}
	public String getUseMode() {
		return useMode;
	}
	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}
	public String getGrouponNum() {
		return grouponNum;
	}
	public void setGrouponNum(String grouponNum) {
		this.grouponNum = grouponNum;
	}
	public String getGrouponOriginal() {
		return grouponOriginal;
	}
	public void setGrouponOriginal(String grouponOriginal) {
		this.grouponOriginal = grouponOriginal;
	}
	public String getGrouponPrice() {
		return grouponPrice;
	}
	public void setGrouponPrice(String grouponPrice) {
		this.grouponPrice = grouponPrice;
	}
	public String getUserQuota() {
		return userQuota;
	}
	public void setUserQuota(String userQuota) {
		this.userQuota = userQuota;
	}
	private String cooperationShopId="-1";
	public String getCooperationShopId() {
		return cooperationShopId;
	}
	public void setCooperationShopId(String cooperationShopId) {
		this.cooperationShopId = cooperationShopId;
	}

	private int rmmmShopStatus=0;

	
	public int getRmmmShopStatus() {
		return rmmmShopStatus;
	}
	public void setRmmmShopStatus(int rmmmShopStatus) {
		this.rmmmShopStatus = rmmmShopStatus;
	}
}
