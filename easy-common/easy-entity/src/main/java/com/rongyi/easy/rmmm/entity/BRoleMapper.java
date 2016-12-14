package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.BRole;

public interface BRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BRole record);

    int insertSelective(BRole record);

    BRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BRole record);

    int updateByPrimaryKey(BRole record);
}