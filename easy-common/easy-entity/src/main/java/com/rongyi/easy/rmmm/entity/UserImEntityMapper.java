package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.UserImEntity;
import com.rongyi.easy.rmmm.entity.UserImEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserImEntityMapper {
    int countByExample(UserImEntityExample example);

    int deleteByExample(UserImEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserImEntity record);

    int insertSelective(UserImEntity record);

    List<UserImEntity> selectByExample(UserImEntityExample example);

    UserImEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserImEntity record, @Param("example") UserImEntityExample example);

    int updateByExample(@Param("record") UserImEntity record, @Param("example") UserImEntityExample example);

    int updateByPrimaryKeySelective(UserImEntity record);

    int updateByPrimaryKey(UserImEntity record);
}