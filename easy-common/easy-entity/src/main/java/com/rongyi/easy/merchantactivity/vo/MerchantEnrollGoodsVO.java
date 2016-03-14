package com.rongyi.easy.merchantactivity.vo;

/**
 * 报名卡劵实体
 * 
 * @author wangjh
 * @date 2016年3月10日
 */
public class MerchantEnrollGoodsVO {
	/**
	 * 开始时间
	 * 
	 * @return
	 */
	public String getActivityStartAt() {
		return activityStartAt;
	}

	/**
	 * 开始时间
	 * 
	 * @param activityStartAt
	 */
	public void setActivityStartAt(String activityStartAt) {
		this.activityStartAt = activityStartAt;
	}

	/**
	 * 结束时间
	 * 
	 * @return
	 */
	public String getActivityEndAt() {
		return activityEndAt;
	}

	/**
	 * 结束时间
	 * 
	 * @param activityEndAt
	 */
	public void setActivityEndAt(String activityEndAt) {
		this.activityEndAt = activityEndAt;
	}

	/**
	 * 
	 * @return
	 */
	public int getActivityGoodsId() {
		return activityGoodsId;
	}

	/**
	 * 
	 * @param activityGoodsId
	 */
	public void setActivityGoodsId(int activityGoodsId) {
		this.activityGoodsId = activityGoodsId;
	}

	/**
	 * 卡劵ID
	 * 
	 * @return
	 */
	public String getGoodsId() {
		return goodsId;
	}

	/**
	 * 卡劵ID
	 * 
	 * @param goodsId
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * 卡劵标题
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 卡劵标题
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 卡劵图片
	 * 
	 * @return
	 */
	public String getPicUrl() {
		return picUrl;
	}

	/**
	 * 卡劵图片
	 * 
	 * @param picUrl
	 */
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	/**
	 * 审核状态
	 * 
	 * @return 0：待审核 1：退回修改（未通过） 2：报名成功（通过） 3：参与成功、活动结束
	 */
	public int getCheckStatus() {
		return checkStatus;
	}

	/**
	 * 审核状态
	 * 
	 * @param checkStatus
	 *            0：待审核 1：退回修改（未通过） 2：报名成功（通过） 3：参与成功、活动结束
	 */
	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}

	/**
	 * 审核理由
	 * 
	 * @return
	 */
	public String getCheckReason() {
		return checkReason;
	}

	/**
	 * 审核理由
	 * 
	 * @param checkReason
	 */
	public void setCheckReason(String checkReason) {
		this.checkReason = checkReason;
	}

	/**
	 * 申请撤销状态
	 * 
	 * @return 1：已申请 0：未申请
	 */
	public int getApplyStatus() {
		return applyStatus;
	}

	/**
	 * 申请撤销状态
	 * 
	 * @param applyStatus
	 *            1：已申请 0：未申请
	 */
	public void setApplyStatus(int applyStatus) {
		this.applyStatus = applyStatus;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	/**
	 * ID
	 */
	private int activityGoodsId = 0;
	private int activityId = 0;
	private String goodsId = "";
	private String title = "";
	private String picUrl = "";
	private int checkStatus = 0;
	private String checkReason = "";
	private int applyStatus = 0;
	private String activityStartAt = "";
	private String activityEndAt = "";
}
