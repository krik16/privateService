package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class ExpressOrderInfoEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 相关物流公司ID，为0时是自填 */
    private Integer expressId;

    /** 相关物流公司名称 */
    private String expressName;

    /** 物流单id */
    private String expressBillId;

    /** 发货时间 */
    private Date sendTime;

    /** 0为卖家发货物流信息，1为买家退货物流信息 */
    private Integer expressFlag;

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
     * 相关物流公司ID，为0时是自填
     * @return expressId
     */
    public Integer getExpressId() {
        return expressId;
    }

    /**
     * 相关物流公司ID，为0时是自填
     * @param expressId
     */
    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    /**
     * 相关物流公司名称
     * @return expressName
     */
    public String getExpressName() {
        return expressName;
    }

    /**
     * 相关物流公司名称
     * @param expressName
     */
    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    /**
     * 物流单id
     * @return expressBillId
     */
    public String getExpressBillId() {
        return expressBillId;
    }

    /**
     * 物流单id
     * @param expressBillId
     */
    public void setExpressBillId(String expressBillId) {
        this.expressBillId = expressBillId;
    }

    /**
     * 发货时间
     * @return sendTime
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 发货时间
     * @param sendTime
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 0为卖家发货物流信息，1为买家退货物流信息
     * @return expressFlag
     */
    public Integer getExpressFlag() {
        return expressFlag;
    }

    /**
     * 0为卖家发货物流信息，1为买家退货物流信息
     * @param expressFlag
     */
    public void setExpressFlag(Integer expressFlag) {
        this.expressFlag = expressFlag;
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
}