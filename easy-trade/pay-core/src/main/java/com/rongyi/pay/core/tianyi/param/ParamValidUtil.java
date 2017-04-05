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

    /**
     * 校验下单参数
     * @param param
     * @param configure
     */
    public static void checkAndSetOrderParam(TianyiOrderParam param, TianyiConfigure configure) {
        if (param == null || configure == null){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"param or configure");
        }
        if (StringUtils.isBlank(configure.getMerchantId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"merchantId");
        }
        param.setMerchantId(configure.getMerchantId());
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
}
