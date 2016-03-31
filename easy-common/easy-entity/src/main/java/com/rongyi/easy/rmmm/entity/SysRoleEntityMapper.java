package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.SysRoleEntity;
import com.rongyi.easy.rmmm.entity.SysRoleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleEntityMapper {
    int countByExample(SysRoleEntityExample example);

    int deleteByExample(SysRoleEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleEntity record);

    int insertSelective(SysRoleEntity record);

    List<SysRoleEntity> selectByExample(SysRoleEntityExample example);

    SysRoleEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleEntity record, @Param("example") SysRoleEntityExample example);

    int updateByExample(@Param("record") SysRoleEntity record, @Param("example") SysRoleEntityExample example);

    int updateByPrimaryKeySelective(SysRoleEntity record);

    int updateByPrimaryKey(SysRoleEntity record);
}