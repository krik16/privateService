package com.rongyi.pay.core.unit;

import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.ali.model.reqData.AliPunchCardPayReqData;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwScanPayParam;
import com.rongyi.pay.core.wechat.model.WechatPaySignData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;

/**
 * conan
 * 2016/11/2 11:30
 **/
public class ParamUnit {


    /**
     * 检查支付宝扫码支付签名请求参数
     * @param aliScanPayReqData 支付参数
     */
    public static void checkAliGetScanPaySignParam(AliScanPayReqData aliScanPayReqData){

        if(StringUtils.isEmpty(aliScanPayReqData.getPayNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"payNo");
        }

        if(StringUtils.isEmpty(aliScanPayReqData.getSubject())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"subject");
        }

        if(aliScanPayReqData.getTotalAmount() == null || aliScanPayReqData.getTotalAmount() <= 0){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"totalAmount");
        }

        if(StringUtils.isEmpty(aliScanPayReqData.getBuyerId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"buyerId");
        }
    }


    /**
     * 检查支付宝面对面刷卡支付请求参数
     * @param aliPunchCardPayReqData 支付参数
     */
    public static void checkAliPunchCardPayParam(AliPunchCardPayReqData aliPunchCardPayReqData){

        if(StringUtils.isEmpty(aliPunchCardPayReqData.getPayNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"payNo");
        }

        if(StringUtils.isEmpty(aliPunchCardPayReqData.getAuthCode())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"authCode");
        }

        if(StringUtils.isEmpty(aliPunchCardPayReqData.getSubject())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"subject");
        }

        if(aliPunchCardPayReqData.getTotalAmount() == null || aliPunchCardPayReqData.getTotalAmount() <= 0){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"totalAmount");
        }
    }

    /**
     * 检查支付宝面对面付款 查询请求参数
     * @param outTradeNo 付款单号
     */
    public static void checkAliF2FPayQueryParam(String outTradeNo){

        if(StringUtils.isEmpty(outTradeNo)){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"outTradeNo");
        }
    }

    /**
     * 检查支付宝面对面付款 退款请求参数
     * @param outTradeNo 付款单号
     * @param refundAmount 退款金额
     * @param outRefundNo 退款单号
     */
    public static void checkAliF2FRefundParam(String outTradeNo, Integer refundAmount, String outRefundNo){

        if(StringUtils.isEmpty(outTradeNo)){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"outTradeNo");
        }

        if(refundAmount == null || refundAmount <= 0){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"refundAmount");
        }

        if(StringUtils.isEmpty(outRefundNo)){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"outRefundNo");
        }
    }

    /**
     * 检查支付宝授权链接参数
     * @param storeId 商户id
     * @param authType 授权类型
     * @param redirectUri 授权回调地址
     */
    public static void checkAliGetAuthUrlParam(String storeId, Integer authType, String redirectUri){

        if(StringUtils.isEmpty(storeId)){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"storeId");
        }

        if(authType == null){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"authType");
        }

        if(StringUtils.isEmpty(redirectUri)){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"redirectUri");
        }

    }

    /**
     * 检查支付宝获取用户token参数
     * @param appId 应用id
     * @param authCode 授权码
     */
    public static void checkAliGetTokenParam(String appId, String authCode){

        if(StringUtils.isEmpty(appId)){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"appId");
        }

        if(StringUtils.isEmpty(authCode)){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"authCode");
        }

    }

    /**
     * 检查微信获取支付签名参数
     * @param wechatConfigure 支付配置
     * @param wechatPaySignData 签名参数
     */
    public static void checkWechatGetPaySign(WechatConfigure wechatConfigure,WechatPaySignData wechatPaySignData){

        if(StringUtils.isEmpty(wechatConfigure.getAppID())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"appId");
        }

        if(StringUtils.isEmpty(wechatConfigure.getKey())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"key");
        }

        if(StringUtils.isEmpty(wechatConfigure.getMchID())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"mchId");
        }

        if(StringUtils.isEmpty(wechatConfigure.getCertPassword())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"certPassword");
        }

        if(StringUtils.isEmpty(wechatConfigure.getCertLocalPath())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"certLocalPath");
        }

        if(ConstantEnum.WEIXIN_PAY_TRADE_TYPE_JSAPI.getValueStr().equals(wechatConfigure.getTradeType())){
            if(StringUtils.isEmpty(wechatPaySignData.getOpenId())){
                throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"openId");
            }
        }


        if(StringUtils.isEmpty(wechatPaySignData.getPayNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"payNo");
        }

        if(StringUtils.isEmpty(wechatPaySignData.getBody())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"body");
        }

        if(wechatPaySignData.getTotalFee() == null || wechatPaySignData.getTotalFee() <= 0){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"totalFee");
        }

    }

    /**
     * 检查微众 微信刷卡支付请求参数
     * @param param 请求参数
     */
    public static void checkWebankWechatPunchCardPay(WwPunchCardPayParam param, WebankConfigure configure) {
        checkWebankMerchatCode(param.getMerchantCode());
        if (StringUtils.isEmpty(param.getTerminalCode())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"terminalCode");
        }
        if (StringUtils.isEmpty(param.getOrderNo())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "orderNo");
        }
        if (param.getAmount() == null || StringUtils.isEmpty(param.getAmount().toString()) || param.getAmount().compareTo(BigDecimal.ZERO) == -1) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "amount");
        }
        if (StringUtils.isEmpty(param.getProduct())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "product");
        }
        if (StringUtils.isEmpty(param.getAuthCode())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "authCode");
        }
        if (StringUtils.isEmpty(configure.getWechatPunchCardPayUrl())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "payUrl");
        }
        if (StringUtils.isEmpty(configure.getKey())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "key");
        }
    }

    /**
     * 检查微众微信刷卡支付查询订单参数
     * @param reqData 请求参数
     */
    public static void checkWebankWechatPunchCardQueryOrder(WwPunchCardQueryOrderReqData reqData, WebankConfigure configure) {
        checkWebankMerchatCode(reqData.getMerchant_code());
        if (StringUtils.isEmpty(reqData.getTerminal_serialno()) && StringUtils.isEmpty(reqData.getOrderid())
                && StringUtils.isEmpty(reqData.getTransaction_id())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "orderid");
        }
        if (StringUtils.isEmpty(configure.getWechatPunchCardPayQueryOrderUrl())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "queryOrderUrl");
        }
        if (StringUtils.isEmpty(configure.getKey())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "key");
        }
    }

    /**
     * 检查微众微信刷卡支付撤销订单参数
     * @param reqData 请求参数
     */
    public static void checkWebankWechatPunchCardReverse(WwPunchCardReverseReqData reqData) {
        checkWebankMerchatCode(reqData.getMerchant_code());
        if (StringUtils.isEmpty(reqData.getTerminal_code())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "terminal_code");
        }
        if (StringUtils.isEmpty(reqData.getTerminal_serialno())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "terminal_serialno");
        }
        if (StringUtils.isEmpty(reqData.getO_terminal_serialno())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "o_terminal_serialno");
        }
        if (reqData.getAmount()==null) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "amount");
        }
    }

    /**
     * 检查微众微信刷卡支付退款参数
     * @param reqData 请求参数
     */
    public static void checkWebankWechatPunchCardRefund(WwpunchCardRefundReqData reqData) {
        checkWebankMerchatCode(reqData.getMerchant_code());
        if (StringUtils.isEmpty(reqData.getTerminal_serialno())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "terminal_serialno");
        }
        if (reqData.getRefund_amount()==null) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "refund_amount");
        }
    }

    /**
     * 检查微众刷卡支付退款结果查询参数
     * @param reqData 请求参数
     */
    public static void checkWebankWechatPunchCardRefundQuery(WwpunchCardRefundReqData reqData) {
        checkWebankMerchatCode(reqData.getMerchant_code());
        if (StringUtils.isEmpty(reqData.getTerminal_serialno())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "terminal_serialno");
        }
    }

    /**
     * 检查微众商户号
     * @param merchatCode 商户号
     */
    private static void checkWebankMerchatCode(String merchatCode) {
        if (StringUtils.isEmpty(merchatCode)) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "merchant_code");
        }
    }


    /**
     * 检查微众支付宝刷卡支付参数
     */
    public static void checkWebankAlipayPunchCardPay(WaPunchCardPayParam param,WebankConfigure configure) {
        checkWebankMerchatCode(param.getWbMerchantId());
        if(StringUtils.isEmpty(configure.getAlipayPunchCardPayUrl()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "url");
        if (StringUtils.isEmpty(param.getOrderId())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "orderId");
        }
        if(StringUtils.isEmpty(param.getAuthCode()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "authCode");
        if(param.getTotalAmount()==null)
                throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "totalAmount");
        if(StringUtils.isEmpty(param.getSubject()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "subject");
    }

    /**
     * 检查微众支付宝订单查询参数
     */
    public static void checkWebankAlipayQueryTrade(WaQueryTradeReqData reqData, WebankConfigure configure) {
        checkWebankMerchatCode(reqData.getWbMerchantId());
        if(StringUtils.isEmpty(configure.getAlipayQueryTradeUrl()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "url");
        if(StringUtils.isEmpty(reqData.getOrderId())&&StringUtils.isEmpty(reqData.getTradeNo()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "orderId");
    }

    /**
     * 检查微众支付宝撤销订单请求参数
     */
    public static void checkWebankAlipayReverseTrade(WaReverseTradeReqData reqData, WebankConfigure configure) {
        checkWebankMerchatCode(reqData.getWbMerchantId());
        if(StringUtils.isEmpty(reqData.getTradeNo())&&StringUtils.isEmpty(reqData.getOrderId()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "orderId");
        if(StringUtils.isEmpty(configure.getAlipayReverseTradeUrl()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "url");
    }

    public static void checkWebankAlipayRefund(WaRefundReqData reqData, WebankConfigure configure) {
        checkWebankMerchatCode(reqData.getWbMerchantId());
        if(StringUtils.isEmpty(reqData.getTradeNo())&&StringUtils.isEmpty(reqData.getOrderId()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "orderId");
        if(reqData.getRefundAmount()==null)
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "refundAmount");
        if(StringUtils.isEmpty(reqData.getOutRequestNo()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "outRequestNo");
    }

    public static void checkWebankAlipayRefundQuery(WaRefundQueryReqData reqData, WebankConfigure configure) {
        checkWebankMerchatCode(reqData.getWbMerchantId());
        if(StringUtils.isEmpty(reqData.getOrderId())&&StringUtils.isEmpty(reqData.getTradeNo()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "orderId");
    }

    public static void checkWebankWechatScanPay(WwScanPayParam param) {
        checkWebankMerchatCode(param.getMchId());
        if (StringUtils.isEmpty(param.getOutTradeNo())) {
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "outTradeNo");
        }
        if(StringUtils.isEmpty(param.getBody()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "body");
        if(StringUtils.isEmpty(param.getSubOpenid()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "subOpenid");
        if(StringUtils.isEmpty(param.getSubAppid()))
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "subAppid");
        if(param.getTotalFee()<=0)
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY, "totalFee");
    }
}
