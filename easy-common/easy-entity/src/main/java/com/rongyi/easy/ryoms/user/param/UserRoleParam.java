package com.rongyi.easy.ryoms.user.param;

import java.io.Serializable;
import java.util.List;

public class UserRoleParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3955488979856332066L;
	private Integer userId;//账号id
	private List<Integer> roleIds;//分配的角色id集合
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<Integer> getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(List<Integer> roleIds) {
		this.roleIds = roleIds;
	}
	@Override
	public String toString() {
		return "UserRoleParam [userId=" + userId + ", roleIds=" + roleIds + "]";
	}
	
}
