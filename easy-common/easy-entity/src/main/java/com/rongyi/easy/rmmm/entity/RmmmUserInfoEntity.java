package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;


public class RmmmUserInfoEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键  */
    private Integer id;

    /** 用户头像logo */
    private String userLogo;

    /** 角色ID  */
    private Integer roleId;

    /** 电话号码 */
    private String userPhone;
    
    /**  用户账号 */
    private String userAccount;

    /** 密码 */
    private String userPwd;

    /** 姓名 */
    private String userName;

    /** 昵称 */
    private String userNickName;

    /** 1:通过，2：审核中，3：删除 */
    private Integer userStatus;
    /** 账号 */
    private Integer accountId;


    /** 创建人 */
    private Integer createBy;

    /** 创建时间 */
    private Date createAt;

    /** 修改人 */
    private Integer updateBy;

    /** 修改时间 */
    private Date updateAt;

    /** 版本 */
    private Integer version;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 设备UUID */
    private String deviceUuid;

    /** 身份证号 */
    private String cardId;
    /** 环信用户账号 */
    private String userIMCount;
    private String devId;//登录时获取当前设备Id
    private Integer type;  // 1 导购 2买手
    private Integer identity;
    private Integer isCooperation;
    private String memo;
    private Integer createSource;
    private Integer stopReason;
	private String sharCode; //邀请码

    private String userDesc;//用户简介

   // private List<Integer> identityTypeList; //用户账号身份列表

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

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
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
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
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
        this.deviceUuid = deviceUuid;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserIMCount() {
        return userIMCount;
    }

    public void setUserIMCount(String userIMCount) {
        this.userIMCount = userIMCount;
    }
    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
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

	public Integer getStopReason() {
		return stopReason;
	}

	public void setStopReason(Integer stopReason) {
		this.stopReason = stopReason;
	}
    public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getSharCode() {
        return sharCode;
    }

    public void setSharCode(String sharCode) {
        this.sharCode = sharCode;
    }}