package com.rongyi.rpb.bizz;

import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.core.constant.TradeConstantEnum;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.core.util.TradePaySignUtil;
import com.rongyi.easy.roa.vo.RyMchAppVo;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.dto.PosBankSynNotifyDto;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.pay.core.Exception.AliPayException;
import com.rongyi.pay.core.Exception.WeChatException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.rpb.Exception.TradeException;
import com.rongyi.rpb.common.pay.util.HttpUtil;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.unit.InitEntityUnit;
import com.rongyi.rpb.unit.SaveUnit;
import com.rongyi.rss.lightning.RoaRyMchAppService;
import com.rongyi.rss.malllife.service.IRedisService;
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
import java.util.UUID;

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
    IRedisService redisService;
    @Autowired
    RoaRyMchAppService roaRyMchAppService;

    private static final Integer maxRetryTimes = 7;//最多重试次数

    private static final Integer retryInterval = 2;//重试等待时间基数

    /**
     * 支付宝支付通知
     *
     * @param map 通知参数
     */
    public void aliPayNotify(Map<String, String> map) {
        log.info("支付宝支付异步通知内容,map={}", map);
        if ("TRADE_SUCCESS".equals(map.get("trade_status"))) {
            String payNo = map.get("out_trade_no");
            String tradeNo = map.get("trade_no");
            String buyerId = map.get("buyer_id");
            String buyerEmail = map.get("buyer_logon_id");
            BigDecimal payAmount = new BigDecimal(map.get("total_amount"));

            this.doPayNotify(payNo, payAmount, tradeNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, buyerId, buyerEmail);
        } else {
            throw new AliPayException("通知结果异常,map=" + map);
        }
    }

    /**
     * 微信支付通知
     *
     * @param map 通知参数
     */
    public void wechatPayNotify(Map<String, String> map) {
        log.info("微信支付通知内容,map={}", map);
        if ("SUCCESS".equals(map.get("result_code"))) {
            String payNo = map.get("out_trade_no");
            String tradeNo = map.get("transaction_id");
            String openId = map.get("openid");
            BigDecimal payAmount = new BigDecimal(map.get("total_fee")).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);

            this.doPayNotify(payNo, payAmount, tradeNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, openId, "");
        } else {
            throw new WeChatException("通知结果异常,map=" + map);
        }
    }

    /**
     * 微众支付宝通知
     * @param paramMap 通知参数
     */
    @SuppressWarnings("unchecked")
    public void webankAlipayNotify(Map<String, String> paramMap) {
        log.info("微众支付宝通知内容,map={}",paramMap);
        Map<String,String> map =(Map<String,String>) JSONObject.fromObject(paramMap.get("data"));
        log.info("微众支付宝通知data内容,map={}",map);
        if ("01".equals(map.get("tradeStatus"))) {
            String payNo = map.get("orderId");
            String tradeNo = map.get("tradeNo");
            String buyerId = map.get("buyerId");
            String buyerEmail = map.get("buyerLogonId");
            BigDecimal payAmount = new BigDecimal(map.get("totalAmount"));

            this.doPayNotify(payNo, payAmount, tradeNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL0, buyerId, buyerEmail);
        } else {
            throw new WebankException("通知结果异常,map=" + map);
        }
    }

    /**
     * 微众微信通知
     * @param map 通知参数
     */
    public void webankWechatNotify(Map<String, String> map) {
        log.info("微众微信通知内容,map={}", map);
        if ("0".equals(map.get("status"))&&"0".equals(map.get("result_code"))&&"0".equals(map.get("pay_result"))) {
            String payNo = map.get("out_trade_no");
            String tradeNo = map.get("transaction_id");
            String openId = map.get("sub_openid");
            BigDecimal payAmount = new BigDecimal(map.get("total_fee")).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);

            this.doPayNotify(payNo, payAmount, tradeNo, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1, openId, "");
        } else {
            throw new WebankException("通知结果异常,map=" + map);
        }
    }

    public void posBankSynPayNotify(PosBankSynNotifyDto dto){

        //获取开放平台商户信息
        RyMchAppVo ryMchAppVo = roaRyMchAppService.getByMchIdAndAppId(dto.getRyMchId(), dto.getRyAppId());
        if (ryMchAppVo == null) {
            throw  new TradeException(ConstantEnum.EXCEPTION_MCH_NOT_FOUND.getCodeStr(),ConstantEnum.EXCEPTION_MCH_NOT_FOUND.getValueStr());
        }

        //验证签名
        validateSign(dto,ryMchAppVo.getToken(),dto.getSign());

        PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(dto.getOrderNo(),
                Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, null, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);

        BigDecimal payAmount = new BigDecimal(dto.getPayAmount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
        //支付通知
       if(dto.getType() != null && 0 == dto.getType()) {

           doPayNotify(paymentEntity.getPayNo(), payAmount, dto.getPaymentNo(), Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2, dto.getAccountNo(), dto.getAccountNo());
       }
       //退款通知
        else if(dto.getType() != null && 1 == dto.getType()){

           doPosBankRefundNotify(dto,Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL2);
       }
    }

    /**
     * 处理支付通知
     *
     * @param payNo      付款单号
     * @param payAmount  付款金额(单位元)
     * @param tradeNo    交易流水号
     * @param payChannel 支付渠道
     * @param buyerId    买家id
     * @param buyerEmail 买家账号
     */
    public void doPayNotify(String payNo, BigDecimal payAmount, String tradeNo, Integer payChannel, String buyerId, String buyerEmail) {
        //获取支付信息
        PaymentEntity paymentEntity = paymentService.selectByPayNoWithLock(payNo, payChannel, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, null);
        if (paymentEntity == null) {
            log.warn("此订单支付记录不存在,payNo={}", payNo);
            throw new TradeException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }

        if (paymentEntity.getAmountMoney().compareTo(payAmount) != 0) {
            log.warn("支付金额不符payNo={},realAmount={},recordAmount={}", payNo, payAmount, paymentEntity.getAmountMoney());
            throw new TradeException(ConstantEnum.EXCEPTION_AMOUNT_FAIL.getCodeStr(),ConstantEnum.EXCEPTION_AMOUNT_FAIL.getValueStr());
        }

        //初始化支付事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(tradeNo, payNo, null, "SUCCESS", payAmount.intValue(),
                buyerId, buyerEmail, 0, Constants.EVENT_TYPE.EVENT_TYPE0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, "");
        //检查重复支付
        boolean rePayResult = paymentLogInfoService.validateRepeatPay(paymentEntity.getPayNo(), paymentLogInfo, payChannel);

        // 验证是否是重复支付
        if (rePayResult) {
            log.info("此笔订单属于重复支付,已发起退款,付款单号payNo={}", paymentEntity.getPayNo());
            return;
        }
        //更新付款状态
        paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        paymentEntity.setFinishTime(new Date());

        //保存支付记录
        saveUnit.updatePaymentEntity(paymentEntity, paymentLogInfo);

        //通知第三方业务
        payNotifyThird(paymentEntity, paymentLogInfo);
    }

    /**
     * 处理pos银行卡退款通知
     *
     */
    public void doPosBankRefundNotify(PosBankSynNotifyDto posBankSynNotifyDto,Integer payChannel) {
        //获取支付信息
        PaymentEntity oldPaymentEntity = paymentService.selectByOrderNoAndPayChannelWithLock(posBankSynNotifyDto.getOrderNo(), payChannel);
        if (oldPaymentEntity == null || oldPaymentEntity.getStatus() == null || Constants.PAYMENT_STATUS.STAUS2 != oldPaymentEntity.getStatus()) {
            log.warn("此订单支付记录不存在,orderNo={}", posBankSynNotifyDto.getOrderNo());
            throw new TradeException(ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getCodeStr(),ConstantEnum.EXCEPTION_PAY_RECORED_NOT_EXIST.getValueStr());
        }
        //获取支付信息
        PaymentEntity refundPaymentEntity = paymentService.selectByOrderNumAndTradeType(posBankSynNotifyDto.getOrderNo(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1,
                null, payChannel);
        if (refundPaymentEntity != null && Constants.PAYMENT_STATUS.STAUS2 == refundPaymentEntity.getStatus()) {
            log.warn("此订单已退款,无法再次退款,orderNo={}", posBankSynNotifyDto.getOrderNo());
            throw new TradeException(ConstantEnum.EXCEPTION_REFUND_FAIL.getCodeStr(),ConstantEnum.EXCEPTION_REFUND_FAIL.getValueStr());
        }

        RyMchVo ryMchVo = new RyMchVo();
        ryMchVo.setRyMchId(posBankSynNotifyDto.getRyMchId());
        ryMchVo.setRyAppId(posBankSynNotifyDto.getRyAppId());
        ryMchVo.setSource((byte)4);
        ryMchVo.setOrgChannel(oldPaymentEntity.getOrgChannel());
        //初始化退款记录
        if(refundPaymentEntity == null) {
            refundPaymentEntity = initEntityUnit.initPaymentEntity(ryMchVo, posBankSynNotifyDto.getOrderNo(), posBankSynNotifyDto.getPayAmount().intValue(), oldPaymentEntity.getOrderType(),
                    Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, oldPaymentEntity.getPayChannel(), oldPaymentEntity.getAliSellerId(), oldPaymentEntity.getWechatMchId(),
                    oldPaymentEntity.getPayScene());
        }

        refundPaymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
        refundPaymentEntity.setFinishTime(new Date());

        //初始化退款事件记录
        PaymentLogInfo paymentLogInfo = initEntityUnit.initPaymentLogInfo(posBankSynNotifyDto.getPaymentNo(), refundPaymentEntity.getPayNo(), Constants.REPLAY_FLAG.REPLAY_FLAG3,
                "SUCCESS", posBankSynNotifyDto.getPayAmount().intValue(), "", "",
                0, 0, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, "");

        //保存退款记录
        saveUnit.updatePaymentEntity(refundPaymentEntity, paymentLogInfo);

    }


    /**
     * 支付成功通知第三方
     *
     * @param paymentEntity PaymentEntity
     */
    public void payNotifyThird(PaymentEntity paymentEntity, PaymentLogInfo paymentLogInfo) {
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
     *
     * @param paymentEntity PaymentEntity
     * @param type          交易类型 1:支付/2:退款
     */
    private void sysnNotifyThird(final PaymentEntity paymentEntity, final PaymentLogInfo paymentLogInfo, final String type) {
        final Thread thread = new Thread() {
            @Override
            public void run() {
                reTryNotifyThird(paymentEntity, paymentLogInfo, type, 1);
            }
        };
        thread.start();
    }

    /**
     * 递归通知第三方订单系统(重试机制)
     *
     * @param paymentEntity PaymentEntity
     * @param type          交易类型 1:支付/2:退款
     * @param retryTimes    重试次数
     */
    private void reTryNotifyThird(PaymentEntity paymentEntity, PaymentLogInfo paymentLogInfo, String type, Integer retryTimes) {
        try {
            notifyThird(paymentEntity, paymentLogInfo, type);
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
                reTryNotifyThird(paymentEntity, paymentLogInfo, type, retryTimes);
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
//    private void refundNotifyThird(PaymentEntity paymentEntity) {
//        try {
//            notifyThird(paymentEntity, null, ConstantEnum.THIRD_NOTIFY_TYPE_2.getCodeStr());
//        } catch (ThirdException e) {
//            log.error("第三方退款结果处理失败，暂记录日志，不做业务处理,payNo={},errno={},errmsg={}", paymentEntity.getPayNo(), e.getCode(), e.getMessage());
//        } catch (Exception e) {
//            log.error(e.getMessage());
//            e.printStackTrace();
//        }
//    }


    /**
     * 通知第三方支付/退款结果
     *
     * @param paymentEntity PaymentEntity
     * @param type          0:支付,1:退款
     * @throws ThirdException
     */
    private void notifyThird(PaymentEntity paymentEntity, PaymentLogInfo paymentLogInfo, String type) throws ThirdException, UnsupportedEncodingException {
        log.info("容易网支付通知开始,orderNo={},tradeNo={},type={}", paymentEntity.getOrderNum(), paymentLogInfo.getTrade_no(), type);

        //获取商户在容易网的注册信息
        RyMchAppVo ryMchAppVo = roaRyMchAppService.getByMchIdAndAppId(paymentEntity.getRyMchId(), paymentEntity.getRyAppId());
        if (ryMchAppVo == null || StringUtil.isEmpty(ryMchAppVo.getToken())) {
            log.warn("ryMchId={},ryAppId={}",paymentEntity.getRyMchId(),paymentEntity.getRyAppId());
            throw new ThirdException(TradeConstantEnum.EXCEPTION_RY_MCH_NOT_FOUND.getCodeStr(), TradeConstantEnum.EXCEPTION_RY_MCH_NOT_FOUND.getValueStr());
        }

        Map<String, Object> map = new HashMap<>();
        map.put("notifyId", UUID.randomUUID());
        map.put("tradeStatus", "SUCCESS");
        map.put("totalAmount", String.valueOf(paymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP)));
        map.put("orderNo", paymentEntity.getOrderNum());
        map.put("payNo", paymentEntity.getPayNo());
        map.put("buyerId", paymentLogInfo.getBuyer_id());
        map.put("payChannel", paymentEntity.getPayChannel());
        map.put("ryMchId", paymentEntity.getRyMchId());
        map.put("ryAppId", paymentEntity.getRyAppId());
        //支付通知返回交易流水号
        if (type.equals(ConstantEnum.THIRD_NOTIFY_TYPE_1.getCodeStr())) {
            map.put("tradeNo", paymentLogInfo.getTrade_no());
        } else {
            map.put("tradeNo", paymentLogInfo.getTransactionId());
        }
        map.put("type", type);
        //支付方式
        map.put("payType",paymentEntity.getPayChannel());
        String timeStamp = String.valueOf(DateUtil.getCurrDateTime().getTime()).substring(0, 10);
        map.put("timeStamp", timeStamp);
        log.info("token={}", ryMchAppVo.getToken());
        String sign = TradePaySignUtil.getSignWithToken(map, ryMchAppVo.getToken());
        map.put("sign", sign);
        //异步通知地址.优先获取下单接口传的地址
        String notifyUrl = redisService.get(paymentEntity.getPayNo() + paymentEntity.getOrderNum());

        if (StringUtils.isEmpty(notifyUrl)) {
            if(StringUtil.isNotEmpty(ryMchAppVo.getNotifyUrl())){
                notifyUrl = ryMchAppVo.getNotifyUrl();
            }else{
                log.warn("支付通知异步地址不存在,通知失败...notifyUrl={}",notifyUrl);
                return;
            }
        }
        String result = HttpUtil.httpPOST(notifyUrl, map);
        log.info("容易网支付通知结果,result={}", result);
        if (StringUtil.isEmpty(result) || !"SUCCESS".equals(result)) {
            throw new ThirdException(TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getCodeStr(), TradeConstantEnum.EXCEPTION_THIRD_PAY_NOTIFY.getValueStr());
        }
        //删除异步通知地址
        redisService.expire(paymentEntity.getPayNo() + paymentEntity.getOrderNum(), 1000);
        log.info("容易网支付通知结束");
    }

    /**
     * 请求签名验证
     * @param o 请求参数对象
     * @param token 商户token
     */
    private void validateSign(Object o,String token,String sign){
        try {
            Map<String, Object> map = BeanMapUtils.objectToMapRemoveSign(o);
            Boolean result = TradePaySignUtil.signValidateWithToken(map, token, sign);
            if(!result){
                log.warn("验签失败,result={}", result);
                throw new TradeException(ConstantEnum.EXC_SIGN_FAIL.getCodeStr(),ConstantEnum.EXC_SIGN_FAIL.getValueStr());
            }
        } catch (Exception e) {
            log.error("验签失败,e={}", e.getMessage(), e);
            throw new TradeException(ConstantEnum.EXC_SIGN_FAIL.getCodeStr(),ConstantEnum.EXC_SIGN_FAIL.getValueStr());
        }
    }

}
