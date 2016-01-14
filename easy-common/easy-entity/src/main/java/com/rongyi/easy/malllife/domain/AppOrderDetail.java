package com.rongyi.easy.malllife.domain;


import com.rongyi.easy.malllife.vo.GroupVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AppOrderDetail implements Serializable {
	private Integer id;

	private Integer orderInfoId;

	private String orderId;

	private String activityId;

	private Integer itemId;

	private String itemName; // 商品名称，团购中对应团购名称 title 字段

	private BigDecimal unitPrice; // 单价

	private Integer unitNum; // 下单数量

	private Double orderPrice; // 下单总价

	private Integer realNum; // 实售数量

	private Double realPrice; // 实售总价

	private Integer refundStatus; // 0:未退款; 1:退款处理中; 2:无法退款

	private String updateBy;

	private Date updateTime;

	private Date saleStart;// 销售时间开始
	
	private Date saleEnd;// 销售时间结束
	
	private Date startTime;// 使用开始日期
	
	private Date endTime;// 使用截止日期
	
	private String buyerId; //购买者id 

	private String thumbnail;
	
    private String buyerMobile; //买家电话
    
    private GroupVO groupVO;

    private boolean hasBuyed;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderInfoId() {
		return orderInfoId;
	}

	public void setOrderInfoId(Integer orderInfoId) {
		this.orderInfoId = orderInfoId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId == null ? null : activityId.trim();
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName == null ? null : itemName.trim();
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(Integer unitNum) {
		this.unitNum = unitNum;
	}

	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getRealNum() {
		return realNum;
	}

	public void setRealNum(Integer realNum) {
		this.realNum = realNum;
	}

	public Double getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(Double realPrice) {
		this.realPrice = realPrice;
	}

	public Integer getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Date getSaleStart() {
		return saleStart;
	}

	public void setSaleStart(Date saleStart) {
		this.saleStart = saleStart;
	}

	public Date getSaleEnd() {
		return saleEnd;
	}

	public void setSaleEnd(Date saleEnd) {
		this.saleEnd = saleEnd;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerMobile() {
		return buyerMobile;
	}

	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile;
	}

	public GroupVO getGroupVO() {
		return groupVO;
	}

	public void setGroupVO(GroupVO groupVO) {
		this.groupVO = groupVO;
	}

	public boolean isHasBuyed() {
		return hasBuyed;
	}

	public void setHasBuyed(boolean hasBuyed) {
		this.hasBuyed = hasBuyed;
	}
	
}