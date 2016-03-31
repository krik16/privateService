package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.ContentUserMsg;
import com.rongyi.easy.rmmm.entity.ContentUserMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentUserMsgMapper {
    int countByExample(ContentUserMsgExample example);

    int deleteByExample(ContentUserMsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentUserMsg record);

    int insertSelective(ContentUserMsg record);

    List<ContentUserMsg> selectByExample(ContentUserMsgExample example);

    ContentUserMsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentUserMsg record, @Param("example") ContentUserMsgExample example);

    int updateByExample(@Param("record") ContentUserMsg record, @Param("example") ContentUserMsgExample example);

    int updateByPrimaryKeySelective(ContentUserMsg record);

    int updateByPrimaryKey(ContentUserMsg record);
}