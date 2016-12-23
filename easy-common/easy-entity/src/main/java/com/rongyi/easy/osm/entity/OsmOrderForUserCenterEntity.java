package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
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
    // 下个状态的时间
    private Date nextStatusTime;
    // 礼品编号
    private String sn;
    // 商品logo
    private String commodityLogo;
    // 订单来源
    private int orderSource;
    // 自提码
    private String couponCode;
    // 订单关闭前状态
    private Integer orgStatus;
    // 订单关闭前状态
    private byte[] buyerComment;
    // 订单创建时间
    private Date payTime;

    public byte[] getBuyerComment() {
        return buyerComment;
    }

    public void setBuyerComment(byte[] buyerComment) {
        this.buyerComment = buyerComment;
    }

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

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public String getCommodityLogo() {
        return commodityLogo;
    }

    public void setCommodityLogo(String commodityLogo) {
        this.commodityLogo = commodityLogo;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public int getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(int orderSource) {
        this.orderSource = orderSource;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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
                ", nextStatusTime=" + nextStatusTime +
                ", sn='" + sn + '\'' +
                ", commodityLogo='" + commodityLogo + '\'' +
                ", orderSource=" + orderSource +
                ", couponCode='" + couponCode + '\'' +
                ", orgStatus=" + orgStatus +
                ", payTime=" + payTime +
                '}';
    }
}
