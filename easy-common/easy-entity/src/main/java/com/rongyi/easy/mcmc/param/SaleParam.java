package com.rongyi.easy.mcmc.param;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.mcmc.Commodity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xgq on 2015/11/19.
 */
public class SaleParam implements Serializable {
    private Integer id; //特卖/闪购ID
    private String secKillSign; //秒杀标记
    private List<String> shopIds = new ArrayList<>(); //特卖关联特卖店铺MONGO ID列表
    private long startTime; //开始时间
    private long endTime; //结束时间
    private int activityType; //活动类型 1为特卖  2为闪购 3为秒杀
    private List<ActivityCommodityParam> commodityParams = new ArrayList<>(); // 闪购或特卖关联商品及排序数
    private List<String> commodityIds = new ArrayList<>(); //秒杀关联商品列表
    private String commodityId;//商品Id
    private String type;//coupon为卡卷，commodity为商品
    private String couponId;//卡卷Id
    private List<CommoditySolr> commodityList;
    private List<CouponSolr> couponSolrList;

    public List<CouponSolr> getCouponSolrList() {
        return couponSolrList;
    }

    public void setCouponSolrList(List<CouponSolr> couponSolrList) {
        this.couponSolrList = couponSolrList;
    }

    public List<CommoditySolr> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<CommoditySolr> commodityList) {
        this.commodityList = commodityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getActivityType() {
        return activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    public List<ActivityCommodityParam> getCommodityParams() {
        return commodityParams;
    }

    public void setCommodityParams(List<ActivityCommodityParam> commodityParams) {
        this.commodityParams = commodityParams;
    }

    public String getSecKillSign() {
        return secKillSign;
    }

    public void setSecKillSign(String secKillSign) {
        this.secKillSign = secKillSign;
    }

    public List<String> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<String> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        return "SaleParam{" +
                "id=" + id +
                ", shopIds=" + shopIds +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", activityType=" + activityType +
                ", commodityParams=" + commodityParams +
                ", secKillSign=" + secKillSign +
                ", commodityIds=" + commodityIds +
                ",commodityId=" + commodityId +
                ",type="+type+
                ",couponId="+couponId+
                '}';
    }
}
