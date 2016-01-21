package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.RmmmUserRelationEntity;
import com.rongyi.easy.rmmm.entity.RmmmUserRelationEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RmmmUserRelationEntityMapper {
    int countByExample(RmmmUserRelationEntityExample example);

    int deleteByExample(RmmmUserRelationEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RmmmUserRelationEntity record);

    int insertSelective(RmmmUserRelationEntity record);

    List<RmmmUserRelationEntity> selectByExample(RmmmUserRelationEntityExample example);

    RmmmUserRelationEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RmmmUserRelationEntity record, @Param("example") RmmmUserRelationEntityExample example);

    int updateByExample(@Param("record") RmmmUserRelationEntity record, @Param("example") RmmmUserRelationEntityExample example);

    int updateByPrimaryKeySelective(RmmmUserRelationEntity record);

    int updateByPrimaryKey(RmmmUserRelationEntity record);
}