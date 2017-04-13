package com.rongyi.pay.core.unit;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayOpenAuthTokenAppRequest;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.response.*;
import com.rongyi.pay.core.Exception.AliPayException;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.auth.AuthorizeRespData;
import com.rongyi.pay.core.ali.model.builder.AlipayTradeCreateRequestBuilder;
import com.rongyi.pay.core.ali.model.builder.AlipayTradePayRequestBuilder;
import com.rongyi.pay.core.ali.model.builder.AlipayTradeQueryRequestBuilder;
import com.rongyi.pay.core.ali.model.builder.AlipayTradeRefundRequestBuilder;
import com.rongyi.pay.core.ali.model.reqData.AliPunchCardPayReqData;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.ali.model.result.AlipayF2CreateResult;
import com.rongyi.pay.core.ali.model.result.AlipayF2FPayResult;
import com.rongyi.pay.core.ali.model.result.AlipayF2FQueryResult;
import com.rongyi.pay.core.ali.model.result.AlipayF2FRefundResult;
import com.rongyi.pay.core.ali.service.AlipayTradeService;
import com.rongyi.pay.core.ali.service.impl.AlipayTradeServiceImpl;
import com.rongyi.pay.core.constants.ConstantEnum;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2016/10/31 10:59
 **/
public class AliPayUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(AliPayUnit.class);

    /**
     * 支付宝扫码支付获取签名
     *
     * @param aliScanPayReqData 扫码支付业务参数
     * @param aliConfigure      支付宝
     * @return map
     */
    public static Map<String, Object> getScanPaySign(AliScanPayReqData aliScanPayReqData, AliConfigure aliConfigure, String notifyUrl) {

        LOGGER.info("支付宝扫码支付获取签名,aliScanPayReqData={},aliConfigure={}", aliScanPayReqData, aliConfigure);

        //检查参数
        ParamUnit.checkAliGetScanPaySignParam(aliScanPayReqData);

        AlipayTradeService tradeService = new AlipayTradeServiceImpl.ClientBuilder().build(aliConfigure);
        // 创建条码支付请求builder，设置请求参数
        AlipayTradeCreateRequestBuilder builder = new AlipayTradeCreateRequestBuilder()
                .setAppAuthToken(aliScanPayReqData.getAppAuthToken())
                .setOutTradeNo(aliScanPayReqData.getPayNo())
                .setSubject(aliScanPayReqData.getSubject())
                .setBuyerId(aliScanPayReqData.getBuyerId())
                .setBuyerLogonId(aliScanPayReqData.getBuyerLogonId())
                .setTotalAmount(fenToYuan(aliScanPayReqData.getTotalAmount()).toString())
                .setStoreId(aliScanPayReqData.getStoreId())
                .setBody(aliScanPayReqData.getBody())
                .setOperatorId(aliScanPayReqData.getOperatorId())
                .setExtendParams(aliScanPayReqData.getExtendParams())
                .setSellerId(aliScanPayReqData.getSellerId())
                .setGoodsDetailList(aliScanPayReqData.getGoodsDetailList())
                .setNotifyUrl(notifyUrl)
                .setTimeoutExpress(aliScanPayReqData.getTimeoutExpress());

        // 调用tradePay方法获取当面付应答
        AlipayF2CreateResult result = tradeService.tradeCreate(builder, aliConfigure);
        switch (result.getTradeStatus()) {
            case SUCCESS:
                LOGGER.info("支付宝扫码支付签名获取成功.");
                Map<String, Object> map = new HashMap<>();
                map.put("payNo", aliScanPayReqData.getPayNo());
                map.put("tradeNo", result.getResponse().getTradeNo());
                map.put("totalAmount", aliScanPayReqData.getTotalAmount());
                return map;
            case FAILED:
                LOGGER.error("支付宝支付失败!!!result={}", result);
                break;

            case UNKNOWN:
                LOGGER.error("系统异常，订单状态未知!!!result={}", result);
                break;

            default:
                LOGGER.error("不支持的交易状态，交易返回异常!!!result={}", result);
                break;
        }
        throw new AliPayException(result.getResponse().getSubCode(), result.getResponse().getSubMsg());
    }

    /**
     * 支付宝刷卡支付
     *
     * @param aliPunchCardPayReqData 刷卡业务参数
     * @param aliConfigure           支付宝
     * @return AlipayTradePayResponse
     */
    public static AlipayTradePayResponse punchCardPay(AliPunchCardPayReqData aliPunchCardPayReqData, AliConfigure aliConfigure) {

        LOGGER.info("支付宝刷卡支付,aliScanPayReqData={},aliConfigure={}", aliPunchCardPayReqData, aliConfigure);

        //检查参数
        ParamUnit.checkAliPunchCardPayParam(aliPunchCardPayReqData);

        AlipayTradeService tradeService = new AlipayTradeServiceImpl.ClientBuilder().build(aliConfigure);
        // 创建条码支付请求builder，设置请求参数
        AlipayTradePayRequestBuilder builder = new AlipayTradePayRequestBuilder()
                .setAppAuthToken(aliPunchCardPayReqData.getAppAuthToken())
                .setOutTradeNo(aliPunchCardPayReqData.getPayNo())
                .setSubject(aliPunchCardPayReqData.getSubject())
                .setAuthCode(aliPunchCardPayReqData.getAuthCode())
                .setTotalAmount(fenToYuan(aliPunchCardPayReqData.getTotalAmount()).toString())
                .setStoreId(aliPunchCardPayReqData.getStoreId())
                .setBody(aliPunchCardPayReqData.getBody())
                .setOperatorId(aliPunchCardPayReqData.getOperatorId())
                .setExtendParams(aliPunchCardPayReqData.getExtendParams())
                .setSellerId(aliPunchCardPayReqData.getSellerId())
                .setGoodsDetailList(aliPunchCardPayReqData.getGoodsDetailList())
                .setTimeoutExpress(aliPunchCardPayReqData.getTimeoutExpress());

        // 调用tradePay方法获取当面付应答
        AlipayF2FPayResult result = tradeService.tradePay(builder, aliConfigure);
        switch (result.getTradeStatus()) {
            case SUCCESS:
                LOGGER.info("支付宝支付成功.");
                return result.getResponse();

            case FAILED:
                LOGGER.error("支付宝支付失败!!!result={}", result);
                break;

            case UNKNOWN:
                LOGGER.error("系统异常，订单状态未知!!!result={}", result);
                break;

            default:
                LOGGER.error("不支持的交易状态，交易返回异常!!!result={}", result);
                break;
        }
        throw new AliPayException(StringUtils.isEmpty(result.getResponse().getSubCode()) ? result.getResponse().getCode() : result.getResponse().getSubCode(),
                StringUtils.isEmpty(result.getResponse().getSubMsg()) ? result.getResponse().getMsg() : result.getResponse().getSubMsg());
    }


    /**
     * 当面付交易结果查询
     *
     * @param aliConfigure 支付配置
     * @param outTradeNo   订单号
     * @param tradeNo      交易流水号
     * @return AlipayF2FQueryResult
     */
    public static AlipayTradeQueryResponse f2fPayQuery(String outTradeNo, String tradeNo, AliConfigure aliConfigure) {

        LOGGER.info("当面付交易结果查询,aliConfigure={},outTradeNo={},tradeNo={}", aliConfigure, outTradeNo, tradeNo);

        //检查参数
        ParamUnit.checkAliF2FPayQueryParam(outTradeNo);

        if (StringUtils.isEmpty(outTradeNo) && StringUtils.isEmpty(tradeNo)) {
            throw new ParamNullException();
        }

        AlipayTradeService tradeService = new AlipayTradeServiceImpl.ClientBuilder().build(aliConfigure);

        // 创建查询请求builder，设置请求参数
        AlipayTradeQueryRequestBuilder builder = new AlipayTradeQueryRequestBuilder()
                .setOutTradeNo(outTradeNo)
                .setTradeNo(tradeNo);
        //服务商模式收款
        if (StringUtils.isNotBlank(aliConfigure.getAppAuthToken())) {
            builder.setAppAuthToken(aliConfigure.getAppAuthToken());
        }

        AlipayF2FQueryResult result = tradeService.queryTradeResult(builder, aliConfigure);
        switch (result.getTradeStatus()) {
            case SUCCESS:
                LOGGER.info("订单支付成功.");
                return result.getResponse();
            case FAILED:
                LOGGER.error("查询返回该订单未支付或支付失败!!!result={}", result);
                break;

            case UNKNOWN:
                LOGGER.error("系统异常，订单支付状态未知!!!result={}", result);
                break;

            default:
                LOGGER.error("不支持的交易状态，交易返回异常!!!result={}", result);
                break;
        }
        throw new AliPayException(result.getResponse().getSubCode(), result.getResponse().getSubMsg());
    }

    /**
     * 当面付交易结果退款
     *
     * @param aliConfigure 支付配置
     * @param outTradeNo   付款单号
     * @param refundAmount 退款金额
     * @param outRefundNo  退款单号
     * @param refundReason 退款原因
     * @param storeId      店铺id
     * @return AlipayF2FRefundResult
     */
    public static AlipayTradeRefundResponse f2fPayRefund(String outTradeNo, Integer refundAmount, String outRefundNo, String refundReason, String storeId, AliConfigure aliConfigure) {

        LOGGER.info("当面付交易退款,aliConfigure={},outTradeNo={},refundAmount={},outRefundNo={},refundReason={},storeId={}",
                aliConfigure, outTradeNo, refundAmount, outRefundNo, refundReason, storeId);

        //检查参数
        ParamUnit.checkAliF2FRefundParam(outTradeNo, refundAmount, outRefundNo);

        if (StringUtils.isEmpty(refundReason)) {
            refundReason = "申请退款";
        }

        // 创建退款请求builder，设置请求参数
        AlipayTradeRefundRequestBuilder builder = new AlipayTradeRefundRequestBuilder()
                .setOutTradeNo(outTradeNo)
                .setRefundAmount(new BigDecimal(refundAmount).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).toString())
                .setRefundReason(refundReason)
                .setOutRequestNo(outRefundNo)
                .setStoreId(storeId);
        if (StringUtils.isNotBlank(aliConfigure.getAppAuthToken())) {
            builder.setAppAuthToken(aliConfigure.getAppAuthToken());
        }
        AlipayTradeService tradeService = new AlipayTradeServiceImpl.ClientBuilder().build(aliConfigure);
        AlipayF2FRefundResult result = tradeService.tradeRefund(builder, aliConfigure);
        switch (result.getTradeStatus()) {
            case SUCCESS:
                LOGGER.info("支付宝退款成功: )");
                return result.getResponse();
            case FAILED:
                LOGGER.error("支付宝退款失败!!!");
                break;

            case UNKNOWN:
                LOGGER.error("系统异常，订单退款状态未知!!!");
                break;

            default:
                LOGGER.error("不支持的交易状态，交易返回异常!!!");
                break;
        }
        throw new AliPayException(result.getResponse().getSubCode(), result.getResponse().getSubMsg());
    }

    /**
     * 获取授权链接
     *
     * @param aliConfigure 支付配置
     * @param storeId      门店id
     * @param scope        授权范围
     * @param authType     授权类型，0:验证开发者公钥信息,1商户授权，2:用户授权
     * @param redirectUrl  回调地址
     * @return String
     */
    public static String getAuthUrl(String storeId, String scope, Integer authType, String redirectUrl, AliConfigure aliConfigure) {

        LOGGER.info("获取授权链接,aliConfigure={},storeId={},scope={},authType={},redirectUrl={}", aliConfigure, storeId, scope, authType, redirectUrl);

        //检查参数
        ParamUnit.checkAliGetAuthUrlParam(storeId, authType, redirectUrl);

        StringBuilder authUrl = new StringBuilder();
        if (ConstantEnum.ALI_AUTH_TYPE_1.getCodeInt().equals(authType)) {
            authUrl.append(aliConfigure.getMchAuthUrl());
        } else if (ConstantEnum.ALI_AUTH_TYPE_2.getCodeInt().equals(authType)) {
            authUrl.append(aliConfigure.getUserAuthUrl());
        }
        authUrl.append("?app_id=");
        authUrl.append(aliConfigure.getAppid());
        if(StringUtils.isNotEmpty(storeId)){
            authUrl.append("&store_id=");
            authUrl.append(storeId);
            authUrl.append("&state=");
            authUrl.append(storeId);
        }
        if (StringUtils.isNotEmpty(scope)) {
            authUrl.append("&scope=");
            authUrl.append(scope);
        }
        authUrl.append("&auth_type=");
        authUrl.append(authType);
        authUrl.append("&redirect_uri=");
        try {
            authUrl.append(URLEncoder.encode(redirectUrl, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return authUrl.toString();
    }

    /**
     * 获取支付宝根据授权url中的redirect_uri返回授权信息
     *
     * @param aliConfigure 配置信息
     * @param appAuthCode  支付宝返回authCode
     * @param appId        支付宝返回appId
     * @param storeId      商户id
     * @param scope        授权范围
     * @param authType     授权类型，1商户授权，2:用户授权
     * @return AuthorizeRespData
     */
    public static AuthorizeRespData getAuthToken(String appAuthCode, String appId, String storeId, String scope, Integer authType, AliConfigure aliConfigure) {

        LOGGER.info("获取用户token,aliConfigure={}appAuthCode={},appId={},storeId={},scope={},authType={}", aliConfigure, appAuthCode, appId, storeId, scope, authType);

        try {
            AuthorizeRespData authorizeRespData = new AuthorizeRespData();
            authorizeRespData.setAppAuthCode(appAuthCode);
            authorizeRespData.setAppId(appId);
            authorizeRespData.setStoreId(storeId);
            authorizeRespData.setScope(scope);
            authorizeRespData.setAuthType(String.valueOf(authType));
            //商户授权token
            if (authType == 1) {
                AlipayOpenAuthTokenAppResponse alipayOpenAuthTokenAppResponse = getMchAuthToken(authorizeRespData.getAppId(), authorizeRespData.getAppAuthCode(), aliConfigure);
                if (StringUtils.isNotEmpty(alipayOpenAuthTokenAppResponse.getSubCode())) {
                    throw new AliPayException(alipayOpenAuthTokenAppResponse.getSubCode(), alipayOpenAuthTokenAppResponse.getSubMsg());
                }
                authorizeRespData.setAlipayOpenAuthTokenAppResponse(alipayOpenAuthTokenAppResponse);
                LOGGER.info("商户token={},ExpiresIn={},appRefreshToken={},reExpiresIn={},userId={}", alipayOpenAuthTokenAppResponse.getAppAuthToken(),
                        alipayOpenAuthTokenAppResponse.getExpiresIn(), alipayOpenAuthTokenAppResponse.getAppRefreshToken(),
                        alipayOpenAuthTokenAppResponse.getReExpiresIn(), alipayOpenAuthTokenAppResponse.getUserId());
            }
            //用户授权token
            else {
                AlipaySystemOauthTokenResponse alipaySystemOauthTokenResponse = getUserAuthToken(authorizeRespData.getAppId(), authorizeRespData.getAppAuthCode(), aliConfigure);
                if (StringUtils.isNotEmpty(alipaySystemOauthTokenResponse.getSubCode())) {
                    throw new AliPayException(alipaySystemOauthTokenResponse.getSubCode(), alipaySystemOauthTokenResponse.getSubMsg());
                }
                LOGGER.info("aliByUserId={}", alipaySystemOauthTokenResponse.getUserId());
                alipaySystemOauthTokenResponse.setAlipayUserId(alipaySystemOauthTokenResponse.getUserId());
                authorizeRespData.setAlipaySystemOauthTokenResponse(alipaySystemOauthTokenResponse);
                LOGGER.info("alipaySystemOauthTokenResponse{}", "accessToken=" + alipaySystemOauthTokenResponse.getAccessToken()
                        + ",AlipayUserId=" + alipaySystemOauthTokenResponse.getAlipayUserId() + ",ExpiresIn=" + alipaySystemOauthTokenResponse.getExpiresIn() +
                        ",RefreshToken=" + alipaySystemOauthTokenResponse.getRefreshToken() + ",ReExpiresIn=" + alipaySystemOauthTokenResponse.getReExpiresIn());
            }

            return authorizeRespData;
        } catch (AliPayException e) {
            LOGGER.warn("获取用户token失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LOGGER.error("获取用户token出错,e={}", e.getMessage(), e);
            throw new AliPayException(ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_AUTHORIZE_FAIL.getValueStr());

        }
    }


    /**
     * 根据授权appId和authCode获取商户authToken信息
     *
     * @param aliConfigure 配置信息
     * @param appId        appId
     * @param authCode     authCode
     * @return AlipayOpenAuthTokenAppResponse
     * @throws Exception
     */
    private static AlipayOpenAuthTokenAppResponse getMchAuthToken(String appId, String authCode, AliConfigure aliConfigure) throws Exception {

        //检查参数
        ParamUnit.checkAliGetTokenParam(appId, authCode);

        AlipayClient alipayClient = new DefaultAlipayClient(aliConfigure.getOpenApiDomain(), appId, aliConfigure.getPrivateKey(),
                "json", "GBK", aliConfigure.getAlipayPublicKey());
        AlipayOpenAuthTokenAppRequest request = new AlipayOpenAuthTokenAppRequest();
        request.setBizContent("{" +
                "    \"grant_type\":\"authorization_code\"," +
                "    \"code\":\"" + authCode + "\"," +
                "  }");
        return alipayClient.execute(request);
    }

    /**
     * 获取用户token信息
     *
     * @param aliConfigure 支付配置
     * @param appId        appId
     * @param authCode     authCode
     * @return AlipaySystemOauthTokenResponse
     * @throws Exception
     */
    private static AlipaySystemOauthTokenResponse getUserAuthToken(String appId, String authCode, AliConfigure aliConfigure) throws Exception {

        AlipayClient alipayClient = new DefaultAlipayClient(aliConfigure.getOpenApiDomain(), appId, aliConfigure.getPrivateKey(),
                "json", "GBK", aliConfigure.getAlipayPublicKey());
        AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
        request.setCode(authCode);
        request.setGrantType("authorization_code");
        return alipayClient.execute(request);
    }

    /**
     * 分转元
     *
     * @param fen 分
     * @return 元单位金额
     */
    public static Double fenToYuan(int fen) {
        double val = 0D;
        if (fen > 0) {
            val = BigDecimal.valueOf(fen).divide(BigDecimal.valueOf(100.00D), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
        return val;
    }
}
