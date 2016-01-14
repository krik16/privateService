package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class MallCooperateEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 商场名称 */
    private String mallName;

    /** 关联Mongo ID */
    private String mallMid;

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
     * 商场名称
     * @return mallName
     */
    public String getMallName() {
        return mallName;
    }

    /**
     * 商场名称
     * @param mallName
     */
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    /**
     * 关联Mongo ID
     * @return mallMid
     */
    public String getMallMid() {
        return mallMid;
    }

    /**
     * 关联Mongo ID
     * @param mallMid
     */
    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
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