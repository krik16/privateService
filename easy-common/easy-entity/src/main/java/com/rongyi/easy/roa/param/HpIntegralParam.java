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
	private String userCardId;//绑定卡的id
	private String phone;
	private Integer integralType; //积分卡类型 0rp 1默认
	private Integer hideLoseCard;//是否隐藏失效积分卡 0:不是 1:是

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

	public String getUserCardId()
	{
		return userCardId;
	}

	public void setUserCardId(String userCardId)
	{
		this.userCardId = userCardId;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public Integer getIntegralType() {
		return integralType;
	}

	public void setIntegralType(Integer integralType) {
		this.integralType = integralType;
	}

	public Integer getHideLoseCard() {
		return hideLoseCard;
	}

	public void setHideLoseCard(Integer hideLoseCard) {
		this.hideLoseCard = hideLoseCard;
	}

	//不要把密码打印出来
	@Override
	public String toString() {
		return "HpIntegralParam [jsessionId=" + jsessionId + ", cardCode=" + cardCode+ ", phone=" + phone + ", cardNo=" + cardNo +", userCardId=" + userCardId + ", password="
				+ "******" + ", code=" + code + ", cardIntegral=" + cardIntegral +", hideLoseCard=" + hideLoseCard + "]";
	}

}
