package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.RefundReasonEntity;
import com.rongyi.easy.rmmm.entity.RefundReasonEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundReasonEntityMapper {
    int countByExample(RefundReasonEntityExample example);

    int deleteByExample(RefundReasonEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefundReasonEntity record);

    int insertSelective(RefundReasonEntity record);

    List<RefundReasonEntity> selectByExample(RefundReasonEntityExample example);

    RefundReasonEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefundReasonEntity record, @Param("example") RefundReasonEntityExample example);

    int updateByExample(@Param("record") RefundReasonEntity record, @Param("example") RefundReasonEntityExample example);

    int updateByPrimaryKeySelective(RefundReasonEntity record);

    int updateByPrimaryKey(RefundReasonEntity record);
}