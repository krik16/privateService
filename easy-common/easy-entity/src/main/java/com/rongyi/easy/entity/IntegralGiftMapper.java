package com.rongyi.easy.entity;

import com.rongyi.easy.entity.IntegralGift;
import com.rongyi.easy.entity.IntegralGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralGiftMapper {
    int countByExample(IntegralGiftExample example);

    int deleteByExample(IntegralGiftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IntegralGift record);

    int insertSelective(IntegralGift record);

    List<IntegralGift> selectByExample(IntegralGiftExample example);

    IntegralGift selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IntegralGift record, @Param("example") IntegralGiftExample example);

    int updateByExample(@Param("record") IntegralGift record, @Param("example") IntegralGiftExample example);

    int updateByPrimaryKeySelective(IntegralGift record);

    int updateByPrimaryKey(IntegralGift record);
}