package com.rongyi.rpb.service.impl.v6;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rss.rpb.IQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * conan
 * 2017/3/14 16:26
 **/
public class QueryServiceImpl implements IQueryService{

    private static final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);
    @Autowired
    PaymentService paymentService;

    @Override
    public List<PaymentEntity> batchQueryByOrderNos(List<String> orderNoList,Integer tradeType){
        log.info("orderNoList={},tradeType={}",orderNoList,tradeType);
        return paymentService.batchQueryByOrderNos(orderNoList,tradeType);
    }

    @Override
    public PaymentEntity queryByOrderNoAndTradeType(String orderNo, Integer tradeType, Integer status, Integer payChannel) {
        log.info("orderNo={},tradeType={},status={},payChannel={}",orderNo,tradeType,status,payChannel);
        return paymentService.selectByOrderNumAndTradeType(orderNo,tradeType,status,payChannel);
    }
}
