package com.rongyi.easy.coupon.vo;

import java.io.Serializable;

/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 扫码进入验码页的返回信息
 * time ：2015年8月19日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 *   张争平                             2015年8月19日                       1.0           创建文件
 */
public class SweepCodeToValidVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;//券码
	private Integer unUsedNum;//未使用数量
	private String codeType;//券类型
	private Double originalPrice;//原价
	private Double currentPrice;//现价
	private String suggest;//建议
	private Integer codeNum;//验码数量
	private String phone;//用户名
	private String errorNo;
	private String title;//券码名称
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getErrorNo() {
		return errorNo;
	}
	public void setErrorNo(String errorNo) {
		this.errorNo = errorNo;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getUnUsedNum() {
		return unUsedNum;
	}
	public void setUnUsedNum(Integer unUsedNum) {
		this.unUsedNum = unUsedNum;
	}
	public String getCodeType() {
		return codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public String getSuggest() {
		return suggest;
	}
	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
	public Integer getCodeNum() {
		return codeNum;
	}
	public void setCodeNum(Integer codeNum) {
		this.codeNum = codeNum;
	}
	public Double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public Double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

		@Override
		public String toString() {
				final StringBuffer sb = new StringBuffer("SweepCodeToValidVO{");
				sb.append("code='").append(code).append('\'');
				sb.append(", unUsedNum=").append(unUsedNum);
				sb.append(", codeType='").append(codeType).append('\'');
				sb.append(", originalPrice=").append(originalPrice);
				sb.append(", currentPrice=").append(currentPrice);
				sb.append(", suggest='").append(suggest).append('\'');
				sb.append(", codeNum=").append(codeNum);
				sb.append(", phone='").append(phone).append('\'');
				sb.append(", errorNo='").append(errorNo).append('\'');
				sb.append(", title='").append(title).append('\'');
				sb.append('}');
				return sb.toString();
		}
}
