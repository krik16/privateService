package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.UserSuggestionEntity;
import com.rongyi.easy.rmmm.entity.UserSuggestionEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSuggestionEntityMapper {
    int countByExample(UserSuggestionEntityExample example);

    int deleteByExample(UserSuggestionEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserSuggestionEntity record);

    int insertSelective(UserSuggestionEntity record);

    List<UserSuggestionEntity> selectByExampleWithBLOBs(UserSuggestionEntityExample example);

    List<UserSuggestionEntity> selectByExample(UserSuggestionEntityExample example);

    UserSuggestionEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserSuggestionEntity record, @Param("example") UserSuggestionEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSuggestionEntity record, @Param("example") UserSuggestionEntityExample example);

    int updateByExample(@Param("record") UserSuggestionEntity record, @Param("example") UserSuggestionEntityExample example);

    int updateByPrimaryKeySelective(UserSuggestionEntity record);

    int updateByPrimaryKeyWithBLOBs(UserSuggestionEntity record);

    int updateByPrimaryKey(UserSuggestionEntity record);
}