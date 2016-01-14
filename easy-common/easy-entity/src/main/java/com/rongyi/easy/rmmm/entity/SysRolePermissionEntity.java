package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class SysRolePermissionEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 角色ID */
    private Integer rolesId;

    /** 权限ID */
    private Integer permissionId;

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
     * 角色ID
     * @return rolesId
     */
    public Integer getRolesId() {
        return rolesId;
    }

    /**
     * 角色ID
     * @param rolesId
     */
    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    /**
     * 权限ID
     * @return permissionId
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 权限ID
     * @param permissionId
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}