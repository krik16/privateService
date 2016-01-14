package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class AppVersionInfoEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**  */
	private Integer id;

	/** 设备类型 （Android/IOS） */
	private String deviceType;

	/** 当前版本号 */
	private String appVersion;

	/** 下载地址 */
	private String appAddres;

	/** 需要更新的 App（MDC2C /RYG /MDB2C ） */
	private String appName;

	/** 是否要强制更新 0 否1是 */
	private Integer appUpdate;

	/** 创建人 */
	private Integer createBy;

	/** 创建时间 */
	private Date createAt;

	/** 修改人 */
	private Integer updateBy;

	/** 修改时间 */
	private Date updateAt;

	/** 版本 */
	private Integer version;

	/** 是否禁用0正常 1禁用 */
	private Integer isDisabled;

	/** 升级说明 */
	private String instruction;

	/**
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 设备类型 （Android/IOS）
	 * 
	 * @return deviceType
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * 设备类型 （Android/IOS）
	 * 
	 * @param deviceType
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * 当前版本号
	 * 
	 * @return appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * 当前版本号
	 * 
	 * @param appVersion
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	/**
	 * 下载地址
	 * 
	 * @return appAddres
	 */
	public String getAppAddres() {
		return appAddres;
	}

	/**
	 * 下载地址
	 * 
	 * @param appAddres
	 */
	public void setAppAddres(String appAddres) {
		this.appAddres = appAddres;
	}

	/**
	 * 需要更新的 App（MDC2C /RYG /MDB2C ）
	 * 
	 * @return appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * 需要更新的 App（MDC2C /RYG /MDB2C ）
	 * 
	 * @param appName
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * 是否要强制更新 0 否1是
	 * 
	 * @return appUpdate
	 */
	public Integer getAppUpdate() {
		return appUpdate;
	}

	/**
	 * 是否要强制更新 0 否1是
	 * 
	 * @param appUpdate
	 */
	public void setAppUpdate(Integer appUpdate) {
		this.appUpdate = appUpdate;
	}

	/**
	 * 创建人
	 * 
	 * @return createBy
	 */
	public Integer getCreateBy() {
		return createBy;
	}

	/**
	 * 创建人
	 * 
	 * @param createBy
	 */
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
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
	 * 修改人
	 * 
	 * @return updateBy
	 */
	public Integer getUpdateBy() {
		return updateBy;
	}

	/**
	 * 修改人
	 * 
	 * @param updateBy
	 */
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * 修改时间
	 * 
	 * @return updateAt
	 */
	public Date getUpdateAt() {
		return updateAt;
	}

	/**
	 * 修改时间
	 * 
	 * @param updateAt
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
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

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

}