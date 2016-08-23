package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.UserInviteCodeRelationEntity;
import com.rongyi.easy.rmmm.entity.UserInviteCodeRelationEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInviteCodeRelationEntityMapper {
    int countByExample(UserInviteCodeRelationEntityExample example);

    int deleteByExample(UserInviteCodeRelationEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInviteCodeRelationEntity record);

    int insertSelective(UserInviteCodeRelationEntity record);

    List<UserInviteCodeRelationEntity> selectByExample(UserInviteCodeRelationEntityExample example);

    UserInviteCodeRelationEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInviteCodeRelationEntity record, @Param("example") UserInviteCodeRelationEntityExample example);

    int updateByExample(@Param("record") UserInviteCodeRelationEntity record, @Param("example") UserInviteCodeRelationEntityExample example);

    int updateByPrimaryKeySelective(UserInviteCodeRelationEntity record);

    int updateByPrimaryKey(UserInviteCodeRelationEntity record);
}