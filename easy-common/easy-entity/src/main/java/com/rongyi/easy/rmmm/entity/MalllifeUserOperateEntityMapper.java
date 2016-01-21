package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.MalllifeUserOperateEntity;

public interface MalllifeUserOperateEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MalllifeUserOperateEntity record);

    int insertSelective(MalllifeUserOperateEntity record);

    MalllifeUserOperateEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MalllifeUserOperateEntity record);

    int updateByPrimaryKey(MalllifeUserOperateEntity record);
}