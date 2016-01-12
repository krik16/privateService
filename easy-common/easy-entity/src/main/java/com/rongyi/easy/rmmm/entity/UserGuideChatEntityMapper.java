package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.UserGuideChatEntity;
import com.rongyi.easy.rmmm.entity.UserGuideChatEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGuideChatEntityMapper {
    int countByExample(UserGuideChatEntityExample example);

    int deleteByExample(UserGuideChatEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserGuideChatEntity record);

    int insertSelective(UserGuideChatEntity record);

    List<UserGuideChatEntity> selectByExample(UserGuideChatEntityExample example);

    UserGuideChatEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserGuideChatEntity record, @Param("example") UserGuideChatEntityExample example);

    int updateByExample(@Param("record") UserGuideChatEntity record, @Param("example") UserGuideChatEntityExample example);

    int updateByPrimaryKeySelective(UserGuideChatEntity record);

    int updateByPrimaryKey(UserGuideChatEntity record);
}