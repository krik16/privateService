/**
 * 
 */
package com.rongyi.easy.roa.param;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：闪电项目-积分福利
 * time ：2016年7月27日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年7月27日               1.0              创建文件
 */
public class HpIntegralParam implements Serializable{
	
	private String jsessionId;
	private String cardCode;//卡公司编码
	private String cardNo;//卡号
	private String password;//卡密码
	private String code;//验证码
	private String cardIntegral;//兑换的第三方积分

	public String getJsessionId() {
		return jsessionId;
	}

	public void setJsessionId(String jsessionId) {
		this.jsessionId = jsessionId;
	}

	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCardIntegral() {
		return cardIntegral;
	}
	public void setCardIntegral(String cardIntegral) {
		this.cardIntegral = cardIntegral;
	}
	//不要把密码打印出来
	@Override
	public String toString() {
		return "HpIntegralParam [jsessionId=" + jsessionId + ", cardCode=" + cardCode + ", cardNo=" + cardNo + ", password="
				+ "******" + ", code=" + code + ", cardIntegral=" + cardIntegral + "]";
	}

}
