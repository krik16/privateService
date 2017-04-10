package com.rongyi.pay.core.tianyi.service;

import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.PayDetailParam;
import com.rongyi.pay.core.tianyi.param.PayQueryParam;
import com.rongyi.pay.core.tianyi.param.RefundParam;
import com.rongyi.pay.core.tianyi.param.TianyiOrderParam;
import com.rongyi.pay.core.tianyi.util.CryptTool;
import com.rongyi.pay.core.tianyi.util.HttpUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yangyang on 2017/4/5.
 */
public class TianyiPayService {

    private static final Logger logger = LoggerFactory.getLogger(TianyiPayService.class);

    public static String getSign(TianyiOrderParam param, TianyiConfigure configure) throws Exception {
        return CryptTool.md5Digest(new StringBuilder().
                append("MERCHANTID=").append(param.getMerchantId()).
                append("&ORDERSEQ=").append(param.getOrderSeq()).
                append("&ORDERREQTRANSEQ=").append(param.getOrderReqTranseq()).
                append("&ORDERREQTIME=").append(param.getOrderReqTime()).
                append("&RISKCONTROLINFO=").append(param.getRiskControlInfo()).
                append("&KEY=").append(param.getKey()).toString());
    }

    public static String order(TianyiOrderParam param, TianyiConfigure configure) throws Exception {
        logger.info("TianyiPayService.order，param:{},configure:{}", param, configure);
        //生成签名
        String mac = getSign(param, configure);
        logger.info("TianyiPayService.order,mac:{}", mac);
        param.setMac(mac);
        //获取请求参数
        String orderReq = getOrderReq(param, configure);
        logger.info("TianyiPayService.order,mac:{}", orderReq);
        return HttpUtil.sendHttpRequest(configure.getOrderUrl(), orderReq);
    }

    public static String getOrderReq(TianyiOrderParam param, TianyiConfigure configure) {
        //下单请求参数
        StringBuilder perpareSignParam = new StringBuilder();
        perpareSignParam.append("MERCHANTID=").append(param.getMerchantId())
                .append("&SUBMERCHANTID=").append(StringUtils.isBlank(param.getMerchantId()) ? "" : param.getMerchantId())
                .append("&ORDERSEQ=").append(param.getOrderSeq())
                .append("&ORDERREQTRANSEQ=").append(param.getOrderReqTranseq())
                .append("&ORDERREQTIME=").append(param.getOrderReqTime())
                .append("&TRANSCODE=").append(param.getTransCode())
                .append("&ORDERAMT=").append(param.getOrderAmt())//下单金额单位分，支付金额单位元
                .append("&ORDERCCY=").append(param.getOrderCcy())
                .append("&SERVICECODE=").append(param.getServiceCode())
                .append("&PRODUCTID=").append(param.getProductId())
                .append("&PRODUCTDESC=").append(StringUtils.isBlank(param.getProductDesc()) ? "" : param.getProductDesc())//下单金额单位分
                .append("&LOGINNO=").append(StringUtils.isBlank(param.getLoginNo())?"":param.getLoginNo())
                .append("&PROVINCECODE=").append(StringUtils.isBlank(param.getProvinceCode())?"":param.getProvinceCode())
                .append("&CITYCODE=").append(StringUtils.isBlank(param.getCityCode())?"":param.getCityCode())
                .append("&DIVDETAILS=").append(StringUtils.isBlank(param.getDivDetails()) ? "" : param.getDivDetails())//todo
                .append("&ENCODETYPE=").append(param.getEncodeType())
                .append("&MAC=").append(param.getMac())
//                .append("&SESSIONKEY=").append(StringUtils.isBlank(param.getSessionKey())?"":param.getSessionKey())
                .append("&ATTACH=").append(StringUtils.isBlank(param.getAccach())?"":param.getAccach())
                .append("&requestSystem=").append(param.getRequestSystem())
                .append("&RISKCONTROLINFO=").append(param.getRiskControlInfo());
        return perpareSignParam.toString();
    }


    public static String getOrderQueryStr(PayQueryParam param) {
        //下单请求参数
        StringBuilder perpareSignParam = new StringBuilder();
        perpareSignParam.append("MERCHANTID=").append(param.getMerchantId())
                .append("&ORDERNO=").append(param.getOrderNo())
                .append("&ORDERREQNO=").append(param.getOrderReqNo())
                .append("&ORDERDATE=").append(param.getOrderDate())
                .append("&MAC=").append(param.getMac());
        return perpareSignParam.toString();
    }

    public static String getPayStr(PayDetailParam param, TianyiConfigure configure, String sign) {
        return new StringBuilder().append("MERCHANTID=").append(param.getMerchantId()).
                append("&SUBMERCHANTID=").append("").append("&MERCHANTPWD=").append(param.getMerchantPwd()).
                append("&ORDERSEQ=").append(param.getOrderSeq()).append("&ORDERAMOUNT=").append(param.getOrderAmount()).
                append("&ORDERTIME=").append(param.getOrderTime()).append("&ORDERVALIDITYTIME=").append(param.getOrderValidityTime()).
                append("&PRODUCTDESC=").append(param.getProductDesc()).append("&CUSTOMERID=").append(param.getCustomerId()).
                append("&PRODUCTAMOUNT=").append(param.getProductAmount()).append("&ATTACHAMOUNT=").append(param.getAttachAmount()).
                append("&CURTYPE=").append(param.getCurType()).append("&BEFOREMERCHANTURL=").append(param.getBeforeMerchantUrl()).
                append("&BACKMERCHANTURL=").append(param.getBackMerchantUrl()).append("&ATTACH=").append("").append("&PRODUCTID=").
                append(param.getProductId()).append("&USERIP=").append(param.getUserIp()).append("&DIVDETAILS=").append("").
                append("&ACCOUNTID=").append(param.getAccountId()).append("&BUSITYPE=").append(param.getBusiType()).
                append("&ORDERREQTRANSEQ=").append(param.getOrderReqTranseq()).append("&SERVICE=").append(param.getService()).
                append("&SIGNTYPE=").append(param.getSignType()).append("&SIGN=").append(sign).append("&SUBJECT=").
                append(param.getSubject()).append("&SWTICHACC=").append(param.getSwtichAcc()).append("&USERLANGUAGE=").
                append(param.getUserLanguage()).toString();
    }

    public static String getTradeRefundMac(RefundParam param) throws Exception {
        StringBuilder sb = new StringBuilder();//组装mac加密明文串
        sb.append("MERCHANTID=").append(param.getMerchantId());
        sb.append("&MERCHANTPWD=").append(param.getMerchantPwd());
        sb.append("&OLDORDERNO=").append(param.getOldOrderNo());
        sb.append("&OLDORDERREQNO=").append(param.getOldOrderReqNo());
        sb.append("&REFUNDREQNO=").append(param.getRefundReqNo());
        sb.append("&REFUNDREQDATE=").append(param.getRefundReqDate());
        sb.append("&TRANSAMT=").append(param.getTransAmt());
        sb.append("&LEDGERDETAIL=").append(param.getLedgerDetail());
        sb.append("&KEY=").append(param.getKey());//此处是商户的key
        return CryptTool.md5Digest(sb.toString());
    }
}
