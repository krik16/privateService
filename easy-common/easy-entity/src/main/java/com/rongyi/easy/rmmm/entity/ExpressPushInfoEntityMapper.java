package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.ExpressPushInfoEntity;

public interface ExpressPushInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpressPushInfoEntity record);

    int insertSelective(ExpressPushInfoEntity record);

    ExpressPushInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpressPushInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(ExpressPushInfoEntity record);

    int updateByPrimaryKey(ExpressPushInfoEntity record);
}