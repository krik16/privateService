package com.rongyi.easy.va.entity;

import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VirtualAccountDetailEntityMapper {
    int countByExample(VirtualAccountDetailEntityExample example);

    int deleteByExample(VirtualAccountDetailEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VirtualAccountDetailEntity record);

    int insertSelective(VirtualAccountDetailEntity record);

    List<VirtualAccountDetailEntity> selectByExample(VirtualAccountDetailEntityExample example);

    VirtualAccountDetailEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VirtualAccountDetailEntity record, @Param("example") VirtualAccountDetailEntityExample example);

    int updateByExample(@Param("record") VirtualAccountDetailEntity record, @Param("example") VirtualAccountDetailEntityExample example);

    int updateByPrimaryKeySelective(VirtualAccountDetailEntity record);

    int updateByPrimaryKey(VirtualAccountDetailEntity record);
}