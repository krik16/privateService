package com.rongyi.easy.roa.vo;

import java.io.Serializable;

/**
 * 拼团人信息
* @Description: 
* @author chenjun
* @date 2016年10月14日 上午10:40:56 
*
 */
public class GroupMemberVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2805099818769256083L;
	
	private String memberId;//开团人id
	private String memberLogo;//开团人头像
	private String memberName;//开团人昵称
	private int groupRole;//0团长,1团员
	public int getGroupRole() {
		return groupRole;
	}
	public void setGroupRole(int groupRole) {
		this.groupRole = groupRole;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberLogo() {
		return memberLogo;
	}
	public void setMemberLogo(String memberLogo) {
		this.memberLogo = memberLogo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "GroupMemberVO [memberId=" + memberId + ", memberLogo="
				+ memberLogo 
				+ ", memberName=" + memberName 
				+ ", groupRole=" + groupRole
				+ "]";
	}

}
