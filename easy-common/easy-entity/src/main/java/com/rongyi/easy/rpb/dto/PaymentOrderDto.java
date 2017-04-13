package com.rongyi.easy.rpb.dto;

import java.util.Date;
import java.util.List;

public class PaymentOrderDto extends BaseDto {

	private static final long serialVersionUID = -2528692529109089729L;

	private Date endAt;

	private Integer status;

	private Integer tradeType;

	private Integer payChannel;

	private List<Integer> tradeTypeList;

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTradeType() {
		return tradeType;
	}

	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
	}

	public Integer getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}

	public List<Integer> getTradeTypeList() {
		return tradeTypeList;
	}

	public void setTradeTypeList(List<Integer> tradeTypeList) {
		this.tradeTypeList = tradeTypeList;
	}

}
