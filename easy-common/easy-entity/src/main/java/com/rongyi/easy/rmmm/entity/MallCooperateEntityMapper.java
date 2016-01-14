package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.MallCooperateEntity;
import com.rongyi.easy.rmmm.entity.MallCooperateEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallCooperateEntityMapper {
    int countByExample(MallCooperateEntityExample example);

    int deleteByExample(MallCooperateEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCooperateEntity record);

    int insertSelective(MallCooperateEntity record);

    List<MallCooperateEntity> selectByExample(MallCooperateEntityExample example);

    MallCooperateEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallCooperateEntity record, @Param("example") MallCooperateEntityExample example);

    int updateByExample(@Param("record") MallCooperateEntity record, @Param("example") MallCooperateEntityExample example);

    int updateByPrimaryKeySelective(MallCooperateEntity record);

    int updateByPrimaryKey(MallCooperateEntity record);
}