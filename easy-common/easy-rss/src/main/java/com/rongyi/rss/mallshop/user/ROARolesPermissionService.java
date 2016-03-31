package com.rongyi.rss.mallshop.user;

import com.rongyi.easy.rmmm.entity.SysPermissionEntity;
import com.rongyi.easy.rmmm.entity.SysRolePermissionEntity;

import java.util.List;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  角色管理
 * time:  2015/5/8
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/8              1.0            创建文件
 *
 */
public interface ROARolesPermissionService {


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
