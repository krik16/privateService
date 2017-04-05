package com.rongyi.rpb.service.impl.v6;

import com.alibaba.dubbo.common.json.JSON;
import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.easy.rpb.vo.*;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.model.res.WaScanPayResData;
import com.rongyi.pay.core.webank.model.res.WwScanPayResData;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WaScanPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwScanPayParam;
import com.rongyi.rpb.bizz.*;
import com.rongyi.rss.rpb.IweBankService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/2/27 13:45
 **/
public class WeBankPayServiceImpl extends BaseServiceImpl implements IweBankService {

    @Autowired
    PayBizz payBizz;

    @Autowired
    QueryBizz queryBizz;

    @Autowired
    RefundBizz refundBizz;

    @Autowired
   ReverseBizz reverseBizz;

    @Autowired
    PaySignBizz paySignBizz;

    private static final Logger log = LoggerFactory.getLogger(WeBankPayServiceImpl.class);

    @Override
    public Map<String, Object> webankWechatPunchCardPay(RyMchVo ryMchVo, WwPunchCardPayVo wwPunchCardPayVo) {
        log.info("微众微信刷卡支付,ryMchVo={},wwPunchCardPayVo={}", ryMchVo, wwPunchCardPayVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //初始化业务参数
            WwPunchCardPayParam wwPunchCardPayParam = getWwPunchCardPayParam(wwPunchCardPayVo);

            WwPunchCardResData resData = payBizz.webankWechatPunchCardPay(ryMchVo, wwPunchCardPayParam, wwPunchCardPayVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(resData);

            //外部订单号
            map.put("orderNo", wwPunchCardPayVo.getOrderNo());
            //容易网交易号
            map.put("payNo", resData.getTerminal_serialno());
            //微信交易号
            map.put("tradeNo", resData.getTransaction_id());
            //交易金额
            map.put("totalAmount", wwPunchCardPayVo.getAmount());

            //设置支付状态
            if (ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(resData.getResult().getErrno()) &&
                    ConstantEnum.WEBANK_PAYEMENT_1.getCodeStr().equals(resData.getPayment())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getResult().getErrno())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            } else {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }

            log.info("微众微信刷卡支付结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众微信刷卡支付失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众微信刷卡支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信刷卡支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankWechatPayQuery(RyMchVo ryMchVo, String orderNo, Integer payType, String weBankMchNo) {
        log.info("微众微信刷卡支付查询,ryMchVo={},orderNo={},payType={},weBankMchNo={}", ryMchVo, orderNo, payType, weBankMchNo);
        try {
            Map<String, Object> map = queryBizz.weBankWechatPayQueryOrder(orderNo, weBankMchNo);
            log.info("微众微信刷卡支付查询结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众微信刷卡支付查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众微信刷卡支付查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信刷卡查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankWechatRefund(String orderNo, Integer refundAmount, String refundReason, String weBankMchNo) {
        log.info("微众微信退款,orderNo={},refundAmount={},refundReason={},weBankMchNo={}", orderNo, refundAmount, refundReason, weBankMchNo);
        try {
            WwPunchCardRefundResData resData = refundBizz.webankWechatRefund(orderNo, refundAmount, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getPayNo());
            //微众银行退款单号
            map.put("tradeNo", resData.getRefundid());
            //交易金额
            map.put("totalAmount", resData.getTotal_fee().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount", resData.getRefund_fee().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众微信退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众微信退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankWechatRefundQuery(String orderNo, Integer payType, String weBankMchNo) {
        log.info("微众微信退款查询,orderNo={},payType={},weBankMchNo={}", orderNo, payType, weBankMchNo);
        try {
            WwPunchCardRefundResData resData = queryBizz.webankWechatPunchCardRefundQuery(orderNo, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getPayNo());
            //微众银行退款单号
            map.put("tradeNo", resData.getRefundid());

            //交易金额
            map.put("totalAmount", resData.getTotal_fee().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount", resData.getRefund_fee().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            map.put("refundStatus", "SUCCESS");
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众微信退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众微信退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankWechatReverse(String orderNo, Integer payType, String weBankMchNo) {
        log.info("微众微信支付撤销,orderNo={},payType={},weBankMchNo={}", orderNo, payType, weBankMchNo);
        try {
            WwPunchCardReverseResData resData = reverseBizz.webankWechatOrderReverse(orderNo, payType, weBankMchNo);

            return BeanMapUtils.toMap(resData);

        } catch (WebankException | ParamNullException e) {
            log.warn("微众微信支付撤销失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众微信支付撤销失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信支付撤销异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankAliPunchCardPay(RyMchVo ryMchVo, WaPunchCardVo waPunchCardVo) {
        log.info("微众支付宝刷卡支付,ryMchVo={},waPunchCardVo={}", ryMchVo, waPunchCardVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //初始化业务参数
            WaPunchCardPayParam waPunchCardPayParam = getWaPunchCardPayParam(waPunchCardVo);

            WaPunchCardPayResData resData = payBizz.webankAliPunchCardPay(ryMchVo, waPunchCardPayParam, waPunchCardVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(resData);

            //外部订单号
            map.put("orderNo", waPunchCardVo.getOrderNo());
            //容易网交易号
            map.put("payNo", resData.getOutTradeNo());
            //交易金额
            map.put("totalAmount", waPunchCardVo.getTotalAmount());

            //设置支付状态
            if (ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getCodeStr().equals(resData.getRetCode())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (ConstantEnum.WA_PUNCHCARDPAY_PAYING.getCodeStr().equals(resData.getRetCode())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            } else {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }
            log.info("微众支付宝刷卡支付结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众支付宝刷卡支付失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众支付宝刷卡支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝刷卡支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_PUNCH_CARD_PAY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_PUNCH_CARD_PAY_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankAliPayQuery(RyMchVo ryMchVo, String orderNo, Integer payType, String weBankMchNo) {
        log.info("微众支付宝刷卡支付查询,ryMchVo={},orderNo={},payType={},weBankMchNo={}", ryMchVo, orderNo, payType, weBankMchNo);
        try {
            WaQueryTradeResData resData = queryBizz.weBankAliPunchCardPayQueryOrder(orderNo, weBankMchNo);

            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOutTradeNo());
            //第三方交易号
            map.put("tradeNo", resData.getTradeNo());
            //设置支付状态
            if (com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_01.getCodeStr().equals(resData.getTradeStatus())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getValueStr());
            } else if (com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_03.getCodeStr().equals(resData.getTradeStatus())) {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_PAYING.getValueStr());
            }else if(com.rongyi.pay.core.constants.ConstantEnum.WA_TRADESTATUS_05.getCodeStr().equals(resData.getTradeStatus())){
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_COLSE.getValueStr());
            } else {
                map.put("tradeStatus", ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getValueStr());
            }

            //交易金额
            map.put("totalAmount", new BigDecimal(resData.getTotalAmount()).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

            log.info("微众支付宝支付查询结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众支付宝刷卡查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众支付宝刷卡查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝刷卡查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankAliRefund(String orderNo, Integer refundAmount, String refundReason, String weBankMchNo) {
        log.info("微众支付宝退款,orderNo={},refundAmount={},refundReason={},weBankMchNo={}", orderNo, refundAmount, refundReason, weBankMchNo);
        try {
            WaRefundResData resData = refundBizz.webankAliRefund(orderNo, refundAmount, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOutTradeNo());
            //微众银行退款单号
            map.put("tradeNo", resData.getTradeNo());
            //交易金额
            map.put("totalAmount", new BigDecimal(resData.getRefundFee()).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

            log.info("微众支付宝支付退款结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankAliRefundQuery(String orderNo, Integer payType, String weBankMchNo) {
        log.info("微众支付宝退款查询,orderNo={},payType={},weBankMchNo={}", orderNo, payType, weBankMchNo);
        try {
            WaRefundQueryResData resData = queryBizz.webankAliPunchCardRefundQuery(orderNo, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOutTradeNo());
            //微众银行退款单号
            map.put("tradeNo", resData.getTradeNo());
            //交易金额
            map.put("totalAmount", new BigDecimal(resData.getTotalAmount()).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount", new BigDecimal(resData.getRefundAmount()).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            map.put("refundStatus", "SUCCESS");
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_REFUND_QUERY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_REFUND_QUERY_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankAliReverse(String orderNo, Integer payType,String weBankMchNo) throws TradePayException {
        log.info("微众支付宝支付撤销,orderNo={},payType={},weBankMchNo={}", orderNo, payType, weBankMchNo);
        try {
            WaReverseTradeResData resData = reverseBizz.webankAliOrderReverse(orderNo, payType, weBankMchNo);

            return BeanMapUtils.toMap(resData);

        } catch (WebankException | ParamNullException e) {
            log.warn("微众支付宝支付撤销失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("微众支付宝支付撤销失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝支付撤销异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankAliScanPaySign(RyMchVo ryMchVo, WaScanPaySignVo waScanPaySignVo) throws TradePayException {
        log.info("微众支付宝扫码支付签名,waScanPaySignVo={}", waScanPaySignVo);
        try {
            WaScanPayParam waScanPayParam = getWaScanPayParam(waScanPaySignVo);

            WaScanPayResData resData = paySignBizz.webankAliScanPaySign(ryMchVo, waScanPayParam, waScanPaySignVo.getOrderType());

            Map<String, Object> map = new HashMap<>();
            map.put("aliPayQrCode", resData.getQrCode());
            map.put("orderNo", resData.getOrderId());
            return map;

        } catch (WebankException | ParamNullException e) {
            log.error("微众支付宝扫码支付签名失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众支付宝扫码支付签名失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝扫码支付签名异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankWechatScanPaySign(RyMchVo ryMchVo, WwScanPaySignVo wwScanPaySignVo) throws TradePayException {
        log.info("微众微信公众号支付签名,wwScanPaySignVo={}",wwScanPaySignVo);
        try {
            WwScanPayParam wwScanPayParam = getWwScanPayParam(wwScanPaySignVo);
            WwScanPayResData resData = paySignBizz.webankWechatScanPaySign(ryMchVo, wwScanPayParam, wwScanPaySignVo.getOrderType());
            Map<String,Object> map =(Map<String,Object>) JSONObject.fromObject(resData.getPay_info());
            map.put("orderNo", resData.getOut_trade_no());
            return map;
        } catch (WebankException | ParamNullException e) {
            log.error("微众微信公众号支付签名失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信公众号支付签名失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信公众号支付签名异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getValueStr());
        }
    }

    //设置微众微信刷卡支付业务参数
    private WwPunchCardPayParam getWwPunchCardPayParam(WwPunchCardPayVo wwPunchCardPayVo) {
        WwPunchCardPayParam wwPunchCardPayParam = new WwPunchCardPayParam();
        wwPunchCardPayParam.setAmount(new BigDecimal(wwPunchCardPayVo.getAmount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
        BeanUtils.copyProperties(wwPunchCardPayVo, wwPunchCardPayParam);
        return wwPunchCardPayParam;
    }

    //设置微众支付宝刷卡支付业务参数
    private WaPunchCardPayParam getWaPunchCardPayParam(WaPunchCardVo waPunchCardVo) {
        WaPunchCardPayParam waPunchCardPayParam = new WaPunchCardPayParam();
        BeanUtils.copyProperties(waPunchCardVo, waPunchCardPayParam);
        waPunchCardPayParam.setTotalAmount(new BigDecimal(waPunchCardVo.getTotalAmount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
        waPunchCardPayParam.setOrderId(waPunchCardVo.getOrderNo());
        return waPunchCardPayParam;
    }

    //设置微众支付宝扫码支付业务参数
    private WaScanPayParam getWaScanPayParam(WaScanPaySignVo waScanPaySignVo) {
        WaScanPayParam waScanPayParam = new WaScanPayParam();
        BeanUtils.copyProperties(waScanPaySignVo, waScanPayParam);
        waScanPayParam.setOrderId(waScanPaySignVo.getOrderNo());
        waScanPayParam.setTotalAmount(new BigDecimal(waScanPaySignVo.getTotalAmount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).toString());
        return waScanPayParam;
    }

    //设置微众微信公众号支付业务参数
    private WwScanPayParam getWwScanPayParam(WwScanPaySignVo wwScanPaySignVo) {
        WwScanPayParam wwScanPayParam = new WwScanPayParam();
        BeanUtils.copyProperties(wwScanPaySignVo, wwScanPayParam);
        wwScanPayParam.setOutTradeNo(wwScanPaySignVo.getOrderNo());
        return wwScanPayParam ;
    }

}
