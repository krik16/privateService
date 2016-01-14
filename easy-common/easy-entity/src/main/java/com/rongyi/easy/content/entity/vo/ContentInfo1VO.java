
package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 接口推荐版块内容返回数据
 * @author WZH
 *
 */
public class ContentInfo1VO implements Serializable{
	
	public static final long serialVersionUID = 1L;

	private Integer contentType;

	private String contentTypeid;

	private String contentLink;

	private List<SysDocPicVO> picList;
	
	private Integer associatedBrandid;
	
	private String brandName;
	
	/** 显示平台 */
    private Integer channel;
    
	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}
	
	public String getContentTypeid() {
		return contentTypeid;
	}

	public void setContentTypeid(String contentTypeid) {
		this.contentTypeid = contentTypeid;
	}

	public String getContentLink() {
		return contentLink;
	}

	public void setContentLink(String contentLink) {
		this.contentLink = contentLink;
	}

	public List<SysDocPicVO> getPicList() {
		return picList;
	}

	public void setPicList(List<SysDocPicVO> picList) {
		this.picList = picList;
	}

	public Integer getAssociatedBrandid() {
		return associatedBrandid;
	}

	public void setAssociatedBrandid(Integer associatedBrandid) {
		this.associatedBrandid = associatedBrandid;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}
	
}
