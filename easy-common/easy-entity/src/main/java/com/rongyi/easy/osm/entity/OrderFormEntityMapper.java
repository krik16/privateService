package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderFormEntityMapper {
    int countByExample(OrderFormEntityExample example);

    int deleteByExample(OrderFormEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderFormEntity record);

    int insertSelective(OrderFormEntity record);

    List<OrderFormEntity> selectByExampleWithBLOBs(OrderFormEntityExample example);

    List<OrderFormEntity> selectByExample(OrderFormEntityExample example);

    OrderFormEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderFormEntity record, @Param("example") OrderFormEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderFormEntity record, @Param("example") OrderFormEntityExample example);

    int updateByExample(@Param("record") OrderFormEntity record, @Param("example") OrderFormEntityExample example);

    int updateByPrimaryKeySelective(OrderFormEntity record);

    int updateByPrimaryKeyWithBLOBs(OrderFormEntity record);

    int updateByPrimaryKey(OrderFormEntity record);
}