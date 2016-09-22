package com.rongyi.easy.usercenter.entity;

import com.rongyi.easy.usercenter.entity.MalllifeUserClickEntity;

public interface MalllifeUserClickEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MalllifeUserClickEntity record);

    int insertSelective(MalllifeUserClickEntity record);

    MalllifeUserClickEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MalllifeUserClickEntity record);

    int updateByPrimaryKey(MalllifeUserClickEntity record);
}