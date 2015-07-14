/** 
* @Title: AbnormalParam.java 
* @Package com.rongyi.tms.moudle.vo 
* @Description: 异常支付编辑参数
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月23日 下午1:17:18 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.moudle.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZhengYl
 *
 */
public class AbnormalParam {
	private Integer id;
	
	private String userId;
	
	private String userAccount;
	
	private String orderNo;
	
	private BigDecimal amount;
	
	private Short paymentType;

	private String paymentAccount;

	private String paymentName;

	private String paymentBank;
	
	private String remarks;
	
	private Date createAt;

	private String createUser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Short getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(Short paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentAccount() {
		return paymentAccount;
	}

	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public String getPaymentBank() {
		return paymentBank;
	}

	public void setPaymentBank(String paymentBank) {
		this.paymentBank = paymentBank;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	
}
