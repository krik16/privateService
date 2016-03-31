package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderSmallTicketEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键id */
	private Integer id;

	/** 大订单号 */
	private String orderNo;

	/** 图片列表（以";"隔开） */
	private String picUrls;

	/** 创建时间 */
	private Date createAt;

	/** 是否禁用0正常 1禁用 */
	private Integer isDisabled;

	/** 版本 */
	private Integer version;

	/**
	 * 主键id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 主键id
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 大订单号
	 * 
	 * @return orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * 大订单号
	 * 
	 * @param orderNo
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * 图片列表（以";"隔开）
	 * 
	 * @return picUrls
	 */
	public String getPicUrls() {
		return picUrls;
	}

	/**
	 * 图片列表（以";"隔开）
	 * 
	 * @param picUrls
	 */
	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}

	/**
	 * 创建时间
	 * 
	 * @return createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * 创建时间
	 * 
	 * @param createAt
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * 是否禁用0正常 1禁用
	 * 
	 * @return isDisabled
	 */
	public Integer getIsDisabled() {
		return isDisabled;
	}

	/**
	 * 是否禁用0正常 1禁用
	 * 
	 * @param isDisabled
	 */
	public void setIsDisabled(Integer isDisabled) {
		this.isDisabled = isDisabled;
	}

	/**
	 * 版本
	 * 
	 * @return version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * 版本
	 * 
	 * @param version
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "OrderSmallTicketEntity [id=" + id + ", orderNo=" + orderNo + ", picUrls=" + picUrls + ", createAt=" + createAt
				+ ", isDisabled=" + isDisabled + ", version=" + version + "]";
	}

}