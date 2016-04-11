package com.rongyi.easy.mcmc.entity;

import com.rongyi.easy.mcmc.entity.PostageTemplateEntity;
import com.rongyi.easy.mcmc.entity.PostageTemplateEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostageTemplateEntityMapper {
    int countByExample(PostageTemplateEntityExample example);

    int deleteByExample(PostageTemplateEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostageTemplateEntity record);

    int insertSelective(PostageTemplateEntity record);

    List<PostageTemplateEntity> selectByExample(PostageTemplateEntityExample example);

    PostageTemplateEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostageTemplateEntity record, @Param("example") PostageTemplateEntityExample example);

    int updateByExample(@Param("record") PostageTemplateEntity record, @Param("example") PostageTemplateEntityExample example);

    int updateByPrimaryKeySelective(PostageTemplateEntity record);

    int updateByPrimaryKey(PostageTemplateEntity record);
}