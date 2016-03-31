/**
 * Project Name:easy-ganghui File Name:Member.java Package Name:com.rongyi.ganghui.entity
 * Date:2015年6月18日下午2:28:12 Copyright (c) 2015, rongyi.com All Rights Reserved.
 * 
 */

package com.rongyi.easy.ganghui;

import java.io.Serializable;

/**
 * ClassName: Member <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 会员. <br/>
 * date: 2015年6月18日 下午2:28:12 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 * 
 */
public class GhMember implements Serializable{
	private static final long serialVersionUID = 3789976898288816991L;
	/**
	 * 会员id
	 */
	private int hyid;
	/**
	 *  会员卡号
	 */
	private String memberCard;
	/**
	 * 卡类型
	 */
	private String cardType;
	/**
	 * 会员姓名
	 */
	private String memberName;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 建卡日期
	 */
	private String bulidDate;
	/**
	 * 有效期
	 */
	private String expireDate;
	/**
	 * 卡状态
	 */
	private float cardStatus;
	/**
	 * 可用积分
	 */
	private String useScore;
	/**
	 * 地址
	 */
	private String address;

	public int getHyid() {
		return hyid;
	}

	public void setHYID(int hyid) {
		hyid = hyid;
	}

	public String getMemberCard() {
		return memberCard;
	}

	public void setMemberCard(String memberCard) {
		this.memberCard = memberCard;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBulidDate() {
		return bulidDate;
	}

	public void setBulidDate(String bulidDate) {
		this.bulidDate = bulidDate;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public float getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(float cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getUseScore() {
		String sarr[] = useScore.split("\\.");
		String formatScore= sarr.length == 0 ? useScore: sarr[0];
		return formatScore.replaceAll(",", "");
	}

	public void setUseScore(String useScore) {
		this.useScore = useScore;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		
	}

}
