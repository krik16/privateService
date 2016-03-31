package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.BrandMallEntity;
import com.rongyi.easy.rmmm.entity.BrandMallEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMallEntityMapper {
    int countByExample(BrandMallEntityExample example);

    int deleteByExample(BrandMallEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandMallEntity record);

    int insertSelective(BrandMallEntity record);

    List<BrandMallEntity> selectByExample(BrandMallEntityExample example);

    BrandMallEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandMallEntity record, @Param("example") BrandMallEntityExample example);

    int updateByExample(@Param("record") BrandMallEntity record, @Param("example") BrandMallEntityExample example);

    int updateByPrimaryKeySelective(BrandMallEntity record);

    int updateByPrimaryKey(BrandMallEntity record);
}