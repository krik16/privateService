package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.UserLoginInfoEntity;

public interface UserLoginInfoEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLoginInfoEntity record);

    int insertSelective(UserLoginInfoEntity record);

    UserLoginInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoginInfoEntity record);

    int updateByPrimaryKey(UserLoginInfoEntity record);
}