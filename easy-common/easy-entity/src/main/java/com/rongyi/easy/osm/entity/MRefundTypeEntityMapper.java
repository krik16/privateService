package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.MRefundTypeEntity;

public interface MRefundTypeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MRefundTypeEntity record);

    int insertSelective(MRefundTypeEntity record);

    MRefundTypeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MRefundTypeEntity record);

    int updateByPrimaryKey(MRefundTypeEntity record);
}