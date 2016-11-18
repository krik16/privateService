package com.rongyi.easy.mcmc.vo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 礼品详情VO
 *
 * @author yaoyiwei
 * @date 2016-11-16
 * @version 1.0
 *
 */
public class GiftDetailVO extends GiftVO implements Serializable {

    private String sn; //礼品编号
    private String commodityType;
    private Double price;
    private List<Integer> exchangeTypes; // 兑换类型（1.兑换，2.换购）
    private Integer pointType; // 积分设置类型（1.同一设置 2.按等级设置）
    private Integer buyType; // 换购类型（1.同一设置 2.按等级设置）
    private List<String> terminalMsg; //上架终端描述
    private Date registerAt; //上架时间
    private Date soldOutAt; //下架时间
    private Integer purchaseCount;//商品的限购数量
    private List<Integer> deliveryTypes; // 配送方式（1.自提 2.快递）
    private Integer selfType; // 自提类型（1.公共设施 2.指定店铺）
    private String selfAddress; // 自提地点
    private String selfRemark; // 自提地点备注
    private List<String> tagIds;  // 标签列表
    private List<GiftTagVO> tagVOs;
    private String description;//商品描述

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public Date getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Date registerAt) {
        this.registerAt = registerAt;
    }

    public Date getSoldOutAt() {
        return soldOutAt;
    }

    public void setSoldOutAt(Date soldOutAt) {
        this.soldOutAt = soldOutAt;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
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

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public List<GiftTagVO> getTagVOs() {
        return tagVOs;
    }

    public void setTagVOs(List<GiftTagVO> tagVOs) {
        this.tagVOs = tagVOs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GiftDetailVO{" +
                "sn='" + sn + '\'' +
                ", commodityType='" + commodityType + '\'' +
                ", price=" + price +
                ", exchangeTypes=" + exchangeTypes +
                ", pointType=" + pointType +
                ", buyType=" + buyType +
                ", terminalMsg='" + terminalMsg + '\'' +
                ", registerAt=" + registerAt +
                ", soldOutAt=" + soldOutAt +
                ", purchaseCount=" + purchaseCount +
                ", deliveryTypes=" + deliveryTypes +
                ", selfType=" + selfType +
                ", selfAddress='" + selfAddress + '\'' +
                ", selfRemark='" + selfRemark + '\'' +
                ", tagIds=" + tagIds +
                ", tagVOs=" + tagVOs +
                ", description=" + description +
                '}';
    }
}
