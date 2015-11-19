package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.malllifeUserCollectionEntity;

public interface malllifeUserCollectionEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(malllifeUserCollectionEntity record);

    int insertSelective(malllifeUserCollectionEntity record);

    malllifeUserCollectionEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(malllifeUserCollectionEntity record);

    int updateByPrimaryKey(malllifeUserCollectionEntity record);
}