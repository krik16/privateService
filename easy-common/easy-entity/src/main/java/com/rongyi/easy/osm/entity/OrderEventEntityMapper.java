package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.OrderEventEntity;
import com.rongyi.easy.osm.entity.OrderEventEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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