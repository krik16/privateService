package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * 申请维权更新图片参数
 * @author zzp
 *
 */
public class UpdateSafeguardPicParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 维权id*/
	private String safeguardId;
	/** 维权要上传的图片凭证,用“;”隔开*/
	private String safeguardPicList;
	
	public String getSafeguardId() {
		return safeguardId;
	}
	public void setSafeguardId(String safeguardId) {
		this.safeguardId = safeguardId;
	}
	public String getSafeguardPicList() {
		return safeguardPicList;
	}
	public void setSafeguardPicList(String safeguardPicList) {
		this.safeguardPicList = safeguardPicList;
	}
	
}
