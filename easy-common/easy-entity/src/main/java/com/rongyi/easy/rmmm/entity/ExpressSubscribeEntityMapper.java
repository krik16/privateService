package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.ExpressSubscribeEntity;

public interface ExpressSubscribeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpressSubscribeEntity record);

    int insertSelective(ExpressSubscribeEntity record);

    ExpressSubscribeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpressSubscribeEntity record);

    int updateByPrimaryKey(ExpressSubscribeEntity record);
}