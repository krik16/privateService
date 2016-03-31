package com.rongyi.easy.merchant.entity;

import com.rongyi.easy.merchant.entity.InviteCodeEntity;
import com.rongyi.easy.merchant.entity.InviteCodeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InviteCodeEntityMapper {
    int countByExample(InviteCodeEntityExample example);

    int deleteByExample(InviteCodeEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InviteCodeEntity record);

    int insertSelective(InviteCodeEntity record);

    List<InviteCodeEntity> selectByExample(InviteCodeEntityExample example);

    InviteCodeEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InviteCodeEntity record, @Param("example") InviteCodeEntityExample example);

    int updateByExample(@Param("record") InviteCodeEntity record, @Param("example") InviteCodeEntityExample example);

    int updateByPrimaryKeySelective(InviteCodeEntity record);

    int updateByPrimaryKey(InviteCodeEntity record);
}