package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.BrandInfoEntity;
import com.rongyi.easy.rmmm.entity.BrandInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoEntityMapper {
    int countByExample(BrandInfoEntityExample example);

    int deleteByExample(BrandInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandInfoEntity record);

    int insertSelective(BrandInfoEntity record);

    List<BrandInfoEntity> selectByExample(BrandInfoEntityExample example);

    BrandInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandInfoEntity record, @Param("example") BrandInfoEntityExample example);

    int updateByExample(@Param("record") BrandInfoEntity record, @Param("example") BrandInfoEntityExample example);

    int updateByPrimaryKeySelective(BrandInfoEntity record);

    int updateByPrimaryKey(BrandInfoEntity record);
}