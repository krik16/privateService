package com.rongyi.easy.tradecenter.vo;

import com.rongyi.easy.coupon.entity.CouponOrderItem;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by hebo on 2015/12/23.
 * 订单详情Vo（容易逛）
 */
public class CouponOrderVO implements Serializable{

    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 摩生活 用户id
     */
    private String buyerId;

    /**
     * 持有人 昵称
     */
    private String buyerName;

    /**
     * 持有人手机
     */
    private String buyerMobile;

    /**
     * 商场Id
     */
    private String mallId;
    /**
     * 微信openId
     */
    private String openId;

    /**
     * 交易状态:待付款[0], 已付款[1], 已取消[2], 已删除[3], 退款中[4], 已退款[5]
     * 显示优先级： 退款中>未消费>已退款>已过期>已使用
     * 举例： 一张订单：退款中+未消费+已使用   在”全部“，”未消费“，”退款单“中都能找到
     */
    private Integer tradeStatus;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付方式  1：web页支付宝支付，3:手机支付宝支付，5：微信app支付
     */
    private Integer tradeWay;

    /**
     * 红包码
     */
    private String cashCouponCode;

    /**
     * 付款单号
     */
    private String paymentNo;

    /**
     * 设备ID，限购使用
     */
    private String devId;

    /**
     * 支付账户，限购使用
     */
    private String payAccount;

    /**
     * 原结算金额
     */
    private Double totalAmount;

    /**
     * 实际支付金额
     */
    private Double payAmount;

    /**
     * 优惠金额 （积分+红包+后续其他优惠）
     */
    private Double discountAmount;

    /**
     * 订单项
     */
    private List<CouponOrderItem> itemList;

    /**
     * 优惠详情，json格式，例如{“score”:”100”, "scoreDeduction":"1"}
     */
    private String discountInfo;

    private Date nextStatusTime;

    private Integer statusHold;
    /**
     * 订单已核销优惠券详情
     */
    private List<CheckCouponDetail> checkCoupons;

    public CouponOrderVO() {

    }

    public CouponOrderVO(String orderNo, String buyerId, String buyerName, String buyerMobile, Integer tradeStatus,
                       Date orderTime, Date payTime, Integer tradeWay, String devId, String payAccount,
                       Double totalAmount, Double payAmount, Double discountAmount, String discountInfo) {
        super();
        this.orderNo = orderNo;
        this.buyerId = buyerId;
        this.buyerName = buyerName;
        this.buyerMobile = buyerMobile;
        this.tradeStatus = tradeStatus;
        this.orderTime = orderTime;
        this.payTime = payTime;
        this.tradeWay = tradeWay;
        this.devId = devId;
        this.payAccount = payAccount;
        this.totalAmount = totalAmount;
        this.payAmount = payAmount;
        this.discountAmount = discountAmount;
        this.discountInfo = discountInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
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

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getTradeWay() {
        return tradeWay;
    }

    public void setTradeWay(Integer tradeWay) {
        this.tradeWay = tradeWay;
    }

    public String getCashCouponCode() {
        return cashCouponCode;
    }

    public void setCashCouponCode(String cashCouponCode) {
        this.cashCouponCode = cashCouponCode;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public List<CouponOrderItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<CouponOrderItem> itemList) {
        this.itemList = itemList;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public Integer getStatusHold() {
        return statusHold;
    }

    public void setStatusHold(Integer statusHold) {
        this.statusHold = statusHold;
    }

    public List<CheckCouponDetail> getCheckCoupons() {
        return checkCoupons;
    }

    public void setCheckCoupons(List<CheckCouponDetail> checkCoupons) {
        this.checkCoupons = checkCoupons;
    }

    public static class CheckCouponDetail implements Serializable{
        private List<String> couponCodes;
        private Date checkTime;
        private String checkUserName;
        private Integer checkUserId;
        private String checkShopName;
        private String cheeckShopId;

        public List<String> getCouponCodes() {
            return couponCodes;
        }

        public void setCouponCodes(List<String> couponCodes) {
            this.couponCodes = couponCodes;
        }

        public Integer getCheckUserId() {
            return checkUserId;
        }

        public void setCheckUserId(Integer checkUserId) {
            this.checkUserId = checkUserId;
        }

        public Date getCheckTime() {
            return checkTime;
        }

        public void setCheckTime(Date checkTime) {
            this.checkTime = checkTime;
        }

        public String getCheckUserName() {
            return checkUserName;
        }

        public void setCheckUserName(String checkUserName) {
            this.checkUserName = checkUserName;
        }

        public String getCheckShopName() {
            return checkShopName;
        }

        public void setCheckShopName(String checkShopName) {
            this.checkShopName = checkShopName;
        }

        public String getCheeckShopId() {
            return cheeckShopId;
        }

        public void setCheeckShopId(String cheeckShopId) {
            this.cheeckShopId = cheeckShopId;
        }
    }

}
