package com.rongyi.easy.osm.entity;

public interface OrderReserveEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderReserveEntity record);

    int insertSelective(OrderReserveEntity record);

    OrderReserveEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderReserveEntity record);

    int updateByPrimaryKey(OrderReserveEntity record);
}