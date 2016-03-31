package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.BankInfoEntity;
import com.rongyi.easy.rmmm.entity.BankInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankInfoEntityMapper {
    int countByExample(BankInfoEntityExample example);

    int deleteByExample(BankInfoEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankInfoEntity record);

    int insertSelective(BankInfoEntity record);

    List<BankInfoEntity> selectByExample(BankInfoEntityExample example);

    BankInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankInfoEntity record, @Param("example") BankInfoEntityExample example);

    int updateByExample(@Param("record") BankInfoEntity record, @Param("example") BankInfoEntityExample example);

    int updateByPrimaryKeySelective(BankInfoEntity record);

    int updateByPrimaryKey(BankInfoEntity record);
}