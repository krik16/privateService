package com.rongyi.easy.rpb.entity;

public interface SmDivideAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmDivideAccount record);

    int insertSelective(SmDivideAccount record);

    SmDivideAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmDivideAccount record);

    int updateByPrimaryKey(SmDivideAccount record);
}