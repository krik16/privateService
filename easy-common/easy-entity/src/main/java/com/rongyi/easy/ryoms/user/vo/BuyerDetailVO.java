package com.rongyi.easy.ryoms.user.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.rongyi.easy.bsoms.vo.CertifiedInfoVo;
import com.rongyi.easy.rmmm.vo.merchant_inviteCode.CashAccountVO;
/**
 * 买手账号详情VO
 * @author user
 *
 */
public class BuyerDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2433369535533257831L;
	
	private Integer id;//用户id
	private String userLogo;//用户头像
	private String idCard;//身份证号
	private String account;//用户账号 （手机号）
	private String userAccount;//  用户账号
	private String userName;//用户姓名
	private String nickName;//用户昵称
	private Integer accountStatus;//账号状态：是否禁用0正常 1禁用'
	private String comment;//评价
	private String createBy;//创建人
	private Date createAt;
	private String updateBy;//修改人
	private Date updateAt;
	private Integer isSuspended;        //资金账户：是否冻结
	private BigDecimal balance;//资金账户余额
	
	private BuyerAlipyVO buyerAlipyVO;//支付宝配置信息
	private CashAccountVO cashAccountVO;//银行配置信息
	private CertifiedInfoVo certifiedVo;//身份证照片信息
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getIsSuspended() {
		return isSuspended;
	}
	public void setIsSuspended(Integer isSuspended) {
		this.isSuspended = isSuspended;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BuyerAlipyVO getBuyerAlipyVO() {
		return buyerAlipyVO;
	}
	public void setBuyerAlipyVO(BuyerAlipyVO buyerAlipyVO) {
		this.buyerAlipyVO = buyerAlipyVO;
	}
	public CashAccountVO getCashAccountVO() {
		return cashAccountVO;
	}
	public void setCashAccountVO(CashAccountVO cashAccountVO) {
		this.cashAccountVO = cashAccountVO;
	}
	public CertifiedInfoVo getCertifiedVo() {
		return certifiedVo;
	}
	public void setCertifiedVo(CertifiedInfoVo certifiedVo) {
		this.certifiedVo = certifiedVo;
	}
	@Override
	public String toString() {
		return "BuyerDetailVO [id=" + id + ", userLogo=" + userLogo
				+ ", idCard=" + idCard + ", account=" + account
				+ ", userAccount=" + userAccount + ", userName=" + userName
				+ ", nickName=" + nickName + ", accountStatus=" + accountStatus
				+ ", comment=" + comment + ", createBy=" + createBy
				+ ", createAt=" + createAt + ", updateBy=" + updateBy
				+ ", updateAt=" + updateAt + ", isSuspended=" + isSuspended
				+ ", balance=" + balance + ", buyerAlipyVO=" + buyerAlipyVO
				+ ", cashAccountVO=" + cashAccountVO + ", certifiedVo="
				+ certifiedVo + "]";
	}
	
	
}
