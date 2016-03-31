package com.rongyi.easy.content.entity;

import com.rongyi.easy.content.entity.SysDocPic;
import com.rongyi.easy.content.entity.SysDocPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDocPicMapper {
    int countByExample(SysDocPicExample example);

    int deleteByExample(SysDocPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysDocPic record);

    int insertSelective(SysDocPic record);

    List<SysDocPic> selectByExample(SysDocPicExample example);

    SysDocPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysDocPic record, @Param("example") SysDocPicExample example);

    int updateByExample(@Param("record") SysDocPic record, @Param("example") SysDocPicExample example);

    int updateByPrimaryKeySelective(SysDocPic record);

    int updateByPrimaryKey(SysDocPic record);
}