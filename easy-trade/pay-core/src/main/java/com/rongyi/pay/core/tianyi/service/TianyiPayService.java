package com.rongyi.pay.core.tianyi.service;

import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.TianyiOrderParam;
import com.rongyi.pay.core.tianyi.util.HttpUtil;
import com.rongyi.pay.core.wechat.util.MD5;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by yangyang on 2017/4/5.
 */
public class TianyiPayService {

    private static final Logger logger = LoggerFactory.getLogger(TianyiPayService.class);

    public static String getSign(TianyiOrderParam param, TianyiConfigure configure) {
        return MD5.MD5Encode("MERCHANTID=" + param.getMerchantId() + "&ORDERSEQ=" + param.getOrderSeq() + "&ORDERREQTRANSEQ=" + param.getOrderReqTranseq() + "&ORDERREQTIME=" + param.getOrderReqTime() + "&RISKCONTROLINFO=" + param.getRiskControlInfo() + "&KEY=" + configure.getMerkey());
    }

    public static String order(TianyiOrderParam param, TianyiConfigure configure) throws IOException {
        logger.info("TianyiPayService.order，param:{},configure:{}",param,configure);
        //生成签名
        String mac = getSign(param, configure);
        logger.info("TianyiPayService.order,mac:{}",mac);
        param.setMac(mac);
        //获取请求参数
        String orderReq = getOrderReq(param, configure);
        logger.info("TianyiPayService.order,mac:{}",orderReq);
        return HttpUtil.sendHttpRequest(configure.getOrderUrl(), orderReq);
    }

    public static String getOrderReq(TianyiOrderParam param, TianyiConfigure configure) {
        //下单请求参数
        StringBuilder perpareSignParam = new StringBuilder();
        perpareSignParam.append("MERCHANTID=").append(param.getMerchantId())
                .append("&SUBMERCHANTID=").append(StringUtils.isBlank(param.getMerchantId())?"":param.getMerchantId())
                .append("&ORDERSEQ=").append(param.getOrderSeq())
                .append("&ORDERREQTRANSEQ=").append(param.getOrderReqTranseq())
                .append("&ORDERREQTIME=").append(param.getOrderReqTime())
                .append("&TRANSCODE=").append(param.getTransCode())
                .append("&ORDERAMT=").append(param.getOrderAmt())//下单金额单位分，支付金额单位元
                .append("&ORDERCCY=").append(param.getOrderCcy())
                .append("&SERVICECODE=").append(param.getServiceCode())
                .append("&PRODUCTID=").append(param.getProductId())
                .append("&PRODUCTDESC=").append(StringUtils.isBlank(param.getProductDesc())?"":param.getProductDesc())//下单金额单位分
                .append("&LOGINNO=").append("")
                .append("&PROVINCECODE=").append("")
                .append("&CITYCODE=").append("")
                .append("&DIVDETAILS=").append(StringUtils.isBlank(param.getDivDetails())?"":param.getDivDetails())//todo
                .append("&ENCODETYPE=").append(param.getEncodeType())
                .append("&MAC=").append(param.getMac())
                .append("&SESSIONKEY=").append("")
                .append("&ATTACH=").append("")
                .append("&requestSystem=").append(param.getRequestSystem())
                .append("&RISKCONTROLINFO=").append(param.getRiskControlInfo());
        return perpareSignParam.toString();
    }
}
