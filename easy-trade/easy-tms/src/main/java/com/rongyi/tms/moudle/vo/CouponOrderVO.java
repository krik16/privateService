package com.rongyi.tms.moudle.vo;

import java.io.Serializable;
import java.util.Date;

public class CouponOrderVO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1175090792646316513L;

	private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 持有人 昵称
     */
    private String userName;

    /**
     * 持有人手机
     */
    private String userPhone;
    
    /**
     * 优惠券名称
     */
    private String title;


    /**
     * 待付款[0], 已付款[1], 已取消[2],已删除[3], （退款中[4], 已退款[5] 已发货 [6] 确认收货 [7] 已关闭 [8]
     */
    private Byte status;
    
    /**
     * 订单金额
     */
    private Double totalAmount;

    /**
     * 下单时间
     */
    private Date createAt;
    
    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 优惠位图 1=使用红包  2=使用积分 4=使用抵扣券 后续继续加
     */
    private Byte discountBitmap;


	private Integer hbDiscount;

    /**
     * 红包券码
     */
    private String hbCode;
    
    /**
     * 使用积分数量
     */
    private Integer score;
    
    /**
     * 抵扣券
     */
    private String rebateCode;

	/**
	 * 抵扣券抵扣金额
	 */
	private  Integer rebateDiscount;
    
    private String couponId;

	private Integer payChannel;

	private Integer source;

	private Double payAmount;

	private String payNo;

	private Double scoreDiscount;
    
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Byte getDiscountBitmap() {
		return discountBitmap;
	}

	public void setDiscountBitmap(Byte discountBitmap) {
		this.discountBitmap = discountBitmap;
	}

	public String getHbCode() {
		return hbCode;
	}

	public void setHbCode(String hbCode) {
		this.hbCode = hbCode;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getRebateCode() {
		return rebateCode;
	}

	public void setRebateCode(String rebateCode) {
		this.rebateCode = rebateCode;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public Integer getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public Double getScoreDiscount() {
		return scoreDiscount;
	}

	public void setScoreDiscount(Double scoreDiscount) {
		this.scoreDiscount = scoreDiscount;
	}

	public Integer getRebateDiscount() {
		return rebateDiscount;
	}

	public void setRebateDiscount(Integer rebateDiscount) {
		this.rebateDiscount = rebateDiscount;
	}

	public Integer getHbDiscount() {
		return hbDiscount;
	}

	public void setHbDiscount(Integer hbDiscount) {
		this.hbDiscount = hbDiscount;
	}
}