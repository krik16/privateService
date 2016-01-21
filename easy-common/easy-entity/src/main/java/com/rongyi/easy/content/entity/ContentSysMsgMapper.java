package com.rongyi.easy.content.entity;

import com.rongyi.easy.content.entity.ContentSysMsg;
import com.rongyi.easy.content.entity.ContentSysMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentSysMsgMapper {
    int countByExample(ContentSysMsgExample example);

    int deleteByExample(ContentSysMsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentSysMsg record);

    int insertSelective(ContentSysMsg record);

    List<ContentSysMsg> selectByExample(ContentSysMsgExample example);

    ContentSysMsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentSysMsg record, @Param("example") ContentSysMsgExample example);

    int updateByExample(@Param("record") ContentSysMsg record, @Param("example") ContentSysMsgExample example);

    int updateByPrimaryKeySelective(ContentSysMsg record);

    int updateByPrimaryKey(ContentSysMsg record);
}