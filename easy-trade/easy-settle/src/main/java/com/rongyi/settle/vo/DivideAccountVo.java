package com.rongyi.settle.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.rongyi.easy.settle.entity.SmDivideAccount;

public class DivideAccountVo extends SmDivideAccount {

	private Integer orderId;

	private String orderNo;

	private Integer subOrderId;

	private Integer unitPrice;

	private Integer unitCount;

	private String couponId;
	
	private Integer shopId;
	
	private Integer mallId;
	
	/**
	 * mongoDB商场ID
	 */
	private String mallMid;
	
	/**
	 * mongoDB店铺ID
	 */
	private String shopMid;
	
	/**
	 * 订单类型：1-商品订单，0-卡券订单
	 */
	private Integer orderType;
	
	 /**
     * 订单总商品数
     */
    private Integer totalQuantity;
    
    private Integer totalAmount;
    
    private String mallName;
    
    private String shopName;
    
    private Date finishTime;
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(Integer subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Integer getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(Integer unitCount) {
		this.unitCount = unitCount;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getMallId() {
		return mallId;
	}

	public void setMallId(Integer mallId) {
		this.mallId = mallId;
	}

	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @Description 支付金额，单位：元
	 * @return
	 */
	public String getPayAmountY() {
		String payAmountY = "";
		Integer payAmount = super.getPayAmount();
		if (null != payAmount) {
			payAmountY = new BigDecimal(payAmount).divide(new BigDecimal(100)).toString();
		}
		return payAmountY;
	}
	
	/**
	 * @Description 结算金额，单位：元
	 * @return
	 */
	public String getSettleAmountY() {
		return this.getPayAmountY();
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	
}