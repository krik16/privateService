/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月12日上午11:25:12
 * @Description: TODO
 *
 **/

package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**	
 * @Author:  柯军
 * @Description: 支付账号支付使用次数 
 * @datetime:2015年8月12日上午11:25:12
 *
 **/

public class PayAccountUseTotal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5369078436331546179L;
	
	/**
	 * 账号
	 */
	private String payAccount;
	
	/**
	 * 账号类型
	 */
	private Integer payType;
	
	/**
	 * 购买次数
	 */
	private int count;

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
