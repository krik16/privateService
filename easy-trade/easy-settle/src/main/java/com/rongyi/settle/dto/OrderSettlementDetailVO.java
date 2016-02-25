/**   
* @Title: OrderSettlementDetailVO.java 
* @Package com.rongyi.settle.dto 
* @Description: 商品对账单明细数据Excel视图
* @author ZhengYl   
* @date 2015年12月8日 下午12:32:58 
* @version V1.0   
*/
package com.rongyi.settle.dto;

/**
 * @author ZhengYl
 *
 */
public class OrderSettlementDetailVO {

	/** 订单生成时间 */
	private String createAt;
	
	/** 订单号 */
	private String orderNo;
	
	/** 订单状态 */
	private String orderStatus;
	
	/** 商品名称 */
	private String commodityName;
    
    /** 店铺名称 */
    private String shopName;
     
    /** 商场名称 */
    private String mallName;
    
    /** 原价 */
    private Double origPrice;
    
    /** 支付金额 */
    private Double payAmount;
    
    /** 红包抵扣金额 */
    private Double hbDiscount;
    
    /** 积分抵扣金额 */
    private Double scoreDiscount;
    
    /** 付款渠道 */
    private String paymentChannel;
    
    /** 付款时间 */
    private String paymentTime;
    
    /** 发货时间 */
    private String deliveryTime;
    
    /** 收货时间 */
    private String receiptTime;
    
    /** 买家手机号 */
    private String buyerPhone;

	/** 订单来源 */
	private String orderSource;

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	/**
	 * @return the createAt
	 */
	public String getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the commodityName
	 */
	public String getCommodityName() {
		return commodityName;
	}

	/**
	 * @param commodityName the commodityName to set
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * @return the mallName
	 */
	public String getMallName() {
		return mallName;
	}

	/**
	 * @param mallName the mallName to set
	 */
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	/**
	 * @return the origPrice
	 */
	public Double getOrigPrice() {
		return origPrice;
	}

	/**
	 * @param origPrice the origPrice to set
	 */
	public void setOrigPrice(Double origPrice) {
		this.origPrice = origPrice;
	}

	/**
	 * @return the payAmount
	 */
	public Double getPayAmount() {
		return payAmount;
	}

	/**
	 * @param payAmount the payAmount to set
	 */
	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * @return the hbDiscount
	 */
	public Double getHbDiscount() {
		return hbDiscount;
	}

	/**
	 * @param hbDiscount the hbDiscount to set
	 */
	public void setHbDiscount(Double hbDiscount) {
		this.hbDiscount = hbDiscount;
	}

	/**
	 * @return the scoreDiscount
	 */
	public Double getScoreDiscount() {
		return scoreDiscount;
	}

	/**
	 * @param scoreDiscount the scoreDiscount to set
	 */
	public void setScoreDiscount(Double scoreDiscount) {
		this.scoreDiscount = scoreDiscount;
	}

	/**
	 * @return the paymentChannel
	 */
	public String getPaymentChannel() {
		return paymentChannel;
	}

	/**
	 * @param paymentChannel the paymentChannel to set
	 */
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}

	/**
	 * @return the paymentTime
	 */
	public String getPaymentTime() {
		return paymentTime;
	}

	/**
	 * @param paymentTime the paymentTime to set
	 */
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	/**
	 * @return the deliveryTime
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * @param deliveryTime the deliveryTime to set
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * @return the receiptTime
	 */
	public String getReceiptTime() {
		return receiptTime;
	}

	/**
	 * @param receiptTime the receiptTime to set
	 */
	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
	}

	/**
	 * @return the buyerPhone
	 */
	public String getBuyerPhone() {
		return buyerPhone;
	}

	/**
	 * @param buyerPhone the buyerPhone to set
	 */
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
    
    
}
