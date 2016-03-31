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
public class ScoreParam implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 卖家id
	 */
	private Integer userId;
	
	/**
	 * 分数
	 */
	private Integer mark;
	
	
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	
}
