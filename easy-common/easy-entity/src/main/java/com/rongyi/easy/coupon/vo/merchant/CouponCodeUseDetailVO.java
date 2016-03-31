package com.rongyi.easy.coupon.vo.merchant;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Descriptions: 券码的购买及领用详情VO
 * Created by 袁波
 * Created at 2015/9/10 17:37.
 */
public class CouponCodeUseDetailVO implements Serializable{
    private Integer codeId;//券码id
    private String code;//券码
    private String couponId;//卡券id
    private String userId;//领用人id
    private String userAccount;//领用人账号
    private String userName;//领用人姓名
    private Integer codeStatus;// 券码的状态 0：未领用 ；1：已领用
    private Integer useStatus;//券码的使用状态 0：未使用 ；1：已使用
    private Date receiveAt;//领用时间
    private Date useAt;//使用时间
    private Date validAt;//有效期结束时间
    private String commodityOrderNo;//卡券购买商品时，商品的订单号
    private String couponOrderNo;//购买代金券订单号
    private Integer rebatePrice;//抵用金额
    private Integer channel;//领用(购买)渠道 0:容易逛 ；1：微信 ； 2：互动屏

    public CouponCodeUseDetailVO() {
    }

    public CouponCodeUseDetailVO(Integer codeId, String code, String couponId, String userId, String userAccount, String userName, Integer codeStatus, Integer useStatus, Date receiveAt, Date useAt, Date validAt, String commodityOrderNo, String couponOrderNo, Integer rebatePrice, Integer channel) {
        this.codeId = codeId;
        this.code = code;
        this.couponId = couponId;
        this.userId = userId;
        this.userAccount = userAccount;
        this.userName = userName;
        this.codeStatus = codeStatus;
        this.useStatus = useStatus;
        this.receiveAt = receiveAt;
        this.useAt = useAt;
        this.validAt = validAt;
        this.commodityOrderNo = commodityOrderNo;
        this.couponOrderNo = couponOrderNo;
        this.rebatePrice = rebatePrice;
        this.channel = channel;
    }

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(Integer codeStatus) {
        this.codeStatus = codeStatus;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt(Date receiveAt) {
        this.receiveAt = receiveAt;
    }

    public Date getUseAt() {
        return useAt;
    }

    public void setUseAt(Date useAt) {
        this.useAt = useAt;
    }


    public Date getValidAt() {
        return validAt;
    }

    public void setValidAt(Date validAt) {
        this.validAt = validAt;
    }

    public String getCommodityOrderNo() {
        return commodityOrderNo;
    }

    public void setCommodityOrderNo(String commodityOrderNo) {
        this.commodityOrderNo = commodityOrderNo;
    }

    public String getCouponOrderNo() {
        return couponOrderNo;
    }

    public void setCouponOrderNo(String couponOrderNo) {
        this.couponOrderNo = couponOrderNo;
    }

    public Integer getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(Integer rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codeId", codeId).append("code", code).append("couponId", couponId).append("userId", userId).append("userAccount", userAccount).append("userName", userName).append("codeStatus", codeStatus).append("useStatus", useStatus).append("receiveAt", receiveAt).append("useAt", useAt).append("validAt", validAt).append("commodityOrderNo", commodityOrderNo).append("couponOrderNo", couponOrderNo).append("rebatePrice", rebatePrice).append("channel", channel).toString();
    }

}
