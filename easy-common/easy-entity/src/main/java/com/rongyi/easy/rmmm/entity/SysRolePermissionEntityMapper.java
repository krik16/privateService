package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.SysRolePermissionEntity;
import com.rongyi.easy.rmmm.entity.SysRolePermissionEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermissionEntityMapper {
    int countByExample(SysRolePermissionEntityExample example);

    int deleteByExample(SysRolePermissionEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRolePermissionEntity record);

    int insertSelective(SysRolePermissionEntity record);

    List<SysRolePermissionEntity> selectByExample(SysRolePermissionEntityExample example);

    SysRolePermissionEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRolePermissionEntity record, @Param("example") SysRolePermissionEntityExample example);

    int updateByExample(@Param("record") SysRolePermissionEntity record, @Param("example") SysRolePermissionEntityExample example);

    int updateByPrimaryKeySelective(SysRolePermissionEntity record);

    int updateByPrimaryKey(SysRolePermissionEntity record);
}