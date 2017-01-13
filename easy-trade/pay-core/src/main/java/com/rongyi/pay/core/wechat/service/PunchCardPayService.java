package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.PunchCardPayReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

/**
 * 请求刷卡服务
 * conan
 * 2016/10/11 14:49
 **/
public class PunchCardPayService extends BaseService{

    public PunchCardPayService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(WechatConfigure.PAY_API);
    }

    /**
     * 请求刷卡服务
     * @param punchCardPayReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的数据
     * @throws Exception
     */
    public String request(PunchCardPayReqData punchCardPayReqData,WechatConfigure wechatConfigure) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        return sendPost(punchCardPayReqData, wechatConfigure);
    }
}
