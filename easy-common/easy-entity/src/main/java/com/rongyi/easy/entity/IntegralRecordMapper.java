package com.rongyi.easy.entity;

import com.rongyi.easy.entity.IntegralRecord;
import com.rongyi.easy.entity.IntegralRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralRecordMapper {
    int countByExample(IntegralRecordExample example);

    int deleteByExample(IntegralRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IntegralRecord record);

    int insertSelective(IntegralRecord record);

    List<IntegralRecord> selectByExample(IntegralRecordExample example);

    IntegralRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IntegralRecord record, @Param("example") IntegralRecordExample example);

    int updateByExample(@Param("record") IntegralRecord record, @Param("example") IntegralRecordExample example);

    int updateByPrimaryKeySelective(IntegralRecord record);

    int updateByPrimaryKey(IntegralRecord record);
}