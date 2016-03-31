package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 导出生成excel邀请码封装类
 * time ：2015年5月27日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 * 张争平                               2015年5月27日                        1.0           创建文件
 */
public class InviteCodeVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String inviteCode;//邀请码
	private Date createAt;//生成时间
	private Integer status;//状态
	private String proposerAccount;//申请人账号
	private String userAccount;//使用人账号
	private Date usedAt;//使用时间
	private String mallName;//商场名称
	private String shopName;//店铺名称
	
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getProposerAccount() {
		return proposerAccount;
	}
	public void setProposerAccount(String proposerAccount) {
		this.proposerAccount = proposerAccount;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public Date getUsedAt() {
		return usedAt;
	}
	public void setUsedAt(Date usedAt) {
		this.usedAt = usedAt;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
}
