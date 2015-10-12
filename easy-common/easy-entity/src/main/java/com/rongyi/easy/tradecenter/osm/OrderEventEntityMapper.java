package com.rongyi.easy.tradecenter.osm;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderEventEntityMapper {
    int countByExample(OrderEventEntityExample example);

    int deleteByExample(OrderEventEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderEventEntity record);

    int insertSelective(OrderEventEntity record);

    List<OrderEventEntity> selectByExample(OrderEventEntityExample example);

    OrderEventEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderEventEntity record, @Param("example") OrderEventEntityExample example);

    int updateByExample(@Param("record") OrderEventEntity record, @Param("example") OrderEventEntityExample example);

    int updateByPrimaryKeySelective(OrderEventEntity record);

    int updateByPrimaryKey(OrderEventEntity record);
}