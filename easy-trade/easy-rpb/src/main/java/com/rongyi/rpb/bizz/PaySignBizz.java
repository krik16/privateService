package com.rongyi.rpb.bizz;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.model.res.WaScanPayResData;
import com.rongyi.pay.core.webank.param.WaScanPayParam;
import com.rongyi.pay.core.wechat.model.WechatPaySignData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.unit.SaveUnit;
import com.rongyi.rss.malllife.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Map;

/**
 * conan
 * 2017/3/30 11:14
 **/
@Repository
public class PaySignBizz extends BaseBizz{

    @Autowired
    SaveUnit saveUnit;
    @Autowired
    IRedisService redisService;

    /**
     * 微信扫码支付签名
     *
     * @param ryMchVo           容易商户信息
     * @param wechatPaySignData 业务参数
     * @param wechatConfigure   支付参数
     * @return map
     */
    public Map<String, Object> wechatScanPaySign(RyMchVo ryMchVo, WechatPaySignData wechatPaySignData, WechatConfigure wechatConfigure,Integer orderType) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, wechatPaySignData.getOrderNo(), wechatPaySignData.getTotalFee(), "",
                wechatConfigure.getMchID(), Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1,orderType);

        //获取微信支付签名
        wechatPaySignData.setPayNo(paymentEntity.getPayNo());
        Map<String, Object> map = WeChatPayUnit.getPaySign(wechatPaySignData, wechatConfigure, ConstantUtil.NOTIFY_ADDRESS_V6.WEIXIN_NOTIFY_URL_V6);

        //保存异步通知地址
        redisService.set(paymentEntity.getPayNo() + paymentEntity.getOrderNum(), wechatConfigure.getNotifyUrl());

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, null);

        return map;

    }


    /**
     * 支付宝扫码支付签名
     *
     * @param ryMchVo           容易商户信息
     * @param aliScanPayReqData 业务参数
     * @param aliConfigure      支付参数
     * @return map
     */
    public Map<String, Object> aliScanPaySign(RyMchVo ryMchVo, AliScanPayReqData aliScanPayReqData, AliConfigure aliConfigure,Integer orderType) {

        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, aliScanPayReqData.getOrderNo(), aliScanPayReqData.getTotalAmount(), aliScanPayReqData.getSellerId(), "",
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, orderType);

        //获取支付宝扫码支付签名
        aliScanPayReqData.setPayNo(paymentEntity.getPayNo());
        Map<String, Object> map = AliPayUnit.getScanPaySign(aliScanPayReqData, aliConfigure, ConstantUtil.NOTIFY_ADDRESS_V6.ALI_NOTIFY_URL_V6);

        //保存异步通知地址
        redisService.set(paymentEntity.getPayNo() + paymentEntity.getOrderNum(), aliConfigure.getNotifyUrl());

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, null);

        return map;
    }


    /**
     * 支付宝扫码支付签名
     *
     * @param ryMchVo           容易商户信息
     * @param waScanPayParam 业务参数
     * @return map
     */
    public WaScanPayResData webankAliScanPaySign(RyMchVo ryMchVo, WaScanPayParam waScanPayParam,Integer orderType) {


        Integer tatolAmount = new BigDecimal(waScanPayParam.getTotalAmount()).multiply(new BigDecimal(100)).intValue();
        //初始化支付记录
        PaymentEntity paymentEntity = initPaymentEntity(ryMchVo, waScanPayParam.getOrderId(),tatolAmount, waScanPayParam.getSellerId(), "",
                Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, orderType);

        //获取支付宝扫码支付签名
        waScanPayParam.setOrderId(paymentEntity.getPayNo());
        WaScanPayResData resData = WebankPayUnit.alipayScanPay(waScanPayParam);

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, null);

        return resData;
    }




}
