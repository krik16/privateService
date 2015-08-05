package com.rongyi.easy.coupon.entity.mysql;

public class CouponBrand {
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
}
