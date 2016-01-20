
package com.rongyi.easy.settle.entity;

import java.io.Serializable;
import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 对账配置商户相关信息表 
 * @datetime:2015年9月17日上午10:44:56
 *
 **/
public class BussinessInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8866652803042014841L;

	private Integer id;

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
     * 创建时间
     */
    private Date createAt;

    /**
     * 标记删除(0:正常，1:删除)
     */
    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}