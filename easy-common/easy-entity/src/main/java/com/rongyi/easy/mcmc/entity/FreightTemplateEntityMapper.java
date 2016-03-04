package com.rongyi.easy.mcmc.entity;

import com.rongyi.easy.mcmc.entity.FreightTemplateEntity;
import com.rongyi.easy.mcmc.entity.FreightTemplateEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreightTemplateEntityMapper {
    int countByExample(FreightTemplateEntityExample example);

    int deleteByExample(FreightTemplateEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FreightTemplateEntity record);

    int insertSelective(FreightTemplateEntity record);

    List<FreightTemplateEntity> selectByExample(FreightTemplateEntityExample example);

    FreightTemplateEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FreightTemplateEntity record, @Param("example") FreightTemplateEntityExample example);

    int updateByExample(@Param("record") FreightTemplateEntity record, @Param("example") FreightTemplateEntityExample example);

    int updateByPrimaryKeySelective(FreightTemplateEntity record);

    int updateByPrimaryKey(FreightTemplateEntity record);
}