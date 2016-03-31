package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderDetailFormEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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