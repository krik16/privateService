package com.rongyi.easy.entity;

import java.util.Date;

public class IntegralRecord {
	/**  */
	private Integer id;

	/** 会员号 */
	private String memberNo;

	/** 兑换日期 */
	private Date tradeDate;

	/** 礼品id */
	private Integer giftId;

	/** 礼品数量 */
	private Integer giftNum;

	/** 原始每个所需积分 */
	private Integer originalEachIntegral;

	/** 实际每个所需积分 */
	private Integer actualEachIntegral;

	/** 共消费积分数 */
	private Integer totalUseIntegral;

	/**
	 * A – Adjust (调整); E – EARN (消费); G – GIFTREDEEM(兑换) ; H – SIGNUP(签到);C
	 * –CLEAR(清零);R – RESET(重置) ; O – OPEN(初始) ;M – MONEYREDEEM(换购)
	 */
	private String action;

	/** 备注 */
	private String remark;

	/** 开支票者 */
	private String issueby;

	/** 创建时间 */
	private Date createdTime;

	/**
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 会员号
	 * 
	 * @return memberNo
	 */
	public String getMemberNo() {
		return memberNo;
	}

	/**
	 * 会员号
	 * 
	 * @param memberNo
	 */
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	/**
	 * 兑换日期
	 * 
	 * @return tradeDate
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * 兑换日期
	 * 
	 * @param tradeDate
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	/**
	 * 礼品id
	 * 
	 * @return giftId
	 */
	public Integer getGiftId() {
		return giftId;
	}

	/**
	 * 礼品id
	 * 
	 * @param giftId
	 */
	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	/**
	 * 礼品数量
	 * 
	 * @return giftNum
	 */
	public Integer getGiftNum() {
		return giftNum;
	}

	/**
	 * 礼品数量
	 * 
	 * @param giftNum
	 */
	public void setGiftNum(Integer giftNum) {
		this.giftNum = giftNum;
	}

	/**
	 * 原始每个所需积分
	 * 
	 * @return originalEachIntegral
	 */
	public Integer getOriginalEachIntegral() {
		return originalEachIntegral;
	}

	/**
	 * 原始每个所需积分
	 * 
	 * @param originalEachIntegral
	 */
	public void setOriginalEachIntegral(Integer originalEachIntegral) {
		this.originalEachIntegral = originalEachIntegral;
	}

	/**
	 * 实际每个所需积分
	 * 
	 * @return actualEachIntegral
	 */
	public Integer getActualEachIntegral() {
		return actualEachIntegral;
	}

	/**
	 * 实际每个所需积分
	 * 
	 * @param actualEachIntegral
	 */
	public void setActualEachIntegral(Integer actualEachIntegral) {
		this.actualEachIntegral = actualEachIntegral;
	}

	/**
	 * 共消费积分数
	 * 
	 * @return totalUseIntegral
	 */
	public Integer getTotalUseIntegral() {
		return totalUseIntegral;
	}

	/**
	 * 共消费积分数
	 * 
	 * @param totalUseIntegral
	 */
	public void setTotalUseIntegral(Integer totalUseIntegral) {
		this.totalUseIntegral = totalUseIntegral;
	}

	/**
	 * A – Adjust (调整); E – EARN (消费); G – GIFTREDEEM(兑换) ; H – SIGNUP(签到);C
	 * –CLEAR(清零);R – RESET(重置) ; O – OPEN(初始) ;M – MONEYREDEEM(换购)
	 * 
	 * @return action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * A – Adjust (调整); E – EARN (消费); G – GIFTREDEEM(兑换) ; H – SIGNUP(签到);C
	 * –CLEAR(清零);R – RESET(重置) ; O – OPEN(初始) ;M – MONEYREDEEM(换购)
	 * 
	 * @param action
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * 备注
	 * 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注
	 * 
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 开支票者
	 * 
	 * @return issueby
	 */
	public String getIssueby() {
		return issueby;
	}

	/**
	 * 开支票者
	 * 
	 * @param issueby
	 */
	public void setIssueby(String issueby) {
		this.issueby = issueby;
	}

	/**
	 * 创建时间
	 * 
	 * @return createdTime
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * 创建时间
	 * 
	 * @param createdTime
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public IntegralRecord() {

	}

	/**
	 * 供金地创建更改会员积分构造函数
	 * @param memberNo
	 * @param totalUseIntegral
	 * @param action
	 * @param remark
	 * @param issueby
	 * @param createdTime
	 */
	public IntegralRecord(String memberNo, String totalUseIntegral, String action, String remark, String issueby, Date createdTime) {
        this.memberNo = memberNo;
        this.totalUseIntegral = Integer.parseInt(totalUseIntegral);
        this.action = action;
        this.remark = remark;
        this.issueby = issueby;
        this.createdTime = createdTime;
	}
}