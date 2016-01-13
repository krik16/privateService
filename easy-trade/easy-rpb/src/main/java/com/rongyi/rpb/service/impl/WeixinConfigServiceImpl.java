package com.rongyi.rpb.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.rpb.domain.WeixinMch;
import com.rongyi.rpb.common.pay.weixin.util.Configure;
import com.rongyi.rpb.service.WeixinConfigService;
import com.rongyi.rpb.service.WeixinMchService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kejun on 2016/1/13.
 */
@Service
public class WeixinConfigServiceImpl extends BaseServiceImpl implements WeixinConfigService{

    @Autowired
    WeixinMchService weixinMchService;

    @Override
    public Configure initConfigure(String publicCode, String userId) {
        Configure configure = new Configure();
        if (StringUtils.isNotBlank(publicCode) && StringUtils.isNotBlank(userId)) {
            WeixinMch weixinMch = weixinMchService.selectByPublicAndUserId(publicCode, userId);
            configure.init(weixinMch);
        }
        return configure;
    }

    @Override
    public Configure initConfigure(Integer weixinMchId) {
        Configure configure = new Configure();
        if (weixinMchId != null && weixinMchId > 0) {
            WeixinMch weixinMch = weixinMchService.selectById(weixinMchId);
            configure.init(weixinMch);
        }
        return configure;
    }
}
