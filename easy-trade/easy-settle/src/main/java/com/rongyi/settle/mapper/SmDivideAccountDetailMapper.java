package com.rongyi.settle.mapper;

import java.util.List;

import com.rongyi.easy.settle.entity.SmDivideAccountDetail;

public interface SmDivideAccountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmDivideAccountDetail record);

    int insertSelective(SmDivideAccountDetail record);

    SmDivideAccountDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmDivideAccountDetail record);

    int updateByPrimaryKey(SmDivideAccountDetail record);
    
    int batchInsertSelective(List<SmDivideAccountDetail> smDivideAccountDetailList);
}