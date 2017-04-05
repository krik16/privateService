package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.ConplaitFormEntity;

public interface ConplaitFormEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConplaitFormEntity record);

    int insertSelective(ConplaitFormEntity record);

    ConplaitFormEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConplaitFormEntity record);

    int updateByPrimaryKey(ConplaitFormEntity record);
}