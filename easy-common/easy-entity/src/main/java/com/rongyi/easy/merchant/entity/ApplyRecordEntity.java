package com.rongyi.easy.merchant.entity;

import java.io.Serializable;
import java.util.Date;

public class ApplyRecordEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 表主键  */
    private Integer id;

    /** 申请时间 */
    private Date createAt;

    /** 申请的邀请码数量 */
    private Integer inviteCodeNum;

    /** 申请人账号 */
    private String proposerAccount;
    
    /** 创建人账号ID **/
    private int createAccountId;
    
    /** 创建人账号  **/
    private String createAccount;
    
    /**  渠道 1商家  2买手 **/
    private String channel ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getInviteCodeNum() {
        return inviteCodeNum;
    }

    public void setInviteCodeNum(Integer inviteCodeNum) {
        this.inviteCodeNum = inviteCodeNum;
    }

    public String getProposerAccount() {
        return proposerAccount;
    }

    public void setProposerAccount(String proposerAccount) {
        this.proposerAccount = proposerAccount;
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