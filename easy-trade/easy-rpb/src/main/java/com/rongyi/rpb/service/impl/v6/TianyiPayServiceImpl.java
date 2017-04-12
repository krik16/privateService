package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rss.rpb.ITianyiPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/4/12 11:28
 **/
public class TianyiPayServiceImpl implements ITianyiPayService {

    @Autowired
    RefundBizz refundBizz;

    private static final Logger log = LoggerFactory.getLogger(TianyiPayServiceImpl.class);
    @Override
    public Map<String, Object> refund(String orderNo, int refundAmount) throws TradePayException {
        log.info("翼支付退款,orderNo={},refundAmount={}",orderNo,refundAmount);
        try {
            refundBizz.tianyiRefund(orderNo,refundAmount);
            return new HashMap<>();
        } catch (WebankException | ParamNullException e) {
            log.warn("翼支付退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("翼支付退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("翼支付退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_TIANYI_TRADEREFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_TIANYI_TRADEREFUND_FAIL.getValueStr());
        }
    }
}
