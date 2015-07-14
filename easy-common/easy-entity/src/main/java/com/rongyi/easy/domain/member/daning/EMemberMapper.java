package com.rongyi.easy.domain.member.daning;

import com.rongyi.easy.domain.member.daning.EMember;
import com.rongyi.easy.domain.member.daning.EMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EMemberMapper {
    int countByExample(EMemberExample example);

    int deleteByExample(EMemberExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(EMember record);

    int insertSelective(EMember record);

    List<EMember> selectByExample(EMemberExample example);

    EMember selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") EMember record, @Param("example") EMemberExample example);

    int updateByExample(@Param("record") EMember record, @Param("example") EMemberExample example);

    int updateByPrimaryKeySelective(EMember record);

    int updateByPrimaryKey(EMember record);
}