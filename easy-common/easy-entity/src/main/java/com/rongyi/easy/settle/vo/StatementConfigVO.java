
/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月21日下午4:15:19
 * @Description: TODO
 *
 **/

package com.rongyi.easy.settle.vo;

import com.rongyi.easy.settle.entity.StatementConfig;

/**	
 * @Author:  柯军
 * @Description:  对账单配置
 * @datetime:2015年9月21日下午4:15:19
 *
 **/

public class StatementConfigVO extends StatementConfig{

	/**
	 * 
	 */
	private static final long serialVersionUID = -850862097477853862L;
	
	  /**
     * 配置表主键
     */
    private Integer configId;

    /**
     * 支付账号
     */
    private String payAccount;

    /**
     * 支付姓名
     */
    private String payName;

    /**
     * 结算银行名称
     */
    private String blankName;

    /**
     * 结算银行地址
     */
    private String blankAddress;

    /**
     * 商户地址
     */
    private String bussinessAddress;

	/**
	 * 关联店铺id集合（逗号分隔），-1表示包含所有，0表示本身
	 */
	private String linkShopId;

	/**
	 * 关联店铺操作(0:选择,1:排除)
	 */
	private Byte linkShopOp;

	/**
	 * 关联角色(0:全部,1:导购，2:买手)
	 */
	private Byte linkRole;

	/**
	 * 关联账号(多个账号逗号分隔)
	 */
	private String linkUserPhone;

    /**
     * 联系人邮箱(多个邮箱用分号分隔开)
     */
    private String bussinessEmail;

    /**
     * 商家系统账号
     */
    private String bussinessAccount;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 联系人微信
     */
    private String contactWeixin;

    /**
     * 联系人QQ
     */
    private String contactQq;

    
	/**
	 * 生成时间
	 */
	private String generateTime;
	
    
	public Integer getConfigId() {
		return configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public String getBlankName() {
		return blankName;
	}

	public void setBlankName(String blankName) {
		this.blankName = blankName;
	}

	public String getBlankAddress() {
		return blankAddress;
	}

	public void setBlankAddress(String blankAddress) {
		this.blankAddress = blankAddress;
	}

	public String getBussinessAddress() {
		return bussinessAddress;
	}

	public void setBussinessAddress(String bussinessAddress) {
		this.bussinessAddress = bussinessAddress;
	}

	public String getBussinessEmail() {
		return bussinessEmail;
	}

	public void setBussinessEmail(String bussinessEmail) {
		this.bussinessEmail = bussinessEmail;
	}

	public String getBussinessAccount() {
		return bussinessAccount;
	}

	public void setBussinessAccount(String bussinessAccount) {
		this.bussinessAccount = bussinessAccount;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactWeixin() {
		return contactWeixin;
	}

	public void setContactWeixin(String contactWeixin) {
		this.contactWeixin = contactWeixin;
	}

	public String getContactQq() {
		return contactQq;
	}

	public void setContactQq(String contactQq) {
		this.contactQq = contactQq;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getGenerateTime() {
		return generateTime;
	}

	public void setGenerateTime(String generateTime) {
		this.generateTime = generateTime;
	}

	@Override
	public String getLinkShopId() {
		return linkShopId;
	}

	@Override
	public void setLinkShopId(String linkShopId) {
		this.linkShopId = linkShopId;
	}

	@Override
	public Byte getLinkShopOp() {
		return linkShopOp;
	}

	@Override
	public void setLinkShopOp(Byte linkShopOp) {
		this.linkShopOp = linkShopOp;
	}

}
