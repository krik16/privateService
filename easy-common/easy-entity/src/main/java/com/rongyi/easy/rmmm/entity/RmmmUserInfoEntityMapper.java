package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RmmmUserInfoEntityMapper {
    int countByExample(RmmmUserInfoEntityExample example);

    int deleteByExample(RmmmUserInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RmmmUserInfoEntity record);

    int insertSelective(RmmmUserInfoEntity record);

    List<RmmmUserInfoEntity> selectByExample(RmmmUserInfoEntityExample example);

    RmmmUserInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RmmmUserInfoEntity record, @Param("example") RmmmUserInfoEntityExample example);

    int updateByExample(@Param("record") RmmmUserInfoEntity record, @Param("example") RmmmUserInfoEntityExample example);

    int updateByPrimaryKeySelective(RmmmUserInfoEntity record);

    int updateByPrimaryKey(RmmmUserInfoEntity record);
}