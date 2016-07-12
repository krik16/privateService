package com.rongyi.easy.rpb.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class DivideAccountDto extends BaseDto {

	private static final long serialVersionUID = -475860699835932675L;

	private String mallName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date billDateBegin;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date billDateEnd;
	
	private String billBatchNo;
	
	private Date accountDate;
	
	private Integer id;
	
	private Integer divideAccountId;
	
	private String mallMid;
	
	private String shopMid;
	
	private List<String> mallMidList;
	private List<String> shopMidList;

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

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public List<String> getMallMidList() {
		return mallMidList;
	}

	public void setMallMidList(List<String> mallMidList) {
		this.mallMidList = mallMidList;
	}

	public List<String> getShopMidList() {
		return shopMidList;
	}

	public void setShopMidList(List<String> shopMidList) {
		this.shopMidList = shopMidList;
	}

}
