package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.MRefundCategoryEntity;

public interface MRefundCategoryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MRefundCategoryEntity record);

    int insertSelective(MRefundCategoryEntity record);

    MRefundCategoryEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MRefundCategoryEntity record);

    int updateByPrimaryKey(MRefundCategoryEntity record);
}