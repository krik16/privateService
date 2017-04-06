package com.rongyi.pay.core.unit;

import com.alibaba.fastjson.JSONObject;
import com.rongyi.pay.core.Exception.TianyiException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.*;
import com.rongyi.pay.core.tianyi.service.TianyiPayService;
import com.rongyi.pay.core.tianyi.util.AES256;
import com.rongyi.pay.core.tianyi.util.HttpUtil;
import com.rongyi.pay.core.tianyi.util.RSA;
import com.rongyi.pay.core.tianyi.util.SysConstants;
import com.rongyi.pay.core.wechat.util.MD5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangyang on 2017/4/1.
 */
public class TianyiPayUnit {

    private static final String INTERCODE = "INTER.SYSTEM.001";

    private static final Logger logger = LoggerFactory.getLogger(TianyiPayUnit.class);

    //微众微信支付配置信息
    private static TianyiConfigure configure = TianyiConfigure.getInstance();

    /**
     * 翼支付下单接口
     *
     * @param param
     * @return
     */
    public static boolean order(TianyiOrderParam param) {
        logger.info("翼支付下单接口，param:{},config:{}", param, configure);
        try {
            ParamValidUtil.checkAndSetOrderParam(param, configure);
            String responseStr = TianyiPayService.order(param, configure);
            if (responseStr != null && "00".equals((responseStr.split("&"))[0])) {
                return true;
            }
        } catch (Exception e) {
            logger.info("翼支付下单接口失败 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_ORDER_FAIL);
        }
        return false;
    }

    /**
     * 翼支付获取公钥接口
     *
     * @param param
     * @return
     */
    public static PublicKeyRes getPublicKey(TianyiOrderParam param) {
        logger.info("翼支付获取公钥接口,param:{}", param);
        String requestBody = getReqParam();
        try {
            String responseStr = HttpUtil.doPost(configure.getPublicKeyUrl(), requestBody);
            TianyiResp result = (TianyiResp) JSONObject.parseObject(responseStr, TianyiResp.class).getResult();
            if (result != null && result.isSuccess()) {
                return JSONObject.parseObject(result.toString(), PublicKeyRes.class);
            }
            return null;
        } catch (Exception e) {
            logger.info("翼支付获取公钥接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_PUBLICKEY_FAIL);
        }
    }

    /**
     * 翼支付拼接url
     *
     * @param param
     * @return
     */
    public static PublicKeyRes getH5Url( PayDetailParam param, PublicKeyRes publicKeyRes) {
        logger.info("翼支付拼接url接口,param:{}", param);
        ParamValidUtil.checkAndSetPayParam(param, configure);
        try {
            //生成数字签名
            String sign = getSign(param);
            String payStr = TianyiPayService.getPayStr(param, configure, sign);
            String key = AES256.getStringRandom(32);
            String encryStr = AES256.AES_Encode(payStr, key);
            key = RSA.encrypt(key, publicKeyRes.getPubKey(), SysConstants.SYS_CHARSET);
            String webUrl = configure.getPayUrl() + "/gateway.pay" + "?platform=wap_3.0" + "&encryStr=" + encryStr + "&keyIndex=" + publicKeyRes.getKeyIndex() + "&encryKey=" + key;
            webUrl = webUrl.replaceAll("\\+", "%2B");
            logger.info("唤起H5收银台的url：" + webUrl);
            return null;
        } catch (Exception e) {
            logger.info("翼支付获取公钥接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_PUBLICKEY_FAIL);
        }
    }


    /**
     * 交易查询
     *
     * @param param
     * @return
     */
    public static TianyiTradeQueryRes tradeQuery(PayQueryParam param, PublicKeyRes publicKeyRes) {
        logger.info("翼支付交易查询接口,param:{}", param);
        ParamValidUtil.checkTradeQueryParam(param, configure);
        try {
            //生成数字签名
            String mac = getTradeQuerySign(param);
            param.setMac(mac);
            String tradeQueryStr = TianyiPayService.getOrderQueryStr(param);
            String responseStr = HttpUtil.doPost(configure.getPayQueryUrl(), tradeQueryStr);
            TianyiResp result = (TianyiResp) JSONObject.parseObject(responseStr, TianyiResp.class).getResult();
            if (result.isSuccess() || result.getResult() != null){
                return JSONObject.parseObject(result.getResult().toString(), TianyiTradeQueryRes.class);
            }
            return null;
        } catch (Exception e) {
            logger.info("翼支付交易查询接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_PUBLICKEY_FAIL);
        }
    }



    /**
     * 交易查询
     *
     * @param param
     * @return
     */
    public static boolean tradeRefund(RefundParam param, PublicKeyRes publicKeyRes) {
        logger.info("翼支付交易查询接口,param:{}", param);
        ParamValidUtil.checkTradeRefundParam(param, configure);
        try {
            //生成数字签名
            String mac = TianyiPayService.getTradeRefundMac(param);
            param.setMac(mac);
            Map<String, String> queryParam = getMap(param, mac);
            String responseStr = HttpUtil.sendTradePost(queryParam, configure);
            TianyiResp result = (TianyiResp) JSONObject.parseObject(responseStr, TianyiResp.class).getResult();
            if (result.isSuccess()){
                return true;
            }
            return false;
        } catch (Exception e) {
            logger.info("翼支付交易查询接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_PUBLICKEY_FAIL);
        }
    }

    private static Map<String, String> getMap(RefundParam param, String mac) {
        Map<String, String> queryParam = new HashMap<String, String>();//组装请求参数

        queryParam.put("merchantId", param.getMerchantId());
        queryParam.put("merchantPwd", param.getMerchantPwd());
        queryParam.put("oldOrderNo", param.getOldOrderNo());
        queryParam.put("oldOrderReqNo", param.getOldOrderReqNo());
        queryParam.put("refundReqNo", param.getRefundReqNo());
        queryParam.put("refundReqDate", param.getRefundReqDate());
        queryParam.put("transAmt", param.getTransAmt());
        queryParam.put("channel", param.getChannel());
        queryParam.put("ledgerDetail", param.getLedgerDetail());
        queryParam.put("mac", mac);
        return queryParam;
    }

    public static String getTradeQuerySign(PayQueryParam param) {
        return MD5.MD5Encode("MERCHANTID=" + param.getMerchantId() + "&ORDERREQNQ=" + param.getOrderReqNo() + "&ORDERDATE=" + param.getOrderDate() + "&KEY=" + param.getKey());
    }

    private static String getSign(PayDetailParam param) {
        StringBuilder md5Builder = new StringBuilder();
        md5Builder.append("SERVICE=").append("mobile.securitypay.pay")
                .append("&MERCHANTID=").append(param.getMerchantId())
                .append("&MERCHANTPWD=").append(param.getMerchantPwd())
                .append("&SUBMERCHANTID=").append("")
                .append("&BACKMERCHANTURL=").append(configure.getBackMerchantUrl())
                .append("&ORDERSEQ=").append(param.getOrderSeq())
                .append("&ORDERREQTRANSEQ=").append(param.getOrderReqTranseq())
                .append("&ORDERTIME=").append(param.getOrderTime())
                .append("&ORDERVALIDITYTIME=").append(param.getOrderValidityTime())
                .append("&CURTYPE=").append(param.getCurType())
                .append("&ORDERAMOUNT=").append(param.getOrderAmount())
                .append("&SUBJECT=").append(param.getSubject())
                .append("&PRODUCTID=").append(param.getProductId())
                .append("&PRODUCTDESC=").append(param.getProductDesc())
                .append("&CUSTOMERID=").append(param.getCustomerId())
                .append("&SWTICHACC=").append(param.getSwtichAcc())
                .append("&KEY=").append(param.getKey());
        logger.info("签名前原串：" + md5Builder.toString());
        return MD5.MD5Encode(md5Builder.toString());
    }

    private static String getReqParam() {
        JSONObject jsonParams = new JSONObject();
        jsonParams.put("keyIndex", "");
        jsonParams.put("encryKey", "");
        jsonParams.put("encryStr", "");
        jsonParams.put("interCode", INTERCODE);
        return jsonParams.toJSONString();
    }


}
