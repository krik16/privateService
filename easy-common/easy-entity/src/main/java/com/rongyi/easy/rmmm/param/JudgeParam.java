package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class JudgeParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String applicationId;// 售后id

	private String conclusion;// 维权结论

	private String officialDescribe;// 官方描述

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getOfficialDescribe() {
		return officialDescribe;
	}

	public void setOfficialDescribe(String officialDescribe) {
		this.officialDescribe = officialDescribe;
	}

}
