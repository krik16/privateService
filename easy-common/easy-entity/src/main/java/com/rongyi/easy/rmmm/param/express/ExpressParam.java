package com.rongyi.easy.rmmm.param.express;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

public class ExpressParam extends BaseParam implements Serializable{
	
	private String expressOrderInfoId;//物流信息主键id 不是物流单号
	
	private String keyWord;//快递公司列表搜索关键字
	
	private String orderNum;//订单号

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getExpressOrderInfoId() {
		return expressOrderInfoId;
	}

	public void setExpressOrderInfoId(String expressOrderInfoId) {
		this.expressOrderInfoId = expressOrderInfoId;
	}

	@Override
	public String toString() {
		return "ExpressParam [expressOrderInfoId=" + expressOrderInfoId
				+ ", keyWord=" + keyWord + ", orderNum=" + orderNum + "]";
	}

}
