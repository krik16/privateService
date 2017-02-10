package com.rongyi.rpb.bizz;

import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.core.constant.TradeConstantEnum;
import com.rongyi.core.util.TradePaySignUtil;
import com.rongyi.easy.roa.entity.MchEncryptInfo;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.pay.core.Exception.AliPayException;
import com.rongyi.pay.core.Exception.WeChatException;
import com.rongyi.rpb.Exception.TradeException;
import com.rongyi.rpb.common.pay.util.HttpUtil;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rpb.unit.SaveUnit;
import com.rongyi.rss.redis.RedisService;
import com.rongyi.rss.roa.RoaMchEncryptInfoService;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/2/8 16:02
 **/
@Repository
public class PayNotifyBizz {

    private static final Logger log = LoggerFactory.getLogger(PayNotifyBizz.class);

    @Autowired
    InitEntityUnit initEntityUnit;
    @Autowired
    PaymentService paymentService;
    @Autowired
    PaymentLogInfoService paymentLogInfoService;
    @Autowired
    SaveUnit saveUnit;
    @Autowired
    RedisService redisService;
    @Autowired
    RoaMchEncryptInfoService  roaMchEncryptInfoService;

    private static final Integer maxRetryTimes = 7;

    private static final Integer retryInterval = 2;

    /**
     * 支付宝支付通知
     * @param map 通知参数
     */
    public void aliPayNotify(Map<String,String> map){
        log.info("支付宝支付异步通知内容,map={}", map);
        if ("TRADE_SUCCESS".equals(map.get("trade_status"))) {
            String payNo = map.get("out_trade_no");
            String tradeNo = map.get("trade_no");
            String buyerId = map.get("buyer_id");
            String buyerEmail = map.get("buyer_logon_id");
            BigDecimal payAmount = new BigDecimal(map.get("total_amount")).multiply(new BigDecimal(100));

            this.doPayNotify(payNo, payAmount, tradeNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, buyerId, buyerEmail);
        } else {
            throw new AliPayException("通知结果异常,map="+map);
        }
    }

    /**
     * 微信支付通知
     * @param map 通知参数
     */
    public void wechatPayNotify(Map<String, String> map) {
        log.info("微信支付通知内容,map={}", map);
        if ("SUCCESS".equals(map.get("result_code"))) {
            String payNo = map.get("out_trade_no");
            String tradeNo = map.get("transaction_id");
            String openId = map.get("openid");
            BigDecimal payAmount = new BigDecimal(map.get("total_fee")).multiply(new BigDecimal(100));

            this.doPayNotify(payNo, payAmount, tradeNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, openId,"");
        } else {
            throw new WeChatException("通知结果异常,map="+map);
        }

    }

    /**
     * 处理支付通知
     * @param payNo 付款单号
     * @param payAmount 付款金额(单位元)
     * @param tradeNo 交易流水号
     * @param payChannel 支付渠道
     * @param buyerId 买家id
     * @param buyerEmail 买家账号
     */
    public void doPayNotify(String payNo, BigDecimal payAmount, String tradeNo, Integer payChannel, String buyerId, String buyerEmail){
        //获取支付信息
        PaymentEntity paymentEntity = paymentService.selectByPayNoWithLock(payNo, payChannel, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS0);
        if (paymentEntity == null) {
            throw new TradeException("此订单支付记录不存在,payNo={}", payNo);
        }

        if (paymentEntity.getAmountMoney().compareTo(payAmount) != 0) {
            throw new TradeException("支付金额不符,payNo={}", payNo);
        }

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(tradeNo, payNo,null, "SUCCESS",payAmount.intValue(),
                buyerId,buyerEmail,0,Constants.EVENT_TYPE.EVENT_TYPE0,Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0,"");
        //检查重复支付
        boolean rePayResult = paymentLogInfoService.validateRepeatPay(paymentEntity.getPayNo(),paymentLogInfo, payChannel);
        if (rePayResult) { // 验证是否是重复支付
            log.info("此笔订单属于重复支付,已发起退款,付款单号payNo={}", paymentEntity.getPayNo());
            return;
        }
        //更新付款状态
        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        paymentEntity.setFinishTime(new Date());

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);

