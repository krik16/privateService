package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * 商品自提码/卡券码查询参数（电子会员）
 *
 * @author wangjh7
 * @date 2016-11-28
 */
public class OsmCommodityCodeQueryForUserCenterParam implements Serializable {

    // 商城id
    private String mallId;
    // 订单编号
    private String tradeNo;
    // 自提码/券码
    private String couponCode;
    // 商品ID
    private String commodityId;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    @Override
    public String toString() {
        return "OsmCommodityCodeQueryForUserCenterParam{" +
                "commodityId='" + commodityId + '\'' +
                ", mallId='" + mallId + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", couponCode='" + couponCode + '\'' +
                '}';
    }
}
