package com.rongyi.easy.rpb.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/29.
 */
public class PaymentOrderDetailForCmsVo implements Serializable {
    private String cashName;//收银商户名称
    private Integer couponUsed;//卡券抵扣
    private String orderNo;//订单编号
    private String contractNo;//合同号
    private Long payAmount;//余额支付
    private Long paymentTime;//支付时间
    private Long createTime;//下单时间
    private Integer paymentType;//支付方式（0:支付宝 1:微信 2:pos银行卡,3:现金）
    private Long realAmount;//订单总额
    private Long reductionUsed;//满减抵扣金额
    private Long scoreDiscount;//积分抵扣
    private String settleName;//结算对象
    private Integer status;// 0 已付款 1 已退款
    private String buyerNo;//买家账号
    private Integer shopScore;//获取积分
    private String paymentNo;//支付交易流水
    private String cardName;//积分商名称

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
    }

    public Integer getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(Integer couponUsed) {
        this.couponUsed = couponUsed;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Long getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Long paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    public Long getReductionUsed() {
        return reductionUsed;
    }

    public void setReductionUsed(Long reductionUsed) {
        this.reductionUsed = reductionUsed;
    }

    public Long getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(Long scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public String getSettleName() {
        return settleName;
    }

    public void setSettleName(String settleName) {
        this.settleName = settleName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getBuyerNo() {
        return buyerNo;
    }

    public void setBuyerNo(String buyerNo) {
        this.buyerNo = buyerNo;
    }

    public Integer getShopScore() {
        return shopScore;
    }

    public void setShopScore(Integer shopScore) {
        this.shopScore = shopScore;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
