package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class SubmitOrderVO implements Serializable {

	private List<String> parentOrderNumList;// 父订单号集合

	public List<String> getCouponCodeList() {
		return couponCodeList;
	}

	public void setCouponCodeList(List<String> couponCodeList) {
		this.couponCodeList = couponCodeList;
	}

	private List<String> couponCodeList ; // 电子会员卡券+商品的自提券码

	public List<String> getParentOrderNumList() {
		return parentOrderNumList;
	}

	public void setParentOrderNumList(List<String> parentOrderNumList) {
		this.parentOrderNumList = parentOrderNumList;
	}

}
