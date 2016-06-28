package com.rongyi.easy.rpb.dto;

import java.util.Date;

public class DivideAccountDto extends BaseDto {

	private String mallName;
	
	private Date billDateBegin;
	
	private Date billDateEnd;
	
	private String billBatchNo;
	
	private Date accountDate;

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
}
