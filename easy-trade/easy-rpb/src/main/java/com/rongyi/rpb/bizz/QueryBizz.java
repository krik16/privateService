package com.rongyi.rpb.bizz;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.model.WwPunchCardQueryOrderReqData;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * conan
 * 2017/2/27 14:25
 **/
@Repository
public class QueryBizz {

    @Autowired
    PaymentService paymentService;
    /**
     * 微信刷卡支付订单查询
     *
     * @param orderNo     订单号
     * @param payType  支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WwPunchCardResData wechatPunchCardPayQueryOrder(String orderNo,Integer payType,String weBankMchNo) {

        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
                payType);

        if (oldPaymentEntity == null) {
            throw new TradePayException("此订单支付记录不存在,orderNo={}", orderNo);
        }
        WwPunchCardQueryOrderReqData reqData  = new WwPunchCardQueryOrderReqData(oldPaymentEntity.getPayNo(),weBankMchNo);

        return WebankPayUnit.webankWechatPunchCardPayQueryOrder(reqData);
    }
}
