package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单实体（适用电子会员）
 *
 * @author wangjh7
 * @date 2016-11-25
 */
public class OsmOrderForUserCenterEntity implements Serializable {

    // mallId
    private String mallId;
    // 订单编号
    private String tradeNo;
    // 商品ID
    private String commodityId;
    // 商品名称
    private String commodityName;
    // 商品类型
    private int commodityType;
    // 商品数量
    private int commodityNumber;
    // 用户ID
    private String userId;
    // 用户手机
    private String userPhone;
    // 用户留言
    private String userMessage;
    // 订单创建时间
    private Date createAt;
    // 总积分
    private int totalCredit;
    // 总金额
    private int totalAmount;
    // 订单状态
    private int status;
    // 兑换类型
    private int exchangeType;

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

    public int getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(int commodityType) {
        this.commodityType = commodityType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(int commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(int exchangeType) {
        this.exchangeType = exchangeType;
    }

    @Override
    public String toString() {
        return "OsmOrderForUserCenterEntity{" +
                "commodityId='" + commodityId + '\'' +
                ", mallId='" + mallId + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", commodityType=" + commodityType +
                ", commodityNumber=" + commodityNumber +
                ", userId='" + userId + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMessage='" + userMessage + '\'' +
                ", createAt=" + createAt +
                ", totalCredit=" + totalCredit +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                ", exchangeType=" + exchangeType +
                '}';
    }
}
