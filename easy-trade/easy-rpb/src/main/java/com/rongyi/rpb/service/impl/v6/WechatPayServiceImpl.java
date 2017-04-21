package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.WechatConfigureVo;
import com.rongyi.easy.rpb.vo.WechatPaySignVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WeChatException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.wechat.model.*;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.bizz.*;
import com.rongyi.rss.rpb.IWechatPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/2/6 17:06
 **/
@Service
public class WechatPayServiceImpl extends BaseServiceImpl implements IWechatPayService {

    private static final Logger log = LoggerFactory.getLogger(WechatPayServiceImpl.class);

    @Autowired
    PayBizz payBizz;
    @Autowired
    RefundBizz refundBizz;
    @Autowired
    QueryBizz queryBizz;
    @Autowired
    ReverseBizz reverseBizz;
    @Autowired
    PaySignBizz paySignBizz;

    @Override
    public Map<String, Object> getPaySign(RyMchVo ryMchVo, WechatPaySignVo wechatPaySignVo, WechatConfigureVo wechatConfigureVo) throws TradePayException {

        log.info("获取微信支付签名,ryMchVo={},wechatPaySignVo={},wechatConfigureVo={}", ryMchVo, wechatPaySignVo, wechatConfigureVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //设置业务参数
            WechatPaySignData wechatPaySignData = getWechatPaySignData(wechatPaySignVo);
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            //获取微信支付签名
            Map<String, Object> map = paySignBizz.wechatScanPaySign(ryMchVo, wechatPaySignData, wechatConfigure,wechatPaySignVo.getOrderType());
            //外部订单号
            map.put("orderNo", wechatPaySignVo.getOrderNo());

            log.info("返回签名结果,map={}", map);
            return map;
        } catch (WeChatException | ParamNullException e) {
            log.warn("获取微信签名失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("获取微信签名失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("获取微信签名失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> refund(String orderNo, int refundFee, WechatConfigureVo wechatConfigureVo) throws TradePayException {
        log.info("微信退款,orderNo={}refundFee={},wechatConfigureVo={}", orderNo, refundFee, wechatConfigureVo);
        try {
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            RefundResData resData = refundBizz.weChatRefund(orderNo, refundFee, wechatConfigure);
            Map<String, Object> map = BeanMapUtils.toMap(resData);

            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOut_trade_no());
            //微众银行退款单号
            map.put("tradeNo", resData.getTransaction_id());
            //交易金额
            map.put("totalAmount", resData.getTotal_fee());
            //退款状态
            map.put("tradeStatus","SUCCESS");
            log.info("退款结果,map={}", map);
            return map;
        } catch (WeChatException | ParamNullException e) {
            log.warn("退款失败，e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("退款失败，e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> refundQuery(String orderNo, WechatConfigureVo wechatConfigureVo) throws TradePayException {
        log.info("微信退款查询,orderNo={},wechatConfigureVo={}", orderNo, wechatConfigureVo);
        try {
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            RefundQueryResData resData = queryBizz.wechatRefundQuery(orderNo, wechatConfigure);
            Map<String, Object> map = BeanMapUtils.toMap(resData);

            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOut_trade_no());

            //微众银行退款单号
            map.put("tradeNo", resData.getTransaction_id());

            //交易金额
            map.put("totalAmount", resData.getTotalAmount().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount", resData.getRefund_fee_0());
            map.put("refundStatus", "SUCCESS");


            log.info("退款查询结果,map={}", map);
            return map;
        } catch (WeChatException | ParamNullException e) {
            log.warn("退款查询失败，e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("退款查询失败，e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("退款查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> punchCardPay(RyMchVo ryMchVo, WechatPaySignVo wechatPaySignVo, WechatConfigureVo wechatConfigureVo) throws TradePayException {
        log.info("发起微信刷卡支付,ryMchVo={},wechatPaySignVo={},wechatConfigureVo={}", ryMchVo, wechatPaySignVo, wechatConfigureVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //设置业务参数
            WechatPaySignData wechatPaySignData = getWechatPaySignData(wechatPaySignVo);
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            //发起支付
            PunchCardPayResData resData = payBizz.wechatPunchCardPay(ryMchVo, wechatPaySignData, wechatConfigure, wechatPaySignVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(resData);

            //外部订单号
            map.put("orderNo", wechatPaySignData.getOrderNo());
            //容易网交易号
            map.put("payNo", resData.getOut_trade_no());
            //微信交易号
            map.put("tradeNo", resData.getTransaction_id());
            //交易金额
            map.put("totalAmount", wechatPaySignVo.getTotalFee());

            //设置支付状态
            if (ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getReturn_code()) &&
                    ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getResult_code())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getErr_code())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            } else {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }

            log.info("返回刷卡支付结果,map={}", map);
            return map;
        } catch (WeChatException | ParamNullException e) {
            log.warn("刷卡支付失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("刷卡支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("刷卡支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> punchCardPayQueryOrder(String orderNo, WechatConfigureVo wechatConfigureVo) throws TradePayException {
        log.info("微信订单查询,orderNo={},wechatCongfigVo={}", orderNo, wechatConfigureVo);
        //设置支付参数
        try {
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            PunchCardPayQueryResData resData = queryBizz.wechatPunchCardPayQueryOrder(orderNo, wechatConfigure);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOut_trade_no());
            //微信流水号
            map.put("tradeNo", resData.getTransaction_id());
            //交易金额
            map.put("totalAmount", resData.getTotal_fee());
            //设置支付状态
            if (ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getReturn_code()) &&
                    ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getResult_code()) &&
                    ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr().equals(resData.getTrade_state())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getTrade_state())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            } else if (ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr().equals(resData.getTrade_state())) {
                map.put("tradeStatus", ConstantEnum.WW_PUNCHCARDPAY_REFUND.getCodeStr());
            } else {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }

            log.info("订单查询结果,map={}", map);
            return map;
        } catch (WeChatException e) {
            log.warn("订单查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("订单查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("订单查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> punchCardPayReverseOrder(String orderNo, Integer payType,WechatConfigureVo wechatConfigureVo) throws TradePayException {
        log.info("微信支付撤销,orderNo={},payType={},weBankMchNo={}", orderNo, payType);
        try {
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            reverseBizz.wechatOrderReverse(orderNo,payType,wechatConfigure);
            return new HashMap<>();
        } catch (WebankException | ParamNullException e) {
            log.warn("微信支付撤销失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微信支付撤销失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微信支付撤销异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> getOpenId(String code, String state, WechatConfigureVo wechatConfigureVo) throws TradePayException {
        try {
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            GetOpenIdResData getOpenIdResData = WeChatPayUnit.getOpenId(code, state, wechatConfigure);
            return BeanMapUtils.toMap(getOpenIdResData);
        } catch (WeChatException e) {
            log.warn("获取微信openId失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (Exception e) {
            log.error("获取微信openId异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_OPENID_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_OPENID_FAIL.getValueStr());
        }
    }

    //设置支付参数
    private WechatConfigure getWechatConfigure(WechatConfigureVo wechatConfigureVo) {
        WechatConfigure wechatConfigure = new WechatConfigure();
        BeanUtils.copyProperties(wechatConfigureVo, wechatConfigure);
        return wechatConfigure;
    }

    //设置业务参数
    private WechatPaySignData getWechatPaySignData(WechatPaySignVo wechatPaySignVo) {
        WechatPaySignData wechatPaySignData = new WechatPaySignData();
        BeanUtils.copyProperties(wechatPaySignVo, wechatPaySignData);
        return wechatPaySignData;
    }

}
