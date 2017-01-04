package com.rongyi.easy.coupon.vo.gift;

import com.rongyi.easy.coupon.entity.Coupon;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * Author: yb
 * DATE: 2016/11/21 11:07
 * Package:com.rongyi.easy.coupon.vo.gift
 * Project:easy-coupon
 */
public class GiftCouponVO extends Coupon implements Serializable {


    /**
     * 兑换类型(1.兑换，2换购)
     */
    private Byte exchangeType;

    /**
     * 0:礼品券；1：停车券
     */
    private Byte giftType;

    /**
     * 业务数据
     */
    private String businessData;

    private Integer userId;

    private List<GiftMemberPayVO> payVOs;

    private List<GiftTagVO> tagVOs;



    public Byte getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(Byte exchangeType) {
        this.exchangeType = exchangeType;
    }

    public Byte getGiftType() {
        return giftType;
    }

    public void setGiftType(Byte giftType) {
        this.giftType = giftType;
    }

    public String getBusinessData() {
        return businessData;
    }

    public void setBusinessData(String businessData) {
        this.businessData = businessData;
    }

    public List<GiftMemberPayVO> getPayVOs() {
        return payVOs;
    }

    public void setPayVOs(List<GiftMemberPayVO> payVOs) {
        this.payVOs = payVOs;
    }

    public List<GiftTagVO> getTagVOs() {
        return tagVOs;
    }

    public void setTagVOs(List<GiftTagVO> tagVOs) {
        this.tagVOs = tagVOs;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        String coupon = super.toString();
        final StringBuffer sb = new StringBuffer("GiftCouponVO{");
        sb.append(", exchangeType=").append(exchangeType);
        sb.append(", giftType=").append(giftType);
        sb.append(", businessData='").append(businessData).append('\'');
        sb.append(", payVOs=").append(payVOs);
        sb.append(", tagVOs=").append(tagVOs);
        sb.append('}');
        return coupon+sb.toString();
    }
}
