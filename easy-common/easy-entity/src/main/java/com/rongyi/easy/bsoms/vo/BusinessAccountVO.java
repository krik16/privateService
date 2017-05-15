package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.rmmm.entity.UserAccountEntity;
/**
 * 商家账户VO
 * @author hebo
 *
 */
public class BusinessAccountVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;//用户id
	private String userLogo;//用户头像
	private String idCard;//身份证
	private String account;//用户账号 （手机号）
	private String userAccount ;//  用户账号
	private String userName;//用户姓名
	private String nickName;//用户昵称
	private Integer type;//商家类型
	private Integer identity;//身份类型
	private Integer groupId;//集团id
	private String groupMid;//集团mid
	private String groupName;//集团名称
	private Integer brandId;//品牌id
	private String brandMid;//品牌mid
	private String brandName;//品牌名
	private Integer mallId;//商场id
	private String mallMid;//商场mid
	private String mallName;//商场名
	private Integer shopId;//店铺id
	private String shopMid;//店铺mid
	private String shopName;//店铺名
	private Integer roleId;//角色id
	private String roleName;//角色名
	private Integer branchId;//分公司id
	private String branchName;//分公司名
	private Integer parentShopId;//上级店铺id
	private Integer grandpaShopId;//上上级店铺id
	private Integer accountStatus;//账号状态：是否禁用0正常 1禁用'
	private Integer isSuspended;//资金账户：是否冻结
	private BigDecimal balance;//资金账户余额
	private String comment;//评价
	private Integer createSource;//账号来源：0大运营、1商家后台
	private String createBy;//创建人
	private String createName;//创建人
	private Date createAt;
	private String updateBy;//修改人
	private String updateName;//修改人
	private Date updateAt;
	private String stopReason;
	private Date stopAt;
	private String virtualStopReason;   //资金账号停用理由
	private Date virtualStopAt;         //资金账号停用时间
	private Integer isAcc;              //是否加速审核  0是 1否
	private Date certTime;              //提交审核时间
	private Integer userStatus;         //用户状态 0未提交审核 2审核中 1审核通过 3审核不通过
	private String shareCode;

	private Integer industryId;
	private String industryName;
	private Integer industryVersionId;
	private String industryVersionName;
	private Integer childAccountNum;
	private Date validStartAt;
	private Date validEndAt;
	private String contractCode;
	private String synTarget;
	private Integer isChief;
	private Integer level;
	private Integer settleOrgStrategy;//结算方式 0单一店铺结算 1统一总店结算
	private Integer chiefId;//主账号id
	private String chiefName;//主账号名称
	private List<UserAccountEntity> userAccounts;
	private String faceImg;    //身份证正面照
	private String backImg;   //身份证背面照
	private String workImg;    //工作证照
	private String otherImg;   //其它照片
	private String resume;      //自我简介
	private String position;   //申请所在城市
	private String merchantAddress;//商户地址
	private String terminalType;//终端类型:1 容易逛,2 微信,3 终端机,多个以逗号隔开
	private Integer defaultTerminal;//默认终端:0 无默认终端,1 容易逛,2 微信,3 终端机
	private Integer isOpenQrCode;//是否开放用户专属二维码  0:否,1:是
	private Integer isAllowBindingWechat ;//是否允许分店绑定微信  0:否,1:是
	private Integer shopNum;//店铺数量
	
	public String getMerchantAddress() {
		return merchantAddress;
	}
	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}
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
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public Integer getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Integer getIsSuspended() {
		return isSuspended;
	}
	public void setIsSuspended(Integer isSuspended) {
		this.isSuspended = isSuspended;
	}
