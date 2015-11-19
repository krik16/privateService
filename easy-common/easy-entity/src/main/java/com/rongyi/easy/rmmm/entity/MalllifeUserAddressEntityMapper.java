package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.MalllifeUserAddressEntity;

public interface MalllifeUserAddressEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(MalllifeUserAddressEntity record);

    int insertSelective(MalllifeUserAddressEntity record);

    MalllifeUserAddressEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MalllifeUserAddressEntity record);

    int updateByPrimaryKey(MalllifeUserAddressEntity record);
}