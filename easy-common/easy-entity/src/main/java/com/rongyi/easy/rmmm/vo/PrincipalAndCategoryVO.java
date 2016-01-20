package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 *  负责人&品类 VO
 * @author ZhangZhengping
 *
 */
public class PrincipalAndCategoryVO implements Serializable{
	
    private String principal;//负责人
	
	private String principalId;//负责人id
	
	private String category;//品类

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPrincipalId() {
		return principalId;
	}

	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
