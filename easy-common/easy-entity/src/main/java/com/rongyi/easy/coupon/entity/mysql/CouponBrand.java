package com.rongyi.easy.coupon.entity.mysql;

import java.io.Serializable;

public class CouponBrand implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 卡券id
     */
    private Integer couponId;

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

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
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

    public CouponBrand(Integer couponId, String brandId, String brandCname) {
        this.couponId = couponId;
        this.brandId = brandId;
        this.brandCname = brandCname;
    }

    public CouponBrand(Integer couponId, String brandId, String brandCname, String brandEname) {

        this.couponId = couponId;
        this.brandId = brandId;
        this.brandCname = brandCname;
        this.brandEname = brandEname;
    }

    public CouponBrand(Integer couponId, String brandId) {

        this.couponId = couponId;
        this.brandId = brandId;
    }

    public CouponBrand() {

    }
}
