package com.rongyi.easy.ryoms.user.vo;

import java.io.Serializable;

public class WechatVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4045606820984902282L;
	private Integer id;//
	private String name;//微信名称
	private String serviceName;//微信服务号
	private boolean hasRelation;//用户账号与该微信服务号是否关联   true是  false 否
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
	public boolean isHasRelation() {
		return hasRelation;
	}
	public void setHasRelation(boolean hasRelation) {
		this.hasRelation = hasRelation;
	}
	@Override
	public String toString() {
		return "WechatVO [id=" + id + ", name=" + name + ", serviceName="
				+ serviceName + ", hasRelation=" + hasRelation + "]";
	}
	
}
