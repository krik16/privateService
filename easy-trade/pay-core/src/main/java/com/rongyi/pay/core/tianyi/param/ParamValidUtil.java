package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import org.apache.commons.lang.StringUtils;

/**
 * Created by yangyang on 2017/4/5.
 */
public class ParamValidUtil {


    private static final String ENCODETYPE = "1";
    private static final String RISKCONTROLINFO = "1";
    private static final String TRANSCODE = "01";
    private static final String ORDERCCY = "RMB";
    private static final String SERVICECODE = "05";
    private static final String SERVICE = "mobile.securitypay.pay";
    private static final String SIGNTYPE ="MD5";
    private static final String USERLANGUAGE ="zh";
    private static final String BUSITYPE ="04";

    /**
     * 校验下单参数
     * @param param
     * @param configure
     */
    public static void checkAndSetOrderParam(TianyiOrderParam param, TianyiConfigure configure) {
        if (param == null || configure == null){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"param or configure");
        }
        if (StringUtils.isBlank(param.getMerchantId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"merchantId");
        }
        if (StringUtils.isBlank(param.getOrderSeq())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderSeq");
        }
        if(StringUtils.isBlank(param.getOrderReqTranseq())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderReqTanSeq");
        }
        if (StringUtils.isBlank(param.getOrderReqTime())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderReqTime");
        }
        param.setTransCode(TRANSCODE);
        if (StringUtils.isBlank(param.getTransCode())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderReqTime");
        }
        if (StringUtils.isBlank(param.getOrderAmt())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderAmt");
        }
        if (StringUtils.isBlank(configure.getProductId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"productId");
        }
        param.setProductId(configure.getProductId());
        if (StringUtils.isBlank(param.getProductDesc())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"productDesc");
        }
        param.setOrderCcy(ORDERCCY);
        param.setEncodeType(ENCODETYPE);
        param.setRequestSystem(RISKCONTROLINFO);
        param.setServiceCode(SERVICECODE);
        if (StringUtils.isBlank(configure.getRiskControlInfo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"riskControlInfo");
        }

    }

    public static void checkAndSetPayParam(PayDetailParam param, TianyiConfigure configure) {
        if (param == null || configure == null){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"param or configure");
        }
        param.setService(SERVICE);
        if (StringUtils.isBlank(param.getMerchantId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"merchantId");
        }
        if (StringUtils.isBlank(param.getMerchantPwd())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"merchantPwd");
        }
        if (StringUtils.isBlank(configure.getBeforeBackUrl())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"beforeMerchantUrl");
        }
        param.setBeforeMerchantUrl(configure.getBeforeBackUrl());
        if (StringUtils.isBlank(configure.getBackMerchantUrl())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"backMerchantUrl");
        }
        param.setBackMerchantUrl(configure.getBackMerchantUrl());
        param.setSignType(SIGNTYPE);
        param.setUserLanguage(USERLANGUAGE);
        param.setRemark("ed2hv12d");//todo
        if (StringUtils.isBlank(param.getOrderSeq())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderSeq");
        }
        if (StringUtils.isBlank(param.getOrderReqTranseq())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderReqTranseq");
        }
        if (StringUtils.isBlank(param.getOrderTime())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderTime");
        }
        if (StringUtils.isBlank(param.getOrderAmount())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderAmount");
        }
        param.setCurType(ORDERCCY);
        if (StringUtils.isBlank(param.getCurType())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"curType");
        }
        if (StringUtils.isBlank(param.getProductId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"productId");
        }
        if (StringUtils.isBlank(param.getProductDesc())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"productDesc");
        }
        if (StringUtils.isBlank(param.getSubject())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"subject");
        }
        if (StringUtils.isBlank(param.getProductAmount())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"productAmount");
        }
        if (StringUtils.isBlank(param.getAttachAmount())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"attachAmount");
        }
        if (StringUtils.isBlank(param.getCustomerId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"customerId");
        }
        if (StringUtils.isBlank(configure.getBusiType())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"busiType");
        }
        param.setBusiType(configure.getBusiType());
        if (StringUtils.isBlank(configure.getSwtichacc())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"busiType");
        }
        param.setSwtichAcc(configure.getSwtichacc());
        if (StringUtils.isBlank(param.getKey())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"key");
        }
    }

    public static void checkTradeQueryParam(PayQueryParam param, TianyiConfigure configure) {
        if (param == null || configure == null){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"param or configure");
        }
        if (StringUtils.isBlank(param.getMerchantId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"merchantId");
        }
        if (StringUtils.isBlank(param.getOrderNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderNo");
        }
        if (StringUtils.isBlank(param.getOrderReqNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderReqNo");
        }
        if (StringUtils.isBlank(param.getOrderDate())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"orderDate");
        }
        if (StringUtils.isBlank(configure.getPayQueryUrl())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"payQueryUrl");
        }
    }

    public static void checkTradeRefundParam(RefundParam param, TianyiConfigure configure) {
        if (param == null || configure == null){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"param or configure");
        }
        if (StringUtils.isBlank(param.getMerchantId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"merchantId");
        }
        if (StringUtils.isBlank(param.getMerchantPwd())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"merchantPwd");
        }
        if (StringUtils.isBlank(param.getOldOrderNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"oldOrderNo");
        }
        if (StringUtils.isBlank(param.getOldOrderReqNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"oldOrderReqNo");
        }
        if (StringUtils.isBlank(param.getRefundReqNo())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"refundReqNo");
        }
        if (StringUtils.isBlank(param.getRefundReqDate())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"refundReqDate");
        }
        if (StringUtils.isBlank(param.getTransAmt())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"transAmt");
        }
        if (StringUtils.isBlank(param.getChannel())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"channel");
        }
    }

    public static void checkAndSetTianyiParam(TianyiParam param, TianyiConfigure configure) {
        if (param == null || param.getPayDetailParam() == null || param.getTianyiOrderParam() == null || configure == null){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"param or configure or payDetailParam or  tianyiOrderParam is null");
        }
    }
}
