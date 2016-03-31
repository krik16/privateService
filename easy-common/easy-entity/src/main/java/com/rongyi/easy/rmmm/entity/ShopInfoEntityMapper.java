package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.ShopInfoEntity;
import com.rongyi.easy.rmmm.entity.ShopInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopInfoEntityMapper {
    int countByExample(ShopInfoEntityExample example);

    int deleteByExample(ShopInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopInfoEntity record);

    int insertSelective(ShopInfoEntity record);

    List<ShopInfoEntity> selectByExample(ShopInfoEntityExample example);

    ShopInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopInfoEntity record, @Param("example") ShopInfoEntityExample example);

    int updateByExample(@Param("record") ShopInfoEntity record, @Param("example") ShopInfoEntityExample example);

    int updateByPrimaryKeySelective(ShopInfoEntity record);

    int updateByPrimaryKey(ShopInfoEntity record);
}