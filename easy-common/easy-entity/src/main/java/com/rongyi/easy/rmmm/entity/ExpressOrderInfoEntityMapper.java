package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.ExpressOrderInfoEntity;
import com.rongyi.easy.rmmm.entity.ExpressOrderInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressOrderInfoEntityMapper {
    int countByExample(ExpressOrderInfoEntityExample example);

    int deleteByExample(ExpressOrderInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExpressOrderInfoEntity record);

    int insertSelective(ExpressOrderInfoEntity record);

    List<ExpressOrderInfoEntity> selectByExample(ExpressOrderInfoEntityExample example);

    ExpressOrderInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExpressOrderInfoEntity record, @Param("example") ExpressOrderInfoEntityExample example);

    int updateByExample(@Param("record") ExpressOrderInfoEntity record, @Param("example") ExpressOrderInfoEntityExample example);

    int updateByPrimaryKeySelective(ExpressOrderInfoEntity record);

    int updateByPrimaryKey(ExpressOrderInfoEntity record);
}