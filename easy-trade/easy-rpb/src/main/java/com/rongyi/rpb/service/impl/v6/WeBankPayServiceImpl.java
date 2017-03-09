package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.WaPunchCardVo;
import com.rongyi.easy.rpb.vo.WwPunchCardPayVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.QueryBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rss.rpb.IweBankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Map;

/**
 * conan
 * 2017/2/27 13:45
 **/
public class WeBankPayServiceImpl  extends BaseServiceImpl implements IweBankService{

    @Autowired
    PayBizz payBizz;

    @Autowired
    QueryBizz queryBizz;

    @Autowired
    RefundBizz refundBizz;

    private static final Logger log = LoggerFactory.getLogger(WeBankPayServiceImpl.class);

    @Override
    public Map<String, Object> webankWechatPunchCardPay(RyMchVo ryMchVo, WwPunchCardPayVo wwPunchCardPayVo) {
        log.info("微众微信刷卡支付,ryMchVo={},wwPunchCardPayVo={}", ryMchVo, wwPunchCardPayVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //初始化业务参数
            WwPunchCardPayParam wwPunchCardPayParam = getWwPunchCardPayParam(wwPunchCardPayVo);

            WwPunchCardResData wwPunchCardResData = payBizz.webankWechatPunchCardPay(ryMchVo, wwPunchCardPayParam,wwPunchCardPayVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(wwPunchCardResData);

            //外部订单号
            map.put("orderNo", wwPunchCardPayVo.getOrderNo());
            //容易网交易号
            map.put("payNo", wwPunchCardResData.getTerminal_serialno());
            //微信交易号
            map.put("tradeNo", wwPunchCardResData.getTransaction_id());
            //交易金额
            map.put("totalAmount",wwPunchCardPayVo.getAmount());

            log.info("微众微信刷卡支付结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.error("微众微信刷卡支付失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信刷卡支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信刷卡支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankWechatPayQuery(RyMchVo ryMchVo, String orderNo,Integer payType,String weBankMchNo) {
        log.info("微众微信刷卡支付查询,ryMchVo={},orderNo={},payType={},weBankMchNo={}", ryMchVo, orderNo,payType,weBankMchNo);
        try {
            WwPunchCardResData resData = queryBizz.webankWechatPunchCardPayQueryOrder(orderNo, payType, weBankMchNo);

            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getTerminal_serialno());
            //微信流水号
            map.put("tradeNo", resData.getTransaction_id());
            //交易金额
            map.put("totalAmount",new BigDecimal(resData.getTotal_fee()).multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
            //交易状态
            map.put("tradeStatus",ConstantEnum.WW_PUNCHCARDPAY_SUCCESS.getCodeStr());
            log.info("微众微信刷卡支付查询结果,map={}", map);
            return map;
        }  catch (WebankException | ParamNullException e) {
            log.error("微众微信刷卡支付查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信刷卡支付查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信刷卡查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankWechatRefund(String orderNo, Integer refundAmount, String refundReason, String weBankMchNo) {
        try {
            WwPunchCardRefundResData resData = refundBizz.webankWechatRefund(orderNo, refundAmount, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getPayNo());
            //微众银行退款单号
            map.put("tradeNo",resData.getRefundid());
            //交易金额
            map.put("totalAmount",resData.getTotal_fee().multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount",resData.getRefund_fee().multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());

            return map;
        }  catch (WebankException | ParamNullException e) {
            log.error("微众微信退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankWechatRefundQuery(String orderNo,Integer payType, String weBankMchNo) {
        try {
            WwPunchCardRefundResData resData = queryBizz.webankWechatPunchCardRefundQuery(orderNo, payType, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getPayNo());
            //微众银行退款单号
            map.put("tradeNo",resData.getRefundid());

            //交易金额
            map.put("totalAmount",resData.getTotal_fee().multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount", resData.getRefund_fee().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            map.put("refundStatus","SUCCESS");
            return map;
        }  catch (WebankException | ParamNullException e) {
            log.error("微众微信退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getValueStr());
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

            WaPunchCardPayResData resData = payBizz.webankAliPunchCardPay(ryMchVo, waPunchCardPayParam,waPunchCardVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(resData);

            //外部订单号
            map.put("orderNo", waPunchCardVo.getOrderNo());
            //容易网交易号
            map.put("payNo", resData.getOutTradeNo());
            //交易金额
            map.put("totalAmount",waPunchCardVo.getTotalAmount());
            log.info("微众支付宝刷卡支付结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.error("微众支付宝刷卡支付失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众支付宝刷卡支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝刷卡支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_PUNCH_CARD_PAY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_PUNCH_CARD_PAY_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankAliPayQuery(RyMchVo ryMchVo, String orderNo, Integer payType, String weBankMchNo) {
        try {
            WaQueryTradeResData resData = queryBizz.weBankAliPunchCardPayQueryOrder(orderNo, payType, weBankMchNo);

            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOutTradeNo());
            //容易网交易号
            map.put("tradeNo", resData.getTradeNo());
            //容易网交易号
            map.put("tradeStatus","SUCCESS");
            //交易金额
            map.put("totalAmount",new BigDecimal(resData.getTotalAmount()).multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());

            log.info("微众支付宝支付查询结果,map={}", map);
            return map;
        }  catch (WebankException | ParamNullException e) {
            log.error("微众支付宝刷卡查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众支付宝刷卡查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝刷卡查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankAliRefund(String orderNo, Integer refundAmount, String refundReason, String weBankMchNo) {
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
            map.put("totalAmount",new BigDecimal(resData.getRefundFee()).multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());

            log.info("微众支付宝支付退款结果,map={}", map);
            return map;
        }  catch (WebankException | ParamNullException e) {
            log.error("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankAliRefundQuery(String orderNo, Integer payType, String weBankMchNo) {
        try {
            WaRefundQueryResData resData = queryBizz.webankAliPunchCardRefundQuery(orderNo, payType, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getOutTradeNo());
            //微众银行退款单号
            map.put("tradeNo",resData.getTradeNo());
            //交易金额
            map.put("totalAmount",new BigDecimal(resData.getTotalAmount()).multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount",new BigDecimal(resData.getRefundAmount()).multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
            map.put("refundStatus","SUCCESS");
            return map;
        }  catch (WebankException | ParamNullException e) {
            log.error("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众支付宝退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众支付宝退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_REFUND_QUERY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_REFUND_QUERY_FAIL.getValueStr());
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


}
