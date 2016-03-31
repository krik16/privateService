package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class LabelInfoEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 标签名 */
    private String labelName;

    /** 标签类型 ： 1为常用标签  2为用户自定义标签 */
    private Integer labelType;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 创建时间 */
    private Date createAt;

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
     * 标签名
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * 标签名
     * @param labelName
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    /**
     * 标签类型 ： 1为常用标签  2为用户自定义标签
     * @return labelType
     */
    public Integer getLabelType() {
        return labelType;
    }

    /**
     * 标签类型 ： 1为常用标签  2为用户自定义标签
     * @param labelType
     */
    public void setLabelType(Integer labelType) {
        this.labelType = labelType;
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
}