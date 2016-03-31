package com.rongyi.easy.entity;

import com.rongyi.easy.entity.MemberGiftHistory;
import com.rongyi.easy.entity.MemberGiftHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberGiftHistoryMapper {
    int countByExample(MemberGiftHistoryExample example);

    int deleteByExample(MemberGiftHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberGiftHistory record);

    int insertSelective(MemberGiftHistory record);

    List<MemberGiftHistory> selectByExample(MemberGiftHistoryExample example);

    MemberGiftHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberGiftHistory record, @Param("example") MemberGiftHistoryExample example);

    int updateByExample(@Param("record") MemberGiftHistory record, @Param("example") MemberGiftHistoryExample example);

    int updateByPrimaryKeySelective(MemberGiftHistory record);

    int updateByPrimaryKey(MemberGiftHistory record);
}