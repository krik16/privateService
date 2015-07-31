package com.rongyi.easy.coupon.param.operation;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class VoucherCouponParam implements Serializable{

//	private static final long serialVersionUID = 1L;

	private Integer id;

	/**
	 * 代金券名称
	 */
	private String name;

	/**
     * 关联类型
     * 代金券：集团[0], 品牌[1], 商场 [2], 店铺[3]
     * 红包 ：全场[0], 商品[1]
     */
    private Integer relatedType;

	/**
	 * 对应的类型id
	 */
	private String relatedTypeId;
	/**
	 * 审核状态 :待审核[0] 未通过 [1] 已通过[2]
	 */
	private Integer checkStatus;
	/**
	 * 发布状态：待发布[0] 进行中[1] 已结束[2] 已下架[3]
	 */
	private Integer publishStatus;
	/**
	 * 一级分类id
	 */
	private String firstCategoryId;

	/**
	 * 二级分类id
	 */
	private String secendCategoryId;

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
	private Integer dateType;

	/**
	 * 时间范围的开始和结束时间
	 */
	private Date startDate;

	private Date endDate;

	/**
     * 卡券发布渠道：大运营平台[0], 商家管理后台[1]
     */
    private Integer sourceTarget;

    /**
     * 卡券类型:抵扣券[1], 代金券[2], 红包[3]
     */
    private Integer couponType;

	private Integer currentPage;

	private Integer pageSize;

	private Integer offset;

	/**
	 * 排序字段
	 */
	private String orderByClause;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getRelatedType() {
		return relatedType;
	}
	public void setRelatedType(Integer relatedType) {
		this.relatedType = relatedType;
	}

	public String getRelatedTypeId() {
		return relatedTypeId;
	}
	public void setRelatedTypeId(String relatedTypeId) {
		this.relatedTypeId = relatedTypeId;
	}
	public Integer getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}
	public String getFirstCategoryId() {
		return firstCategoryId;
	}
	public void setFirstCategoryId(String firstCategoryId) {
		this.firstCategoryId = firstCategoryId;
	}
	public String getSecendCategoryId() {
		return secendCategoryId;
	}
	public void setSecendCategoryId(String secendCategoryId) {
		this.secendCategoryId = secendCategoryId;
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
	public Integer getDateType() {
		return dateType;
	}
	public void setDateType(Integer dateType) {
		this.dateType = dateType;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getSourceTarget() {
		return sourceTarget;
	}
	public void setSourceTarget(Integer sourceTarget) {
		this.sourceTarget = sourceTarget;
	}

	public Integer getCouponType() {
		return couponType;
	}
	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
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
	public Integer getOffset() {
		this.offset = pageSize * (currentPage - 1);
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public String getOrderByClause() {
		return orderByClause;
	}
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

}
