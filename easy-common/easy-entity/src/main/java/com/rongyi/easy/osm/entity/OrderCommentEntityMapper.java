package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.OrderCommentEntity;

public interface OrderCommentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderCommentEntity record);

    int insertSelective(OrderCommentEntity record);

    OrderCommentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderCommentEntity record);

    int updateByPrimaryKey(OrderCommentEntity record);
}