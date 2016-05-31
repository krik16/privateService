package com.rongyi.easy.usercenter.entity;

import com.rongyi.easy.usercenter.entity.MalllifeUserOpenidEntity;

public interface MalllifeUserOpenidEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MalllifeUserOpenidEntity record);

    int insertSelective(MalllifeUserOpenidEntity record);

    MalllifeUserOpenidEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MalllifeUserOpenidEntity record);

    int updateByPrimaryKey(MalllifeUserOpenidEntity record);
}