package com.rongyi.easy.roa.vo;

import com.rongyi.easy.coupon.entity.CouponBrand;
import com.rongyi.easy.coupon.entity.CouponGroup;
import com.rongyi.easy.coupon.entity.CouponMall;
import com.rongyi.easy.coupon.entity.CouponShop;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: 微信v3.8 我的卡包接口
 * Author: 袁波
 * DATE: 2016/4/19 18:01
 * Package:com.rongyi.easy.roa.vo
 * Project:easy-market
 */
public class CouponOrderVO implements Serializable{
    private static final long serialVersionUID = 1L;
    private String orderId;
    /**
     * 交易状态：0:待付款 ,1:已付款,2:已取消,3:已删除, 4:全部, 5:退款(包括已退款和未退款) 6:过期
     */
    private Integer tradeStatus;
    private String couponName;
    /**
     * 有效期开始时间
     */
    private Date validStart;
    /**
     * 有效期结束时间
     */
    private Date validEnd;
    /**
     * 卡券类型。0：代金券；1:抵扣券；2：兑换券
     */
    private Integer couponType;
    /**
     * 券的关联类型
     * 0：集团；1：品牌；2：商场；3：店铺。
     */
    private Integer relatedType;
    /**
     * 关联类型所对应的商场
     */
    private CouponMall couponMall;
    /**
     * 关联类型所对应的品牌
     */
    private CouponBrand couponBrand;
    /**
     * 关联类型所对应的集团
     */
    private CouponGroup couponGroup;
    /**
     * 关联类型所对应的店铺
     */
    private CouponShop couponShop;
    /**
     * 券id
     */
    private String couponId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Date getValidStart() {
        return validStart;
    }

    public void setValidStart(Date validStart) {
        this.validStart = validStart;
    }

    public Date getValidEnd() {
        return validEnd;
    }

    public void setValidEnd(Date validEnd) {
        this.validEnd = validEnd;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public CouponMall getCouponMall() {
        return couponMall;
    }

    public void setCouponMall(CouponMall couponMall) {
        this.couponMall = couponMall;
    }

    public CouponBrand getCouponBrand() {
        return couponBrand;
    }

    public void setCouponBrand(CouponBrand couponBrand) {
        this.couponBrand = couponBrand;
    }

    public CouponGroup getCouponGroup() {
        return couponGroup;
    }

    public void setCouponGroup(CouponGroup couponGroup) {
        this.couponGroup = couponGroup;
    }

    public CouponShop getCouponShop() {
        return couponShop;
    }

    public void setCouponShop(CouponShop couponShop) {
        this.couponShop = couponShop;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponOrderVO{");
        sb.append("orderId='").append(orderId).append('\'');
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", couponName='").append(couponName).append('\'');
        sb.append(", validStart=").append(validStart);
        sb.append(", validEnd=").append(validEnd);
        sb.append(", couponType=").append(couponType);
        sb.append(", relatedType=").append(relatedType);
        sb.append(", couponMall=").append(couponMall);
        sb.append(", couponBrand=").append(couponBrand);
        sb.append(", couponGroup=").append(couponGroup);
        sb.append(", couponShop=").append(couponShop);
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
