package com.rongyi.easy.ryoms.entity;

/**
 * 微信 
 * @author 苏娟
 *
 */
public class WechatInfoVo {
	private Integer id;
	private String name;
	private String serviceName;
	private String appId;
	private String appSecret;
	private String encodingAESKey;
	private Integer type;
	private String mallId;
	private String mallName;
	private String dockingType;
	private Integer isMeiwei ;//是否接入美味不用等
	private String meiweiId;  //美味不用等商场ID
	private Integer isDeleted ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public String getEncodingAESKey() {
		return encodingAESKey;
	}
	public void setEncodingAESKey(String encodingAESKey) {
		this.encodingAESKey = encodingAESKey;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getDockingType() {
		return dockingType;
	}
	public void setDockingType(String dockingType) {
		this.dockingType = dockingType;
	}
	public Integer getIsMeiwei() {
		return isMeiwei;
	}
	public void setIsMeiwei(Integer isMeiwei) {
		this.isMeiwei = isMeiwei;
	}
	public String getMeiweiId() {
		return meiweiId;
	}
	public void setMeiweiId(String meiweiId) {
		this.meiweiId = meiweiId;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
