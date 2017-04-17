package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.v6.PosBankCardPayVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.QueryBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rss.rpb.IPosBankCardPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Map;

/**
 * conan
 * 2017/3/17 10:47
 **/
public class PosBankCardServiceImpl extends BaseServiceImpl implements IPosBankCardPayService{

    @Autowired
    PayBizz payBizz;
    @Autowired
    QueryBizz queryBizz;
    @Autowired
    RefundBizz refundBizz;

    private static final Logger log = LoggerFactory.getLogger(PosBankCardServiceImpl.class);

    @Override
    public Map<String, Object> posBankCardPay(RyMchVo ryMchVo, PosBankCardPayVo posBankCardPayVo) {
        log.info("pos银行卡支付,ryMchVo={},posBankCardPayVo={}", ryMchVo, posBankCardPayVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);

            PaymentEntity paymentEntity = payBizz.posBankCardPay(ryMchVo, posBankCardPayVo,posBankCardPayVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(paymentEntity);

            //外部订单号
            map.put("orderNo", paymentEntity.getOrderNum());
            //交易金额
            map.put("totalAmount",posBankCardPayVo.getTotalAmount());

            log.info("pos银行卡支付结果,map={}", map);
            return map;
        } catch (ParamNullException e) {
            log.error("pos银行卡支付失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("pos银行卡支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("pos银行卡支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_PAY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_PAY_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> posBankCardPayQuery(RyMchVo ryMchVo, String orderNo, Integer payType) {
        log.info("pos银行卡支付查询,ryMchVo={},orderNo={},payType={}", ryMchVo, orderNo,payType);
        try {
            PaymentEntity paymentEntity = queryBizz.posBankCardPayQueryOrder(orderNo);

            PaymentLogInfo paymentLogInfo = queryBizz.queryPaymentLogInfo(paymentEntity.getPayNo());

            Map<String, Object> map = BeanMapUtils.toMap(paymentEntity);
            //外部订单号
            map.put("orderNo", orderNo);
            //微信流水号
            map.put("tradeNo", paymentLogInfo.getTrade_no());
            //交易金额
            map.put("totalAmount", paymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
            //交易状态
            if(paymentEntity.getStatus() == 3){
                map.put("tradeStatus","REFUND");
            }else {
                map.put("tradeStatus", ConstantEnum.WW_PUNCHCARDPAY_SUCCESS.getCodeStr());
            }
            log.info("pos银行卡支付查询结果,map={}", map);
            return map;
        }  catch (ParamNullException e) {
            log.error("pos银行卡支付查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("pos银行卡支付查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("pos银行卡支付查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_PAY_QUERY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_PAY_QUERY_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> posBankCardPayRefund(String orderNo, Integer refundAmount) {
        log.info("pos银行卡退款,orderNo={},refundAmount={}", orderNo, refundAmount);
        try {
            PaymentEntity paymentEntity = refundBizz.posBankCardPayRefund(orderNo, refundAmount);
            Map<String, Object> map = BeanMapUtils.toMap(paymentEntity);
            //外部订单号
            map.put("orderNo", orderNo);
            //交易金额
            map.put("totalAmount", paymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

            log.info("pos银行卡退款结果,map={}", map);
            return map;
        }  catch (ParamNullException e) {
            log.error("pos银行卡退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("pos银行卡退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("pos银行卡退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> posBankCardPayRefundQuery(String orderNo) {
        log.info("pos银行卡退款查询,orderNo={}", orderNo);
        try {
            PaymentEntity paymentEntityVo = queryBizz.posBankCardRefundQueryOrder(orderNo);

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
            log.error("pos银行卡退款查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("pos银行卡退款查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("pos银行卡退款查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_CASH_REFUND_FAIL.getValueStr());
        }
    }
}
