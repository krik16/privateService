package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.UserShopEntity;
import com.rongyi.easy.rmmm.entity.UserShopEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShopEntityMapper {
    int countByExample(UserShopEntityExample example);

    int deleteByExample(UserShopEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserShopEntity record);

    int insertSelective(UserShopEntity record);

    List<UserShopEntity> selectByExample(UserShopEntityExample example);

    UserShopEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserShopEntity record, @Param("example") UserShopEntityExample example);

    int updateByExample(@Param("record") UserShopEntity record, @Param("example") UserShopEntityExample example);

    int updateByPrimaryKeySelective(UserShopEntity record);

    int updateByPrimaryKey(UserShopEntity record);
}