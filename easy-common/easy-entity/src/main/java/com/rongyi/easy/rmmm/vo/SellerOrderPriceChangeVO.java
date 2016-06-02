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

	@Override
	public String toString() {
		return "SellerOrderPriceChangeVO [" +
				"createTime=" + createTime + ", " +
				"expressFee=" + expressFee+"]";
	}

}