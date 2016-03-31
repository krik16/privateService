package com.rongyi.easy.content.entity;

import com.rongyi.easy.content.entity.ContentForum;
import com.rongyi.easy.content.entity.ContentForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentForumMapper {
    int countByExample(ContentForumExample example);

    int deleteByExample(ContentForumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentForum record);

    int insertSelective(ContentForum record);

    List<ContentForum> selectByExample(ContentForumExample example);

    ContentForum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentForum record, @Param("example") ContentForumExample example);

    int updateByExample(@Param("record") ContentForum record, @Param("example") ContentForumExample example);

    int updateByPrimaryKeySelective(ContentForum record);

    int updateByPrimaryKey(ContentForum record);
}