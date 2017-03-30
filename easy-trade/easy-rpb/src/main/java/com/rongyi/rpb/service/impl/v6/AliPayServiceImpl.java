package com.rongyi.rpb.service.impl.v6;

import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.AliConfigureVo;
import com.rongyi.easy.rpb.vo.AliPaySignVo;
import com.rongyi.easy.rpb.vo.AliPunchCardPayVo;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.pay.core.Exception.AliPayException;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.auth.AuthorizeRespData;
import com.rongyi.pay.core.ali.model.reqData.AliPunchCardPayReqData;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.PaySignBizz;
import com.rongyi.rpb.bizz.QueryBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.rss.rpb.IAliPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/2/7 17:05
 **/
public class AliPayServiceImpl extends BaseServiceImpl implements IAliPayService {

    private static final Logger log = LoggerFactory.getLogger(AliPayServiceImpl.class);

    @Autowired
    PayBizz payBizz;
    @Autowired
    RefundBizz refundBizz;
    @Autowired
    QueryBizz queryBizz;
    @Autowired
    PaySignBizz paySignBizz;

    @Override
    public Map<String, Object> getPaySign(RyMchVo ryMchVo,AliPaySignVo aliPaySignVo, AliConfigureVo aliConfigureVo) throws TradePayException{

        log.info("获取支付宝扫码签名,ryMchVo={},aliPaySignVo={},aliConfigureVo={}", ryMchVo,aliPaySignVo, aliConfigureVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //初始化业务参数
            AliScanPayReqData aliScanPayReqData = getAliPaySignData(aliPaySignVo, aliConfigureVo);
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);
            //获取签名
            Map<String, Object> map = paySignBizz.aliScanPaySign(ryMchVo, aliScanPayReqData, aliConfigure);
            //外部订单号
            map.put("orderNo", aliPaySignVo.getOrderNo());
            log.info("支付宝扫码签名结果,map={}", map);
            return map;
        } catch (AliPayException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            throw e;
        } catch (Exception e) {
            log.error("获取支付宝扫码支付签名失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_PAY_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_PAY_SIGN_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> f2fPayRefund(String orderNo, Integer refundAmount, String refundReason, AliConfigureVo aliConfigureVo) throws TradePayException{

        log.info("支付宝面对面退款,orderNo={},refundAmount={},refundReson={},aliConfigUreVo={}", orderNo, refundAmount, refundReason, aliConfigureVo);
        try {
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            AlipayTradeRefundResponse alipayTradeRefundResponse = refundBizz.aliRefund(orderNo, refundAmount, refundReason, aliConfigure);

            Map<String, Object> map = BeanMapUtils.toMap(alipayTradeRefundResponse);

            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", alipayTradeRefundResponse.getOutTradeNo());

            //交易金额
            map.put("totalAmount", new BigDecimal(alipayTradeRefundResponse.getRefundFee()).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

            log.info("支付宝面对面支付退款,map={}", map);
            return map;
        } catch (AliPayException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            throw e;
        } catch (Exception e) {
            log.error("支付宝面对面支付退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> punchCardPay(RyMchVo ryMchVo,AliPunchCardPayVo aliPunchCardPayVo, AliConfigureVo aliConfigureVo) {

        log.info("支付宝刷卡支付,aliPunchCardPayVo={},aliConfigureVo={}", aliPunchCardPayVo, aliConfigureVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //初始化业务参数
            AliPunchCardPayReqData aliPunchCardPayReqData = getAliPunchCardPayReqData(aliPunchCardPayVo, aliConfigureVo);
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            AlipayTradePayResponse alipayTradePayResponse = payBizz.aliPunchCardPay(ryMchVo, aliPunchCardPayReqData, aliConfigure,aliPunchCardPayVo.getOrderType());

            Map<String, Object> map = BeanMapUtils.toMap(alipayTradePayResponse);

            //外部订单号
            map.put("orderNo", aliPunchCardPayVo.getOrderNo());
            //容易网交易号
            map.put("payNo", alipayTradePayResponse.getOutTradeNo());
            //设置支付金额
            map.put("totalAmount",aliPunchCardPayVo.getTotalAmount());
            log.info("支付宝刷卡支付结果,map={}", map);
            return map;
        } catch (AliPayException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            throw e;
        } catch (Exception e) {
            log.error("支付宝面对面刷卡支付退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_PUNCH_CARD_PAY_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_PUNCH_CARD_PAY_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> f2fPayQuery(String orderNo, AliConfigureVo aliConfigureVo) throws TradePayException{

        log.info("支付宝面对面支付查询,orderNo={},aliConfigureVo={}", orderNo, aliConfigureVo);
        try {
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            AlipayTradeQueryResponse alipayTradeQueryResponse = queryBizz.aliF2FPayQuery(orderNo, aliConfigure);

            Map<String, Object> map = BeanMapUtils.toMap(alipayTradeQueryResponse);

            map.remove("fundBillList");

            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", alipayTradeQueryResponse.getOutTradeNo());

            map.put("tradeStatus","SUCCESS");
            //交易金额
            map.put("totalAmount", new BigDecimal(alipayTradeQueryResponse.getTotalAmount()).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString());

            log.info("支付宝面对面支付查询结果,map={}", map);
            return map;
        } catch (AliPayException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            throw e;
        } catch (Exception e) {
            log.error("支付宝面对面刷卡支付退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> refundQuery(String orderNo, AliConfigureVo aliConfigureVo) throws TradePayException {
        log.info("支付宝退款查询,orderNo={},aliConfigureVo={}", orderNo, aliConfigureVo);
        try {
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            PaymentEntity paymentEntity = queryBizz.aliRefundQuery(orderNo, aliConfigure);

            PaymentLogInfo paymentLogInfo = queryBizz.queryPaymentLogInfo(paymentEntity.getPayNo());

            Map<String, Object> map = BeanMapUtils.toMap(paymentEntity);

            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", paymentEntity.getPayNo());

            //微众银行退款单号
            map.put("tradeNo",paymentLogInfo.getTrade_no());
            //交易金额
            map.put("totalAmount",paymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
            //退款金额
            map.put("refundAmount",paymentEntity.getAmountMoney().multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_UP).toString());

            map.put("refundStatus","SUCCESS");

            log.info("支付宝退款查询结果,map={}", map);
            return map;
        } catch (AliPayException | ParamNullException e) {
            log.error("支付宝退款查询失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("支付宝退款查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("支付宝退款查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_ALI_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public String getUserAuthUrl(String storeId, String scope, Integer authType, String redirectUrl, AliConfigureVo aliConfigureVo)throws TradePayException {

        log.info("获取支付宝用户支付链接,storeId={},scope={},authType={},redirectUrl={},aliConfigureVo={}", storeId, scope, authType, redirectUrl, aliConfigureVo);
        try {
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            String authUrl = AliPayUnit.getAuthUrl(storeId, scope, authType, redirectUrl, aliConfigure);
            log.info("获取支付宝用户支付链接结果,result={}", authUrl);
            return authUrl;
        } catch (AliPayException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (Exception e) {
            log.error("获取支付宝用户支付链接结果失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getValueStr());
        }

    }

    @Override
    public Map<String, Object> getUserBuyerId(String appAuthCode, String appId, String storeId, String scope, Integer authType, AliConfigureVo aliConfigureVo) throws TradePayException{

        try {
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            AuthorizeRespData authorizeRespData = AliPayUnit.getAuthToken(appAuthCode, appId, storeId, scope, authType, aliConfigure);

            Map<String, Object> map = new HashMap<>();
            //支付宝买家id
            map.put("aliBuyerId", authorizeRespData.getAlipaySystemOauthTokenResponse().getUserId());
            return map;
        } catch (AliPayException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (Exception e) {
            log.error("获取支付宝买家id结果失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> getMchAuthToken(String appAuthCode, String appId, String storeId, String scope, Integer authType, AliConfigureVo aliConfigureVo) throws TradePayException{
        try {
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            AuthorizeRespData authorizeRespData = AliPayUnit.getAuthToken(appAuthCode, appId, storeId, scope, authType, aliConfigure);

            Map<String,Object> map = BeanMapUtils.toMap(authorizeRespData.getAlipayOpenAuthTokenAppResponse());
            log.info("返回结果,map={}",map);
            return map;
        } catch (AliPayException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (Exception e) {
            log.error("获取支付宝商户授权结果失败,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getValueStr());
        }
    }

    //设置支付参数
    private AliConfigure getAliConfigure(AliConfigureVo aliConfigureVo) {
        AliConfigure aliConfigure = AliConfigure.getInstance();
        BeanUtils.copyProperties(aliConfigureVo, aliConfigure);
        return aliConfigure;
    }

    //设置支付签名业务参数
    private AliScanPayReqData getAliPaySignData(AliPaySignVo aliPaySignVo, AliConfigureVo aliConfigureVo) {
        AliScanPayReqData aliScanPayReqData = new AliScanPayReqData();
        BeanUtils.copyProperties(aliPaySignVo, aliScanPayReqData);
        if (StringUtil.isEmpty(aliPaySignVo.getSellerId())) {
            aliScanPayReqData.setSellerId(aliConfigureVo.getPid());
        }
        return aliScanPayReqData;
    }

    //设置刷卡支付业务参数
    private AliPunchCardPayReqData getAliPunchCardPayReqData(AliPunchCardPayVo aliPunchCardPayVo, AliConfigureVo aliConfigureVo) {
        AliPunchCardPayReqData aliPunchCardPayReqData = new AliPunchCardPayReqData();
        BeanUtils.copyProperties(aliPunchCardPayVo, aliPunchCardPayReqData);
        if (StringUtil.isEmpty(aliPunchCardPayVo.getSellerId())) {
            aliPunchCardPayReqData.setSellerId(aliConfigureVo.getPid());
        }
        return aliPunchCardPayReqData;
    }

}