//	public Integer getCashAccountStatus() {
//		return cashAccountStatus;
//	}
//	public void setCashAccountStatus(Integer cashAccountStatus) {
//		this.cashAccountStatus = cashAccountStatus;
//	}
	public Integer getCreateSource() {
		return createSource;
	}
	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public Integer getMallId() {
		return mallId;
	}
	public void setMallId(Integer mallId) {
		this.mallId = mallId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getStopReason() {
		return stopReason;
	}
	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}
	public Date getStopAt() {
		return stopAt;
	}
	public void setStopAt(Date stopAt) {
		this.stopAt = stopAt;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getGroupMid() {
		return groupMid;
	}
	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}
	public String getBrandMid() {
		return brandMid;
	}
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	public String getVirtualStopReason() {
		return virtualStopReason;
	}
	public void setVirtualStopReason(String virtualStopReason) {
		this.virtualStopReason = virtualStopReason;
	}
	public Date getVirtualStopAt() {
		return virtualStopAt;
	}
	public void setVirtualStopAt(Date virtualStopAt) {
		this.virtualStopAt = virtualStopAt;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public Integer getIsAcc() {
		return isAcc;
	}
	public void setIsAcc(Integer isAcc) {
		this.isAcc = isAcc;
	}
	public Date getCertTime() {
		return certTime;
	}
	public void setCertTime(Date certTime) {
		this.certTime = certTime;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public Integer getIndustryVersionId() {
		return industryVersionId;
	}
	public void setIndustryVersionId(Integer industryVersionId) {
		this.industryVersionId = industryVersionId;
	}
	public String getIndustryVersionName() {
		return industryVersionName;
	}
	public void setIndustryVersionName(String industryVersionName) {
		this.industryVersionName = industryVersionName;
	}
	public Integer getChildAccountNum() {
		return childAccountNum;
	}
	public void setChildAccountNum(Integer childAccountNum) {
		this.childAccountNum = childAccountNum;
	}
	public Date getValidStartAt() {
		return validStartAt;
	}
	public void setValidStartAt(Date validStartAt) {
		this.validStartAt = validStartAt;
	}
	public Date getValidEndAt() {
		return validEndAt;
	}
	public void setValidEndAt(Date validEndAt) {
		this.validEndAt = validEndAt;
	}
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getSynTarget() {
		return synTarget;
	}
	public void setSynTarget(String synTarget) {
		this.synTarget = synTarget;
	}
	public Integer getIsChief() {
		return isChief;
	}
	public void setIsChief(Integer isChief) {
		this.isChief = isChief;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getSettleOrgStrategy() {
		return settleOrgStrategy;
	}
	public void setSettleOrgStrategy(Integer settleOrgStrategy) {
		this.settleOrgStrategy = settleOrgStrategy;
	}
	public List<UserAccountEntity> getUserAccounts() {
		return userAccounts;
	}
	public void setUserAccounts(List<UserAccountEntity> userAccounts) {
		this.userAccounts = userAccounts;
	}
	public Integer getChiefId() {
		return chiefId;
	}
	public void setChiefId(Integer chiefId) {
		this.chiefId = chiefId;
	}
	public String getChiefName() {
		return chiefName;
	}
	public void setChiefName(String chiefName) {
		this.chiefName = chiefName;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	public String getFaceImg() {
		return faceImg;
	}
	public void setFaceImg(String faceImg) {
		this.faceImg = faceImg;
	}
	public String getBackImg() {
		return backImg;
	}
	public void setBackImg(String backImg) {
		this.backImg = backImg;
	}
	public String getWorkImg() {
		return workImg;
	}
	public void setWorkImg(String workImg) {
		this.workImg = workImg;
	}
	public String getOtherImg() {
		return otherImg;
	}
	public void setOtherImg(String otherImg) {
		this.otherImg = otherImg;
	}
	public Integer getParentShopId() {
		return parentShopId;
	}
	public void setParentShopId(Integer parentShopId) {
		this.parentShopId = parentShopId;
	}
	public Integer getGrandpaShopId() {
		return grandpaShopId;
	}
	public void setGrandpaShopId(Integer grandpaShopId) {
		this.grandpaShopId = grandpaShopId;
	}

	public String getShareCode() {
		return shareCode;
	}
	public void setShareCode(String shareCode) {
		this.shareCode = shareCode;
	}

	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public Integer getDefaultTerminal() {
		return defaultTerminal;
	}
	public void setDefaultTerminal(Integer defaultTerminal) {
		this.defaultTerminal = defaultTerminal;
	}
	public Integer getIsOpenQrCode() {
		return isOpenQrCode;
	}
	public void setIsOpenQrCode(Integer isOpenQrCode) {
		this.isOpenQrCode = isOpenQrCode;
	}
	public Integer getIsAllowBindingWechat() {
		return isAllowBindingWechat;
	}
	public void setIsAllowBindingWechat(Integer isAllowBindingWechat) {
		this.isAllowBindingWechat = isAllowBindingWechat;
	}
	
	public Integer getShopNum() {
		return shopNum;
	}
	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}
	
	public String getBindingMid(){
		if(getIdentity().equals(0)){
			return groupMid;
		}else if(getIdentity().equals(1)){
			return mallMid;
		}else if(getIdentity().equals(2)){
			return brandMid;
		}else if (getIdentity().equals(3)) {
			return null;
		}else if (getIdentity().equals(4) || getIdentity().equals(5) || getIdentity().equals(8)) {
			return shopMid;
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "BusinessAccountVO [id=" + id + ", userLogo=" + userLogo
				+ ", idCard=" + idCard + ", account=" + account
				+ ", userAccount=" + userAccount + ", userName=" + userName
				+ ", nickName=" + nickName + ", type=" + type + ", identity="
				+ identity + ", groupId=" + groupId + ", groupMid=" + groupMid
				+ ", groupName=" + groupName + ", brandId=" + brandId
				+ ", brandMid=" + brandMid + ", brandName=" + brandName
				+ ", mallId=" + mallId + ", mallMid=" + mallMid + ", mallName="
				+ mallName + ", shopId=" + shopId + ", shopMid=" + shopMid
				+ ", shopName=" + shopName + ", roleId=" + roleId
				+ ", roleName=" + roleName + ", branchId=" + branchId
				+ ", branchName=" + branchName + ", parentShopId="
				+ parentShopId + ", grandpaShopId=" + grandpaShopId
				+ ", accountStatus=" + accountStatus + ", isSuspended="
				+ isSuspended + ", balance=" + balance + ", comment=" + comment
				+ ", createSource=" + createSource + ", createBy=" + createBy
				+ ", createName=" + createName + ", createAt=" + createAt
				+ ", updateBy=" + updateBy + ", updateName=" + updateName
				+ ", updateAt=" + updateAt + ", stopReason=" + stopReason
				+ ", stopAt=" + stopAt + ", virtualStopReason="
				+ virtualStopReason + ", virtualStopAt=" + virtualStopAt
				+ ", isAcc=" + isAcc + ", certTime=" + certTime
				+ ", userStatus=" + userStatus + ", shareCode=" + shareCode
				+ ", industryId=" + industryId + ", industryName="
				+ industryName + ", industryVersionId=" + industryVersionId
				+ ", industryVersionName=" + industryVersionName
				+ ", childAccountNum=" + childAccountNum + ", validStartAt="
				+ validStartAt + ", validEndAt=" + validEndAt
				+ ", contractCode=" + contractCode + ", synTarget=" + synTarget
				+ ", isChief=" + isChief + ", level=" + level
				+ ", settleOrgStrategy=" + settleOrgStrategy + ", chiefId="
				+ chiefId + ", chiefName=" + chiefName + ", userAccounts="
				+ userAccounts + ", faceImg=" + faceImg + ", backImg="
				+ backImg + ", workImg=" + workImg + ", otherImg=" + otherImg
				+ ", resume=" + resume + ", position=" + position
				+ ", merchantAddress=" + merchantAddress + ", terminalType="
				+ terminalType + ", defaultTerminal=" + defaultTerminal
				+ ", isOpenQrCode=" + isOpenQrCode + ", isAllowBindingWechat="
				+ isAllowBindingWechat + ", shopNum=" + shopNum + "]";
	}
	
}
