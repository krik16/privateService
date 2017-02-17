package com.rongyi.rpb.service.impl.v2;

import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.easy.rpb.vo.AliConfigureVo;
import com.rongyi.easy.rpb.vo.AliPaySignVo;
import com.rongyi.easy.rpb.vo.AliPunchCardPayVo;
import com.rongyi.pay.core.Exception.AliPayException;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.auth.AuthorizeRespData;
import com.rongyi.pay.core.ali.model.reqData.AliPunchCardPayReqData;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rpb.common.BeanMapUtils;
import com.rongyi.rss.rpb.IAliPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/2/7 17:05
 **/
public class AliPayServiceImpl implements IAliPayService {

    private static final Logger log = LoggerFactory.getLogger(AliPayServiceImpl.class);

    @Autowired
    PayBizz payBizz;
    @Autowired
    RefundBizz refundBizz;

    @Override
    public Map<String, Object> getPaySign(AliPaySignVo aliPaySignVo, AliConfigureVo aliConfigureVo) throws TradePayException{

        log.info("获取支付宝扫码签名,aliPaySignVo={},aliConfigureVo={}", aliPaySignVo, aliConfigureVo);
        try {
            //初始化业务参数
            AliScanPayReqData aliScanPayReqData = getAliPaySignData(aliPaySignVo, aliConfigureVo);
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);
            //获取签名
            Map<String, Object> map = payBizz.aliScanPaySign(aliConfigureVo.getRyMchId(), aliScanPayReqData, aliConfigure);
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

            AlipayTradeRefundResponse alipayTradeRefundResponse = refundBizz.aliRefund(aliConfigureVo.getRyMchId(), orderNo, refundAmount, refundReason, aliConfigure);

            Map<String, Object> map = BeanMapUtils.toMap(alipayTradeRefundResponse);

            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", alipayTradeRefundResponse.getOutTradeNo());

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
    public Map<String, Object> punchCardPay(AliPunchCardPayVo aliPunchCardPayVo, AliConfigureVo aliConfigureVo) {

        log.info("支付宝刷卡支付,aliPunchCardPayVo={},aliConfigureVo={}", aliPunchCardPayVo, aliConfigureVo);
        try {
            //初始化业务参数
            AliPunchCardPayReqData aliPunchCardPayReqData = getAliPunchCardPayReqData(aliPunchCardPayVo, aliConfigureVo);
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            AlipayTradePayResponse alipayTradePayResponse = payBizz.aliPunchCardPay(aliConfigureVo.getRyMchId(), aliPunchCardPayReqData, aliConfigure);

            Map<String, Object> map = BeanMapUtils.toMap(alipayTradePayResponse);

            //外部订单号
            map.put("orderNo", aliPunchCardPayVo.getOrderNo());
            //容易网交易号
            map.put("payNo", alipayTradePayResponse.getOutTradeNo());


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

            AlipayTradeQueryResponse alipayTradeQueryResponse = payBizz.aliF2FPayQuery(orderNo, aliConfigure);

            Map<String, Object> map = BeanMapUtils.toMap(alipayTradeQueryResponse);

            map.remove("fundBillList");

            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", alipayTradeQueryResponse.getOutTradeNo());

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

            return BeanMapUtils.toMap(authorizeRespData);
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
