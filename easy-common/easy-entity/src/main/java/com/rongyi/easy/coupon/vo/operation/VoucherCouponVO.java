package com.rongyi.easy.coupon.vo.operation;

public class VoucherCouponVO {

    private Integer id;

    /**
     * 代金券名称
     */
    private String name;

    /**
     * 卡券类型:抵扣券[1], 代金券[2], 红包[3]
     */
    private Integer couponType;

    /**
     * 券码发行量
     */
    private Integer totalCount;

    /**
     * 库存量
     */
    private Integer stockCount;

    /**
     * 原价
     */
    private Double originalPrice;

    /**
     * 现价
     */
    private Double currentPrice;

    /**
     * 关联类型
     * 代金券：集团[0], 品牌[1], 商场 [2], 店铺[3]
     */
    private Integer relatedType;

    /**
     * 状态: 待审核[0], 审核未通过[1], 审核通过[2]
     */
    private Integer status;

    /**
     * 发布状态：待发布[0] 进行中[1] 已结束[2] 已下架[3]
     */
    private Integer publishStatus;

    /**
     * 一级分类名称
     */
    private String firstCategoryName;

    /**
     * 二级分类名称
     */
    private String secendCategoryName;

    /**
     * 是否是第三方券 否[false], 是[true], 默认不是第三方券
     */
    private Boolean outStatus;

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

	public Integer getCouponType() {
		return couponType;
	}

	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getStockCount() {
		return stockCount;
	}

	public void setStockCount(Integer stockCount) {
		this.stockCount = stockCount;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Integer getRelatedType() {
		return relatedType;
	}

	public void setRelatedType(Integer relatedType) {
		this.relatedType = relatedType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}

	public String getFirstCategoryName() {
		return firstCategoryName;
	}

	public void setFirstCategoryName(String firstCategoryName) {
		this.firstCategoryName = firstCategoryName;
	}

	public String getSecendCategoryName() {
		return secendCategoryName;
	}

	public void setSecendCategoryName(String secendCategoryName) {
		this.secendCategoryName = secendCategoryName;
	}

	public Boolean getOutStatus() {
		return outStatus;
	}

	public void setOutStatus(Boolean outStatus) {
		this.outStatus = outStatus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VoucherCouponVO [id=").append(id).append(", name=")
				.append(name).append(", couponType=").append(couponType)
				.append(", totalCount=").append(totalCount)
				.append(", stockCount=").append(stockCount)
				.append(", originalPrice=").append(originalPrice)
				.append(", currentPrice=").append(currentPrice)
				.append(", relatedType=").append(relatedType)
				.append(", status=").append(status).append(", publishStatus=")
				.append(publishStatus).append(", firstCategoryName=")
				.append(firstCategoryName).append(", secendCategoryName=")
				.append(secendCategoryName).append(", outStatus=")
				.append(outStatus).append("]");
		return builder.toString();
	}

}
