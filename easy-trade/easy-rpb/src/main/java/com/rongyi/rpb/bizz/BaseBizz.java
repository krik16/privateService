package com.rongyi.rpb.bizz;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentEntityExt;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.ryoms.entity.WechatTianyiPayVo;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mapper.PaymentEntityExtMapper;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rss.rpb.OrderNoGenService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

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
    @Autowired
    PaymentEntityExtMapper paymentEntityExtMapper;

    @Autowired
    OrderNoGenService orderNoGenService;
    /**
     * 初始化支付记录信息
     */
    protected PaymentEntity initPaymentEntity(RyMchVo ryMchVo, String orderNo, Integer totalFee, String aliSellerId, String wechatMchId,
                                              Integer payChannel, Integer orderType,Integer paySence) {
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
            paymentEntity.setPayScene(paySence);
            paymentEntity.setPayChannel(payChannel);
            paymentEntity.setPayNo(orderNoGenService.getOrderNo("0"));
        } else {
            //生成支付信息
            paymentEntity = initEntityUnit.initPaymentEntity(ryMchVo, orderNo, totalFee, orderType, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, payChannel,
                    aliSellerId, wechatMchId,paySence);
        }
        return paymentEntity;
    }

    /**
     * 初始化支付记录信息
     */
    protected PaymentEntity initPaymentEntity(WechatTianyiPayVo wechatTianyiPayVo, String orderNo, Integer totalFee,
                                              Integer payChannel, Integer orderType,Integer paySence,Byte source) {

        //查找支付记录
        PaymentEntity paymentEntity = paymentService.selectByOrderNoAndPayChannelWithLock(orderNo, payChannel);

        //检查订单是否已支付完成
        PaymentEntity finishPayment = paymentService.selectByOrderNumAndTradeType(orderNo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2, null);
        if (finishPayment != null) {// 订单已完成支付
            throw new TradePayException("-1", "此订单已成功支付,此次请求属于订单重复支付请求,请重新下单,重复订单号为:" + orderNo);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("tianyiPayId", wechatTianyiPayVo.getId());
        jsonObject.put("merchatId", wechatTianyiPayVo.getMerchatId());
        jsonObject.put("merchatKey", wechatTianyiPayVo.getMerchatKey());
        jsonObject.put("merchatPwd", wechatTianyiPayVo.getMerchatPwd());
        //支付记录已存在
        if (paymentEntity != null) {
            paymentEntity.setSource(source);
            paymentEntity.setOrgChannel((byte) 2);
            paymentEntity.setCreateTime(DateUtil.getCurrDateTime());
            paymentEntity.setOrderPrice(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
            paymentEntity.setAmountMoney(new BigDecimal(totalFee).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
            paymentEntity.setPayScene(paySence);
            paymentEntity.setPayChannel(payChannel);
            paymentEntity.setTianyiPayId(wechatTianyiPayVo.getId());
            paymentEntity.setAttach(jsonObject.toString());
        } else {
            //生成支付信息
            paymentEntity = initEntityUnit.initPaymentEntity(wechatTianyiPayVo.getId(), orderNo, totalFee, orderType, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, payChannel,
                    paySence,jsonObject.toString(),source);
        }
        return paymentEntity;
    }

    /**
     * 初始化支付扩展表信息
     */
    protected PaymentEntityExt initPaymentEntityExt(String extend,Integer paymentEntityId,String memo) {
        PaymentEntityExt paymentEntityExt = null;
        //查找扩展表记录
        if (paymentEntityId != null) {
            paymentEntityExt = paymentEntityExtMapper.selectByPaymentOrderId(paymentEntityId);
        }
        if (paymentEntityExt == null) {
            paymentEntityExt = new PaymentEntityExt();
        }
        if(StringUtil.isNotEmpty(extend)){
            String[] extendArray = extend.split("__");
            //记录已存在
            paymentEntityExt.setPaymentOrderId(paymentEntityId);
            if(extendArray.length > 0){
                paymentEntityExt.setMchInfoId(extendArray[0]);
            }
            if(extendArray.length > 1){
                paymentEntityExt.setStoreId(extendArray[1]);
            }
            if(extendArray.length > 2){
                paymentEntityExt.setPosNo(extendArray[2]);
            }
        }
        paymentEntityExt.setCreateAt(new Date());
        paymentEntityExt.setMemo(memo);
        return paymentEntityExt;
    }


    /**
     * 初始化支付扩展表信息
     */
    protected PaymentEntityExt initPaymentEntityExt(String mchInfoId,String storeId,String posNo,String subject,
                                                    String body,String attach,Integer paymentEntityId,String extend,String memo) {
        PaymentEntityExt paymentEntityExt = null;
        //查找扩展表记录
        if (paymentEntityId != null) {
            paymentEntityExt = paymentEntityExtMapper.selectByPaymentOrderId(paymentEntityId);
        }
        //记录不存在
        if (paymentEntityExt == null) {
            paymentEntityExt = new PaymentEntityExt();
            paymentEntityExt.setPaymentOrderId(paymentEntityId);
        }
        //特殊定义扩展信息
        if(StringUtil.isNotEmpty(extend)){
            String[] extendArray = extend.split("__");
            if(extendArray.length > 0){
                paymentEntityExt.setMchInfoId(extendArray[0]);
            }
            if(extendArray.length > 1){
                paymentEntityExt.setStoreId(extendArray[1]);
            }
            if(extendArray.length > 2){
                paymentEntityExt.setPosNo(extendArray[2]);
            }
        }
        if(StringUtil.isNotEmpty(mchInfoId)) {
            paymentEntityExt.setMchInfoId(mchInfoId);
        }
        if(StringUtil.isNotEmpty(storeId)) {
            paymentEntityExt.setStoreId(storeId);
        }
        if(StringUtil.isNotEmpty(posNo)) {
            paymentEntityExt.setPosNo(posNo);
        }
        paymentEntityExt.setSubject(subject);
        paymentEntityExt.setBody(body);
        paymentEntityExt.setAttach(attach);
        paymentEntityExt.setCreateAt(new Date());
        paymentEntityExt.setMemo(memo);
        return paymentEntityExt;
    }
}
