package com.rongyi.easy.ryoms.advert.vo;

/**
 * @Description: 理由VO类
 * @author wangjh
 * @date 2016年2月18
 */
public class ReasonVO {
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	// 创建人
	private String createBy = "";
	// 创建时间
	private String createAt = "";
	// 理由
	private String reason = "";
}
