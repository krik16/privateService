package com.rongyi.easy.tradecenter.osm;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderModelEntityMapper {
    int countByExample(OrderModelEntityExample example);

    int deleteByExample(OrderModelEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderModelEntity record);

    int insertSelective(OrderModelEntity record);

    List<OrderModelEntity> selectByExample(OrderModelEntityExample example);

    OrderModelEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderModelEntity record, @Param("example") OrderModelEntityExample example);

    int updateByExample(@Param("record") OrderModelEntity record, @Param("example") OrderModelEntityExample example);

    int updateByPrimaryKeySelective(OrderModelEntity record);

    int updateByPrimaryKey(OrderModelEntity record);
}