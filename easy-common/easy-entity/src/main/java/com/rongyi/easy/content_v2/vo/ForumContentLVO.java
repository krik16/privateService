package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.core.common.util.DateTool;

public class ForumContentLVO  implements Serializable{
	/**内容id*/
	private Integer id;
	
	/**位置id*/
	private Integer positionId;
	/**省份名称*/
	private String provName;
	/**城市名称*/
	private String cityName;
	/**图片*/
	private String picUrls;
	/**标题  或则活动主题*/
	private String title;
	/**发布开始时间*/
	private Date publishBeginAt;
	/**发布结束时间*/
	private Date publishEndAt;
	/**创建人*/
	private String createUser;
	/**创建时间*/
	private Date createAt;
	/**状态0待发布、1已发布、2已关闭 4已结束*/
	private Integer status;
	/**
	 *iosVersion版本
	 */
	private String iosVersion;
	/**
	 * 安卓版本号
	 */
	private String androidVersion;
	/**
	 * 是否置顶 0不置顶，1置顶
	 */
	private int stick;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public String getProvName() {
		return provName;
	}
	public void setProvName(String provName) {
		this.provName = provName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPicUrls() {
		return picUrls;
	}
	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishBeginAt() {
		return DateTool.date2String(publishBeginAt, DateTool.FORMAT_DATETIME2);
	}
	public void setPublishBeginAt(Date publishBeginAt) {
		this.publishBeginAt = publishBeginAt;
	}
	public String getPublishEndAt() {
		return DateTool.date2String(publishEndAt, DateTool.FORMAT_DATETIME2);
	}
	public void setPublishEndAt(Date publishEndAt) {
		this.publishEndAt = publishEndAt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateAt() {
		return DateTool.date2String(createAt, DateTool.FORMAT_DATETIME2);
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the stick
	 */
	public int getStick() {
		return stick;
	}
	/**
	 * @param stick the stick to set
	 */
	public void setStick(int stick) {
		this.stick = stick;
	}
	@Override
	public String toString() {
		return "ForumContentLVO{" +
				"id=" + id +
				", positionId=" + positionId +
				", provName='" + provName + '\'' +
				", cityName='" + cityName + '\'' +
				", picUrls='" + picUrls + '\'' +
				", title='" + title + '\'' +
				", publishBeginAt=" + publishBeginAt +
				", publishEndAt=" + publishEndAt +
				", createUser='" + createUser + '\'' +
				", createAt=" + createAt +
				", status=" + status +
				", iosVersion='" + iosVersion + '\'' +
				", androidVersion='" + androidVersion + '\'' +
				'}';
	}

	public String getIosVersion() {
		return iosVersion;
	}

	public void setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}
}
