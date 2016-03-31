package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.UserAccountEntity;
import com.rongyi.easy.rmmm.entity.UserAccountEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountEntityMapper {
    int countByExample(UserAccountEntityExample example);

    int deleteByExample(UserAccountEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAccountEntity record);

    int insertSelective(UserAccountEntity record);

    List<UserAccountEntity> selectByExample(UserAccountEntityExample example);

    UserAccountEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAccountEntity record, @Param("example") UserAccountEntityExample example);

    int updateByExample(@Param("record") UserAccountEntity record, @Param("example") UserAccountEntityExample example);

    int updateByPrimaryKeySelective(UserAccountEntity record);

    int updateByPrimaryKey(UserAccountEntity record);
}