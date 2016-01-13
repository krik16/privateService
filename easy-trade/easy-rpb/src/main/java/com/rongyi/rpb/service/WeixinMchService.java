package com.rongyi.rpb.service;

import com.rongyi.easy.rpb.domain.WeixinMch;

/**
 * Created by kejun on 2016/1/13.
 */
public interface WeixinMchService {

    void insert(WeixinMch weixinMch);

    void update(WeixinMch weixinMch);

    WeixinMch selectById(Integer id);

    WeixinMch selectByPublicAndUserId(String publicCode,String userId);
}
