package com.rongyi.easy.entity;

import com.rongyi.easy.entity.AdapterEntity;
import com.rongyi.easy.entity.AdapterEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdapterEntityMapper {
    int countByExample(AdapterEntityExample example);

    int deleteByExample(AdapterEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdapterEntity record);

    int insertSelective(AdapterEntity record);

    List<AdapterEntity> selectByExample(AdapterEntityExample example);

    AdapterEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdapterEntity record, @Param("example") AdapterEntityExample example);

    int updateByExample(@Param("record") AdapterEntity record, @Param("example") AdapterEntityExample example);

    int updateByPrimaryKeySelective(AdapterEntity record);

    int updateByPrimaryKey(AdapterEntity record);
}