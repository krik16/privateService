package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.RefundQueryReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

/**
 * 退款结果查询服务
 * conan
 * 2016/10/11 14:49
 **/
public class RefundQueryService extends BaseService{

    public RefundQueryService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(WechatConfigure.REFUND_QUERY_API);
    }

    /**
     * 请求退款查询服务
     * @param refundQueryReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的XML数据
     * @throws Exception
     */
    public String request(RefundQueryReqData refundQueryReqData,WechatConfigure wechatConfigure) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        return sendPost(refundQueryReqData, wechatConfigure);
    }




}
