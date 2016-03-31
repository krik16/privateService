package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.AppVersionInfoEntity;
import com.rongyi.easy.rmmm.entity.AppVersionInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVersionInfoEntityMapper {
    int countByExample(AppVersionInfoEntityExample example);

    int deleteByExample(AppVersionInfoEntityExample example);

    int insert(AppVersionInfoEntity record);

    int insertSelective(AppVersionInfoEntity record);

    List<AppVersionInfoEntity> selectByExample(AppVersionInfoEntityExample example);

    int updateByExampleSelective(@Param("record") AppVersionInfoEntity record, @Param("example") AppVersionInfoEntityExample example);

    int updateByExample(@Param("record") AppVersionInfoEntity record, @Param("example") AppVersionInfoEntityExample example);
}