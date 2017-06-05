package com.rongyi.rpb.unit;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentEntityExt;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.rpb.mapper.PaymentEntityExtMapper;
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
    @Autowired
    PaymentEntityExtMapper paymentEntityExtMapper;

    public void updatePaymentEntity(PaymentEntity paymentEntity,PaymentLogInfo paymentLogInfo,PaymentEntityExt paymentEntityExt){


        try {
            log.info("支付请求写入数据库orderNum:{},payNo:{}",paymentEntity.getOrderNum(),paymentEntity.getPayNo());
            //支付记录
            if(paymentEntity != null && paymentEntity.getId() != null && paymentEntity.getId() > 0){
                paymentService.updateByPrimaryKeySelective(paymentEntity);
            }else if(paymentEntity != null){
                paymentService.insert(paymentEntity);
            }
            log.info("支付请求写入数据库完成orderNum:{},payNo:{}",paymentEntity.getOrderNum(),paymentEntity.getPayNo());
            //支付事件记录
            if(paymentLogInfo != null){
                paymentLogInfoService.insert(paymentLogInfo);
            }
            //扩展表记录
            if(paymentEntityExt != null){
                if(paymentEntityExt.getId() == null){
                    if(paymentEntityExt.getPaymentOrderId() == null && paymentEntity != null) {
                        paymentEntityExt.setPaymentOrderId(paymentEntity.getId());
                    }
                    paymentEntityExtMapper.insertSelective(paymentEntityExt);
                }else {
                    paymentEntityExtMapper.updateByPrimaryKey(paymentEntityExt);
                }
            }
        } catch (Exception e) {
            log.error("修改支付记录出错,e={}",e.getMessage(),e);
            throw new RuntimeException(e.getMessage(),e.getCause());
        }
    }
}
