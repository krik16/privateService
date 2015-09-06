package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ActivitySearchInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5991538172808720465L;

	
	private String id;                 //id
	private String name;               //name
	private String addr;               //地址
	private String pic_url;            //品牌logo （优惠券需要么）
	private List<Double> location;     //坐标
	private String description;        //描述
	private String city_name;          //城市名
	private String shop_own;           //店铺所属名  
	private String title;              //标题
	private Date start_time;           //开始时间
	private Date end_time;             //结束时间
	private String holder_id;          //持有者id;
	private String holder_type;        //持有者类型 shop/mall/brand
	private String thumbnail;          //缩略图
	private List<String> carouselImg;   //详情图
	private String vistedNum;         //访问量
	private String userQuota;          //这是啥 这里你们加的，你问我？（一脸无辜）用户限购数量
	private String grouponPrice;       //现价
	private String grouponOriginal;    //原价
	private String grouponNum;         //优惠券数量
	private String buyedAmount;        //购买量
	private String restAmount;         //剩余量
	private String useRestriction;     //使用限制
	private String useMode;            //使用方式
	private String grouponStyle;       //这是啥 优惠券类型 0是优惠券，不传就是普通优惠
	private Integer limitPublishCount;  //貌似不要
	private Integer limitUseCount;      //貌似不要
	private Integer limitCount;         //貌似不要
	private List<Integer> afterSaleService;//貌似不要
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getShop_own() {
		return shop_own;
	}
	public void setShop_own(String shop_own) {
		this.shop_own = shop_own;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getHolder_id() {
		return holder_id;
	}
	public void setHolder_id(String holder_id) {
		this.holder_id = holder_id;
	}
	public String getHolder_type() {
		return holder_type;
	}
	public void setHolder_type(String holder_type) {
		this.holder_type = holder_type;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public List<String> getCarouselImg() {
		return carouselImg;
	}
	public void setCarouselImg(List<String> carouselImg) {
		this.carouselImg = carouselImg;
	}
	public String getVistedNum() {
		return vistedNum;
	}
	public void setVistedNum(String vistedNum) {
		this.vistedNum = vistedNum;
	}
	public String getUserQuota() {
		return userQuota;
	}
	public void setUserQuota(String userQuota) {
		this.userQuota = userQuota;
	}
	public String getGrouponPrice() {
		return grouponPrice;
	}
	public void setGrouponPrice(String grouponPrice) {
		this.grouponPrice = grouponPrice;
	}
	public String getGrouponOriginal() {
		return grouponOriginal;
	}
	public void setGrouponOriginal(String grouponOriginal) {
		this.grouponOriginal = grouponOriginal;
	}
	public String getGrouponNum() {
		return grouponNum;
	}
	public void setGrouponNum(String grouponNum) {
		this.grouponNum = grouponNum;
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
	public String getUseMode() {
		return useMode;
	}
	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}
	public String getGrouponStyle() {
		return grouponStyle;
	}
	public void setGrouponStyle(String grouponStyle) {
		this.grouponStyle = grouponStyle;
	}
	public Integer getLimitPublishCount() {
		return limitPublishCount;
	}
	public void setLimitPublishCount(Integer limitPublishCount) {
		this.limitPublishCount = limitPublishCount;
	}
	public Integer getLimitUseCount() {
		return limitUseCount;
	}
	public void setLimitUseCount(Integer limitUseCount) {
		this.limitUseCount = limitUseCount;
	}
	public Integer getLimitCount() {
		return limitCount;
	}
	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}
	public List<Integer> getAfterSaleService() {
		return afterSaleService;
	}
	public void setAfterSaleService(List<Integer> afterSaleService) {
		this.afterSaleService = afterSaleService;
	}

}
