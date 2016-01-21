package com.rongyi.easy.ryoms.callcenter.param;

import java.io.Serializable;

/**
 * 客服工单新增/修改 参数
 * 
 * @author wangjianhua
 *
 */
public class OrderSaveParam implements Serializable {

	@Override
	public String toString() {
		return "OrderSaveParam [id=" + id + ", customerCode=" + customerCode + ", customerTel=" + customerTel
				+ ", orderSrc=" + orderSrc + ", orderType=" + orderType + ", orderStatus=" + orderStatus
				+ ", orderLevel=" + orderLevel + ", title=" + title + ", moduleId=" + moduleId + ", content=" + content
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getOrderSrc() {
		return orderSrc;
	}
	public void setOrderSrc(String orderSrc) {
		this.orderSrc = orderSrc;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderLevel() {
		return orderLevel;
	}
	public void setOrderLevel(String orderLevel) {
		this.orderLevel = orderLevel;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 5318884313259020240L;

	// 编号
	private String id = "";

	// 客户账户
	private String customerCode = "";

	// 客户电话
	private String customerTel = "";

	// 工单来源
	private String orderSrc = "";

	// 工单类型
	private String orderType = "";

	// 工单状态
	private String orderStatus = "";

	// 工单等级
	private String orderLevel = "";

	// 标题
	private String title = "";

	// 板块
	private String moduleId = "";

	// 内容
	private String content = "";
}
