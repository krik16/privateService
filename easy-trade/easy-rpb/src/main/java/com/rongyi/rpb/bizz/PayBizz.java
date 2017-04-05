package com.rongyi.rpb.bizz;

import com.alipay.api.response.AlipayTradePayResponse;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.v6.CashPayVo;
import com.rongyi.easy.rpb.vo.v6.PaymentEntityVo;
import com.rongyi.easy.rpb.vo.v6.PosBankCardPayVo;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.reqData.AliPunchCardPayReqData;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.model.WaPunchCardPayResData;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.rongyi.pay.core.wechat.model.PunchCardPayResData;
import com.rongyi.pay.core.wechat.model.WechatPaySignData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.unit.PayConfigInitUnit;
import com.rongyi.rpb.unit.SaveUnit;
import com.rongyi.rss.malllife.service.IRedisService;
import com.rongyi.rss.rpb.OrderNoGenService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

/**
 * conan
 * 2017/2/7 10:28
 **/
@Repository
public class PayBizz extends BaseBizz{

    @Autowired
    SaveUnit saveUnit;
    @Autowired
    IRedisService redisService;
    @Autowired
    PayConfigInitUnit payConfigInitUnit;
    @Autowired
    PayNotifyBizz payNotifyBizz;
    @Autowired
    OrderNoGenService orderNoGenService;

