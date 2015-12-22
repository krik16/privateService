package com.rongyi.easy.coupon.vo.operation;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.coupon.entity.CouponRejectRecord;

public class VoucherCouponVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	/**
	 * 代金券名称
	 */
	private String name;

	/**
	 * 卡券类型:代金券[0], 抵扣券[1], 红包[2]
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
	private Integer origPrice;

	/**
	 * 现价
	 */
	private Integer currPrice;

	/**
	 * 关联类型 代金券：集团[0],品牌[1], 商场 [2],店铺[3]; 红包 ：全场[0],商品[1]
	 */
	private Integer relatedType;

	/**
	 * 状态: 待审核[0], 审核未通过[1], 审核通过[2]
	 */
	private Integer status;

	/**
	 * 发布状态：待发布[0] 进行中[1] 已结束[2] 已下架[3]
	 * 
	 */
	private Integer publishStatus;

	/**
	 * 置顶状态：未置顶[0] 已置顶[1]
	 */
	private Integer stickStatus;

	/**
	 * 是否是第三方券 否[false], 是[true], 默认不是第三方券fasle
	 */
	private Boolean isThird;

	/**
	 * 一级分类name
	 */
	private String lv1Name;

	/**
	 * 一级分类name
	 */
	private String lv2Name;

	/**
	 * 拒绝原因
	 */
	private List<CouponRejectRecord> rejectRecordList;

	/**
	 * 排序id
	 */
	private Integer couponSortId;

	/**
	 * 省id
	 */
	private String provinceId;

	/**
	 * 省名
	 */
	private String provinceName;

	/**
	 * 城市id
	 */
	private String cityId;

	/**
	 * 城市名
	 */
	private String cityName;

	/**
	 * 排序值
	 */
	private Integer sortIdx;

	/**
	 * 展示区域
	 */
	private String displayRegion;
	
	/** 卡券发布渠道：大运营平台[0], 商家管理后台[1] */
	private Integer publishChannel;
	

	public Integer getPublishChannel() {
		return publishChannel;
	}

	public void setPublishChannel(Integer publishChannel) {
		this.publishChannel = publishChannel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Integer getOrigPrice() {
		return origPrice;
	}

	public void setOrigPrice(Integer origPrice) {
		this.origPrice = origPrice;
	}

	public Integer getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(Integer currPrice) {
		this.currPrice = currPrice;
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

	public Integer getStickStatus() {
		return stickStatus;
	}

	public void setStickStatus(Integer stickStatus) {
		this.stickStatus = stickStatus;
	}

	public Boolean getIsThird() {
		return isThird;
	}

	public void setIsThird(Boolean isThird) {
		this.isThird = isThird;
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

	public List<CouponRejectRecord> getRejectRecordList() {
		return rejectRecordList;
	}

	public void setRejectRecordList(List<CouponRejectRecord> rejectRecordList) {
		this.rejectRecordList = rejectRecordList;
	}

	public Integer getCouponSortId() {
		return couponSortId;
	}

	public void setCouponSortId(Integer couponSortId) {
		this.couponSortId = couponSortId;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getSortIdx() {
		return sortIdx;
	}

	public void setSortIdx(Integer sortIdx) {
		this.sortIdx = sortIdx;
	}

	public String getDisplayRegion() {
		return displayRegion;
	}

	public void setDisplayRegion(String displayRegion) {
		this.displayRegion = displayRegion;
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
				.append(publishStatus).append(", stickStatus=")
				.append(stickStatus).append(", isThird=").append(isThird)
				.append(", lv1Name=").append(lv1Name).append(", lv2Name=")
				.append(lv2Name).append(", rejectRecordList=")
				.append(rejectRecordList).append(", couponSortId=")
				.append(couponSortId).append(", provinceId=")
				.append(provinceId).append(", provinceName=")
				.append(provinceName).append(", cityId=").append(cityId)
				.append(", cityName=").append(cityName).append(", sortIdx=")
				.append(sortIdx).append(", displayRegion=")
				.append(displayRegion).append("]");
		return builder.toString();
	}
}
