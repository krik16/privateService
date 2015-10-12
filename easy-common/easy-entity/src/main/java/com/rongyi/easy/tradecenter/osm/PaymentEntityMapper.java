package com.rongyi.easy.tradecenter.osm;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentEntityMapper {
    int countByExample(PaymentEntityExample example);

    int deleteByExample(PaymentEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentEntity record);

    int insertSelective(PaymentEntity record);

    List<PaymentEntity> selectByExample(PaymentEntityExample example);

    PaymentEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentEntity record, @Param("example") PaymentEntityExample example);

    int updateByExample(@Param("record") PaymentEntity record, @Param("example") PaymentEntityExample example);

    int updateByPrimaryKeySelective(PaymentEntity record);

    int updateByPrimaryKey(PaymentEntity record);
}