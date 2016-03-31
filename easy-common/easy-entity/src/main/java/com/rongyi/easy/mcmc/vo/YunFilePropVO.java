package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

public class YunFilePropVO implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5131364842365788863L;
//	private String yunFileUname;
//	private String yunFilePwd;
	private String yunBaseUrl;
	public String getYunBaseUrl() {
		return yunBaseUrl;
	}
	public void setYunBaseUrl(String yunBaseUrl) {
		this.yunBaseUrl = yunBaseUrl;
	}
	private String yunFileKey;
	private String yunBucketName;
	public String getYunFileKey() {
		return yunFileKey;
	}
	public void setYunFileKey(String yunFileKey) {
		this.yunFileKey = yunFileKey;
	}
	public String getYunBucketName() {
		return yunBucketName;
	}
	public void setYunBucketName(String yunBucketName) {
		this.yunBucketName = yunBucketName;
	}
	

}
