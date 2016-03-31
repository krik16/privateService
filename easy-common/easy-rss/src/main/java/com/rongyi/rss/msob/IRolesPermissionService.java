package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.rmmm.entity.SysPermissionEntity;
import com.rongyi.easy.rmmm.entity.SysRolePermissionEntity;

public interface IRolesPermissionService {

	/**
     * 获取权限名称
     * @param roleid
     * @return
     * @throws Exception
     */
    public String getPermissionStrByRoleId(Integer roleid)throws Exception;


    /**
     * 根据角色ID 获取权限ID
     * @param rolesId
     * @return
     * @throws Exception
     */
    public List<SysRolePermissionEntity> getRolesPermissionByRolesId(Integer rolesId) throws Exception;

    /**
     * 通过id获取权限表的信息
     * @param permissionId
     * @return
     * @throws Exception
     */
    public SysPermissionEntity getPermissionById(Integer permissionId) throws Exception;
}
