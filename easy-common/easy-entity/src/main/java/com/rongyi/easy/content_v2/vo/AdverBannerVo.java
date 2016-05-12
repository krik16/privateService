package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * APP广告banner Vo
 * @author sj
 *
 */
public class AdverBannerVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title; //标题
	private String picUrl; //图片地址
	private Integer type ;     //类型 
	private String typeVal;  //类型绑定值
	private Integer status;   //状态   0待发布、1已发布、2已关闭 3全部  4 已结束
	private Date publishBeginAt ; //发布开始时间
	private Date publishEndAt;   //发布结束时间
	private String shareTitle;  //分享标题
	private String appTitle;    //app标题
	private String shareContent; //分享内容
	private String sharePic;   //分享图片
	private String typeName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getTypeVal() {
		return typeVal;
	}
	public void setTypeVal(String typeVal) {
		this.typeVal = typeVal;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Date getPublishBeginAt() {
		return publishBeginAt;
	}
	public void setPublishBeginAt(Date publishBeginAt) {
		this.publishBeginAt = publishBeginAt;
	}
	public Date getPublishEndAt() {
		return publishEndAt;
	}
	public void setPublishEndAt(Date publishEndAt) {
		this.publishEndAt = publishEndAt;
	}
	public String getShareTitle() {
		return shareTitle;
	}
	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}
	public String getAppTitle() {
		return appTitle;
	}
	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}
	public String getShareContent() {
		return shareContent;
	}
	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}
	public String getSharePic() {
		return sharePic;
	}
	public void setSharePic(String sharePic) {
		this.sharePic = sharePic;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}   
}
