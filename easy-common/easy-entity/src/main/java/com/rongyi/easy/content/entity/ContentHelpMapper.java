package com.rongyi.easy.content.entity;

import com.rongyi.easy.content.entity.ContentHelp;
import com.rongyi.easy.content.entity.ContentHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentHelpMapper {
    int countByExample(ContentHelpExample example);

    int deleteByExample(ContentHelpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentHelp record);

    int insertSelective(ContentHelp record);

    List<ContentHelp> selectByExampleWithBLOBs(ContentHelpExample example);

    List<ContentHelp> selectByExample(ContentHelpExample example);

    ContentHelp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentHelp record, @Param("example") ContentHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") ContentHelp record, @Param("example") ContentHelpExample example);

    int updateByExample(@Param("record") ContentHelp record, @Param("example") ContentHelpExample example);

    int updateByPrimaryKeySelective(ContentHelp record);

    int updateByPrimaryKeyWithBLOBs(ContentHelp record);

    int updateByPrimaryKey(ContentHelp record);
}