package com.rongyi.pay.core.unit;

import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.TianyiOrderParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yangyang on 2017/4/1.
 */
public class TianyiPayUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(TianyiPayUnit.class);

    //微众微信支付配置信息
    private static TianyiConfigure configure = TianyiConfigure.getInstance() ;

    /**
     * 翼支付下单接口
     * @param param
     * @return
     */
    public static boolean order(TianyiOrderParam param){
        return false;
    }

    /**
     * 翼支付下单接口
     * @param param
     * @return
     */
    public static boolean order1(TianyiOrderParam param){
        return false;
    }

}
