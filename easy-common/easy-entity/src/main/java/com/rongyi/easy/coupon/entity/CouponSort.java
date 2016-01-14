package com.rongyi.easy.coupon.entity;

import java.io.Serializable;

public class CouponSort implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 卡券id
     */
    private String couponId;

    /**
     * 省id
     */
    private String provinceId;

    /**
     * 省名
     */
    private String provinceName;

    /**
     * 市id
     */
    private String cityId;

    /**
     * 市名
     */
    private String cityName;

    /**
     * 排序值 1~10 数字越小越靠前
     */
    private Integer sortIdx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponSort [id=").append(id).append(", couponId=").append(couponId).append(", provinceId=")
				.append(provinceId).append(", provinceName=").append(provinceName).append(", cityId=").append(cityId)
				.append(", cityName=").append(cityName).append(", sortIdx=").append(sortIdx).append("]");
		return builder.toString();
	}
    
}