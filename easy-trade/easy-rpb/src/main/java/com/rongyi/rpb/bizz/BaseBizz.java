package com.rongyi.rpb.bizz;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * conan
 * 2017/3/30 11:16
 **/
@Repository
public class BaseBizz {

    @Autowired
    PaymentService paymentService;
    @Autowired
    InitEntityUnit initEntityUnit;
    /**
     * 初始化支付记录信息
     */
    protected PaymentEntity initPaymentEntity(RyMchVo ryMchVo, String orderNo, Integer totalFee, String aliSellerId, String wechatMchId, Integer payChannel, Integer orderType) {

        //查找支付记录
        PaymentEntity paymentEntity = paymentService.selectByOrderNoAndPayChannelWithLock(orderNo, payChannel);

        //检查订单是否已支付完成
        PaymentEntity finishPayment = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2, null);
        if (finishPayment != null) {// 订单已完成支付
            throw new TradePayException("-1", "此订单已成功支付,此次请求属于订单重复支付请求,请重新下单,重复订单号为:" + orderNo);
        }
        //支付记录已存在
        if (paymentEntity != null) {
            paymentEntity.setWechatMchId(wechatMchId);
            paymentEntity.setAliSellerId(aliSellerId);
            paymentEntity.setRyMchId(ryMchVo.getRyMchId());
            paymentEntity.setRyAppId(ryMchVo.getRyAppId());
            paymentEntity.setSource(ryMchVo.getSource());
            paymentEntity.setOrgChannel(ryMchVo.getOrgChannel());
            paymentEntity.setCreateTime(DateUtil.getCurrDateTime());
            paymentEntity.setOrderPrice(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
            paymentEntity.setAmountMoney(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
        } else {
            //生成支付信息
            paymentEntity = initEntityUnit.initPaymentEntity(ryMchVo, orderNo, totalFee, orderType, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, payChannel, aliSellerId, wechatMchId);
        }
        return paymentEntity;
    }

}
