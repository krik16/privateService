package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/20              1.0            创建文件
 *
 */
public class UserManagerParam extends BaseParam implements Serializable{


	private static final long serialVersionUID = 5283693194457124613L;
	private Integer id;//账户id
    private String userAccount ;//用户账号
    private String userLogo;//用户头像
    private String  phone; //验证号码是否可注册
    private String  checkCode;//验证码",
    private String nickName;//昵称 验证唯一
    private String  uuId;  //":"设备ID"；//注册时验证,
    private String  invitCode;//":"邀请码" //验证判断
    private String  pswd;  //":"密码"
    private AccountParam account;//账号信息

    private String shopId;//商铺Id
    private String mallId;//商场Id
    private String brandId;//品牌Id
    private String ownerId;//集团Id
    private Integer roleId; 
    private String branchCompanyId;//分公司id
    private String userName;//用户姓名
    private String cardId;//身份证号
	private Integer type = 1;//商家类型：0商场、1品牌    private Integer roleType=2;//角色类型
	private Integer roleType=2;//角色类型 @Deprecated
    private List<AccountParam> accountList;//账号信息
	private Integer identity = 5;//身份类型:0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购
    private Integer isCooperation = 0;//是否合作(给店长、导购用) 0否 1是
    private String memo;//备注
    private Integer createSource = 3;//账号创建来源：0大运营、1商家后台、3App 4 导购升级
    private String stopReason;//停用原因
    private String creatingUserType;
    private Integer merUserId;//操作人id
 

	private String userDesc;//买手描述
	private int flag=0;//操作参数 1升级功能
	private int isUpdate = 0;  //操作参数  （==1直接修改未合作店长为已合作店长 ）
	private int defaultAccount ;  //资金账号默认   1默认支付宝  2默认银行卡
	private String jsessionid ;//摩店登录标识

	private String shareCode;//邀请码
	
	private String faceImg;    //身份证正面照 
	
	private String backImg;   //身份证背面照 
	
	private String workImg;    //工作证照
	
	private String otherImg;   //其它照片
	private Boolean isOrdering;//是否接单状态  true:是，false:否

	//行业版账号2016年10月28日10:50:17
	private Integer industryId;//行业id
	private Integer industryVersionId;//行业版本id
	private Integer childAccountNum;//子账号数量0
	private String validStartAtStamp;//有效期开始时间戳
	private String validEndAtStamp;//有效期结束时间戳
	private String contractCode;//合同号
	private String synTarget;//设置终端 是[1]、否[0] ，第一位为容易逛
	private Integer isChief = 1;//是否主账号，默认 
	private Integer level;//层级 1级 2级 3级
	private Integer settleOrgStrategy;//结算方式 0单一店铺结算 1统一总店结算
	private Integer chiefId; //主账号ID
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public String getShareCode() {
		return shareCode;
	}

	public void setShareCode(String shareCode) {
		this.shareCode = shareCode;
	}

	public String getCreatingUserType() {
		return creatingUserType;
	}

    
	public void setCreatingUserType(String creatingUserType) {
		this.creatingUserType = creatingUserType;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public String getInvitCode() {
        return invitCode;
    }

    public void setInvitCode(String invitCode) {
        this.invitCode = invitCode;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public AccountParam getAccount() {
        return account;
    }

    public void setAccount(AccountParam account) {
        this.account = account;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}



	/*public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}*/

	public String getUserLogo() {
		return userLogo;
	}

	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}

	public List<AccountParam> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<AccountParam> accountList) {
		this.accountList = accountList;
	}
    public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public Integer getIsCooperation() {
		return isCooperation;
	}

	public void setIsCooperation(Integer isCooperation) {
		this.isCooperation = isCooperation;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getCreateSource() {
		return createSource;
	}

	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}

	public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getBranchCompanyId() {
		return branchCompanyId;
	}

