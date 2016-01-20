package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class SysPermissionEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 权限名称 */
    private String perName;

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
     * 权限名称
     * @return perName
     */
    public String getPerName() {
        return perName;
    }

    /**
     * 权限名称
     * @param perName
     */
    public void setPerName(String perName) {
        this.perName = perName;
    }
}