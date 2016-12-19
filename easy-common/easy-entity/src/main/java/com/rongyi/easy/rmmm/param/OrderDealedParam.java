package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;
import com.rongyi.easy.rmmm.vo.SalerSonOrderVO;

public class OrderDealedParam extends BaseParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderId;// 大订单id
	private String discount;// 要减去的价格
	private String commodityPostage;// 运费
	private String orderNo;// 大订单号
	private String orderPrice;// 订单价格
	private Integer userId;//卖家用户id
	private Integer source = 1;//操作平台 1摩店 2商家后台
    private List<SalerSonOrderVO> sonOrderList = new ArrayList<>(); //商品详情
    private String orderTotalPrice;//订单总价（包括邮费），用来计算一键改价
	private int type = 0;// 0:卖家撤销订单，1：拼团团过期通知,默认0

	public String getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getSource()
	{
		return source;
	}

	public void setSource(Integer source)
	{
		this.source = source;
	}

	public List<SalerSonOrderVO> getSonOrderList()
	{
		return sonOrderList;
	}

	public void setSonOrderList(List<SalerSonOrderVO> sonOrderList)
	{
		this.sonOrderList = sonOrderList;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "OrderDealedParam [orderId=" + orderId + ", discount="
				+ discount + ", commodityPostage=" + commodityPostage
				+ ", orderNo=" + orderNo + ", orderPrice=" + orderPrice
				+ ", userId=" + userId + ", source=" + source
				+ ", sonOrderList=" + sonOrderList + ", orderTotalPrice="
				+ orderTotalPrice + ", type=" + type
				+ "]";
	}
}
