package com.rongyi.rpb.bizz;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.RyMchVo;
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
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rpb.unit.PayConfigInitUnit;
import com.rongyi.rpb.unit.SaveUnit;
import com.rongyi.rss.rpb.OrderNoGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

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
    @Autowired
    InitEntityUnit initEntityUnit;
    @Autowired
    SaveUnit saveUnit;
    @Autowired
    OrderNoGenService orderNoGenService;

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

        PaymentEntity reversePaymentEntity = baseReverse(payType, oldPaymentEntity);

        //保存撤销记录
        saveUnit.updatePaymentEntity(reversePaymentEntity,null,null);

        WwPunchCardReverseReqData reqData = new WwPunchCardReverseReqData();
        reqData.setMerchant_code(weBankMchNo);
        reqData.setTerminal_serialno(reversePaymentEntity.getPayNo());
        reqData.setO_terminal_serialno(oldPaymentEntity.getPayNo());
        reqData.setAmount(oldPaymentEntity.getAmountMoney());

        WwPunchCardReverseResData resData = WebankPayUnit.wechatPunchCardReverse(reqData);
        if(resData.getResult() == null || !"0".equals(resData.getResult().getErrno())){
            throw new WebankException(ConstantEnum.EXCEPTION_REVERSE_FAIL.getCodeStr(),ConstantEnum.EXCEPTION_REVERSE_FAIL.getValueStr());
        }

        //保存撤销成功记录
        reversePaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        reversePaymentEntity.setFinishTime(new Date());
        saveUnit.updatePaymentEntity(reversePaymentEntity,null,null);
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

        PaymentEntity reversePaymentEntity = baseReverse( payType, oldPaymentEntity);
        //保存撤销记录
        saveUnit.updatePaymentEntity(reversePaymentEntity, null, null);

        WaReverseTradeReqData reqData = new WaReverseTradeReqData();
        reqData.setWbMerchantId(weBankMchNo);
        reqData.setOrderId(oldPaymentEntity.getPayNo());

        WaReverseTradeResData resData = WebankPayUnit.alipayReverseTrade(reqData);

        //保存撤销成功记录
        reversePaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        reversePaymentEntity.setFinishTime(new Date());
        saveUnit.updatePaymentEntity(reversePaymentEntity, null,null);
        return resData;
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

        PaymentEntity reversePaymentEntity = baseReverse(payType, oldPaymentEntity);
        //保存撤销记录
        saveUnit.updatePaymentEntity(reversePaymentEntity, null, null);

        WeChatPayUnit.reverseOrder(orderNo, wechatConfigure);

        //保存撤销记录
        reversePaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        reversePaymentEntity.setFinishTime(new Date());
        saveUnit.updatePaymentEntity(reversePaymentEntity, null, null);
    }

    /**
     * 初始化撤销记录
     * @param payType 支付方式 0支付宝 1微信
     * @param oldPaymentEntity
     * @return
     */
    public PaymentEntity baseReverse(Integer payType, PaymentEntity oldPaymentEntity) {
        //初始化退款入住商户信息
        RyMchVo ryMchVo = initRefundRyMchVo(oldPaymentEntity);

        //查询订单是否已退款，已退款不可再撤销
        PaymentEntity refundPaymentEntity = paymentService.selectByOrderNumAndTradeType(oldPaymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_STATUS.STAUS2,
                payType);

        if (refundPaymentEntity != null) {
            throw new TradePayException(ConstantEnum.EXCEPTION_REVERSE_ISREFUND.getCodeStr(),ConstantEnum.EXCEPTION_REVERSE_ISREFUND.getValueStr());
        }

        //查找订单撤销记录
        PaymentEntity oldReversePaymentEntity = paymentService.selectByOrderNumAndTradeType(oldPaymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE9, null,
                payType);

        if (oldReversePaymentEntity != null && oldReversePaymentEntity.getStatus() == Constants.PAYMENT_STATUS.STAUS2) {
            throw new TradePayException(ConstantEnum.EXCEPTION_REVERSE_REPLAY.getCodeStr(),ConstantEnum.EXCEPTION_REVERSE_REPLAY.getValueStr());
        }

        //未撤销成功的撤销记录已存在
        if(oldReversePaymentEntity != null){
            oldReversePaymentEntity.setPayNo(orderNoGenService.getOrderNo("0"));
            return oldReversePaymentEntity;
        }

        //计算撤销金额
        Integer reverseAmount = oldPaymentEntity.getOrderPrice().multiply(new BigDecimal(100)).intValue();

        //初始化撤销记录
        PaymentEntity reversePaymentEntity = initEntityUnit.initPaymentEntity(ryMchVo, oldPaymentEntity.getOrderNum(),
                reverseAmount, oldPaymentEntity.getOrderType(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE9,
                payType, "", "",oldPaymentEntity.getPayScene());
        if (oldPaymentEntity.getStatus().equals(Constants.PAYMENT_STATUS.STAUS2)) {
            reversePaymentEntity.setIsRefund(Constants.IS_REFUND.yes);
        }
        return reversePaymentEntity;
    }

    public RyMchVo initRefundRyMchVo(PaymentEntity paymentEntity){
        //初始化开放商户信息
        RyMchVo ryMchVo = new RyMchVo();
        ryMchVo.setSource(paymentEntity.getSource());
        ryMchVo.setRyAppId(paymentEntity.getRyAppId());
        ryMchVo.setRyMchId(paymentEntity.getRyMchId());
        ryMchVo.setOrgChannel(paymentEntity.getOrgChannel());
        return ryMchVo;
    }

}
