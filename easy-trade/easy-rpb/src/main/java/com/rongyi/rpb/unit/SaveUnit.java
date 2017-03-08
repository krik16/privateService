package com.rongyi.rpb.unit;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * conan
 * 2017/2/7 14:51
 **/
@Repository
public class SaveUnit {

    private static final Logger log = LoggerFactory.getLogger(SaveUnit.class);
    @Autowired
    PaymentService paymentService;

    @Autowired
    PaymentLogInfoService paymentLogInfoService;


    public void updatePaymentEntity(PaymentEntity paymentEntity,PaymentLogInfo paymentLogInfo){

        try {
            if(paymentEntity != null && paymentEntity.getId() != null && paymentEntity.getId() > 0){
                paymentService.updateByPrimaryKeySelective(paymentEntity);
            }else if(paymentEntity != null){
                paymentService.insert(paymentEntity);
            }
            if(paymentLogInfo != null){
                paymentLogInfoService.insert(paymentLogInfo);
            }
        } catch (Exception e) {
            log.error("修改支付记录出错,e={}",e.getMessage(),e);
            throw new RuntimeException(e.getMessage(),e.getCause());
        }
    }
}
