package com.rongyi.easy.coupon.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lqy
 *         红包领用记录实体
 */
@Entity(value = "coupon_record", noClassnameStored = true)
public class CouponRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private ObjectId id;

    /**
     * 券码
     */
    @Property("coupon_code")
    private String couponCode;

    /**
     * 卡券名称
     */
    private String title;

    /**
     * 券类型: 优惠券[02] 红包[03]
     */
    @Property("coupon_type")
    private String couponType;

    /**
     * 折扣价
     */
    private Double discount;

    /**
     * 订单号
     */
    @Property("order_no")
    private String orderNo;

    /**
     * 订单类型: 商品订单[0] 优惠券订单[1]
     */
    @Property("order_type")
    private Integer orderType;

    /**
     * 买家帐号
     */
    @Property("buyer_account")
    private String buyerAccount;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 使用状态:已领用:1,已使用:2,已过期:3,退款中:4,已退款:5
     */
    private Integer status;

    /**
     * 领取时间
     */
    @Property("provide_time")
    private Date provideTime;

    /**
     * 使用时间
     */
    @Property("use_time")
    private Date useTime;

    /**
     * 卖家帐号
     */
    @Property("seller_account")
    private String sellerAccount;

    /**
     * 卖家姓名
     */
    @Property("seller_name")
    private String sellerName;

    /**
     * 卖家支付宝帐号
     */
    @Property("seller_alipay_account")
    private String sellerAlipayAccount;

    /**
     * 卖家支付宝姓名
     */
    @Property("seller_alipay_name")
    private String sellerAlipayName;

    /**
     * 卖家开户银行
     */
    @Property("seller_bank_name")
    private String sellerBankName;

    /**
     * 卖家开户银行卡号
     */
    @Property("seller_bank_account")
    private String sellerBankAccount;

    /**
     * 卖家持卡人姓名
     */
    @Property("seller_card_name")
    private String sellerCardName;

    /**
     * 有效期始
     */
    private Date startTime;

    /**
     * 有效起止
     */
    private Date endTime;

    public CouponRecord() {
    }

    public CouponRecord(String couponCode, String title, String couponType, Double discount, String orderNo, String buyerAccount, String channel, Integer status, Date provideTime, Date startTime, Date endTime) {
        this.couponCode = couponCode;
        this.title = title;
        this.couponType = couponType;
        this.discount = discount;
        this.orderNo = orderNo;
        this.buyerAccount = buyerAccount;
        this.channel = channel;
        this.status = status;
        this.provideTime = provideTime;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getProvideTime() {
        return provideTime;
    }

    public void setProvideTime(Date provideTime) {
        this.provideTime = provideTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAlipayAccount() {
        return sellerAlipayAccount;
    }

    public void setSellerAlipayAccount(String sellerAlipayAccount) {
        this.sellerAlipayAccount = sellerAlipayAccount;
    }

    public String getSellerAlipayName() {
        return sellerAlipayName;
    }

    public void setSellerAlipayName(String sellerAlipayName) {
        this.sellerAlipayName = sellerAlipayName;
    }

    public String getSellerBankName() {
        return sellerBankName;
    }

    public void setSellerBankName(String sellerBankName) {
        this.sellerBankName = sellerBankName;
    }

    public String getSellerBankAccount() {
        return sellerBankAccount;
    }

    public void setSellerBankAccount(String sellerBankAccount) {
        this.sellerBankAccount = sellerBankAccount;
    }

    public String getSellerCardName() {
        return sellerCardName;
    }

    public void setSellerCardName(String sellerCardName) {
        this.sellerCardName = sellerCardName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
}
