package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;


/**
 * 
 * @author Lc
 * 
 * 合作商场VO
 *
 */
public class CooperateMallVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallLogo; // 商场LOGO
	private String id;
	private String name; // 合作商场名称
	private String keyTag; // 标签
	private String bussinessDistrict; // 商圈

	public String getMallLogo() {
		return mallLogo;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getKeyTag() {
		return keyTag;
	}
	public String getBussinessDistrict() {
		return bussinessDistrict;
	}
	public void setMallLogo(String mallLogo) {
		this.mallLogo = mallLogo;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKeyTag(String keyTag) {
		this.keyTag = keyTag;
	}
	public void setBussinessDistrict(String bussinessDistrict) {
		this.bussinessDistrict = bussinessDistrict;
	}
}
