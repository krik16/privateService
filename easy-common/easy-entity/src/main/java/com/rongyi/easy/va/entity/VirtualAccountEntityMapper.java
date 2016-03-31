package com.rongyi.easy.va.entity;

import com.rongyi.easy.va.entity.VirtualAccountEntity;
import com.rongyi.easy.va.entity.VirtualAccountEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VirtualAccountEntityMapper {
    int countByExample(VirtualAccountEntityExample example);

    int deleteByExample(VirtualAccountEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VirtualAccountEntity record);

    int insertSelective(VirtualAccountEntity record);

    List<VirtualAccountEntity> selectByExample(VirtualAccountEntityExample example);

    VirtualAccountEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VirtualAccountEntity record, @Param("example") VirtualAccountEntityExample example);

    int updateByExample(@Param("record") VirtualAccountEntity record, @Param("example") VirtualAccountEntityExample example);

    int updateByPrimaryKeySelective(VirtualAccountEntity record);

    int updateByPrimaryKey(VirtualAccountEntity record);
}