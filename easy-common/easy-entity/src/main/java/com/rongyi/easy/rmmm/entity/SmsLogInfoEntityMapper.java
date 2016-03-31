package com.rongyi.easy.rmmm.entity;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsLogInfoEntityMapper {
    int countByExample(SmsLogInfoEntityExample example);

    int deleteByExample(SmsLogInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsLogInfoEntity record);

    int insertSelective(SmsLogInfoEntity record);

    List<SmsLogInfoEntity> selectByExample(SmsLogInfoEntityExample example);

    SmsLogInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsLogInfoEntity record, @Param("example") SmsLogInfoEntityExample example);

    int updateByExample(@Param("record") SmsLogInfoEntity record, @Param("example") SmsLogInfoEntityExample example);

    int updateByPrimaryKeySelective(SmsLogInfoEntity record);

    int updateByPrimaryKey(SmsLogInfoEntity record);
}