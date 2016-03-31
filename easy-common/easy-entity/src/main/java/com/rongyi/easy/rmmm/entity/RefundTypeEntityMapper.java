package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.RefundTypeEntity;
import com.rongyi.easy.rmmm.entity.RefundTypeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundTypeEntityMapper {
    int countByExample(RefundTypeEntityExample example);

    int deleteByExample(RefundTypeEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefundTypeEntity record);

    int insertSelective(RefundTypeEntity record);

    List<RefundTypeEntity> selectByExample(RefundTypeEntityExample example);

    RefundTypeEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefundTypeEntity record, @Param("example") RefundTypeEntityExample example);

    int updateByExample(@Param("record") RefundTypeEntity record, @Param("example") RefundTypeEntityExample example);

    int updateByPrimaryKeySelective(RefundTypeEntity record);

    int updateByPrimaryKey(RefundTypeEntity record);
}