package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.FeedbackInfoEntity;
import com.rongyi.easy.rmmm.entity.FeedbackInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackInfoEntityMapper {
    int countByExample(FeedbackInfoEntityExample example);

    int deleteByExample(FeedbackInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeedbackInfoEntity record);

    int insertSelective(FeedbackInfoEntity record);

    List<FeedbackInfoEntity> selectByExample(FeedbackInfoEntityExample example);

    FeedbackInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeedbackInfoEntity record, @Param("example") FeedbackInfoEntityExample example);

    int updateByExample(@Param("record") FeedbackInfoEntity record, @Param("example") FeedbackInfoEntityExample example);

    int updateByPrimaryKeySelective(FeedbackInfoEntity record);

    int updateByPrimaryKey(FeedbackInfoEntity record);
}