package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.RmmmUserScoreEntity;
import com.rongyi.easy.rmmm.entity.RmmmUserScoreEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RmmmUserScoreEntityMapper {
    int countByExample(RmmmUserScoreEntityExample example);

    int deleteByExample(RmmmUserScoreEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RmmmUserScoreEntity record);

    int insertSelective(RmmmUserScoreEntity record);

    List<RmmmUserScoreEntity> selectByExample(RmmmUserScoreEntityExample example);

    RmmmUserScoreEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RmmmUserScoreEntity record, @Param("example") RmmmUserScoreEntityExample example);

    int updateByExample(@Param("record") RmmmUserScoreEntity record, @Param("example") RmmmUserScoreEntityExample example);

    int updateByPrimaryKeySelective(RmmmUserScoreEntity record);

    int updateByPrimaryKey(RmmmUserScoreEntity record);
}