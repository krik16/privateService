package com.rongyi.rpb.service.impl.v6;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.param.PaymentOrderParam;
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
    private Logger logger = LoggerFactory.getLogger(QueryServiceImpl.class);
    @Autowired
    PaymentService paymentService;

    @Override
    public List<PaymentEntity> batchQueryByOrderNos(List<String> orderNoList,Integer tradeType){
        logger.info("orderNoList={},tradeType={}",orderNoList,tradeType);
        return paymentService.batchQueryByOrderNos(orderNoList,tradeType);
    }

    @Override
    public PaymentEntity queryByOrderNoAndTradeType(String orderNo, Integer tradeType, Integer status, Integer payChannel) {
        logger.info("查询paymentOrder,orderNo={},tradeType={},status={},paychannel={}",orderNo,tradeType,status,payChannel);
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

    @Override
    public PaymentEntity queryByPayNo(String payNo) {
        logger.info("查询paymentOrder,payNo={}",payNo);
        List<PaymentEntity> payments = paymentService.selectByPayNo(payNo);
        return payments.get(0);
    }
}
