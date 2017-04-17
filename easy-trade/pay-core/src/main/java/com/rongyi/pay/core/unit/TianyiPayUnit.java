package com.rongyi.pay.core.unit;

import com.alibaba.fastjson.JSONObject;
import com.rongyi.pay.core.Exception.TianyiException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.*;
import com.rongyi.pay.core.tianyi.service.TianyiPayService;
import com.rongyi.pay.core.tianyi.util.*;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 天翼支付接口
 * Created by yangyang on 2017/4/1.
 */
public class TianyiPayUnit {

    private static final String INTERCODE = "INTER.SYSTEM.001";

    private static final Logger logger = LoggerFactory.getLogger(TianyiPayUnit.class);

    //微众微信支付配置信息
    private static TianyiConfigure configure = TianyiConfigure.getInstance();


    /**
     * 翼支付总接口
     *
     * @param param 总请求参数，由调用方提供
     * @return 返回h5url
     */
    public static String tianyiPay(TianyiParam param) {
        logger.info("翼支付总接口，param:{},config:{}", param, configure);
        try {
            ParamValidUtil.checkAndSetTianyiParam(param, configure);
            boolean orderResult = order(param.getTianyiOrderParam());
            if (orderResult){
                PublicKeyRes publicKey = getPublicKey(param.getTianyiOrderParam());
                logger.info("翼支付总接口,publicKey="+publicKey);
                if (publicKey == null){
                    throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_PAY_FAIL);
                }
                String h5Url = getH5Url(param.getPayDetailParam(), publicKey);
                if (StringUtils.isNotBlank(h5Url)){
                    return h5Url;
                }
            }
        } catch (Exception e) {
            logger.info("翼支付下单接口失败 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
        }
        throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_PAY_FAIL);
    }

    /**
     * 翼支付下单接口
     *
     * @param param 下单参数
     * @return 失败或成功
     */
    public static boolean order(TianyiOrderParam param) {
        logger.info("翼支付下单接口，param:{},config:{}", param, configure);
        try {
            ParamValidUtil.checkAndSetOrderParam(param, configure);
            String responseStr = TianyiPayService.order(param, configure);
            if (responseStr != null && "00".equals((responseStr.split("&"))[0])) {
                return true;
            }
            logger.info("翼支付下单接口 error,responseStr="+responseStr);
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
     * @param param 下单参数
     * @return 公钥对象
     */
    public static PublicKeyRes getPublicKey(TianyiOrderParam param) {
        logger.info("翼支付获取公钥接口,param:{}", param);
        String requestBody = getReqParam();
        try {
            String responseStr = HttpUtil.doPost(configure.getPublicKeyUrl(), requestBody);
            if (StringUtils.isBlank(responseStr)){
                return null;
            }
            TianyiResp result = JSONObject.parseObject(responseStr, TianyiResp.class);
            if (result != null && result.isSuccess() && result.getResult() != null) {
                return JSONObject.parseObject(result.getResult().toString(), PublicKeyRes.class);
            }
            logger.info("翼支付获取公钥接口 error,result="+result);
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
     * @param param 支付详情参数
     * @return String
     */
    public static String getH5Url( PayDetailParam param, PublicKeyRes publicKeyRes) {
        logger.info("翼支付拼接url接口,param:{}", param);
        ParamValidUtil.checkAndSetPayParam(param, configure);
        try {
            //生成数字签名
            String sign = getSign(param);
            String payStr = TianyiPayService.getPayStr(param, configure, sign);
            logger.info("翼支付原始数据："+payStr);
            String key = AES256.getStringRandom(32);
            String encryStr = AES256.AES_Encode(payStr, key);
            key = RSA.encrypt(key, publicKeyRes.getPubKey(), SysConstants.SYS_CHARSET);
            String webUrl = configure.getPayUrl() + "?platform=wap_3.0" + "&encryStr=" + encryStr + "&keyIndex=" + publicKeyRes.getKeyIndex() + "&encryKey=" + key;
            webUrl = webUrl.replaceAll("\\+", "%2B");
            logger.info("唤起H5收银台的url：" + webUrl);
            return webUrl;
        } catch (Exception e) {
            logger.info("翼支付获取公钥接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_GETH5_FAIL);
        }
    }


    /**
     * 交易查询
     *
     * @param param 交易查询参数
     * @return TianyiTradeQueryRes
     */
    public static TianyiTradeQueryRes tradeQuery(PayQueryParam param) {
        logger.info("翼支付交易查询接口,param:{}", param);
        ParamValidUtil.checkTradeQueryParam(param, configure);
        try {
            //生成数字签名
            String mac = getTradeQuerySign(param);
            param.setMac(mac);
            String tradeQueryStr = TianyiPayService.getOrderQueryStr(param);
            String responseStr = HttpUtil.sendHttpRequest(configure.getPayQueryUrl(), tradeQueryStr);
            TianyiResp result = JSONObject.parseObject(responseStr, TianyiResp.class);
            if (result != null && result.isSuccess()  && result.getResult() != null){
                return JSONObject.parseObject(result.getResult().toString(), TianyiTradeQueryRes.class);
            }
            logger.info("翼支付交易查询接口 error,result="+result);
            return null;
        } catch (Exception e) {
            logger.info("翼支付交易查询接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_TRADEQUERY_FAIL);
        }
    }



    /**
     * 交易退款
     *
     * @param param 退款参数
     * @return boolean
     */
    public static boolean tradeRefund(RefundParam param) {
        logger.info("翼支付退款接口,param:{}", param);
        ParamValidUtil.checkTradeRefundParam(param, configure);
        try {
            //生成数字签名
            String mac = TianyiPayService.getTradeRefundMac(param);
            param.setMac(mac);
            Map<String, String> queryParam = getMap(param, mac);
            String responseStr = HttpUtil.sendTradePost(configure.getRefundUrl(), queryParam);
            if (StringUtils.isBlank(responseStr)){
                throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_TRADEREFUND_FAIL);
            }
            TianyiResp result = JSONObject.parseObject(responseStr, TianyiResp.class);
            if (result != null && result.isSuccess()){
                return true;
            }
            logger.info("翼支付退款接口 error,result="+result);
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_TRADEREFUND_FAIL);
        } catch (Exception e) {
            logger.info("翼支付退款接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_TRADEREFUND_FAIL);
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

    public static String getTradeQuerySign(PayQueryParam param) throws Exception {
        return CryptTool.md5Digest("MERCHANTID=" + param.getMerchantId() +"&ORDERNO=" + param.getOrderNo() + "&ORDERREQNO=" + param.getOrderReqNo() + "&ORDERDATE=" + param.getOrderDate() + "&KEY=" + param.getKey());
    }

    private static String getSign(PayDetailParam param) throws Exception {
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
        return CryptTool.md5Digest(md5Builder.toString());
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
