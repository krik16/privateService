package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;

public class SuggestionParam extends BaseParam implements Serializable{
	
	/**联系号码*/
	private String contactNum;
	
	/**反馈内容*/
	private String suggestContent;
	
	/**来源  0003 为移动微商城*/
	private String source;

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getSuggestContent() {
		return suggestContent;
	}

	public void setSuggestContent(String suggestContent) {
		this.suggestContent = suggestContent;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
		
}
