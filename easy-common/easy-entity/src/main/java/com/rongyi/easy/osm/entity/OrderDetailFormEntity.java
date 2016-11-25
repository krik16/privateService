package com.rongyi.easy.osm.entity;

import com.rongyi.easy.mcmc.vo.CommodityVO;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderDetailFormEntity implements Serializable ,Comparable<OrderDetailFormEntity>{
    /**
	 *
	 */
	private static final long serialVersionUID = 132563330176284561L;

	/** 主键id */
    private Integer id;

    /** 子订单号 */
    private String orderItemNo;

    /** 大订单号 */
    private String orderNo;

    /** 商品编号 */
    private String commodityMid;

    /** 购买单价 */
    private BigDecimal unitPrice;

    /** 购买数量 */
    private Integer quantity;

    /** 退款金额 */
    private BigDecimal refundAmount;

    /** 子订单实际价格 */
    private BigDecimal realAmount;

    /** 子订单状态 0同父订单状态 1待退款 2已关闭 3维权中 */
    private String status;

    /** 维权已申请次数 */
    private Integer appealTimes;

    /** 退款已申请次数 */
    private Integer refundTimes;

    /** 已成功退款  0否 1是 */
    private Integer isRefunded;

    /** 客服已判定 */
    private Integer isJudged;

    /** 退款或维权申请id */
    private Integer appealId;

    /** 支付款id列表，用逗号隔开 */
    private String paymentIdList;

    /** 商品规格id */
    private String commoditySpecMid;

    /** 抵扣券ID */
    private String couponId;

    /** 返佣金额 */
    private BigDecimal commodityCommission;

    /** 退款时使用，指退款商品在支付阶段享受到的优惠，例如购买3件商品使用100积分，退款2件，则2件商品对应积分为(2/3)*100四舍五入(存json格式数据)   */
    private String refundDiscountInfo;

    /**促销券抵扣金额*/
    private BigDecimal couponDiscount;

    /**促销券来源 1：平台 2：商家*/
    private Integer couponSource;

    /**促销券类型 1：满减 2：立减*/
    private Integer couponType;

    /**实际支付金额*/
    private BigDecimal payAmount;

    /**大订单改价分摊优惠金额*/
    private BigDecimal orderDiscountFee;

    /**大订单积分分摊*/
    private Integer orderScore;

    /**大订单积分分摊优惠金额*/
    private BigDecimal orderScoreDiscount;

    /**大订单抵扣券分摊优惠金额*/
    private BigDecimal orderCouponDiscount;

    private BigDecimal discountAmount;//原价-卖家优惠

    private BigDecimal rebateAmount;//discount_amount-红包抵扣券

    private BigDecimal scoreAmount;//rebate_amount - 积分

    private Integer limitNum;//关联商品的限购数

    private Integer activityLimitNum;//关联商品的活动限购数

    private Integer activityType;//商品活动 闪购1、特卖2、秒杀3  拼团4

    private BigDecimal disconntFee;//商品折扣

    private String articleId;//文章id

    private Integer activityStatus;//活动状态


    private Integer articleType;//文章类型 1潮人攻略

    private Integer activityId;//活动id

    private String activityName;//活动名称

    private Long activityRoundId;//活动场次id

    private BigDecimal unitOrigPrice;//商品价格（不含活动折扣）

    private Integer exchangeType ;  // 兑换类型，1：兑换 2：换购'


    public String getRefundDiscountInfo() {
		return refundDiscountInfo;
	}

	public void setRefundDiscountInfo(String refundDiscountInfo) {
		this.refundDiscountInfo = refundDiscountInfo;
	}

    /**
     * 主键id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 子订单号
     * @return orderItemNo
     */
    public String getOrderItemNo() {
        return orderItemNo;
    }

    /**
     * 子订单号
     * @param orderItemNo
     */
    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo;
    }

    /**
     * 大订单号
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 大订单号
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 商品编号
     * @return commodityMid
     */
    public String getCommodityMid() {
        return commodityMid;
    }

    /**
     * 商品编号
     * @param commodityMid
     */
    public void setCommodityMid(String commodityMid) {
        this.commodityMid = commodityMid;
    }

    /**
     * 购买单价
     * @return unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 购买单价
     * @param unitPrice
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 购买数量
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 购买数量
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 退款金额
     * @return refundAmount
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * 退款金额
     * @param refundAmount
     */
    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 子订单实际价格
     * @return realAmount
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 子订单实际价格
     * @param realAmount
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 子订单状态 0同父订单状态 1待退款 2已关闭 3维权中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 子订单状态 0同父订单状态 1待退款 2已关闭 3维权中
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 维权已申请次数
     * @return appealTimes
     */
    public Integer getAppealTimes() {
        return appealTimes;
    }

    /**
     * 维权已申请次数
     * @param appealTimes
     */
    public void setAppealTimes(Integer appealTimes) {
        this.appealTimes = appealTimes;
    }

    /**
     * 退款已申请次数
     * @return refundTimes
     */
    public Integer getRefundTimes() {
        return refundTimes;
    }

    /**
     * 退款已申请次数
     * @param refundTimes
     */
    public void setRefundTimes(Integer refundTimes) {
        this.refundTimes = refundTimes;
    }

    /**
     * 已成功退款  0否 1是
     * @return isRefunded
     */
    public Integer getIsRefunded() {
        return isRefunded;
    }

    /**
     * 已成功退款  0否 1是
     * @param isRefunded
     */
    public void setIsRefunded(Integer isRefunded) {
        this.isRefunded = isRefunded;
    }

    /**
     * 客服已判定
     * @return isJudged
     */
    public Integer getIsJudged() {
        return isJudged;
    }

    /**
     * 客服已判定
     * @param isJudged
     */
    public void setIsJudged(Integer isJudged) {
        this.isJudged = isJudged;
    }

    /**
     * 退款或维权申请id
     * @return appealId
     */
    public Integer getAppealId() {
        return appealId;
    }

    /**
     * 退款或维权申请id
     * @param appealId
     */
    public void setAppealId(Integer appealId) {
        this.appealId = appealId;
    }

    /**
     * 支付款id列表，用逗号隔开
     * @return paymentIdList
     */
    public String getPaymentIdList() {
        return paymentIdList;
    }

    /**
     * 支付款id列表，用逗号隔开
     * @param paymentIdList
     */
    public void setPaymentIdList(String paymentIdList) {
        this.paymentIdList = paymentIdList;
    }

    /**
     * 商品规格id
     * @return commoditySpecMid
     */
    public String getCommoditySpecMid() {
        return commoditySpecMid;
    }

    /**
     * 商品规格id
     * @param commoditySpecMid
     */
    public void setCommoditySpecMid(String commoditySpecMid) {
        this.commoditySpecMid = commoditySpecMid;
    }

    /**
     * 抵扣券ID
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 抵扣券ID
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

	/**
	* 返佣金额
	* @return
	*/
	public BigDecimal getCommodityCommission() {
		return commodityCommission;
	}

    public BigDecimal getDisconntFee()
    {
        return disconntFee;
    }

    public void setDisconntFee(BigDecimal disconntFee)
    {
        this.disconntFee = disconntFee;
    }

    /**
	* 返佣金额
	* @param commodityCommission
	*/
	public void setCommodityCommission(BigDecimal commodityCommission) {
		this.commodityCommission = commodityCommission;
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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getOrderDiscountFee() {
        return orderDiscountFee;
    }

    public void setOrderDiscountFee(BigDecimal orderDiscountFee) {
        this.orderDiscountFee = orderDiscountFee;
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

    public Integer getLimitNum()
    {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum)
    {
        this.limitNum = limitNum;
    }

    public Integer getActivityType()
    {
        return activityType;
    }

    public void setActivityType(Integer activityType)
    {
        this.activityType = activityType;
    }


    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Integer getOrderScore()
    {
        return orderScore;
    }

    public void setOrderScore(Integer orderScore)
    {
        this.orderScore = orderScore;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Long getRoundId() {
        return activityRoundId;
    }

    public void setRoundId(Long roundId) {
        this.activityRoundId = activityRoundId;
    }

    public BigDecimal getUnitOrigPrice() {
        return unitOrigPrice;
    }

    public void setUnitOrigPrice(BigDecimal unitOrigPrice) {
        this.unitOrigPrice = unitOrigPrice;
    }

    public Integer getActivityLimitNum() {
        return activityLimitNum;
    }

    public void setActivityLimitNum(Integer activityLimitNum) {
        this.activityLimitNum = activityLimitNum;
    }

    public Long getActivityRoundId() {
        return activityRoundId;
    }

    public void setActivityRoundId(Long activityRoundId) {
        this.activityRoundId = activityRoundId;
    }

    @Override
	public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

    public Integer getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(Integer exchangeType) {
        this.exchangeType = exchangeType;
    }

    @Override
    public int compareTo(OrderDetailFormEntity o) {
        if(o == null){
            return 1;
        }
        return this.getCommodityMid().compareTo(o.getCommodityMid());
    }
}