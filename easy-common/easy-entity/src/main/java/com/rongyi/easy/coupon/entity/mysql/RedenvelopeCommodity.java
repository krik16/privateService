package com.rongyi.easy.coupon.entity.mysql;

import java.io.Serializable;
/**
 * @see 红包与商品的关联表
 * @author lijing 
 * @since 2015-08-10 
 * 
 */
public class RedenvelopeCommodity implements Serializable{
	
    /**
	 * 序列化号
	 */
	private static final long serialVersionUID = 1L;
	/**主键ID*/
	private Integer id;
	/**红包Id*/
    private Integer couponId;
    /**商品Id*/
    private String commodityId;
    /**商品名称*/
    private String commodityName;
    /**商品编码*/
    private String commodityCode;
    /**商场名称*/
    private String mallName;
    /**店铺名称*/
    private String shopName;
    /**商场ID*/
    private String mallId;
    /**店铺ID*/
    private String shopId;
    /**商品图片用；隔开*/
    private String pics;
    /**商品状态 1上架   0下架*/
    private Integer status;

    public RedenvelopeCommodity(){
    	
    }
    
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

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}