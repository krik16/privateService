package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.CommodityCategoryEntity;
import com.rongyi.easy.rmmm.entity.CommodityCategoryEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityCategoryEntityMapper {
    int countByExample(CommodityCategoryEntityExample example);

    int deleteByExample(CommodityCategoryEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommodityCategoryEntity record);

    int insertSelective(CommodityCategoryEntity record);

    List<CommodityCategoryEntity> selectByExample(CommodityCategoryEntityExample example);

    CommodityCategoryEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommodityCategoryEntity record, @Param("example") CommodityCategoryEntityExample example);

    int updateByExample(@Param("record") CommodityCategoryEntity record, @Param("example") CommodityCategoryEntityExample example);

    int updateByPrimaryKeySelective(CommodityCategoryEntity record);

    int updateByPrimaryKey(CommodityCategoryEntity record);
}