package com.rongyi.easy.ryoms.callcenter.param;

import java.io.Serializable;

/**
 * 客服工单实体（请求参数）
 * 
 * @author wangjianhua
 *
 */
public class OrderParam implements Serializable {

	@Override
	public String toString() {
		return "OrderParam [id=" + id + ", customerCode=" + customerCode + ", orderSrc=" + orderSrc + ", orderType="
				+ orderType + ", orderStatus=" + orderStatus + ", orderLevel=" + orderLevel + ", title=" + title
				+ ", userName=" + userName + ", userTag=" + userTag + ", startDate=" + startDate + ", endDate="
				+ endDate + ", startIndex=" + startIndex + ", pageSize=" + pageSize + "]";
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserTag() {
		return userTag;
	}

	public void setUserTag(int userTag) {
		this.userTag = userTag;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6317758135338708592L;

	// 编号
	private int id = 0;
	// 客户账户
	private String customerCode = "";

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

	// 用户名
	private String userName = "";
	// 用户类型（标签，创建人/更新人）
	private int userTag = 0;
	// 开始日期
	private String startDate = "";
	// 结束日期
	private String endDate = "";

	// 开始的序号
	private int startIndex = 0;

	// 每页数
	private int pageSize = 0;
}
