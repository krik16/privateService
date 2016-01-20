/** 
 * @Title: BuyerMarkParam.java 
 * @Package com.rongyi.easy.coupon.param 
 * @Description: RMMM给卖家打分传入参数的封装
 * @author wzh  
 * @date 2015年5月19日 上午10:57:02 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * @author wzh
 *
 */
public class FeedbackParam implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 联系方式
	 */
	private String contact;
	
	/**
	 * 反馈意见
	 */
	private String content;
	
	/**
	 * 称呼
	 */
	private String name;
	/**
	 * 类型
	 */
	private Integer type;//1容易逛 2摩店
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
}
