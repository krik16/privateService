package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentEntityExt;
import com.rongyi.easy.rpb.param.PaymentOrderParam;
import com.rongyi.easy.rpb.vo.v6.PaymentEntityVo;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.mapper.PaymentEntityExtMapper;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rss.rpb.IQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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
    @Autowired
    PaymentEntityExtMapper paymentEntityExtMapper;
    @Override
    public List<PaymentEntity> batchQueryByOrderNos(List<String> orderNoList,Integer tradeType){
        logger.info("orderNoList={},tradeType={}",orderNoList,tradeType);
        return paymentService.batchQueryByOrderNos(orderNoList,tradeType);
    }

    @Override
    public PaymentEntityVo queryByOrderNoAndTradeType(String orderNo, Integer tradeType, Integer status, Integer payChannel) {
        logger.info("查询paymentOrder,orderNo={},tradeType={},status={},paychannel={}", orderNo, tradeType, status, payChannel);
        PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, tradeType, status, payChannel);
        if(paymentEntity == null){
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(), ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        PaymentEntityExt paymentEntityExt = paymentEntityExtMapper.selectByPaymentOrderId(paymentEntity.getId());
        PaymentEntityVo vo = new PaymentEntityVo();
        BeanUtils.copyProperties(paymentEntity, vo);
        if(paymentEntityExt != null) {
            vo.setMchInfoId(paymentEntityExt.getMchInfoId());
            vo.setStoreId(paymentEntityExt.getStoreId());
            vo.setPosNo(paymentEntityExt.getPosNo());
        }
        return vo;
    }

    @Override
    public List<PaymentEntityVo> queryListByParam(PaymentOrderParam param) {
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
