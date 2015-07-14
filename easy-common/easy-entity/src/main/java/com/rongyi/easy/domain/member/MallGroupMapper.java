package com.rongyi.easy.domain.member;

import com.rongyi.easy.domain.member.MallGroup;
import com.rongyi.easy.domain.member.MallGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallGroupMapper {
    int countByExample(MallGroupExample example);

    int deleteByExample(MallGroupExample example);

    int deleteByPrimaryKey(String mallId);

    int insert(MallGroup record);

    int insertSelective(MallGroup record);

    List<MallGroup> selectByExample(MallGroupExample example);

    MallGroup selectByPrimaryKey(String mallId);

    int updateByExampleSelective(@Param("record") MallGroup record, @Param("example") MallGroupExample example);

    int updateByExample(@Param("record") MallGroup record, @Param("example") MallGroupExample example);

    int updateByPrimaryKeySelective(MallGroup record);

    int updateByPrimaryKey(MallGroup record);
}