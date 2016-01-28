package com.rongyi.easy.ryoms.callcenter.param;

import java.io.Serializable;

/**
 * 客服工单查询参数
 * 
 * @author wangjianhua
 *
 */
public class OrderSearchParam implements Serializable {
	/** 
	* @Title: toString 
	* @Description: toString重写
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年1月25日 下午5:42:05
	* @throws 
	*/
	@Override
	public String toString() {
		return "OrderSearchParam [id=" + id + ", customerCode=" + customerCode + ", orderSrc=" + orderSrc
				+ ", orderType=" + orderType + ", orderStatus=" + orderStatus + ", orderLevel=" + orderLevel
				+ ", title=" + title + ", userName=" + userName + ", userTag=" + userTag + ", dateTag=" + dateTag
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", pageSize=" + pageSize + ", currentPage="
				+ currentPage + ", startIndex=" + startIndex + ", userId=" + userId + ", customerTel=" + customerTel
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userTag
	 */
	public String getUserTag() {
		return userTag;
	}

	/**
	 * @param userTag the userTag to set
	 */
	public void setUserTag(String userTag) {
		this.userTag = userTag;
	}

	/**
	 * @return the dateTag
	 */
	public String getDateTag() {
		return dateTag;
	}

	/**
	 * @param dateTag the dateTag to set
	 */
	public void setDateTag(String dateTag) {
		this.dateTag = dateTag;
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

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the customerTel
	 */
	public String getCustomerTel() {
		return customerTel;
	}

	/**
	 * @param customerTel the customerTel to set
	 */
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6317758135338708592L;

	// 编号
	private String id = "";

	// 客户账户
	private String customerCode = "";

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

	// 用户名
	private String userName = "";

	// 用户类型（标签，创建人/更新人）
	private String userTag = "";
	
	private String dateTag ="";

	// 开始日期
	private String startDate = "";

	// 结束日期
	private String endDate = "";

	// 每页数
	private int pageSize = 0;

	// 页数
	private int currentPage = 0;

	// 开始数
	private int startIndex = 0;

	private int userId = 0;
	
	//手机号码
	private String customerTel;
	
}
