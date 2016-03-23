/**
 * @Title: CouponParam.java
 * @Package com.rongyi.easy.coupon.param
 * @Description: RMMM创建优惠券传入参数的封装
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年4月23日 上午10:57:02
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.easy.coupon.param; 
import java.io.Serializable;
import java.util.List;

/**
 * @author zzq
 *
 */
public class RmmmActiveCouponParam implements Serializable {
	private static final long serialVersionUID = 1L;
	
 	private String jsessionid;
	/**
	 * 卡券id
	 */
	private String goodsId;
	/**
	 * 活动id列表
	 */
	private List activityIds;
	/**
	 * 活动
	 */
	private Integer activityId;
	/**
	 * 店铺
	 */
	private String shopId;
	/**
	 * 券名称
	 */
	private String title; 
	/**
	 * 总量
	 */
	private Integer stockCount; 
	/**
	 * 原价
	 */
	private String orgPrice;

	/**
	 * 现价
	 */
	private String activityPrice;

	/**
	 * 发布开始时间 格式："yyyy-MM-dd";
	 */
	private String publishStartDate;

	/**
	 * 发布结束时间 格式："yyyy-MM-dd";
	 */
	private String publishEndDate;

	/**
	 * 有效期开始时间 格式："yyyy-MM-dd";
	 */
	private String validBeginDate;

	/**
	 * 有效期结束时间 格式："yyyy-MM-dd";
	 */
	private String validEndDate;

	/**
	 * 使用限制
	 */
	private String limitRemark;
 	/**
	 * 使用说明
	 */
	private String description;
 	/**
	 * 详情图url列表(0-4)张
	 */
	private List<String> imageList; 
	private int currentPage;
	private int pageSize;
	private Integer identity;//身份类型:0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购，6买手
	private int number;
	private String status;
	private String reason;
	private String statusDes;
	private String activityGoodsId;
	public String getActivityGoodsId() {
		return activityGoodsId;
	}

	public void setActivityGoodsId(String activityGoodsId) {
		this.activityGoodsId = activityGoodsId;
	}

	public String getStatusDes() {
		return statusDes;
	}

	public void setStatusDes(String statusDes) {
		this.statusDes = statusDes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public List getActivityIds() {
		return activityIds;
	}

	public void setActivityIds(List activityIds) {
		this.activityIds = activityIds;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	} 
	/**
	 * 创建人
	 */
	private String createUser;
	public String getJsessionid() {
		return jsessionid;
	}

	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStockCount() {
		return stockCount;
	}

	public void setStockCount(Integer stockCount) {
		this.stockCount = stockCount;
	}

	public String getOrgPrice() {
		return orgPrice;
	}

	public void setOrgPrice(String orgPrice) {
		this.orgPrice = orgPrice;
	}

	public String getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}

	public String getPublishStartDate() {
		return publishStartDate;
	}

	public void setPublishStartDate(String publishStartDate) {
		this.publishStartDate = publishStartDate;
	}

	public String getPublishEndDate() {
		return publishEndDate;
	}

	public void setPublishEndDate(String publishEndDate) {
		this.publishEndDate = publishEndDate;
	}

	public String getValidBeginDate() {
		return validBeginDate;
	}

	public void setValidBeginDate(String validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

	public String getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}

	public String getLimitRemark() {
		return limitRemark;
	}

	public void setLimitRemark(String limitRemark) {
		this.limitRemark = limitRemark;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getImageList() {
		return imageList;
	}

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	@Override
	public String toString() {
		return "RmmmActiveCouponParam [jsessionid=" + jsessionid + ", goodsId="
				+ goodsId + ", activityIds=" + activityIds + ", activityId="
				+ activityId + ", shopId=" + shopId + ", title=" + title
				+ ", stockCount=" + stockCount + ", orgPrice=" + orgPrice
				+ ", activityPrice=" + activityPrice + ", publishStartDate="
				+ publishStartDate + ", publishEndDate=" + publishEndDate
				+ ", validBeginDate=" + validBeginDate + ", validEndDate="
				+ validEndDate + ", limitRemark=" + limitRemark
				+ ", description=" + description + ", imageList=" + imageList
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize
				+ ", identity=" + identity + ", number=" + number + ", status="
				+ status + ", reason=" + reason + ", statusDes=" + statusDes
				+ ", activityGoodsId=" + activityGoodsId + ", createUser="
				+ createUser + "]";
	}
 
 
 
}
