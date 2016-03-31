package com.rongyi.easy.mcmc.entity;

import com.rongyi.easy.mcmc.entity.CommodityStockEntity;
import com.rongyi.easy.mcmc.entity.CommodityStockEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityStockEntityMapper {
    int countByExample(CommodityStockEntityExample example);

    int deleteByExample(CommodityStockEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommodityStockEntity record);

    int insertSelective(CommodityStockEntity record);

    List<CommodityStockEntity> selectByExample(CommodityStockEntityExample example);

    CommodityStockEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommodityStockEntity record, @Param("example") CommodityStockEntityExample example);

    int updateByExample(@Param("record") CommodityStockEntity record, @Param("example") CommodityStockEntityExample example);

    int updateByPrimaryKeySelective(CommodityStockEntity record);

    int updateByPrimaryKey(CommodityStockEntity record);
}