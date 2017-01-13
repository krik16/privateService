package com.rongyi.easy.tradecenter;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单实体（适用电子会员）
 *
 * @author wangjh7
 * @date 2016-11-16
 */
public class TraderOrderForUserCenterEntity implements Serializable {

    // mallId
    private String mallId;
    // 订单编号
    private String tradeNo;
    // 用户ID
    private String userId;
    // 用户名称
    private String userName;
    // 用户手机
    private String userPhone;
    // 用户留言
    private String userMessage;
    // 兑换类型
    private int exchangeType;
    // 订单创建时间
    private Date createAt;
    // 订单支付时间
    private Date payAt;
    // 总积分
    private int totalCredit;
    // 总金额
    private int payAmount;
    // 订单状态
    private int status;
    // 卡券id
    private int unitId;
    // 卡券数量
    private int unitNum;
    // 卡券状态
    private int couponStatus;
    // 卡券标题
    private String couponTitle;
    // 卡券图片
    private String couponImageUrl;
    // 卡券使用时间
    private Date couponUsedAt;

    public String getCouponImageUrl() {
        return couponImageUrl;
    }

    public void setCouponImageUrl(String couponImageUrl) {
        this.couponImageUrl = couponImageUrl;
    }

    public int getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(int couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
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

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public int getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(int unitNum) {
        this.unitNum = unitNum;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCouponUsedAt() {
        return couponUsedAt;
    }

    public void setCouponUsedAt(Date couponUsedAt) {
        this.couponUsedAt = couponUsedAt;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public int getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(int exchangeType) {
        this.exchangeType = exchangeType;
    }

    @Override
    public String toString() {
        return "TraderOrderForUserCenterEntity{" +
                "couponImageUrl='" + couponImageUrl + '\'' +
                ", mallId='" + mallId + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMessage='" + userMessage + '\'' +
                ", exchangeType=" + exchangeType +
                ", createAt=" + createAt +
                ", payAt=" + payAt +
                ", totalCredit=" + totalCredit +
                ", payAmount=" + payAmount +
                ", status=" + status +
                ", unitId=" + unitId +
                ", unitNum=" + unitNum +
                ", couponStatus=" + couponStatus +
                ", couponTitle='" + couponTitle + '\'' +
                ", couponUsedAt=" + couponUsedAt +
                '}';
    }
}
