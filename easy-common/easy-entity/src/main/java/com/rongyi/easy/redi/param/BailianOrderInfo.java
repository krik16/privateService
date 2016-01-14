package com.rongyi.easy.redi.param;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author rongyi
 */
public class BailianOrderInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orderTypeCode;// String 商品id
	
	private String orderSourceCode;// String 渠道id
	
	private String orderAmount ;
	
	private String orderDiscount ;
	
	private String deliveryCharge ;
	
	private String orderPay ;
	
	private String groupId ;
	
	private List<BailianGoodsInfo> goodsList ;
	
	private AddressInfo addressInfo ;
	
	private SendInfo sendInfo ;
	
	private PayInfo payInfo ;
	
	private InvoiceInfo invoiceInfo ;

	public String getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public String getOrderSourceCode() {
		return orderSourceCode;
	}

	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDiscount() {
		return orderDiscount;
	}

	public void setOrderDiscount(String orderDiscount) {
		this.orderDiscount = orderDiscount;
	}

	public String getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(String deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public String getOrderPay() {
		return orderPay;
	}

	public void setOrderPay(String orderPay) {
		this.orderPay = orderPay;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<BailianGoodsInfo> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<BailianGoodsInfo> goodsList) {
		this.goodsList = goodsList;
	}

	public AddressInfo getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public SendInfo getSendInfo() {
		return sendInfo;
	}

	public void setSendInfo(SendInfo sendInfo) {
		this.sendInfo = sendInfo;
	}

	public PayInfo getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(PayInfo payInfo) {
		this.payInfo = payInfo;
	}

	public InvoiceInfo getInvoiceInfo() {
		return invoiceInfo;
	}

	public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}
	
	


	
}
