package com.rongyi.easy.domain.member;

import java.io.Serializable;

public class CityonActivity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8593301255766359952L;
	
	private Integer id;
	private String mobile;
	private String memberNo;
	private String mallId;
	private String memberName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
