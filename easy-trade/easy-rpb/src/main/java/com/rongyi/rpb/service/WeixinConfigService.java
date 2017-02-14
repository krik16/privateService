package com.rongyi.rpb.service;

import com.rongyi.rpb.common.pay.weixin.util.Configure;

/**
 * Created by kejun on 2016/1/13.
 */
public interface WeixinConfigService {

    Configure initConfigure(String appId,Integer weixinPayType,String useId);

    Configure initConfigure(Integer weixinMchId);

}
