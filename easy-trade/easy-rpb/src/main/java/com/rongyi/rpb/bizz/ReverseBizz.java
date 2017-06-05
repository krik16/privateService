package com.rongyi.rpb.bizz;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.model.WaReverseTradeReqData;
import com.rongyi.pay.core.webank.model.WaReverseTradeResData;
import com.rongyi.pay.core.webank.model.WwPunchCardReverseReqData;
import com.rongyi.pay.core.webank.model.WwPunchCardReverseResData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.PayConfigInitUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * conan
 * 2017/2/27 14:25
 **/
@Repository
public class ReverseBizz {

    @Autowired
    PaymentService paymentService;
    @Autowired
    PayConfigInitUnit payConfigInitUnit;
    @Autowired
    PaymentLogInfoService paymentLogInfoService;
    /**
     * 微众微信支付订单撤销
     *
     * @param orderNo     订单号
     * @param payType  支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WwPunchCardReverseResData webankWechatOrderReverse(String orderNo, Integer payType, String weBankMchNo) {

        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, null,
                payType);

        if (oldPaymentEntity == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }

//        if(oldPaymentEntity.getStatus() == Constants.PAYMENT_STATUS.STAUS2){
//            throw new TradePayException(ConstantEnum.EXCEPTION_LIMIT_REVERSE.getCodeStr(),ConstantEnum.EXCEPTION_LIMIT_REVERSE.getValueStr());
//        }

        WwPunchCardReverseReqData reqData = new WwPunchCardReverseReqData();
        reqData.setMerchant_code(weBankMchNo);
        reqData.setTerminal_serialno(System.currentTimeMillis() + "");
        reqData.setO_terminal_serialno(oldPaymentEntity.getPayNo());
        reqData.setAmount(oldPaymentEntity.getAmountMoney());

        WwPunchCardReverseResData resData = WebankPayUnit.wechatPunchCardReverse(reqData);
        if(resData.getResult() == null || !"0".equals(resData.getResult().getErrno())){
            throw new WebankException(ConstantEnum.EXCEPTION_REVERSE_FAIL.getCodeStr(),ConstantEnum.EXCEPTION_REVERSE_FAIL.getValueStr());
        }
        return resData;
    }

    /**
     * 微众支付宝支付订单撤销
     *
     * @param orderNo     订单号
     * @param payType  支付方式(0:支付宝,1:微信)
     * @param weBankMchNo 微众商户号
     * @return PunchCardPayQueryResData
     */
    public WaReverseTradeResData webankAliOrderReverse(String orderNo, Integer payType, String weBankMchNo) {

        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, null,
                payType);

        if (oldPaymentEntity == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        //去掉支付成功不允许撤销的限制
        if(oldPaymentEntity.getStatus() == Constants.PAYMENT_STATUS.STAUS2){
            throw new TradePayException(ConstantEnum.EXCEPTION_LIMIT_REVERSE.getCodeStr(),ConstantEnum.EXCEPTION_LIMIT_REVERSE.getValueStr());
        }
        WaReverseTradeReqData reqData = new WaReverseTradeReqData();
        reqData.setWbMerchantId(weBankMchNo);
        reqData.setOrderId(oldPaymentEntity.getPayNo());

        return WebankPayUnit.alipayReverseTrade(reqData);
    }
    /**
     * 微信微信订单撤销
     *
     * @param orderNo     订单号
     * @param payType  支付方式(0:支付宝,1:微信)
     */
    public void wechatOrderReverse(String orderNo, Integer payType, WechatConfigure wechatConfigure) {

        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, null,
                payType);

        if (oldPaymentEntity == null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        if(oldPaymentEntity.getStatus() == Constants.PAYMENT_STATUS.STAUS2){
            throw new TradePayException(ConstantEnum.EXCEPTION_LIMIT_REVERSE.getCodeStr(),ConstantEnum.EXCEPTION_LIMIT_REVERSE.getValueStr());
        }
        WeChatPayUnit.reverseOrder(orderNo, wechatConfigure);
    }

}
