package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订阅快递100
 * @author user
 *
 */
public class ExpressSubscribeEntity  implements Serializable{
	
	/** 主键  */
    private Integer id;

    /** 物流单号  */
    private String expressBillId;

    /** 订单物流主键id  */
    private Integer expressOrderInfoId;

    /** 快递公司编码  */
    private String company;

    /** 签名  */
    private String salt;

    /** 创建时间  */
    private Date createAt;

    /** 修改时间 */
    private Date updateAt;

    /** 200: 提交成功 500: 服务器错误 501:重复订阅 700: 订阅方的订阅数据存在错误 701: 拒绝订阅的快递公司 */
    private String returnCode;

    /** 错误信息  */
    private String returnMessage;

    /** 是否禁用0正常 1禁用  */
    private Integer isDisabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpressBillId() {
        return expressBillId;
    }

    public void setExpressBillId(String expressBillId) {
        this.expressBillId = expressBillId;
    }

    public Integer getExpressOrderInfoId() {
        return expressOrderInfoId;
    }

    public void setExpressOrderInfoId(Integer expressOrderInfoId) {
        this.expressOrderInfoId = expressOrderInfoId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

	@Override
	public String toString() {
		return "ExpressSubscribeEntity [id=" + id + ", expressBillId="
				+ expressBillId + ", expressOrderInfoId=" + expressOrderInfoId
				+ ", company=" + company + ", salt=" + salt + ", createAt="
				+ createAt + ", updateAt=" + updateAt + ", returnCode="
				+ returnCode + ", returnMessage=" + returnMessage
				+ ", isDisabled=" + isDisabled + "]";
	}
}