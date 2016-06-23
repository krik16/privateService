package com.rongyi.easy.rpb.entity;

public interface SmDivideAccountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmDivideAccountDetail record);

    int insertSelective(SmDivideAccountDetail record);

    SmDivideAccountDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmDivideAccountDetail record);

    int updateByPrimaryKey(SmDivideAccountDetail record);
}