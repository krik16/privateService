package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class SysRoleEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 角色名称 */
    private String roleName;

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
     * 角色名称
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}