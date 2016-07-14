package com.rongyi.settle.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.rongyi.easy.settle.entity.SmDivideAccount;
import com.rongyi.settle.util.AmountUtil;

public class DivideAccountVo extends SmDivideAccount {

	private Integer orderId;

	private String orderNo;

	private Integer subOrderId;

	private Integer unitPrice;

	private Integer unitCount;

	private String couponId;
	
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
    
    private BigDecimal totalAmount;
    
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

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
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
			payAmountY = String.valueOf(AmountUtil.changFenToYuan(payAmount));
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

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	
}