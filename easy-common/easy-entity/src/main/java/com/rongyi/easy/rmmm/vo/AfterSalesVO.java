package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class AfterSalesVO  implements Serializable{
	
	private String afterSalesStatus;//是否支持申请售后（0:不支持，1:支持，2:已超过7天

	private String guideId;//导购或买手id

	private String guideImId;//导购或买手环信账号

	private String officalImId;// 官方环信账号

	private String officalPhone;// 官方联系号码

	public String getAfterSalesStatus() {
		return afterSalesStatus;
	}

	public void setAfterSalesStatus(String afterSalesStatus) {
		this.afterSalesStatus = afterSalesStatus;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public String getGuideImId() {
		return guideImId;
	}

	public void setGuideImId(String guideImId) {
		this.guideImId = guideImId;
	}

	public String getOfficalImId() {
		return officalImId;
	}

	public void setOfficalImId(String officalImId) {
		this.officalImId = officalImId;
	}

	public String getOfficalPhone() {
		return officalPhone;
	}

	public void setOfficalPhone(String officalPhone) {
		this.officalPhone = officalPhone;
	}

	@Override
	public String toString() {
		return "AfterSalesVO [afterSalesStatus=" + afterSalesStatus
				+ ", guideId=" + guideId + ", guideImId=" + guideImId
				+ ", officalImId=" + officalImId + ", officalPhone="
				+ officalPhone + "]";
	}

}
