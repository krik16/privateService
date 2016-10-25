package com.rongyi.easy.osm.entity;

import net.sf.json.JSONObject;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderFormEntity implements Serializable ,Comparable<OrderFormEntity>{
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 大订单号
     */
    private String orderNo;

    /**
     * 总价（总价=子订单实价总和 + 邮费 - 折扣
     */
    private BigDecimal totalAmount;

    /**
     * 邮费
     */
    private BigDecimal expressFee;

    /**
     * 折扣
     */
    private BigDecimal disconntFee = BigDecimal.ZERO;;

    /**
     * 物流信息主键id
     */
    private String expressInfoId;

    /**
     * 状态 (1未付款 2待发货 3已发货 4确认收货 5已关闭)
     */
    private String status;

    /**
     * 状态路径
     */
    private String statusRoute;

    /**
     * 订单创建时间
     */
    private Date createAt;

    /**
     * 状态保持剩余时间(毫秒)
     */
    private Long statusHoldMs;

    /**
     * 预计转入下一状态时间
     */
    private Date nextStatusTime;

    /**
     * 买家id
     */
    private String buyerId;

    /**
     * 微店id
     */
    private String weidianId;

    /**
     * 支付款id列表，多个id之间用逗号隔开
     */
    private String paymentIdList;

    /**
     * 是否已评价 (0否 1是)
     */
    private Integer isComment;

    /**
     * 邮寄地址id
     */
    private String addressId;

    /**
     * 订单类型 1直接付款 2担保交易
     */
    private Integer orderType;

    /**
     * 订单渠道 1APP 2终端机
     */
    private Integer orderSource;

    /**
     * 抵扣券ID
     */
    private String couponId;

    /**
     * 容易网活动抵扣券ID
     */
    private String internalCouponId;

    /**
     * 导购id
     */
    private String guideId;

    /**
     * 本订单享受到的优惠(存json格式数据，方便后续扩展)
     */
    private String discountInfo;

    /**
     * 买家备注
     */
    private String buyerComment;

    /**
     * 促销券抵扣金额
     */
    private BigDecimal couponDiscount;

    /**
     * 促销券来源 1：平台 2：商家
     */
    private Integer couponSource;

    /**
     * 促销券类型 1：满减 2：立减
     */
    private Integer couponType;

    /**
     * 积分优惠金额
     */
    private BigDecimal scoreDiscount;

    private JSONObject jsonDiscountInfo;

    /**
     * 1是导购 2是买手
     */
    private Integer guideType;
    /**
     * 是否已提醒买家付款 0 未提醒 1 已提醒
     **/
    private Byte isAlert;
    //促销券能使用的最小订单金额
    private BigDecimal couponRequirement;

    /**
     * 订单总金额（不包括积分优惠）
     **/
    private BigDecimal totalAmountWithoutScoreDiscount = null;
    //设备类型
    private Integer devType;

    //0:未打款，1:对私(打款到导购虚拟账号)，2:对公(通过对账单结算)
    private Byte isPayVa;//0:未打款，1:对私(打款到导购虚拟账号)，2:对公(通过对账单结算)

    private Integer orderScore;//购物车订单积分分摊

    private BigDecimal orderScoreDiscount;//购物车订单积分分摊优惠金额

    private BigDecimal orderCouponDiscount;//购物车订单抵扣券分摊优惠金额

    private Byte changePriceFlag;//用户改价通知 0未改价 1 改价 2 改价且恢复抵扣券

    private Integer cartId;//购物车id 0表示不使用购物车

    private Integer buyerDeleteFlag;//买家删除标志 0 未删除 1 删除

    private Integer sellerDeleteFlag;//卖家删除标志 0 未删除 1 删除

    private BigDecimal realAmount;//原价

    private BigDecimal discountAmount;//原价-卖家优惠

    private BigDecimal rebateAmount;//discount_amount-红包抵扣券

    private BigDecimal scoreAmount;//rebate_amount - 积分

    private List<OrderDetailFormEntity> detailOrderList;
    private OrderFormExtraEntity orderExtra;
    
    //订单对应事件
    private OrderEventEntity orderEvent;

    //对单对应退款记录
    private String applicationType;

    /**
     * 微信标准版支付记录appid
     */
    private String weixinAppId;

    /**
     * 下单渠道
     */
    private String orderChannel;

    /**
     * 微信openId
     */
    private String openId;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 活动状态
     */
    private Integer activityStatus;

    private Integer activityType;//活动类型 0不参与活动 3秒杀 4拼团
    private Long activityRoundId;//活动场次
    private String activityName;//活动名称

    public Byte getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Byte isAlert) {
        this.isAlert = isAlert;
    }

    public BigDecimal getTotalAmountWithoutScoreDiscount() {
        return totalAmountWithoutScoreDiscount;
    }

    public void setTotalAmountWithoutScoreDiscount(BigDecimal totalAmountWithoutScoreDiscount) {
        this.totalAmountWithoutScoreDiscount = totalAmountWithoutScoreDiscount;
    }

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    public JSONObject getJsonDiscountInfo() {
        return jsonDiscountInfo;
    }

    public void setJsonDiscountInfo(JSONObject jsonDiscountInfo) {
        this.jsonDiscountInfo = jsonDiscountInfo;
    }

    public OrderFormExtraEntity getOrderExtra() {
        return orderExtra;
    }

    public void setOrderExtra(OrderFormExtraEntity orderExtra) {
        this.orderExtra = orderExtra;
    }

    /**
     * 主键id
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 大订单号
     *
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 大订单号
     *
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 总价（总价=子订单实价总和 + 邮费 - 折扣
     *
     * @return totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 总价（总价=子订单实价总和 + 邮费 - 折扣
     *
     * @param totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 邮费
     *
     * @return expressFee
     */
    public BigDecimal getExpressFee() {
        return expressFee;
    }

    /**
     * 邮费
     *
     * @param expressFee
     */
    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    /**
     * 折扣
     *
     * @return disconntFee
     */
    public BigDecimal getDisconntFee() {
        return disconntFee;
    }

    /**
     * 折扣
     *
     * @param disconntFee
     */
    public void setDisconntFee(BigDecimal disconntFee) {
        this.disconntFee = disconntFee;
    }

    /**
     * 物流信息主键id
     *
     * @return expressInfoId
     */
    public String getExpressInfoId() {
        return expressInfoId;
    }

    /**
     * 物流信息主键id
     *
     * @param expressInfoId
     */
    public void setExpressInfoId(String expressInfoId) {
        this.expressInfoId = expressInfoId;
    }

    /**
     * 状态 (1未付款 2待发货 3已发货 4确认收货 5已关闭)
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态 (1未付款 2待发货 3已发货 4确认收货 5已关闭)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 状态路径
     *
     * @return statusRoute
     */
    public String getStatusRoute() {
        return statusRoute;
    }

    /**
     * 状态路径
     *
     * @param statusRoute
     */
    public void setStatusRoute(String statusRoute) {
        this.statusRoute = statusRoute;
    }

    /**
     * 订单创建时间
     *
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 订单创建时间
     *
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 状态保持剩余时间(毫秒)
     *
     * @return statusHoldMs
     */
    public Long getStatusHoldMs() {
        return statusHoldMs;
    }

    /**
     * 状态保持剩余时间(毫秒)
     *
     * @param statusHoldMs
     */
    public void setStatusHoldMs(Long statusHoldMs) {
        this.statusHoldMs = statusHoldMs;
    }

    /**
     * 预计转入下一状态时间
     *
     * @return nextStatusTime
     */
    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    /**
     * 预计转入下一状态时间
     *
     * @param nextStatusTime
     */
    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    /**
     * 买家id
     *
     * @return buyerId
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * 买家id
     *
     * @param buyerId
     */
    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 微店id
     *
     * @return weidianId
     */
    public String getWeidianId() {
        return weidianId;
    }

    /**
     * 微店id
     *
     * @param weidianId
     */
    public void setWeidianId(String weidianId) {
        this.weidianId = weidianId;
    }

    /**
     * 支付款id列表，多个id之间用逗号隔开
     *
     * @return paymentIdList
     */
    public String getPaymentIdList() {
        return paymentIdList;
    }

    /**
     * 支付款id列表，多个id之间用逗号隔开
     *
     * @param paymentIdList
     */
    public void setPaymentIdList(String paymentIdList) {
        this.paymentIdList = paymentIdList;
    }

    /**
     * 是否已评价 (0否 1是)
     *
     * @return isComment
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * 是否已评价 (0否 1是)
     *
     * @param isComment
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    /**
     * 邮寄地址id
     *
     * @return addressId
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * 邮寄地址id
     *
     * @param addressId
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * 订单类型 1直接付款 2担保交易
     *
     * @return orderType
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 订单类型 1直接付款 2担保交易
     *
     * @param orderType
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 订单渠道 1APP 2终端机
     *
     * @return orderSource
     */
    public Integer getOrderSource() {
        return orderSource;
    }

    /**
     * 订单渠道 1APP 2终端机
     *
     * @param orderSource
     */
    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * 抵扣券ID
     *
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 抵扣券ID
     *
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * 容易网活动抵扣券ID
     *
     * @return internalCouponId
     */
    public String getInternalCouponId() {
        return internalCouponId;
    }

    /**
     * 容易网活动抵扣券ID
     *
     * @param internalCouponId
     */
    public void setInternalCouponId(String internalCouponId) {
        this.internalCouponId = internalCouponId;
    }

    /**
     * 导购id
     *
     * @return guideId
     */
    public String getGuideId() {
        return guideId;
    }

    /**
     * 导购id
     *
     * @param guideId
     */
    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    /**
     * 本订单享受到的优惠(存json格式数据，方便后续扩展)
     *
     * @return discountInfo
     */
    public String getDiscountInfo() {
        return discountInfo;
    }

    /**
     * 本订单享受到的优惠(存json格式数据，方便后续扩展)
     *
     * @param discountInfo
     */
    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    /**
     * 买家备注
     *
     * @return buyerComment
     */
    public String getBuyerComment() {
        return buyerComment;
    }

    public Integer getBuyerDeleteFlag()
    {
        return buyerDeleteFlag;
    }

    public void setBuyerDeleteFlag(Integer buyerDeleteFlag)
    {
        this.buyerDeleteFlag = buyerDeleteFlag;
    }

    public Integer getSellerDeleteFlag()
    {
        return sellerDeleteFlag;
    }

    public void setSellerDeleteFlag(Integer sellerDeleteFlag)
    {
        this.sellerDeleteFlag = sellerDeleteFlag;
    }

    /**
     * 买家备注
     *
     * @param buyerComment
     */
    public void setBuyerComment(String buyerComment) {
        this.buyerComment = buyerComment;
    }

    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public Integer getCouponSource() {
        return couponSource;
    }

    public void setCouponSource(Integer couponSource) {
        this.couponSource = couponSource;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public BigDecimal getCouponRequirement() {
        return couponRequirement;
    }

    public void setCouponRequirement(BigDecimal couponRequirement) {
        this.couponRequirement = couponRequirement;
    }

    public BigDecimal getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(BigDecimal scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public Integer getDevType() {
        return devType;
    }

    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    public Byte getIsPayVa() {
        return isPayVa;
    }

    public void setIsPayVa(Byte isPayVa) {
        this.isPayVa = isPayVa;
    }

    public BigDecimal getOrderScoreDiscount() {
        return orderScoreDiscount;
    }

    public void setOrderScoreDiscount(BigDecimal orderScoreDiscount) {
        this.orderScoreDiscount = orderScoreDiscount;
    }

    public BigDecimal getOrderCouponDiscount() {
        return orderCouponDiscount;
    }

    public void setOrderCouponDiscount(BigDecimal orderCouponDiscount) {
        this.orderCouponDiscount = orderCouponDiscount;
    }

    public Byte getChangePriceFlag() {
        return changePriceFlag;
    }

    public void setChangePriceFlag(Byte changePriceFlag) {
        this.changePriceFlag = changePriceFlag;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public List<OrderDetailFormEntity> getDetailOrderList() {
        return detailOrderList;
    }

    public void setDetailOrderList(List<OrderDetailFormEntity> detailOrderList) {
        this.detailOrderList = detailOrderList;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getDiscountAmount()
    {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getRebateAmount()
    {
        return rebateAmount;
    }

    public void setRebateAmount(BigDecimal rebateAmount)
    {
        this.rebateAmount = rebateAmount;
    }

    public BigDecimal getScoreAmount()
    {
        return scoreAmount;
    }

    public void setScoreAmount(BigDecimal scoreAmount)
    {
        this.scoreAmount = scoreAmount;
    }

    public OrderEventEntity getOrderEvent()
    {
        return orderEvent;
    }

    public void setOrderEvent(OrderEventEntity orderEvent)
    {
        this.orderEvent = orderEvent;
    }

    public String getApplicationType()
    {
        return applicationType;
    }

    public void setApplicationType(String applicationType)
    {
        this.applicationType = applicationType;
    }

    public String getWeixinAppId() {
        return weixinAppId;
    }

    public void setWeixinAppId(String weixinAppId) {
        this.weixinAppId = weixinAppId;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserPhone()
    {
        return userPhone;
    }

    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone;
    }

    public Integer getOrderScore()
    {
        return orderScore;
    }

    public void setOrderScore(Integer orderScore)
    {
        this.orderScore = orderScore;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Long getActivityRoundId() {
        return activityRoundId;
    }

    public void setActivityRoundId(Long activityRoundId) {
        this.activityRoundId = activityRoundId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    @Override
    public int compareTo(OrderFormEntity o) {
        if(o == null){
            return 1;
        }
        return this.getOrderNo().compareTo(o.getOrderNo());
    }
}