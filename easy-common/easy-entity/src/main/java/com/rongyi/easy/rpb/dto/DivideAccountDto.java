package com.rongyi.easy.rpb.dto;

import java.util.Date;

public class DivideAccountDto extends BaseDto {

	private static final long serialVersionUID = -475860699835932675L;

	private String mallName;
	
	private Date billDateBegin;
	
	private Date billDateEnd;
	
	private String billBatchNo;
	
	private Date accountDate;
	
	private Integer id;
	
	private Integer divideAccountId;
	
	private Integer mallId;
	
	private Integer shopId;

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public Date getBillDateBegin() {
		return billDateBegin;
	}

	public void setBillDateBegin(Date billDateBegin) {
		this.billDateBegin = billDateBegin;
	}

	public Date getBillDateEnd() {
		return billDateEnd;
	}

	public void setBillDateEnd(Date billDateEnd) {
		this.billDateEnd = billDateEnd;
	}

	public String getBillBatchNo() {
		return billBatchNo;
	}

	public void setBillBatchNo(String billBatchNo) {
		this.billBatchNo = billBatchNo;
	}

	public Date getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDivideAccountId() {
		return divideAccountId;
	}

	public void setDivideAccountId(Integer divideAccountId) {
		this.divideAccountId = divideAccountId;
	}

	public Integer getMallId() {
		return mallId;
	}

	public void setMallId(Integer mallId) {
		this.mallId = mallId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
}
