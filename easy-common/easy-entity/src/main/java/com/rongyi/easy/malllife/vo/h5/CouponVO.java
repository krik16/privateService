package com.rongyi.easy.malllife.vo.h5;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * 商铺分享详情页返回代金券VO信息
 * @author user
 *
 */
public class CouponVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String couponId;//代金券id
	private String couponName;//代金券名称
	private String thumbnail; //缩略图
	private List<String> couponPicList; //代金券图片
	private List<Double> location; //坐标
	private String description; //描述
//	private String shopOwn; //店铺所属名
	private String startTime; //开始时间
	private String endTime; //结束时间
	private String holderName;//店铺/商场/品牌名称
	private String holder_id; //持有者id;
	private String holder_type; //持有者类型 Shop/Mall/Brand
	private String grouponPrice; //现价
	private String grouponOriginal; //原价
	private String distance;//距离
	private Integer limitCount; //每人限购数
	private String buyedAmount; //已售数量
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public List<String> getCouponPicList() {
		return couponPicList;
	}
	public void setCouponPicList(List<String> couponPicList) {
		this.couponPicList = couponPicList;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public Integer getLimitCount() {
		return limitCount;
	}
	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}
	public String getBuyedAmount() {
		return buyedAmount;
	}
	public void setBuyedAmount(String buyedAmount) {
		this.buyedAmount = buyedAmount;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
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
	@Override
	public String toString() {
		return "CouponVO [couponId=" + couponId + ", couponName=" + couponName
				+ ", thumbnail=" + thumbnail + ", couponPicList="
				+ couponPicList + ", location=" + location + ", description="
				+ description + ", startTime=" + startTime + ", endTime="
				+ endTime + ", holderName=" + holderName + ", holder_id="
				+ holder_id + ", holder_type=" + holder_type
				+ ", grouponPrice=" + grouponPrice + ", grouponOriginal="
				+ grouponOriginal + ", distance=" + distance + ", limitCount="
				+ limitCount + ", buyedAmount=" + buyedAmount + "]";
	}
	
}
