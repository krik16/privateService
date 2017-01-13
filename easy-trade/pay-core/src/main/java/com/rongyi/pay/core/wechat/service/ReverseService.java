package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.ReverseReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

/**
 * 请求支付撤销服务
 * conan
 * 2016/10/11 14:49
 **/
public class ReverseService extends BaseService{

    public ReverseService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(WechatConfigure.REVERSE_API);
    }

    /**
     * 请求撤销服务
     * @param reverseReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的XML数据
     * @throws Exception
     */
    public String request(ReverseReqData reverseReqData,WechatConfigure wechatConfigure) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
       return sendPost(reverseReqData, wechatConfigure);
    }

}