        //通知第三方业务
        payNotifyThird(paymentEntity,paymentLogInfo);
    }

    /**
     * 支付成功通知第三方
     *
     * @param paymentEntity PaymentEntity
     */
    private void payNotifyThird(PaymentEntity paymentEntity,PaymentLogInfo paymentLogInfo) {
        try {
            sysnNotifyThird(paymentEntity, paymentLogInfo, ConstantEnum.THIRD_NOTIFY_TYPE_1.getCodeStr());
        } catch (TradeException e) {
            log.error("第三方支付结果处理失败，暂记录日志，不做业务处理，payNo={},errno={},errmsg={}", paymentEntity.getPayNo(), e.getCode(), e.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 异步开启支付通知接口
     * @param paymentEntity PaymentEntity
     * @param type 交易类型 1:支付/2:退款
     */
    private void sysnNotifyThird(final PaymentEntity paymentEntity,final PaymentLogInfo paymentLogInfo ,final String type) {
        final Thread thread = new Thread() {
            @Override
            public void run() {
                reTryNotifyThird(paymentEntity,paymentLogInfo, type, 1);
            }
        };
        thread.start();
    }

    /**
     * 递归通知第三方订单系统(重试机制)
     * @param paymentEntity PaymentEntity
     * @param type 交易类型 1:支付/2:退款
     * @param retryTimes 重试次数
     */
    private void reTryNotifyThird(PaymentEntity paymentEntity,PaymentLogInfo paymentLogInfo,String type, Integer retryTimes) {
        try {
            notifyThird(paymentEntity, paymentLogInfo,type);
        } catch (ThirdException e) {
            if (retryTimes <= maxRetryTimes) {//最多重试7次,加上默认第一次的通知,一共8次,0,4s,16s,64s,17m,1h8m,4h33m,18h10m
                //每次重试之后睡眠2的2*n次方秒
                long retryIntervalMill = Double.valueOf(Math.pow(retryInterval, 2 * retryTimes)).longValue() * 1000;
                log.info("异步支付结果通知第三方系统处理未完成,等待后续处理，orderNo={},retryTimes={},retryIntervalMill={},errMsg={}", paymentEntity.getOrderNum(), retryTimes, retryIntervalMill, e.getMessage());
                try {
                    Thread.sleep(retryIntervalMill);
                } catch (InterruptedException e2) {
                    log.warn(e2.getMessage());
                }
                retryTimes++;
                reTryNotifyThird(paymentEntity, paymentLogInfo,type, retryTimes);
            } else {
                log.info("异步支付结果通知第三方系统最终处理失败,需人工处理,orderNo={}", paymentEntity.getOrderNum());
            }
        } catch (TradeException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new TradeException();
        }
    }

    /**
     * 退款成功通知第三方
     *
     * @param paymentEntity PaymentEntity
     */
    private void refundNotifyThird(PaymentEntity paymentEntity) {
        try {
            notifyThird(paymentEntity,null, ConstantEnum.THIRD_NOTIFY_TYPE_2.getCodeStr());
        } catch (ThirdException e) {
            log.error("第三方退款结果处理失败，暂记录日志，不做业务处理,payNo={},errno={},errmsg={}", paymentEntity.getPayNo(), e.getCode(), e.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * 通知第三方支付/退款结果
     *
     * @param paymentEntity PaymentEntity
     * @param type          0:支付,1:退款
     * @throws ThirdException
     */
    private void notifyThird(PaymentEntity paymentEntity,PaymentLogInfo paymentLogInfo ,String type) throws ThirdException, UnsupportedEncodingException {
        log.info("notifyThird start...paymentEntity={},type={}", paymentEntity, type);

        //获取商户在容易网的加密信息
        MchEncryptInfo mchEncryptInfo = roaMchEncryptInfoService.getByRyMchId(paymentEntity.getRyMchId());
        if(mchEncryptInfo == null || StringUtil.isEmpty(mchEncryptInfo.getToken())){
            throw new ThirdException(TradeConstantEnum.EXCEPTION_RY_MCH_NOT_FOUND.getCodeStr(), TradeConstantEnum.EXCEPTION_RY_MCH_NOT_FOUND.getValueStr());
        }

        Map<String,Object> map = new HashMap<>();
        map.put("tradeStatus", "SUCCESS");//支付成功默认为0/否则给1
        map.put("payAmount", String.valueOf(paymentEntity.getAmountMoney().multiply(new BigDecimal(100))));
        map.put("orderNo", paymentEntity.getOrderNum());
        map.put("payNo", paymentEntity.getPayNo());
        map.put("buyerId", paymentLogInfo.getBuyer_id());
        map.put("payChannel",paymentEntity.getPayChannel());
        //支付通知返回交易流水号
        if(type.equals(ConstantEnum.THIRD_NOTIFY_TYPE_1.getCodeStr())){
            map.put("tradeNo", paymentLogInfo.getTrade_no());
        }else{
            map.put("tradeNo", paymentLogInfo.getTransactionId());
        }
        map.put("type", type);
        String timeStamp = String.valueOf(DateUtil.getCurrDateTime().getTime()).substring(0, 10);
        map.put("timeStamp",timeStamp);
        String sign = TradePaySignUtil.getSignWithToken(map,mchEncryptInfo.getToken());
        map.put("sign", sign);
        String notifyUrl = redisService.get(paymentEntity.getPayNo()+paymentEntity.getOrderNum());
        if (StringUtils.isEmpty(notifyUrl)) {
            throw new TradeException(TradeConstantEnum.EXCEPTION_ORDER_NOTIFY_URL_NULL.getCodeStr(), TradeConstantEnum.EXCEPTION_ORDER_NOTIFY_URL_NULL.getValueStr());
        }
        String result = HttpUtil.httpPOST(notifyUrl, map);
        log.info("notifyThird end...result={}", result);
        if (StringUtil.isEmpty(result)) {
            throw new ThirdException(TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getCodeStr(), TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getValueStr());
        }
        JSONObject resultJson = JSONObject.fromObject(result);
        if (resultJson == null || resultJson.get("meta") == null) {
            throw new ThirdException(TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getCodeStr(), TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getValueStr());
        }
        JSONObject metaJson = resultJson.getJSONObject("meta");
        if (metaJson.get("errno") == null || !"0".equals(metaJson.getString("errno"))) {
            throw new ThirdException(metaJson.getString("errno"), metaJson.getString("msg"));
        }
    }
}
