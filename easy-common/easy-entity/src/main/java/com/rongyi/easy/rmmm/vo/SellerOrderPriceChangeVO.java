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
	private Date expressFee;//运费
	List<SalerSonOrderVO> sonOrderList;// 子订单列表

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public Date getExpressFee()
	{
		return expressFee;
	}

	public void setExpressFee(Date expressFee)
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
		return "SellerOrderPriceChangeVO [" +
				"createTime=" + createTime + ", " +
				"expressFee=" + expressFee+"]";
	}

}