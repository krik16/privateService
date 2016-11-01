package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class UserAccountEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 类型1:支付宝,2：银行卡 */
    private Integer accountType;

    /** 银行账户或支付宝账号 */
    private String accountCode;

    /** 支付宝姓名/储蓄卡人姓名 */
    private String accountName;

    /** 对应银行表的ID */
    private Integer bankId;

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
    /** 用户Id **/
    private Integer userId;
    
    /** 是否为默认资金账号  0是  1否  **/
    private Integer isDefault =1 ;

    private Integer settleOrgStrategy;//结算方式 0单一店铺结算 1统一总店结算
    
    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 类型1:支付宝,2：银行卡
     * @return accountType
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 类型1:支付宝,2：银行卡
     * @param accountType
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 银行账户或支付宝账号
     * @return accountCode
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * 银行账户或支付宝账号
     * @param accountCode
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /**
     * 支付宝姓名/储蓄卡人姓名
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 支付宝姓名/储蓄卡人姓名
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 对应银行表的ID
     * @return bankId
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * 对应银行表的ID
     * @param bankId
     */
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * 创建人
     * @return createBy
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 修改人
     * @return updateBy
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改人
     * @param updateBy
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 修改时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 是否禁用0正常 1禁用
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getSettleOrgStrategy() {
		return settleOrgStrategy;
	}

	public void setSettleOrgStrategy(Integer settleOrgStrategy) {
		this.settleOrgStrategy = settleOrgStrategy;
	}
	
}