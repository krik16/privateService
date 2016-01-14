package com.rongyi.easy.rmmm.entity;


public interface LabelInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LabelInfoEntity record);

    int insertSelective(LabelInfoEntity record);

    LabelInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LabelInfoEntity record);

    int updateByPrimaryKey(LabelInfoEntity record);
}