package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.SysNoticeEntity;
import com.rongyi.easy.rmmm.entity.SysNoticeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNoticeEntityMapper {
    int countByExample(SysNoticeEntityExample example);

    int deleteByExample(SysNoticeEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysNoticeEntity record);

    int insertSelective(SysNoticeEntity record);

    List<SysNoticeEntity> selectByExampleWithBLOBs(SysNoticeEntityExample example);

    List<SysNoticeEntity> selectByExample(SysNoticeEntityExample example);

    SysNoticeEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysNoticeEntity record, @Param("example") SysNoticeEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") SysNoticeEntity record, @Param("example") SysNoticeEntityExample example);

    int updateByExample(@Param("record") SysNoticeEntity record, @Param("example") SysNoticeEntityExample example);

    int updateByPrimaryKeySelective(SysNoticeEntity record);

    int updateByPrimaryKeyWithBLOBs(SysNoticeEntity record);

    int updateByPrimaryKey(SysNoticeEntity record);
}