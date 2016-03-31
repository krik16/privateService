package com.rongyi.easy.coupon.entity;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * 红包与商品的关联表
 *
 * @author lijing
 * @since 2015-08-10
 */
public class CouponCommodity implements Serializable {

    /**
     * 序列化号
     */
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 红包Id
     */
    private String couponId;
    /**
     * 商品Id
     */
    private String commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品编码
     */
    private String commodityCode;
    /**
     * 商场名称
     */
    private String mallName;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 商场ID
     */
    private String mallId;
    /**
     * 店铺ID
     */
    private String shopId;
    /**
     * 商品图片用；隔开
     */
    private String pics;
    /**
     * 商品状态 1上架   0下架
     */
    private Integer status;

    public CouponCommodity() {

    }

    public CouponCommodity(Integer id, String couponId, String commodityId, String commodityName, String commodityCode, String mallName, String shopName, String mallId, String shopId, String pics, Integer status) {
        this.id = id;
        this.couponId = couponId;
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityCode = commodityCode;
        this.mallName = mallName;
        this.shopName = shopName;
        this.mallId = mallId;
        this.shopId = shopId;
        this.pics = pics;
        this.status = status;
    }

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

    public List<String> getPics2List() {
        List<String> list = ListUtils.EMPTY_LIST;
        if (StringUtils.isNotBlank(pics)) {
            list = Arrays.asList(pics.split(";"));
        }
        return list;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RedenvelopeCommodity [id=").append(id).append(", couponId=").append(couponId)
                .append(", commodityId=").append(commodityId).append(", commodityName=").append(commodityName)
                .append(", commodityCode=").append(commodityCode).append(", mallName=").append(mallName)
                .append(", shopName=").append(shopName).append(", mallId=").append(mallId).append(", shopId=")
                .append(shopId).append(", pics=").append(pics).append(", status=").append(status).append("]");
        return builder.toString();
    }

}