package com.rongyi.easy.bsoms.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer type;

    private Integer identity;

    private Integer isCooperation;

    private String userLogo;

    private Integer roleId;

    private String userPhone;
    
    private String userAccount ; 

    private String userPwd;

    private String userName;

    private String userNickName;

    private Integer userStatus;

    private Integer accountId;

    private Integer createBy;

    private Date createAt;

    private Integer updateBy;

    private Date updateAt;

    private Integer version;

    private Integer isDisabled;

    private String deviceUuid;

    private String cardId;

    private String memo;
    
    private Date stopAt ;
    
    private Integer stopBy;
    
    private String branchCompanyName;   //所属分公司
    
    private String shopName ;  //所属店铺
    
    private String createName;  //添加人
    
    private String roleName ;  //角色职位

    private Integer createSource;
    
    private String stopReason;//停用 原因
    
    private UserShop userShop;
    
	private String useCode; //注册使用的邀请码
    
    private String jsessionid ;//摩店登录标识	
	private Integer isEdit = 1;  //是否可编辑  0可编辑  1不可编辑
    private Integer isOrdering;  //是否接单中  0是  1否
    private Date updateOrderingAt;//更新接单状态的时间
    public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public Integer getIsCooperation() {
        return isCooperation;
    }

    public void setIsCooperation(Integer isCooperation) {
        this.isCooperation = isCooperation;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo == null ? null : userLogo.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getDeviceUuid() {
        return deviceUuid;
    }

    public void setDeviceUuid(String deviceUuid) {
        this.deviceUuid = deviceUuid == null ? null : deviceUuid.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    
    public Date getStopAt() {
		return stopAt;
	}

	public void setStopAt(Date stopAt) {
		this.stopAt = stopAt;
	}

	public Integer getStopBy() {
		return stopBy;
	}

	public void setStopBy(Integer stopBy) {
		this.stopBy = stopBy;
	}

	public String getBranchCompanyName() {
		return branchCompanyName;
	}

	public void setBranchCompanyName(String branchCompanyName) {
		this.branchCompanyName = branchCompanyName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public Integer getCreateSource() {
        return createSource;
    }

    public void setCreateSource(Integer createSource) {
        this.createSource = createSource;
    }

	public UserShop getUserShop() {
		return userShop;
	}

	public void setUserShop(UserShop userShop) {
		this.userShop = userShop;
	}
	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUseCode() {
		return useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getJsessionid() {
		return jsessionid;
	}

	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}public Integer getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Integer isEdit) {
		this.isEdit = isEdit;
	}

    public Integer getIsOrdering() {
        return isOrdering;
    }

    public void setIsOrdering(Integer isOrdering) {
        this.isOrdering = isOrdering;
    }

    public Date getUpdateOrderingAt() {
        return updateOrderingAt;
    }

    public void setUpdateOrderingAt(Date updateOrderingAt) {
        this.updateOrderingAt = updateOrderingAt;
    }
}