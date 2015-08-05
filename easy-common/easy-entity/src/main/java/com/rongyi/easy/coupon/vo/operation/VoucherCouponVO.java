package com.rongyi.easy.coupon.vo.operation;

import java.io.Serializable;

public class VoucherCouponVO implements Serializable {


	private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 代金券名称
     */
    private String name;

    /**
     * 卡券类型:抵扣券[rebate], 代金券[voucher], 红包[redenvelope]
     */
    private String couponType;

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
    private Double origPrice;

    /**
     * 现价
     */
    private Double currPrice;

    /**
     * 关联类型
     * 代金券：集团[group],品牌[brand], 商场 [mall],店铺[shop];
     * 红包 ：全场[all_court],商品[commodity]
     */
    private String relatedType;

    /**
     * 状态: 待审核[uncheck], 审核未通过[unpass], 审核通过[pass]
     */
    private String status;

    /**
	 * 发布状态：待发布[unpublish] 进行中[proceeing] 已结束[ended] 已下架[off]
	 *
	 */
	private String publishStatus;

	 /**
     * 是否是第三方券 否[false], 是[true], 默认不是第三方券fasle
     */
    private Boolean is3rd;

    /**
     * 一级分类name
     */
    private String lv1Name;

    /**
     * 一级分类name
     */
    private String lv2Name;

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

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
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

	public Double getOrigPrice() {
		return origPrice;
	}

	public void setOrigPrice(Double origPrice) {
		this.origPrice = origPrice;
	}

	public Double getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(Double currPrice) {
		this.currPrice = currPrice;
	}

	public String getRelatedType() {
		return relatedType;
	}

	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}

	public Boolean getIs3rd() {
		return is3rd;
	}

	public void setIs3rd(Boolean is3rd) {
		this.is3rd = is3rd;
	}

	public String getLv1Name() {
		return lv1Name;
	}

	public void setLv1Name(String lv1Name) {
		this.lv1Name = lv1Name;
	}

	public String getLv2Name() {
		return lv2Name;
	}

	public void setLv2Name(String lv2Name) {
		this.lv2Name = lv2Name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VoucherCouponVO [id=").append(id).append(", name=")
				.append(name).append(", couponType=").append(couponType)
				.append(", totalCount=").append(totalCount)
				.append(", stockCount=").append(stockCount)
				.append(", origPrice=").append(origPrice)
				.append(", currPrice=").append(currPrice)
				.append(", relatedType=").append(relatedType)
				.append(", status=").append(status).append(", publishStatus=")
				.append(publishStatus).append(", is3rd=").append(is3rd)
				.append(", lv1Name=").append(lv1Name).append(", lv2Name=")
				.append(lv2Name).append("]");
		return builder.toString();
	}

}
