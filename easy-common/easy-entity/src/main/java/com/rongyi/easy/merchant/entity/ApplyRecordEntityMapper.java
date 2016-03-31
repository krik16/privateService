package com.rongyi.easy.merchant.entity;

import com.rongyi.easy.merchant.entity.ApplyRecordEntity;
import com.rongyi.easy.merchant.entity.ApplyRecordEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyRecordEntityMapper {
    int countByExample(ApplyRecordEntityExample example);

    int deleteByExample(ApplyRecordEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyRecordEntity record);

    int insertSelective(ApplyRecordEntity record);

    List<ApplyRecordEntity> selectByExample(ApplyRecordEntityExample example);

    ApplyRecordEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplyRecordEntity record, @Param("example") ApplyRecordEntityExample example);

    int updateByExample(@Param("record") ApplyRecordEntity record, @Param("example") ApplyRecordEntityExample example);

    int updateByPrimaryKeySelective(ApplyRecordEntity record);

    int updateByPrimaryKey(ApplyRecordEntity record);
}