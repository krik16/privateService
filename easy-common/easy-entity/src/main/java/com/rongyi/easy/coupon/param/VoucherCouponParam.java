package com.rongyi.easy.coupon.param;

import java.io.Serializable;

@SuppressWarnings("serial")
public class VoucherCouponParam implements Serializable{

//	private static final long serialVersionUID = 1L;

	private String id;

	/**
	 * 代金券名称
	 */
	private String title;
	/**
     * 关联类型
     * 代金券：集团[0],品牌[1], 商场 [2],店铺[3]
     *
     */
	private String type;

	/**
	 * 对应的类型id
	 */
	private String typeId;
	/**
	 * 审核状态 :待审核[0] 未通过 [1] 已通过[2]
	 */
	private String checkStatus;
	/**
	 * 发布状态：待发布[0] 进行中[1] 已结束[2] 已下架[3]
	 */
	private String status;
	/**
	 * 一级分类id
	 */
	private String firstId;

	/**
	 * 二级分类id
	 */
	private String secondId;

	/**
	 * 导入渠道
	 */
	private String inChannel;

	/**
	 * 导出渠道
	 */
	private String outChannel;

	/**
	 * 时间类型：发布开始时间[0] 发布结束时间[1] 有效期开始时间[2] 有效期结束时间[3]
	 */
	private String dateType;

	/**
	 * 时间范围的开始和结束时间
	 */
	private String startDate;

	private String endDate;

	private Integer currentPage;

	private Integer pageSize;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFirstId() {
		return firstId;
	}
	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}
	public String getSecondId() {
		return secondId;
	}
	public void setSecondId(String secondId) {
		this.secondId = secondId;
	}
	public String getInChannel() {
		return inChannel;
	}
	public void setInChannel(String inChannel) {
		this.inChannel = inChannel;
	}
	public String getOutChannel() {
		return outChannel;
	}
	public void setOutChannel(String outChannel) {
		this.outChannel = outChannel;
	}
	public String getDateType() {
		return dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
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
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
