package com.rongyi.easy.contentnew.entity.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 这个是页面上的列表的数据
 * @author lijing
 * @time 2015-09-07
 *
 */
public class ForumContentListVo implements Serializable{
	/**内容id*/
	private Integer id;
	/**模版id*/
	private Integer modelId;
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
	/**状态0待发布、1已发布、2已关闭*/
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
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

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateAt() {
		return createAt;
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
	
}
