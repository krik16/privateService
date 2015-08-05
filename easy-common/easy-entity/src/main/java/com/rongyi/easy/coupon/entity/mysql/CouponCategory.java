package com.rongyi.easy.coupon.entity.mysql;

public class CouponCategory {
    private Integer id;

    /**
     * 卡券id
     */
    private Integer couponId;

    /**
     * 一级分类id
     */
    private String lv1Id;

    /**
     * 一级分类名称
     */
    private String lv1Name;

    /**
     * 二级分类id
     */
    private String lv2Id;

    /**
     * 二级分类名称
     */
    private String lv2Name;

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

    public String getLv1Id() {
        return lv1Id;
    }

    public void setLv1Id(String lv1Id) {
        this.lv1Id = lv1Id;
    }

    public String getLv1Name() {
        return lv1Name;
    }

    public void setLv1Name(String lv1Name) {
        this.lv1Name = lv1Name;
    }

    public String getLv2Id() {
        return lv2Id;
    }

    public void setLv2Id(String lv2Id) {
        this.lv2Id = lv2Id;
    }

    public String getLv2Name() {
        return lv2Name;
    }

    public void setLv2Name(String lv2Name) {
        this.lv2Name = lv2Name;
    }
}