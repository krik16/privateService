package com.rongyi.easy.ryoms.user.param;

import java.io.Serializable;
import java.util.List;

public class RoleAuthParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 132130534642395779L;
	private Integer id;//角色id
	private List<Integer> authIds;//权限id集合
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Integer> getAuthIds() {
		return authIds;
	}
	public void setAuthIds(List<Integer> authIds) {
		this.authIds = authIds;
	}
	@Override
	public String toString() {
		return "RoleAuthParam [id=" + id + ", authIds=" + authIds + "]";
	}
	
	
}
