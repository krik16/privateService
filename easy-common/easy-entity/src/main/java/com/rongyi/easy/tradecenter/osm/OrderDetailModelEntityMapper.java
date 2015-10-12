package com.rongyi.easy.tradecenter.osm;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailModelEntityMapper {
    int countByExample(OrderDetailModelEntityExample example);

    int deleteByExample(OrderDetailModelEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetailModelEntity record);

    int insertSelective(OrderDetailModelEntity record);

    List<OrderDetailModelEntity> selectByExample(OrderDetailModelEntityExample example);

    OrderDetailModelEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDetailModelEntity record, @Param("example") OrderDetailModelEntityExample example);

    int updateByExample(@Param("record") OrderDetailModelEntity record, @Param("example") OrderDetailModelEntityExample example);

    int updateByPrimaryKeySelective(OrderDetailModelEntity record);

    int updateByPrimaryKey(OrderDetailModelEntity record);
}