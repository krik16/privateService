package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.FilialeInfoEntity;

public interface FilialeInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FilialeInfoEntity record);

    int insertSelective(FilialeInfoEntity record);

    FilialeInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FilialeInfoEntity record);

    int updateByPrimaryKey(FilialeInfoEntity record);
}