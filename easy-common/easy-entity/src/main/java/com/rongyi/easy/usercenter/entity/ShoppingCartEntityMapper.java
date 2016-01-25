package com.rongyi.easy.usercenter.entity;

import com.rongyi.easy.usercenter.entity.ShoppingCartEntity;

public interface ShoppingCartEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCartEntity record);

    int insertSelective(ShoppingCartEntity record);

    ShoppingCartEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCartEntity record);

    int updateByPrimaryKey(ShoppingCartEntity record);
}