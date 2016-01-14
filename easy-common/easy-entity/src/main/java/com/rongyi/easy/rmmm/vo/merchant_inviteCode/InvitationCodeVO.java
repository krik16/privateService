package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.util.Date;

/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 邀请码列表显示封装类
 * time ：2015年5月27日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 * 张争平    2015年5月27日                        1.0           创建文件
 */
public class InvitationCodeVO {
	
	private int id;//邀请码id
	private String proposerAccount;//申请人账号
	private int inviteNum;//邀请码数量
	private int usedInviteNum;//已使用数量
	private int invalidNum;//作废数量
	private Date createAt;//申请时间
	private int createAccountId;
	private String createAccount;
	private String channel ;//渠道  1商家  2买手
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProposerAccount() {
		return proposerAccount;
	}
	public void setProposerAccount(String proposerAccount) {
		this.proposerAccount = proposerAccount;
	}
	public int getInviteNum() {
		return inviteNum;
	}
	public void setInviteNum(int inviteNum) {
		this.inviteNum = inviteNum;
	}
	public int getUsedInviteNum() {
		return usedInviteNum;
	}
	public void setUsedInviteNum(int usedInviteNum) {
		this.usedInviteNum = usedInviteNum;
	}
	public int getInvalidNum() {
		return invalidNum;
	}
	public void setInvalidNum(int invalidNum) {
		this.invalidNum = invalidNum;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public int getCreateAccountId() {
		return createAccountId;
	}
	public void setCreateAccountId(int createAccountId) {
		this.createAccountId = createAccountId;
	}
	public String getCreateAccount() {
		return createAccount;
	}
	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	
}
