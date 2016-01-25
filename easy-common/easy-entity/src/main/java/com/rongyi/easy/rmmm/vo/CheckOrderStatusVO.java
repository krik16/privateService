package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CheckOrderStatusVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> closeOrderNums;//已关闭订单号集合

	private Integer shopId;//店铺id

	private Integer guideId;//买手id

	private Integer guideType;//1是导购 2是买手

	public List<String> getCloseOrderNums()
	{
		return closeOrderNums;
	}

	public void setCloseOrderNums(List<String> closeOrderNums)
	{
		this.closeOrderNums = closeOrderNums;
	}

	public Integer getShopId()
	{
		return shopId;
	}

	public void setShopId(Integer shopId)
	{
		this.shopId = shopId;
	}

	public Integer getGuideId()
	{
		return guideId;
	}

	public void setGuideId(Integer guideId)
	{
		this.guideId = guideId;
	}

	public Integer getGuideType()
	{
		return guideType;
	}

	public void setGuideType(Integer guideType)
	{
		this.guideType = guideType;
	}

	@Override
	public String toString() {
		return "CheckOrderStatusVO{" +
				", shopId='" + shopId + '\'' +
				", guideId='" + guideId + '\'' +
				", guideType='" + guideType + '\'' +
				'}';
	}
}
