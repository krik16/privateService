package com.rongyi.easy.content.entity;

import com.rongyi.easy.content.entity.ContentHelpCategory;
import com.rongyi.easy.content.entity.ContentHelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentHelpCategoryMapper {
    int countByExample(ContentHelpCategoryExample example);

    int deleteByExample(ContentHelpCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentHelpCategory record);

    int insertSelective(ContentHelpCategory record);

    List<ContentHelpCategory> selectByExample(ContentHelpCategoryExample example);

    ContentHelpCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentHelpCategory record, @Param("example") ContentHelpCategoryExample example);

    int updateByExample(@Param("record") ContentHelpCategory record, @Param("example") ContentHelpCategoryExample example);

    int updateByPrimaryKeySelective(ContentHelpCategory record);

    int updateByPrimaryKey(ContentHelpCategory record);
}