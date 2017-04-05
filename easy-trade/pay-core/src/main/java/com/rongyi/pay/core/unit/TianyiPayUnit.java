package com.rongyi.pay.core.unit;

import com.alibaba.fastjson.JSONObject;
import com.rongyi.pay.core.Exception.TianyiException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.ParamValidUtil;
import com.rongyi.pay.core.tianyi.param.PublicKeyRes;
import com.rongyi.pay.core.tianyi.param.TianyiOrderParam;
import com.rongyi.pay.core.tianyi.param.TianyiResp;
import com.rongyi.pay.core.tianyi.service.TianyiPayService;
import com.rongyi.pay.core.tianyi.util.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yangyang on 2017/4/1.
 */
public class TianyiPayUnit {

    private static final String INTERCODE = "INTER.SYSTEM.001";

    private static final Logger logger = LoggerFactory.getLogger(TianyiPayUnit.class);

    //微众微信支付配置信息
    private static TianyiConfigure configure = TianyiConfigure.getInstance() ;

    /**
     * 翼支付下单接口
     * @param param
     * @return
     */
    public static boolean order(TianyiOrderParam param){
        logger.info("翼支付下单接口，param:{},config:{}",param,configure);
        try {
            ParamValidUtil.checkAndSetOrderParam(param, configure);
            String responseStr = TianyiPayService.order(param, configure);
            if (responseStr != null && "00".equals((responseStr.split("&"))[0])){
                return true;
            }
        }catch (Exception e){
            logger.info("翼支付下单接口失败 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_ORDER_FAIL);
        }
        return false;
    }

    /**
     * 翼支付获取公钥接口
     * @param param
     * @return
     */
    public static PublicKeyRes getPublicKey(TianyiOrderParam param){
        logger.info("翼支付获取公钥接口,param:{}",param);
        String requestBody = getReqParam();
        PublicKeyRes res = new PublicKeyRes();
        try {
            String responseStr = HttpUtil.doPost(configure.getPublicKeyUrl(), requestBody);
            TianyiResp result = (TianyiResp) JSONObject.parseObject(responseStr, TianyiResp.class).getResult();
            if (result != null && result.isSuccess()){
                PublicKeyRes publicKeyRes = JSONObject.parseObject(result.toString(), PublicKeyRes.class);
                return publicKeyRes;
            }
            return null;
        }catch (Exception e){
            logger.info("翼支付获取公钥接口 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new TianyiException(ConstantEnum.EXCEPTION_TIANYI_PUBLICKEY_FAIL);
        }
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
