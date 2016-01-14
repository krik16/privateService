package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.SysPermissionEntity;
import com.rongyi.easy.rmmm.entity.SysPermissionEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionEntityMapper {
    int countByExample(SysPermissionEntityExample example);

    int deleteByExample(SysPermissionEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysPermissionEntity record);

    int insertSelective(SysPermissionEntity record);

    List<SysPermissionEntity> selectByExample(SysPermissionEntityExample example);

    SysPermissionEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysPermissionEntity record, @Param("example") SysPermissionEntityExample example);

    int updateByExample(@Param("record") SysPermissionEntity record, @Param("example") SysPermissionEntityExample example);

    int updateByPrimaryKeySelective(SysPermissionEntity record);

    int updateByPrimaryKey(SysPermissionEntity record);
}