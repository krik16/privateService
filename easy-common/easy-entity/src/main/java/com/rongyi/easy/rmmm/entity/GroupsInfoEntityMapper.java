package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.GroupsInfoEntity;

import java.util.List;

public interface GroupsInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupsInfoEntity record);

    int insertSelective(GroupsInfoEntity record);

    GroupsInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupsInfoEntity record);

    int updateByPrimaryKey(GroupsInfoEntity record);

    List<Integer> selectGroupIdByMallId(Integer mallId);
}