package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.OrderSmallTicketEntity;
import com.rongyi.easy.osm.entity.OrderSmallTicketEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSmallTicketEntityMapper {
    int countByExample(OrderSmallTicketEntityExample example);

    int deleteByExample(OrderSmallTicketEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderSmallTicketEntity record);

    int insertSelective(OrderSmallTicketEntity record);

    List<OrderSmallTicketEntity> selectByExample(OrderSmallTicketEntityExample example);

    OrderSmallTicketEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderSmallTicketEntity record, @Param("example") OrderSmallTicketEntityExample example);

    int updateByExample(@Param("record") OrderSmallTicketEntity record, @Param("example") OrderSmallTicketEntityExample example);

    int updateByPrimaryKeySelective(OrderSmallTicketEntity record);

    int updateByPrimaryKey(OrderSmallTicketEntity record);
}