package com.rongyi.easy.coupon.entity;

import java.io.Serializable;

public class CouponCategory implements Serializable{
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponCategory [id=").append(id).append(", couponId=").append(couponId).append(", lv1Id=")
				.append(lv1Id).append(", lv1Name=").append(lv1Name).append(", lv2Id=").append(lv2Id)
				.append(", lv2Name=").append(lv2Name).append("]");
		return builder.toString();
	}
    
}