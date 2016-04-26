package com.rongyi.easy.rmc.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;

public class LoginWithSmsParam extends BaseParam implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 7210234450106428202L;
	private String mallId;
	private String mobile;
	private String content;
	/**
	 * @return the mallId
	 */
	public String getMallId() {
		return mallId;
	}
	/**
	 * @param mallId the mallId to set
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月8日 上午10:42:36
	* @throws 
	*/
	@Override
	public String toString() {
		return "LoginWithSmsParam [mallId=" + mallId + ", mobile=" + mobile + ", content=" + content + "]";
	}
}
