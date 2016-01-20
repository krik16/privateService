package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.OrderDetailModelEntity;
import com.rongyi.easy.osm.entity.OrderDetailModelEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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