	public void setBranchCompanyId(String branchCompanyId) {
		this.branchCompanyId = branchCompanyId;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	public Integer getMerUserId() {
		return merUserId;
	}

	public String getUserAccount() {
		return userAccount;
	}
	public int getIsUpdate() {
		return isUpdate;
	}
	public void setIsUpdate(int isUpdate) {
		this.isUpdate = isUpdate;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public void setMerUserId(Integer merUserId) {
		this.merUserId = merUserId;
	}
	public int getDefaultAccount() {
		return defaultAccount;
	}
	public void setDefaultAccount(int defaultAccount) {
		this.defaultAccount = defaultAccount;
	}
	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
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
	public Boolean getIsOrdering() {
		return isOrdering;
	}
	public void setIsOrdering(Boolean isOrdering) {
		this.isOrdering = isOrdering;
	}
	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public Integer getIndustryVersionId() {
		return industryVersionId;
	}
	public void setIndustryVersionId(Integer industryVersionId) {
		this.industryVersionId = industryVersionId;
	}
	public Integer getChildAccountNum() {
		return childAccountNum;
	}
	public void setChildAccountNum(Integer childAccountNum) {
		this.childAccountNum = childAccountNum;
	}
	public String getValidStartAtStamp() {
		return validStartAtStamp;
	}
	public void setValidStartAtStamp(String validStartAtStamp) {
		this.validStartAtStamp = validStartAtStamp;
	}
	public String getValidEndAtStamp() {
		return validEndAtStamp;
	}
	public void setValidEndAtStamp(String validEndAtStamp) {
		this.validEndAtStamp = validEndAtStamp;
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
	
	public Date getValidStartAt(){
		Date date = null;
		try {
			if(this.validStartAtStamp != null){
				long lt = new Long(this.validStartAtStamp);
				date = new Date(lt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return date;
		}
	}
	
	public Date getValidEndAt(){
		Date date = null;
		try {
			if(this.validEndAtStamp != null){
				long lt = new Long(this.validEndAtStamp);
				date = new Date(lt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return date;
		}
	}

	public Integer getChiefId() {
		return chiefId;
	}

	public void setChiefId(Integer chiefId) {
		this.chiefId = chiefId;
	}

	public Integer getSettleOrgStrategy() {
		return settleOrgStrategy;
	}
	public void setSettleOrgStrategy(Integer settleOrgStrategy) {
		this.settleOrgStrategy = settleOrgStrategy;
	}
	@Override
	public String toString() {
		return "UserManagerParam [id=" + id + ", userAccount=" + userAccount + ", userLogo=" + userLogo + ", phone="
				+ phone + ", checkCode=" + checkCode + ", nickName=" + nickName + ", uuId=" + uuId + ", invitCode="
				+ invitCode + ", pswd=" + pswd + ", account=" + account + ", shopId=" + shopId + ", mallId=" + mallId
				+ ", brandId=" + brandId + ", ownerId=" + ownerId + ", roleId=" + roleId + ", branchCompanyId="
				+ branchCompanyId + ", userName=" + userName + ", cardId=" + cardId + ", type=" + type + ", roleType="
				+ roleType + ", accountList=" + accountList + ", identity=" + identity + ", isCooperation="
				+ isCooperation + ", memo=" + memo + ", createSource=" + createSource + ", stopReason=" + stopReason
				+ ", creatingUserType=" + creatingUserType + ", merUserId=" + merUserId + ", userDesc=" + userDesc
				+ ", flag=" + flag + ", isUpdate=" + isUpdate + ", defaultAccount=" + defaultAccount + ", jsessionid="
				+ jsessionid + ", shareCode=" + shareCode + ", faceImg=" + faceImg + ", backImg=" + backImg
				+ ", workImg=" + workImg + ", otherImg=" + otherImg + ", isOrdering=" + isOrdering + ", industryId="
				+ industryId + ", industryVersionId=" + industryVersionId + ", childAccountNum=" + childAccountNum
				+ ", validStartAtStamp=" + validStartAtStamp + ", validEndAtStamp=" + validEndAtStamp
				+ ", contractCode=" + contractCode + ", synTarget=" + synTarget + ", isChief=" + isChief + ", level="
				+ level + ", settleOrgStrategy=" + settleOrgStrategy + "]";
	}
	
	
}
