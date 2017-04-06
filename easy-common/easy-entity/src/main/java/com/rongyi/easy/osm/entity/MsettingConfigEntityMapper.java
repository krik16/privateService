package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.MsettingConfigEntity;

public interface MsettingConfigEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsettingConfigEntity record);

    int insertSelective(MsettingConfigEntity record);

    MsettingConfigEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsettingConfigEntity record);

    int updateByPrimaryKey(MsettingConfigEntity record);
}