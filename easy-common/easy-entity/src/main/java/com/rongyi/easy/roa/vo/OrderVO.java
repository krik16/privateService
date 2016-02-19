package com.rongyi.easy.roa.vo;

import com.rongyi.easy.coupon.old_vo.OldCouponCodeVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class OrderVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String orderId;
	private Integer tradeStatus;//交易状态：0:待付款 ,1:已付款,2:已取消,3:已删除, 4:全部, 5:退款(包括已退款和未退款)
	private String orderTime;//下单时间
	private String payTime;//付款时间
	private String itemName;//购买商品
	private BigDecimal unitPrice;//单价
	private Integer unitNum;//下单数量
	private BigDecimal orderPrice;//下单总价：单价*下单数量
	private List<OldCouponCodeVO> orderActivities;
	private String couponId;//券id
	private String thumbnail;//缩略图
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getUnitNum() {
		return unitNum;
	}
	public void setUnitNum(Integer unitNum) {
		this.unitNum = unitNum;
	}
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}
	public List<OldCouponCodeVO> getOrderActivities() {
		return orderActivities;
	}
	public void setOrderActivities(List<OldCouponCodeVO> orderActivities) {
		this.orderActivities = orderActivities;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
