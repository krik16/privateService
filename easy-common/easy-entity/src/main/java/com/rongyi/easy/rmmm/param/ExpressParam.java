package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class ExpressParam extends MalllifeBaseParam implements Serializable{
	
	private String expressOrderInfoId;//物流信息主键id 不是物流单号

	public String getExpressOrderInfoId() {
		return expressOrderInfoId;
	}

	public void setExpressOrderInfoId(String expressOrderInfoId) {
		this.expressOrderInfoId = expressOrderInfoId;
	}

	@Override
	public String toString() {
		return "ExpressParam [expressOrderInfoId=" + expressOrderInfoId + "]";
	}

}
