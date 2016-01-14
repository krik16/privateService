package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.ExpressInfoEntity;
import com.rongyi.easy.rmmm.entity.ExpressInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressInfoEntityMapper {
    int countByExample(ExpressInfoEntityExample example);

    int deleteByExample(ExpressInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExpressInfoEntity record);

    int insertSelective(ExpressInfoEntity record);

    List<ExpressInfoEntity> selectByExample(ExpressInfoEntityExample example);

    ExpressInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExpressInfoEntity record, @Param("example") ExpressInfoEntityExample example);

    int updateByExample(@Param("record") ExpressInfoEntity record, @Param("example") ExpressInfoEntityExample example);

    int updateByPrimaryKeySelective(ExpressInfoEntity record);

    int updateByPrimaryKey(ExpressInfoEntity record);
}