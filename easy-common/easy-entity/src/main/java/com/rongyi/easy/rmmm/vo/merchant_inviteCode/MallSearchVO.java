package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;
/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 筛选的商场相关的信息VO
 * time ：2015年6月4日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 * 张争平                                  2015年6月4日                        1.0           创建文件
 */
public class MallSearchVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallMId;
	private String mallMName;
	public String getMallMId() {
		return mallMId;
	}
	public void setMallMId(String mallMId) {
		this.mallMId = mallMId;
	}
	public String getMallMName() {
		return mallMName;
	}
	public void setMallMName(String mallMName) {
		this.mallMName = mallMName;
	}
	
}
