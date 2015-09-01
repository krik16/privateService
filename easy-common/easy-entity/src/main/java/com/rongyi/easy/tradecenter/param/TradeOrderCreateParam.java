package com.rongyi.easy.tradecenter.param;

import com.rongyi.core.common.util.JsonUtil;
import org.apache.commons.lang.builder.ToStringBuilder;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ROA调用
 * 优惠券订单创建参数
 * 0元单和非0元单
 * 使用场合：微信公众号优惠劵 互动屏优惠券 容易逛
 */
public class TradeOrderCreateParam implements Serializable {

    /**
     * 优惠券ID
     */
    private String couponId;
    /**
     * 购买份数
     */
    private Integer unitNum;
    /**
     * 容易逛对应的用户ID，只用“容易逛”下单的用户，才需要记录用户ID
     */
    private String buyerId;
    /**
     * 购买用户ID
     */
    private String buyerName;
    /**
     * 用户手机号
     */
    private String buyerMobile;
    /**
     * 红包
     */
    private String cashCouponCode;
    /**
     * 积分
     */
    private Integer score;
    /**
     * 积分抵扣金额 元
     */
    private Double scoreDeduction;
    /**
     * 下单渠道, 0为容易逛，1为微网站，2为终端机，3其他
     */
    private Integer orderSource;
    /**
     * 1:手机用户登陆终端机领取优惠券状态
     */
    private String tmStatus = "0";
    /**
     * 商场对应的ID
     */
    private String mallId;
    /**
     * 当下单渠道是“微网站”时，需传入openid
     */
    private String openId;
    /**
     * 设备ID，购买优惠券时限购使用
     */
    private String devId;

    /**
     * start
     * 以下字段是内部处理流程时使用，非外部传入
     * 金额字段均为分
     */
    private boolean useHb = false;//是否使用红包

    private boolean useScore = false;//是否使用积分

    private BigDecimal discountWithOutScore = new BigDecimal(0);//除积分外优惠金额 分

    private BigDecimal totalAmount = new BigDecimal(0);//原结算金额 分

    private BigDecimal payAmount = new BigDecimal(0);//实际支付金额 分

    private BigDecimal discountAmount = new BigDecimal(0);//总优惠金额 分

    private BigDecimal scoreDiscount = new BigDecimal(0);//积分抵扣金额 分

    private Byte discountBitMap;

    private Integer statusHold;

    private Date nextStatusTime;
    /**
     * end
     */

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getTmStatus() {
        return tmStatus;
    }

    public void setTmStatus(String tmStatus) {
        this.tmStatus = tmStatus;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getCashCouponCode() {
        return cashCouponCode;
    }

    public void setCashCouponCode(String cashCouponCode) {
        this.cashCouponCode = cashCouponCode;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Double getScoreDeduction() {
        return scoreDeduction;
    }

    public void setScoreDeduction(Double scoreDeduction) {
        this.scoreDeduction = scoreDeduction;
    }

    public boolean isUseScore() {
        return useScore;
    }

    public void setUseScore(boolean useScore) {
        this.useScore = useScore;
    }

    public BigDecimal getDiscountWithOutScore() {
        return discountWithOutScore;
    }

    public void setDiscountWithOutScore(BigDecimal discountWithOutScore) {
        this.discountWithOutScore = discountWithOutScore;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(BigDecimal scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public Byte getDiscountBitMap() {
        return discountBitMap;
    }

    public void setDiscountBitMap(Byte discountBitMap) {
        this.discountBitMap = discountBitMap;
    }

    public boolean isUseHb() {
        return useHb;
    }

    public void setUseHb(boolean useHb) {
        this.useHb = useHb;
    }

    public Integer getStatusHold() {
        return statusHold;
    }

    public void setStatusHold(Integer statusHold) {
        this.statusHold = statusHold;
    }

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    @Override
    public String toString() {
        return "TradeOrderCreateParam{" +
                "couponId='" + couponId + '\'' +
                ", unitNum=" + unitNum +
                ", buyerId='" + buyerId + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerMobile='" + buyerMobile + '\'' +
                ", cashCouponCode='" + cashCouponCode + '\'' +
                ", score=" + score +
                ", scoreDeduction=" + scoreDeduction +
                ", orderSource=" + orderSource +
                ", tmStatus='" + tmStatus + '\'' +
                ", mallId='" + mallId + '\'' +
                ", openId='" + openId + '\'' +
                ", devId='" + devId + '\'' +
                '}';
    }
}
