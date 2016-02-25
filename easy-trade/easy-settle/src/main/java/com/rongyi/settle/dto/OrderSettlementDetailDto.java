/**   
* @Title: OrderStatementDetailDto.java 
* @Package com.rongyi.settle.dto 
* @Description: 商品对账单明细数据DB对象
* @author ZhengYl   
* @date 2015年12月8日 上午11:12:07 
* @version V1.0   
*/
package com.rongyi.settle.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZhengYl
 *
 */
public class OrderSettlementDetailDto {

	/** 订单生成时间 */
	private Date createAt;

	/** 订单号 */
	private String orderNo;

	/** 订单状态 */
	private String orderStatus;

	/** 商品Id */
	private String commodityId;

	/** 商品名称 */
	private String commodityName;

	/** 店铺Id */
	private String shopId;

	/** 店铺名称 */
	private String shopName;

	/** 商场Id */
	private String mallId;

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
	private Date paymentTime;

	/** 发货时间 */
	private Date deliveryTime;

	/** 收货时间 */
	private Date receiptTime;

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
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt
	 *            the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
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
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the commodityId
	 */
	public String getCommodityId() {
		return commodityId;
	}

	/**
	 * @param commodityId
	 *            the commodityId to set
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * @return the commodityName
	 */
	public String getCommodityName() {
		return commodityName;
	}

	/**
	 * @param commodityName
	 *            the commodityName to set
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	/**
	 * @return the shopId
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * @param shopId
	 *            the shopId to set
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * @param shopName
	 *            the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * @return the mallId
	 */
	public String getMallId() {
		return mallId;
	}

	/**
	 * @param mallId
	 *            the mallId to set
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	/**
	 * @return the mallName
	 */
	public String getMallName() {
		return mallName;
	}

	/**
	 * @param mallName
	 *            the mallName to set
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
	 * @param origPrice
	 *            the origPrice to set
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
	 * @param payAmount
	 *            the payAmount to set
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
	 * @param hbDiscount
	 *            the hbDiscount to set
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
	 * @param scoreDiscount
	 *            the scoreDiscount to set
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
	 * @param paymentChannel
	 *            the paymentChannel to set
	 */
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}

	/**
	 * @return the paymentTime
	 */
	public Date getPaymentTime() {
		return paymentTime;
	}

	/**
	 * @param paymentTime
	 *            the paymentTime to set
	 */
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	/**
	 * @return the deliveryTime
	 */
	public Date getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * @param deliveryTime
	 *            the deliveryTime to set
	 */
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * @return the receiptTime
	 */
	public Date getReceiptTime() {
		return receiptTime;
	}

	/**
	 * @param receiptTime
	 *            the receiptTime to set
	 */
	public void setReceiptTime(Date receiptTime) {
		this.receiptTime = receiptTime;
	}

	/**
	 * @return the buyerPhone
	 */
	public String getBuyerPhone() {
		return buyerPhone;
	}

	/**
	 * @param buyerPhone
	 *            the buyerPhone to set
	 */
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public OrderSettlementDetailVO toVO() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		OrderSettlementDetailVO vo = new OrderSettlementDetailVO();

		vo.setCreateAt(dateFormat.format(getCreateAt()));
		vo.setOrderNo(getOrderNo());
		vo.setOrderStatus(getOrderStatus());
		vo.setCommodityName(getCommodityName());
		vo.setShopName(getShopName());
		vo.setMallName(getMallName());
		vo.setOrigPrice(getOrigPrice());
		vo.setPayAmount(getPayAmount());
		vo.setHbDiscount(getHbDiscount());
		vo.setScoreDiscount(getScoreDiscount());
		vo.setPaymentChannel(getPaymentChannel());
		if (getPaymentTime() != null) {
			vo.setPaymentTime(dateFormat.format(getPaymentTime()));
		}
		if (getDeliveryTime() != null) {
			vo.setDeliveryTime(dateFormat.format(getDeliveryTime()));
		}
		if (getReceiptTime() != null) {
			vo.setReceiptTime(dateFormat.format(getReceiptTime()));
		}
		vo.setBuyerPhone(getBuyerPhone());
		vo.setOrderSource(getOrderSource());
		return vo;
	}
}
