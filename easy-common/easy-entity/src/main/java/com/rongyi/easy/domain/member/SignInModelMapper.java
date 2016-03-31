package com.rongyi.easy.domain.member;

import com.rongyi.easy.domain.member.SignInModel;
import com.rongyi.easy.domain.member.SignInModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignInModelMapper {
    int countByExample(SignInModelExample example);

    int deleteByExample(SignInModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SignInModel record);

    int insertSelective(SignInModel record);

    List<SignInModel> selectByExample(SignInModelExample example);

    SignInModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SignInModel record, @Param("example") SignInModelExample example);

    int updateByExample(@Param("record") SignInModel record, @Param("example") SignInModelExample example);

    int updateByPrimaryKeySelective(SignInModel record);

    int updateByPrimaryKey(SignInModel record);
}