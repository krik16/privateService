package com.rongyi.easy.usercenter.entity;

import com.rongyi.easy.usercenter.entity.MalllifeWelfareEntity;

public interface MalllifeWelfareEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MalllifeWelfareEntity record);

    int insertSelective(MalllifeWelfareEntity record);

    MalllifeWelfareEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MalllifeWelfareEntity record);

    int updateByPrimaryKey(MalllifeWelfareEntity record);
}