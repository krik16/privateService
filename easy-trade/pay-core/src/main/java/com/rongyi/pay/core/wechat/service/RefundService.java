package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.RefundReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

/**
 * 请求退款服务
 * conan
 * 2016/10/11 14:49
 **/
public class RefundService extends BaseService{

    public RefundService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(WechatConfigure.REFUND_API);
    }

    /**
     * 请求退款服务
     * @param refundReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的XML数据
     * @throws Exception
     */
    public String request(RefundReqData refundReqData,WechatConfigure wechatConfigure) throws Exception {
    	
        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
       return sendPost(refundReqData, wechatConfigure);
    }

}
