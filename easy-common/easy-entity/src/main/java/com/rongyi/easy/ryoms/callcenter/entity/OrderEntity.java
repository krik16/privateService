package com.rongyi.easy.ryoms.callcenter.entity;

import java.io.Serializable;

/**
 * 客服工单实体
 * 
 * @author wangjianhua
 *
 */
public class OrderEntity implements Serializable {

	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", customerCode=" + customerCode + ", customerTel=" + customerTel
				+ ", orderSrc=" + orderSrc + ", orderSrcString=" + orderSrcString + ", orderType=" + orderType
				+ ", orderTypeString=" + orderTypeString + ", orderStatus=" + orderStatus + ", orderStatusString="
				+ orderStatusString + ", orderLevel=" + orderLevel + ", orderLevelString=" + orderLevelString
				+ ", title=" + title + ", content=" + content + ", moduleId=" + moduleId + ", moduleString="
				+ moduleString + ", createBy=" + createBy + ", createAt=" + createAt + ", updateBy=" + updateBy
				+ ", updateAt=" + updateAt + ", userId=" + userId + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5227301844456464871L;

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

	public String getOrderSrcString() {
		return orderSrcString;
	}

	public void setOrderSrcString(String orderSrcString) {
		this.orderSrcString = orderSrcString;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public String getOrderTypeString() {
		return orderTypeString;
	}

	public void setOrderTypeString(String orderTypeString) {
		this.orderTypeString = orderTypeString;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusString() {
		return orderStatusString;
	}

	public void setOrderStatusString(String orderStatusString) {
		this.orderStatusString = orderStatusString;
	}

	public int getOrderLevel() {
		return orderLevel;
	}

	public void setOrderLevel(int orderLevel) {
		this.orderLevel = orderLevel;
	}

	public String getOrderLevelString() {
		return orderLevelString;
	}

	public void setOrderLevelString(String orderLevelString) {
		this.orderLevelString = orderLevelString;
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

	public String getModuleString() {
		return moduleString;
	}

	public void setModuleString(String moduleString) {
		this.moduleString = moduleString;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	// 编号
	private int id = 0;
	// 客户账户
	private String customerCode = "";
	// 客户电话
	private String customerTel = "";

	// 工单来源
	private int orderSrc = 0;
	// 工单来源字符串
	private String orderSrcString = "";

	// 工单类型
	private int orderType = 0;
	// 工单类型字符串
	private String orderTypeString = "";

	// 工单状态
	private int orderStatus = 0;
	// 工单状态字符串
	private String orderStatusString = "";

	// 工单等级
	private int orderLevel = 0;
	// 工单等级字符串
	private String orderLevelString = "";

	// 标题
	private String title = "";

	// 标题
	private String content = "";

	// 板块
	private int moduleId = 0;
	// 板块 字符串
	private String moduleString = "";

	// 创建人
	private String createBy = "";
	// 创建时间
	private String createAt = "";
	// 更新人
	private String updateBy = "";

	// 更新时间
	private String updateAt = "";

	// 用户Id
	private int userId = 0;
}
