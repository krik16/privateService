package com.rongyi.easy.domain.member;

import com.rongyi.easy.domain.member.RYUser;
import com.rongyi.easy.domain.member.RYUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RYUserMapper {
    int countByExample(RYUserExample example);

    int deleteByExample(RYUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RYUser record);

    int insertSelective(RYUser record);

    List<RYUser> selectByExample(RYUserExample example);

    RYUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RYUser record, @Param("example") RYUserExample example);

    int updateByExample(@Param("record") RYUser record, @Param("example") RYUserExample example);

    int updateByPrimaryKeySelective(RYUser record);

    int updateByPrimaryKey(RYUser record);
}