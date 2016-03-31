package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 店铺下的导购列表VO
 * time ：2015年6月2日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 *   张争平                             2015年6月2日                        1.0           创建文件
 */
public class ShoppingGuideVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String guideId;// 导购id
	private String nickName;// 导购昵称
	private String userLogo;// 导购logo
	private String userName;// 导购姓名
	private String userPhone;// 导购电话
	private Integer status;//状态   是否禁用0正常 1禁用 
	private Integer cashAccountStatus;//提现账号状态  0 正常  1 冻结 2 全部
	private Date createAt;//创建时间
	public String getGuideId() {
		return guideId;
	}
	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCashAccountStatus() {
		return cashAccountStatus;
	}
	public void setCashAccountStatus(Integer cashAccountStatus) {
		this.cashAccountStatus = cashAccountStatus;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
}
