package com.rongyi.easy.osm.entity;

import java.util.Date;
import java.util.List;

/**
 * 订单详情实体（适用电子会员）
 *
 * @author wangjh7
 * @date 2016-11-28
 */
public class OsmOrderDetailForUserCenterEntity extends OsmOrderForUserCenterEntity {
    // 类目Id
    private String commoditySpecIds;
    // 类目列表
    private List<String> commoditySpecList;
    // 商品logo
    private String commodityLogo;
    // 快递方式 1：自提 2：快递
    private int deliveryType;
    // 快递信息
    private OrderFormExtraEntity orderFormExtraEntity;
    // 对应事件
    private List<OrderEventEntity> eventList;
    // 券码
    private List<String> commodityCodeList;
    // 快递id
    private String expressId;
    // 快递单号
    private String expressNo;
    // 快递公司
    private String expressCompany;
    //  自提商品过期时间
    private Date expireAt;
    // 卡券开始时间
    private Date couponStartAt;
    // 卡券结束时间
    private Date couponEndAt;

    public String getCommodityLogo() {
        return commodityLogo;
    }

    public void setCommodityLogo(String commodityLogo) {
        this.commodityLogo = commodityLogo;
    }

    public String getCommoditySpecIds() {
        return commoditySpecIds;
    }

    public void setCommoditySpecIds(String commoditySpecIds) {
        this.commoditySpecIds = commoditySpecIds;
    }

    public List<String> getCommoditySpecList() {
        return commoditySpecList;
    }

    public void setCommoditySpecList(List<String> commoditySpecList) {
        this.commoditySpecList = commoditySpecList;
    }

    public int getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(int deliveryType) {
        this.deliveryType = deliveryType;
    }

    public List<OrderEventEntity> getEventList() {
        return eventList;
    }

    public void setEventList(List<OrderEventEntity> eventList) {
        this.eventList = eventList;
    }

    public List<String> getCommodityCodeList() {
        return commodityCodeList;
    }

    public void setCommodityCodeList(List<String> commodityCodeList) {
        this.commodityCodeList = commodityCodeList;
    }

    public OrderFormExtraEntity getOrderFormExtraEntity() {
        return orderFormExtraEntity;
    }

    public void setOrderFormExtraEntity(OrderFormExtraEntity orderFormExtraEntity) {
        this.orderFormExtraEntity = orderFormExtraEntity;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public Date getCouponEndAt() {
        return couponEndAt;
    }

    public void setCouponEndAt(Date couponEndAt) {
        this.couponEndAt = couponEndAt;
    }

    public Date getCouponStartAt() {
        return couponStartAt;
    }

    public void setCouponStartAt(Date couponStartAt) {
        this.couponStartAt = couponStartAt;
    }

    public Date getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }

    @Override
    public String toString() {
        return "OsmOrderDetailForUserCenterEntity{" +
                "commodityCodeList=" + commodityCodeList +
                ", commoditySpecIds='" + commoditySpecIds + '\'' +
                ", commoditySpecList=" + commoditySpecList +
                ", commodityLogo='" + commodityLogo + '\'' +
                ", deliveryType=" + deliveryType +
                ", orderFormExtraEntity=" + orderFormExtraEntity +
                ", eventList=" + eventList +
                ", expressId='" + expressId + '\'' +
                ", expressNo='" + expressNo + '\'' +
                ", expressCompany='" + expressCompany + '\'' +
                ", expireAt=" + expireAt +
                ", couponStartAt=" + couponStartAt +
                ", couponEndAt=" + couponEndAt +
                "} " + super.toString();
    }
}
