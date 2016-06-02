package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;
/**
 * 抄同款接口传参
 * @author user
 *
 */
public class CopyCommodityParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commodityId;//商品id (用于获取商品详情)
	private String number;//商品款号/商品款号前几位
	
	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
