package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 礼品参数
 *
 * @author yaoyiwei
 * @date 2016-11-22
 * @version 1.0
 *
 */
public class GiftParam implements Serializable {

    private String name;
    private String code;
    private Integer stock;
    private Integer terminalType;
    private List<String> picList;
    private String description;
    private Integer purchaseCount;
    private String createBy;
    // 礼品id mysql id 兼容老数据
    private String giftId;
    // 礼品编号
    private String sn;
    // 礼品所属id
    private String mappingId;
    // 商品类型(0:商品, 1:礼品)
    private Integer commodityType;
    // 礼品参与活动id
    private String activityId;
    // 兑换类型（1.兑换，2.换购）
    private List<Integer> exchangeTypes;
    // 积分设置类型（1.同一设置 2.按等级设置）
    private Integer pointType;
    // 换购类型（1.同一设置 2.按等级设置）
    private Integer buyType;
    // 配送方式（1.自提 2.快递）
    private List<Integer> deliveryTypes;
    // 自提类型（1.公共设施 2.指定店铺）
    private Integer selfType;
    // 自提地点
    private String selfAddress;
    // 自提地点备注
    private String selfRemark;
    // 自提地点id
    private String selfAddressId;
    // 自提期限
    private Date selfExpireDate;
    // 标签列表
    private List<String> tagIds;
    // 支付方式列表
    private List<String> paymentIds;
    // 商品总库存
    private Integer total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public Integer getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(Integer commodityType) {
        this.commodityType = commodityType;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public List<Integer> getExchangeTypes() {
        return exchangeTypes;
    }

    public void setExchangeTypes(List<Integer> exchangeTypes) {
        this.exchangeTypes = exchangeTypes;
    }

    public Integer getPointType() {
        return pointType;
    }

    public void setPointType(Integer pointType) {
        this.pointType = pointType;
    }

    public Integer getBuyType() {
        return buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public List<Integer> getDeliveryTypes() {
        return deliveryTypes;
    }

    public void setDeliveryTypes(List<Integer> deliveryTypes) {
        this.deliveryTypes = deliveryTypes;
    }

    public Integer getSelfType() {
        return selfType;
    }

    public void setSelfType(Integer selfType) {
        this.selfType = selfType;
    }

    public String getSelfAddress() {
        return selfAddress;
    }

    public void setSelfAddress(String selfAddress) {
        this.selfAddress = selfAddress;
    }

    public String getSelfRemark() {
        return selfRemark;
    }

    public void setSelfRemark(String selfRemark) {
        this.selfRemark = selfRemark;
    }

    public String getSelfAddressId() {
        return selfAddressId;
    }

    public void setSelfAddressId(String selfAddressId) {
        this.selfAddressId = selfAddressId;
    }

    public Date getSelfExpireDate() {
        return selfExpireDate;
    }

    public void setSelfExpireDate(Date selfExpireDate) {
        this.selfExpireDate = selfExpireDate;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public List<String> getPaymentIds() {
        return paymentIds;
    }

    public void setPaymentIds(List<String> paymentIds) {
        this.paymentIds = paymentIds;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "GiftParam{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", stock=" + stock +
                ", terminalType=" + terminalType +
                ", picList=" + picList +
                ", description='" + description + '\'' +
                ", purchaseCount=" + purchaseCount +
                ", giftId='" + giftId + '\'' +
                ", sn='" + sn + '\'' +
                ", mappingId='" + mappingId + '\'' +
                ", commodityType=" + commodityType +
                ", activityId='" + activityId + '\'' +
                ", exchangeTypes=" + exchangeTypes +
                ", pointType=" + pointType +
                ", buyType=" + buyType +
                ", deliveryTypes=" + deliveryTypes +
                ", selfType=" + selfType +
                ", selfAddress='" + selfAddress + '\'' +
                ", selfRemark='" + selfRemark + '\'' +
                ", selfAddressId='" + selfAddressId + '\'' +
                ", selfExpireDate=" + selfExpireDate +
                ", tagIds=" + tagIds +
                ", paymentIds=" + paymentIds +
                ", total=" + total +
                ", createBy=" + createBy +
                '}';
    }
}
