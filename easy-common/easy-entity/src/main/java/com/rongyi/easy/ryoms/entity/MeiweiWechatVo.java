package com.rongyi.easy.ryoms.entity;

import java.io.Serializable;

/**
 * 微信号与美味不用等对应关系
 * @author 苏娟
 *
 */
public class MeiweiWechatVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer wechatId;
	private String mallId;
	private String meiweiId;
	private String mallName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getWechatId() {
		return wechatId;
	}
	public void setWechatId(Integer wechatId) {
		this.wechatId = wechatId;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMeiweiId() {
		return meiweiId;
	}
	public void setMeiweiId(String meiweiId) {
		this.meiweiId = meiweiId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	
}
