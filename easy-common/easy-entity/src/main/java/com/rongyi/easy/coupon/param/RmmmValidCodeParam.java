package com.rongyi.easy.coupon.param;

import java.io.Serializable;
/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 极速验券参数
 * time ：2015年8月19日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 *   张争平                              2015年8月19日                      1.0           创建文件
 */
public class RmmmValidCodeParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;//券码
	private Integer codeNum;//券码数量
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getCodeNum() {
		return codeNum;
	}
	public void setCodeNum(Integer codeNum) {
		this.codeNum = codeNum;
	}
	
}
