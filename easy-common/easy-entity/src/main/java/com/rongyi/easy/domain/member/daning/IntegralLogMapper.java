package com.rongyi.easy.domain.member.daning;

import com.rongyi.easy.domain.member.daning.IntegralLog;
import com.rongyi.easy.domain.member.daning.IntegralLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralLogMapper {
    int countByExample(IntegralLogExample example);

    int deleteByExample(IntegralLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IntegralLog record);

    int insertSelective(IntegralLog record);

    List<IntegralLog> selectByExample(IntegralLogExample example);

    IntegralLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IntegralLog record, @Param("example") IntegralLogExample example);

    int updateByExample(@Param("record") IntegralLog record, @Param("example") IntegralLogExample example);

    int updateByPrimaryKeySelective(IntegralLog record);

    int updateByPrimaryKey(IntegralLog record);
}