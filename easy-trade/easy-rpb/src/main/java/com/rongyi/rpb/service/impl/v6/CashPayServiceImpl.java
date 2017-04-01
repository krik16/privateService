package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.v6.CashPayVo;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.v6.PaymentEntityVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.QueryBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rss.rpb.ICashPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Map;

/**
 *
 * 现金付款
 * conan
 * 2017/2/27 13:45
 **/
public class CashPayServiceImpl extends BaseServiceImpl implements ICashPayService{

    @Autowired
    PayBizz payBizz;

    @Autowired
    QueryBizz queryBizz;

    @Autowired
    RefundBizz refundBizz;

    private static final Logger log = LoggerFactory.getLogger(CashPayServiceImpl.class);

    @Override
    public Map<String, Object> cashPay(RyMchVo ryMchVo, CashPayVo cashPayVo) {
        log.info("现金支付,ryMchVo={},cashPayVo={}", ryMchVo, cashPayVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);

            PaymentEntityVo paymentEntityVo = payBizz.cashPay(ryMchVo, cashPayVo,cashPayVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(paymentEntityVo);

            //外部订单号
            map.put("orderNo", paymentEntityVo.getOrderNum());
            //交易金额
            map.put("totalAmount",cashPayVo.getTotalAmount());

            log.info("现金支付结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            log.warn("现金支付失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("现金支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("现金支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_PAY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_PAY_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> cashPayQuery(RyMchVo ryMchVo, String orderNo,Integer payType) {
        log.info("现金支付查询,ryMchVo={},orderNo={},payType={}", ryMchVo, orderNo,payType);
        try {
            PaymentEntity paymentEntity = queryBizz.cashPayQueryOrder(orderNo);

            PaymentLogInfo paymentLogInfo = queryBizz.queryPaymentLogInfo(paymentEntity.getPayNo());

            Map<String, Object> map = BeanMapUtils.toMap(paymentEntity);
            //外部订单号
            map.put("orderNo", orderNo);
            //微信流水号
            map.put("tradeNo", paymentLogInfo.getTrade_no());
            //交易金额
            map.put("totalAmount", paymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            //交易状态
            map.put("tradeStatus",ConstantEnum.WW_PUNCHCARDPAY_SUCCESS.getCodeStr());
            log.info("现金支付查询结果,map={}", map);
            return map;
        }  catch (WebankException | ParamNullException e) {
            log.warn("现金支付查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("现金支付查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("现金支付查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_PAY_QUERY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_PAY_QUERY_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> cashRefund(String orderNo, Integer refundAmount) {
        log.info("现金退款,orderNo={},refundAmount={}", orderNo, refundAmount);
        try {
            PaymentEntityVo paymentEntityVo = refundBizz.cashRefund(orderNo, refundAmount);
            Map<String, Object> map = BeanMapUtils.toMap(paymentEntityVo);
            //外部订单号
            map.put("orderNo", orderNo);
            //微众银行退款单号
            map.put("tradeNo", paymentEntityVo.getTradeNo());
            //交易金额
            map.put("totalAmount", paymentEntityVo.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

            log.info("现金退款结果,map={}", map);
            return map;
        }  catch (WebankException | ParamNullException e) {
            log.warn("现金退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("现金退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("现金退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> cashRefundQuery(String orderNo) {
        log.info("现金退款查询,orderNo={}", orderNo);
        try {
            PaymentEntity paymentEntityVo = queryBizz.cashRefundQueryOrder(orderNo);

            PaymentLogInfo paymentLogInfo = queryBizz.queryPaymentLogInfo(paymentEntityVo.getPayNo());
            Map<String, Object> map = BeanMapUtils.toMap(paymentEntityVo);
            //外部订单号
            map.put("orderNo", orderNo);
            //微众银行退款单号
            map.put("tradeNo",paymentLogInfo.getTrade_no());
            //交易金额
            map.put("totalAmount", paymentEntityVo.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount",paymentEntityVo.getAmountMoney().multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
            map.put("refundStatus","SUCCESS");
            return map;
    }  catch (WebankException | ParamNullException e) {
            log.error("现金退款查询失败,e={}", e.getMessage(), e);
            log.warn("现金退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("现金退款查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("现金退款查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getValueStr());
        }
    }

}
