package com.rongyi.easy.ryoms.callcenter.entity;

import java.io.Serializable;

/**
 * 客服工单实体（对应DB）
 * 
 * @author wangjianhua
 *
 */
public class OrderEntity implements Serializable {

	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", customerCode=" + customerCode + ", customerTel=" + customerTel
				+ ", orderSrc=" + orderSrc + ", orderType=" + orderType + ", orderStatus=" + orderStatus
				+ ", orderLevel=" + orderLevel + ", title=" + title + ", moduleId=" + moduleId + ", userId=" + userId
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerTel() {
		return customerTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	public int getOrderSrc() {
		return orderSrc;
	}

	public void setOrderSrc(int orderSrc) {
		this.orderSrc = orderSrc;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderLevel() {
		return orderLevel;
	}

	public void setOrderLevel(int orderLevel) {
		this.orderLevel = orderLevel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5227301844456464871L;

	// 编号
	private int id = 0;
	
	// 客户账户
	private String customerCode = "";
	
	// 客户电话
	private String customerTel = "";

	// 工单来源
	private int orderSrc = 0;

	// 工单类型
	private int orderType = 0;

	// 工单状态
	private int orderStatus = 0;

	// 工单等级
	private int orderLevel = 0;

	// 标题
	private String title = "";

	// 内容
	private String content = "";

	// 板块
	private int moduleId = 0;

	// 用户Id
	private int userId = 0;
}
