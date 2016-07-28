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
	
	private String jsessionid;
	private String cardCode;//卡公司编码
	private String cardNum;//卡号
	private String password;//卡密码
	private String code;//验证码
	private String cardIntegral;//兑换的第三方积分
	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
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
		return "HpIntegralParam [jsessionid=" + jsessionid + ", cardCode=" + cardCode + ", cardNum=" + cardNum + ", password="
				+ "******" + ", code=" + code + ", cardIntegral=" + cardIntegral + "]";
	}

}
