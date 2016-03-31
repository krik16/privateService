package com.rongyi.easy.usercenter.entity;

public interface MalllifeUserCollectionEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MalllifeUserCollectionEntity record);

    int insertSelective(MalllifeUserCollectionEntity record);

    MalllifeUserCollectionEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MalllifeUserCollectionEntity record);

    int updateByPrimaryKey(MalllifeUserCollectionEntity record);
}