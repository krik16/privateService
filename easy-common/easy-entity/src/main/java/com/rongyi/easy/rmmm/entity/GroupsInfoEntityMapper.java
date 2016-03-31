package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.GroupsInfoEntity;

public interface GroupsInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupsInfoEntity record);

    int insertSelective(GroupsInfoEntity record);

    GroupsInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupsInfoEntity record);

    int updateByPrimaryKey(GroupsInfoEntity record);
}