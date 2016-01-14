package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Objects;

public class CouponBrand implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 卡券id
     */
    private String couponId;

    /**
     * 品牌id
     */
    private String brandId;

    /**
     * 品牌中文名
     */
    private String brandCname;

    /**
     * 品牌英文名
     */
    private String brandEname;

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

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandCname() {
        return brandCname;
    }

    public void setBrandCname(String brandCname) {
        this.brandCname = brandCname;
    }

    public String getBrandEname() {
        return brandEname;
    }

    public void setBrandEname(String brandEname) {
        this.brandEname = brandEname;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponBrand [id=").append(id).append(", couponId=").append(couponId).append(", brandId=")
				.append(brandId).append(", brandCname=").append(brandCname).append(", brandEname=").append(brandEname)
				.append("]");
		return builder.toString();
	}


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CouponBrand that = (CouponBrand) o;
        return Objects.equals(couponId, that.couponId) &&
            Objects.equals(brandId, that.brandId) &&
            Objects.equals(brandCname, that.brandCname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, brandId, brandCname);
    }

    public CouponBrand(String couponId, String brandId, String brandCname) {
        this.couponId = couponId;
        this.brandId = brandId;
        this.brandCname = brandCname;
    }

    public CouponBrand(String couponId, String brandId, String brandCname, String brandEname) {

        this.couponId = couponId;
        this.brandId = brandId;
        this.brandCname = brandCname;
        this.brandEname = brandEname;
    }

    public CouponBrand(String couponId, String brandId) {
        this.couponId = couponId;
        this.brandId = brandId;
    }

    public CouponBrand() {

    }

}
