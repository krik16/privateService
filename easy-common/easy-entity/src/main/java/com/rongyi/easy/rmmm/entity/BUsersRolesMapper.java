package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.BUsersRoles;

public interface BUsersRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BUsersRoles record);

    int insertSelective(BUsersRoles record);

    BUsersRoles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BUsersRoles record);

    int updateByPrimaryKey(BUsersRoles record);
}