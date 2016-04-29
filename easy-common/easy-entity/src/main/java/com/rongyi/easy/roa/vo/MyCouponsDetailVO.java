package com.rongyi.easy.roa.vo;

import com.rongyi.easy.coupon.entity.CouponMall;
import com.rongyi.easy.coupon.entity.CouponShop;

import java.math.BigDecimal;
import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/4/29 11:05
 * Package:com.rongyi.easy.roa.vo
 * Project:easy-market
 */
public class MyCouponsDetailVO {
    private String orderNo;//订单号







    private String itemName; // 商品名称

    private String couponId; //卡券Id


    /**
     * 每人每日限用张数
     */
    private Integer limitUseCount;








    private String listPicUrl;

    private String limitDesc;//使用限制

    private String usageDesc;//使用说明

    private List<ActivityDetailVO> codeList; // 本订单所含的优惠券信息

    private String holderId;

    private String holderType;

    private String holderName;

    private String logoUrl;

    private Integer count;

    private List<CouponShop> couponShops;//适用店铺列表

    private List<CouponMall> couponMalls;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getLimitUseCount() {
        return limitUseCount;
    }

    public void setLimitUseCount(Integer limitUseCount) {
        this.limitUseCount = limitUseCount;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public List<ActivityDetailVO> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<ActivityDetailVO> codeList) {
        this.codeList = codeList;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CouponShop> getCouponShops() {
        return couponShops;
    }

    public void setCouponShops(List<CouponShop> couponShops) {
        this.couponShops = couponShops;
    }

    public List<CouponMall> getCouponMalls() {
        return couponMalls;
    }

    public void setCouponMalls(List<CouponMall> couponMalls) {
        this.couponMalls = couponMalls;
    }
}
