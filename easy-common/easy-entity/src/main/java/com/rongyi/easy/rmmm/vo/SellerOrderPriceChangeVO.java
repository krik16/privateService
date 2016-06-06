package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 卖家改价预览vo
 * 
 * @author yujisun
 * 
 */
public class SellerOrderPriceChangeVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date createTime;//下单时间
	private BigDecimal expressFee;//运费
	private String orderNo;//订单号
	private String orderTime;//下单时间
	List<SalerSonOrderVO> sonOrderList;// 子订单列表

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public BigDecimal getExpressFee()
	{
		return expressFee;
	}

	public void setExpressFee(BigDecimal expressFee)
	{
		this.expressFee = expressFee;
	}

	public List<SalerSonOrderVO> getSonOrderList()
	{
		return sonOrderList;
	}

	public void setSonOrderList(List<SalerSonOrderVO> sonOrderList)
	{
		this.sonOrderList = sonOrderList;
	}

	@Override
	public String toString() {
		return "SellerOrderPriceChangeVO [createTime=" + createTime
				+ ", expressFee=" + expressFee + ", orderNo=" + orderNo + ", orderTime="
				+ orderTime + ", sonOrderList=" + sonOrderList + "]";
	}

}