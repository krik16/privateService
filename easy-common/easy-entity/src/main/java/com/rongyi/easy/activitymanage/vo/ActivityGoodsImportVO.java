package com.rongyi.easy.activitymanage.vo;

import java.io.Serializable;

/**
 * Created by Leon on 2016/1/27.
 */
public class ActivityGoodsImportVO implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     *  活动id
     */
    private Integer activityId;

    /**
     * 商品|卡券id
     */
    private String goodsId;

    /**
     * 商品|卡券名称
     */
    private String goodsName;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 版本号
     */
    private String version;

    /**
     * 商品成功的数量
     */
    private Integer commoditySuccessCount;

    /**
     * 商品失败的数量
     */
    private Integer commodityFailureCount;

    /**
     * 卡券成功的数量
     */
    private Integer couponSuccessCount;

    /**
     * 卡券失败的数量
     */
    private Integer couponFailureCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getCommoditySuccessCount() {
        return commoditySuccessCount;
    }

    public void setCommoditySuccessCount(Integer commoditySuccessCount) {
        this.commoditySuccessCount = commoditySuccessCount;
    }

    public Integer getCommodityFailureCount() {
        return commodityFailureCount;
    }

    public void setCommodityFailureCount(Integer commodityFailureCount) {
        this.commodityFailureCount = commodityFailureCount;
    }

    public Integer getCouponSuccessCount() {
        return couponSuccessCount;
    }

    public void setCouponSuccessCount(Integer couponSuccessCount) {
        this.couponSuccessCount = couponSuccessCount;
    }

    public Integer getCouponFailureCount() {
        return couponFailureCount;
    }

    public void setCouponFailureCount(Integer couponFailureCount) {
        this.couponFailureCount = couponFailureCount;
    }
}
