package com.rongyi.easy.rmmm.param.user;

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;
import java.util.List;

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

    private static final long serialVersionUID = 1L;

    private Integer id;//账户id
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
    private Integer type;//商家类型：0商场、1品牌
    private Integer roleType=2;//角色类型
    private List<AccountParam> accountList;//账号信息
    private Integer identity;//身份类型:0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购
    private Integer isCooperation;//是否合作(给店长、导购用) 0否 1是
    private String memo;//备注
    private Integer createSource;//账号创建来源：0大运营、1商家后台
    private String stopReason;//停用原因
    private String creatingUserType;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreatingUserType() {
		return creatingUserType;
	}

	public void setCreatingUserType(String creatingUserType) {
		this.creatingUserType = creatingUserType;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
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
	

}
