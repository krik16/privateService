package com.rongyi.rpb.service.impl.v6;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.param.PaymentOrderParam;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rss.rpb.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * conan
 * 2017/3/14 16:26
 **/
public class QueryServiceImpl implements IQueryService{

    @Autowired
    PaymentService paymentService;

    @Override
    public List<PaymentEntity> batchQueryByOrderNos(List<String> orderNoList,Integer tradeType){
        return paymentService.batchQueryByOrderNos(orderNoList,tradeType);
    }

    @Override
    public PaymentEntity queryByOrderNoAndTradeType(String orderNo, Integer tradeType, Integer status, Integer payChannel) {
        return paymentService.selectByOrderNumAndTradeType(orderNo,tradeType,status,payChannel);
    }

    @Override
    public List<PaymentEntity> queryListByParam(PaymentOrderParam param) {
        return paymentService.queryListByParam(param);
    }

    @Override
    public Integer queryCountByParam(PaymentOrderParam paymentParam) {
        return paymentService.queryCountByParam(paymentParam);
    }
}
