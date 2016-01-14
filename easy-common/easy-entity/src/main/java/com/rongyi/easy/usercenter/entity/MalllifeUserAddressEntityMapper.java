package com.rongyi.easy.usercenter.entity;

public interface MalllifeUserAddressEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(MalllifeUserAddressEntity record);

    int insertSelective(MalllifeUserAddressEntity record);

    MalllifeUserAddressEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MalllifeUserAddressEntity record);

    int updateByPrimaryKey(MalllifeUserAddressEntity record);
}