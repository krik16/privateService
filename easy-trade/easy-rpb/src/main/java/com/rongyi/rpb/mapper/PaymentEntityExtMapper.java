package com.rongyi.rpb.mapper;


import com.rongyi.easy.rpb.domain.PaymentEntityExt;

public interface PaymentEntityExtMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentEntityExt record);

    int insertSelective(PaymentEntityExt record);

    PaymentEntityExt selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(PaymentEntityExt record);

    PaymentEntityExt selectByPaymentOrderId(Integer paymentOrderId);
}