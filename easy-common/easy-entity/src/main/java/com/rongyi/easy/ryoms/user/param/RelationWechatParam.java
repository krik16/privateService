package com.rongyi.easy.ryoms.user.param;

import java.io.Serializable;
import java.util.List;

public class RelationWechatParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7923272643850246723L;
	private Integer id;//用户账号id
	private List<Integer> wechatIds;//微信id集合
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Integer> getWechatIds() {
		return wechatIds;
	}
	public void setWechatIds(List<Integer> wechatIds) {
		this.wechatIds = wechatIds;
	}
	@Override
	public String toString() {
		return "RelationWechatParam [id=" + id + ", wechatIds=" + wechatIds
				+ "]";
	}
	
}
