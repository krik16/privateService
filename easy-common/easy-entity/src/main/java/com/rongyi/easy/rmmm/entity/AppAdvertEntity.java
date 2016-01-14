package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class AppAdvertEntity implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 设备类型 1:Android 2:IOS） */
    private String deviceType;

    /** APP标识 */
    private String appId;

    /** 1:MDC2C 2:RYG 3:MDB2C ） */
    private String appName;

    /** 用户标识 */
    private String idfa;

    /** 1:指盟 2:万普 */
    private Integer channel;

    /** 1:未激活 2:已激活 */
    private Integer status;

    /** 创建时间 */
    private Date createAt;

    /** 修改时间 */
    private Date updateAt;

    /** 版本 */
    private Integer version;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 设备类型 1:Android 2:IOS）
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设备类型 1:Android 2:IOS）
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * APP标识
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * APP标识
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 1:MDC2C 2:RYG 3:MDB2C ）
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 1:MDC2C 2:RYG 3:MDB2C ）
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 用户标识
     * @return idfa
     */
    public String getIdfa() {
        return idfa;
    }

    /**
     * 用户标识
     * @param idfa
     */
    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    /**
     * 1:指盟 2:万普
     * @return channel
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * 1:指盟 2:万普
     * @param channel
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * 1:未激活 2:已激活
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 1:未激活 2:已激活
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 修改时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 是否禁用0正常 1禁用
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }
}