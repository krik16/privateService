package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.util.WechatConfigure;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

/**
 * 这里定义服务层需要请求器标准接口
 * conan
 * 2016/10/11 14:49
 **/
public interface IServiceRequest {

    //Service依赖的底层https请求器必须实现这么一个接口
    String sendPost(String api_url,Object xmlObj,WechatConfigure wechatConfigure) throws UnrecoverableKeyException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException;

}
