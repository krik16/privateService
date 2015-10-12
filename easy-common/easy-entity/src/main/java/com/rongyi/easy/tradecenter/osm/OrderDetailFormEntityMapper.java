package com.rongyi.easy.tradecenter.osm;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailFormEntityMapper {
    int countByExample(OrderDetailFormEntityExample example);

    int deleteByExample(OrderDetailFormEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetailFormEntity record);

    int insertSelective(OrderDetailFormEntity record);

    List<OrderDetailFormEntity> selectByExample(OrderDetailFormEntityExample example);

    OrderDetailFormEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDetailFormEntity record, @Param("example") OrderDetailFormEntityExample example);

    int updateByExample(@Param("record") OrderDetailFormEntity record, @Param("example") OrderDetailFormEntityExample example);

    int updateByPrimaryKeySelective(OrderDetailFormEntity record);

    int updateByPrimaryKey(OrderDetailFormEntity record);
}