    /**
     * 微信刷卡支付
     *
     * @param ryMchVo           容易商户信息
     * @param wechatPaySignData 业务参数
     * @param wechatConfigure   支付参数
     * @return PunchCardPayResData
     */
    public PunchCardPayResData wechatPunchCardPay(RyMchVo ryMchVo, WechatPaySignData wechatPaySignData, WechatConfigure wechatConfigure, Integer orderType) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, wechatPaySignData.getOrderNo(), wechatPaySignData.getTotalFee(), "", wechatConfigure.getMchID(), Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1,
                orderType,ConstantEnum.PAY_SCENE_POS.getCodeInt());

        //发起支付
        wechatPaySignData.setPayNo(paymentEntity.getPayNo());
        PunchCardPayResData punchCardPayResData;
        if (ConstantEnum.PAY_NATIVE_0.getCodeInt().equals(ryMchVo.getNativePay())) {
            punchCardPayResData = WeChatPayUnit.punchCardPay(wechatPaySignData, wechatConfigure);

            paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
            paymentEntity.setFinishTime(new Date());

            //初始化支付事件记录
            PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(punchCardPayResData.getTransaction_id(), punchCardPayResData.getOut_trade_no(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                    punchCardPayResData.getResult_code(), punchCardPayResData.getTotal_fee(), punchCardPayResData.getOpenid(), punchCardPayResData.getOpenid(),
                    0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");

            //保存支付记录
            saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);
        } else {
            punchCardPayResData = WeChatPayUnit.punchCardNativePay(wechatPaySignData, wechatConfigure);
            //保存未支付记录
            saveUnit.updatePaymentEntity(paymentEntity, null);
            //循环查询支付状态
            wechatWaitUserPaying(paymentEntity, wechatConfigure, punchCardPayResData);
        }

        return punchCardPayResData;
    }


    /**
     * 支付宝刷卡支付
     *
     * @param ryMchVo                容易商户信息
     * @param aliPunchCardPayReqData 业务参数
     * @param aliConfigure           支付参数
     * @param orderType              订单类型
     * @return AlipayTradePayResponse
     */
    public AlipayTradePayResponse aliPunchCardPay(RyMchVo ryMchVo, AliPunchCardPayReqData aliPunchCardPayReqData, AliConfigure aliConfigure, Integer orderType) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, aliPunchCardPayReqData.getOrderNo(), aliPunchCardPayReqData.getTotalAmount(), aliPunchCardPayReqData.getSellerId(),
                "", Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, orderType,ConstantEnum.PAY_SCENE_POS.getCodeInt());

        //发起支付
        aliPunchCardPayReqData.setPayNo(paymentEntity.getPayNo());
        AlipayTradePayResponse alipayTradePayResponse = AliPayUnit.punchCardPay(aliPunchCardPayReqData, aliConfigure);

        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        paymentEntity.setFinishTime(new Date());

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(alipayTradePayResponse.getTradeNo(), alipayTradePayResponse.getOutTradeNo(), Constants.REPLAY_FLAG.REPLAY_FLAG0,
                "SUCCESS", aliPunchCardPayReqData.getTotalAmount(), alipayTradePayResponse.getBuyerUserId(), alipayTradePayResponse.getBuyerLogonId(),
                0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);

        //发送异步通知
        payNotifyBizz.payNotifyThird(paymentEntity, paymentLogInfo);
        return alipayTradePayResponse;
    }


    /**
     * 微众渠道微信刷卡支付
     *
     * @param ryMchVo             容易商户信息
     * @param wwPunchCardPayParam 业务参数
     * @param orderType           订单类型
     * @return WwPunchCardResData
     */
    public WwPunchCardResData webankWechatPunchCardPay(RyMchVo ryMchVo, WwPunchCardPayParam wwPunchCardPayParam, Integer orderType) {


        Integer totalFee = wwPunchCardPayParam.getAmount().multiply(new BigDecimal(100)).intValue();
        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, wwPunchCardPayParam.getOrderNo(), totalFee, "", "",
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, orderType,ConstantEnum.PAY_SCENE_POS.getCodeInt());

        //支付流水号设置为微众商户单号
        wwPunchCardPayParam.setOrderNo(paymentEntity.getPayNo());
        WwPunchCardResData wwPunchCardResData;

        //综合支付
        if (ConstantEnum.PAY_NATIVE_0.getCodeInt().equals(ryMchVo.getNativePay())) {
            wwPunchCardResData = WebankPayUnit.wechatPunchCardPay(wwPunchCardPayParam);
            paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
            paymentEntity.setFinishTime(new Date());

            Integer payAmount = new BigDecimal(wwPunchCardResData.getTotal_fee()).multiply(new BigDecimal(100)).intValue();
            //初始化支付事件记录
            PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(wwPunchCardResData.getTransaction_id(), wwPunchCardResData.getTerminal_serialno(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                    "SUCCESS", payAmount, wwPunchCardResData.getOpenid(), wwPunchCardResData.getOpenid(),
                    0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");

            //保存支付记录
            saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);

            //发送异步通知
            payNotifyBizz.payNotifyThird(paymentEntity, paymentLogInfo);
            //微众支付查询接口未返回
            wwPunchCardResData.setTerminal_serialno(paymentEntity.getPayNo());
        }
        //原生支付,直接返回客户端支付状态,异步循环处理用户支付中的情况,检测到用户已完成支付则更新支付状态
        else {
            wwPunchCardResData = WebankPayUnit.wechatPunchCardPayNative(wwPunchCardPayParam);
            //保存未支付记录
            saveUnit.updatePaymentEntity(paymentEntity, null);
            //循环查询支付状态
            webankWechatWaitUserPaying(paymentEntity, wwPunchCardPayParam);
        }

        return wwPunchCardResData;
    }

    /**
     * 微众渠道支付宝刷卡支付
     *
     * @param ryMchVo             容易商户信息
     * @param waPunchCardPayParam 业务参数
     * @param orderType           订单类型
     * @return WwPunchCardResData
     */
    public WaPunchCardPayResData webankAliPunchCardPay(RyMchVo ryMchVo, WaPunchCardPayParam waPunchCardPayParam, Integer orderType) {

        //初始化设置支付宝ticket
        payConfigInitUnit.initAliTicket();
        Integer totalFee = waPunchCardPayParam.getTotalAmount().multiply(new BigDecimal(100)).intValue();
        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, waPunchCardPayParam.getOrderId(), totalFee, "", "",
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, orderType,ConstantEnum.PAY_SCENE_POS.getCodeInt());

        //支付流水号设置为微众商户单号
        waPunchCardPayParam.setOrderId(paymentEntity.getPayNo());
        WaPunchCardPayResData resData;
        //综合支付处理接口
        if (ConstantEnum.PAY_NATIVE_0.getCodeInt().equals(ryMchVo.getNativePay())) {
            resData = WebankPayUnit.alipayPunchCardPay(waPunchCardPayParam);

            paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
            paymentEntity.setFinishTime(new Date());

            //支付结果返回金额计算
            Integer totalAmount = new BigDecimal(resData.getTotalAmount()).multiply(new BigDecimal(100)).intValue();
            //初始化支付事件记录
            PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(resData.getTradeNo(), paymentEntity.getPayNo(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                    "SUCCESS", totalAmount, resData.getBuyerUserId(), resData.getBuyerLogonId(),
                    0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");

            //保存支付记录
            saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);
            //发送异步通知
            payNotifyBizz.payNotifyThird(paymentEntity, paymentLogInfo);
        }
        //原生支付接口
        else {
            resData = WebankPayUnit.alipayPunchCardPayNative(waPunchCardPayParam);
            //保存未支付记录
            saveUnit.updatePaymentEntity(paymentEntity, null);
            //循环查询支付状态
            webankAliWaitUserPaying(paymentEntity, waPunchCardPayParam);
        }
        return resData;
    }

    /**
     * 现金支付
     *
     * @param ryMchVo   容易商户信息
     * @param cashPayVo 业务参数
     * @param orderType 订单类型
     * @return WwPunchCardResData
     */
    public PaymentEntityVo cashPay(RyMchVo ryMchVo, CashPayVo cashPayVo, Integer orderType) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, cashPayVo.getOrderNo(), cashPayVo.getTotalAmount(), "", "",
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL3, orderType,ConstantEnum.PAY_SCENE_POS.getCodeInt());

        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        paymentEntity.setFinishTime(new Date());

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(orderNoGenService.getOrderNo("6"), paymentEntity.getPayNo(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                "SUCCESS", cashPayVo.getTotalAmount(), "", "",
                0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);
        //发送异步通知
        payNotifyBizz.payNotifyThird(paymentEntity, paymentLogInfo);

        //设置返回对象
        PaymentEntityVo paymentEntityVo = new PaymentEntityVo();
        BeanUtils.copyProperties(paymentEntity, paymentEntityVo);
        paymentEntityVo.setTradeNo(paymentLogInfo.getTrade_no());
        return paymentEntityVo;
    }

    /**
     * 现金支付
     *
     * @param ryMchVo          容易商户信息
     * @param posBankCardPayVo 业务参数
     * @param orderType        订单类型
     * @return WwPunchCardResData
     */
    public PaymentEntity posBankCardPay(RyMchVo ryMchVo, PosBankCardPayVo posBankCardPayVo, Integer orderType) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, posBankCardPayVo.getOrderNo(), posBankCardPayVo.getTotalAmount(), "", "",
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2, orderType,ConstantEnum.PAY_SCENE_POS.getCodeInt());

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, null);
        return paymentEntity;
    }




    /**
     * 容易网渠道微信原生支付接口调用，循环处理用户支付中的场景
     */
    private void wechatWaitUserPaying(final PaymentEntity paymentEntity, final WechatConfigure wechatConfigure, final PunchCardPayResData punchCardPayResData) {

        final Thread thread = new Thread() {
            @Override
            public void run() {
                WeChatPayUnit.waitUserPaying(paymentEntity.getPayNo(), wechatConfigure, punchCardPayResData, 24);
                paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
                paymentEntity.setFinishTime(new Date());

                //初始化支付事件记录
                PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(punchCardPayResData.getTransaction_id(), punchCardPayResData.getOut_trade_no(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                        punchCardPayResData.getResult_code(), punchCardPayResData.getTotal_fee(), punchCardPayResData.getOpenid(), punchCardPayResData.getOpenid(),
                        0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");
                doNativePay(paymentEntity, paymentLogInfo);
            }
        };
        thread.start();

    }


    /**
     * 微众微信原生支付接口调用，循环处理用户支付中的场景
     */
    private void webankWechatWaitUserPaying(final PaymentEntity paymentEntity, final WwPunchCardPayParam wwPunchCardPayParam) {

        final Thread thread = new Thread() {
            @Override
            public void run() {
                WwPunchCardResData wwPunchCardResData = WebankPayUnit.waitUserWechatPaying(wwPunchCardPayParam, 24);
                Integer payAmount = new BigDecimal(wwPunchCardResData.getTotal_fee()).multiply(new BigDecimal(100)).intValue();
                //初始化支付事件记录
                PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(wwPunchCardResData.getTransaction_id(), wwPunchCardResData.getTerminal_serialno(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                        "SUCCESS", payAmount, wwPunchCardResData.getOpenid(), wwPunchCardResData.getOpenid(),
                        0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");
                doNativePay(paymentEntity, paymentLogInfo);
            }
        };
        thread.start();

    }

    /**
     * 微众支付宝原生支付接口调用，循环处理用户支付中的场景
     */
    private void webankAliWaitUserPaying(final PaymentEntity paymentEntity, final WaPunchCardPayParam waPunchCardPayParam) {

        final Thread thread = new Thread() {
            @Override
            public void run() {
                WaPunchCardPayResData resData = WebankPayUnit.waitUserAlipayPaying(waPunchCardPayParam, 24);
                //支付结果返回金额计算
                Integer totalAmount = new BigDecimal(resData.getTotalAmount()).multiply(new BigDecimal(100)).intValue();
                //初始化支付事件记录
                PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(resData.getTradeNo(), paymentEntity.getPayNo(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                        "SUCCESS", totalAmount, resData.getBuyerUserId(), resData.getBuyerLogonId(),
                        0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");
                doNativePay(paymentEntity, paymentLogInfo);
            }
        };
        thread.start();
    }

    /**
     * 原生支付结果处理
     */
    private void doNativePay(PaymentEntity paymentEntity, PaymentLogInfo paymentLogInfo) {

        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        paymentEntity.setFinishTime(new Date());
        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);
        //发送异步通知
        payNotifyBizz.payNotifyThird(paymentEntity, paymentLogInfo);

    }

}
