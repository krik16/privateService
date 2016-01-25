package com.rongyi.easy.content.entity;

import com.rongyi.easy.content.entity.ContentInfo;
import com.rongyi.easy.content.entity.ContentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentInfoMapper {
    int countByExample(ContentInfoExample example);

    int deleteByExample(ContentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentInfo record);

    int insertSelective(ContentInfo record);

    List<ContentInfo> selectByExample(ContentInfoExample example);

    ContentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentInfo record, @Param("example") ContentInfoExample example);

    int updateByExample(@Param("record") ContentInfo record, @Param("example") ContentInfoExample example);

    int updateByPrimaryKeySelective(ContentInfo record);

    int updateByPrimaryKey(ContentInfo record);
}