package com.rongyi.rpb.common.pay.weixin.service;

import com.rongyi.rpb.common.pay.weixin.model.RedPackReqData;
import com.rongyi.rpb.common.pay.weixin.util.Configure;

/**
 * 发送红包服务
 */
public class RedPackService extends BaseService {

    public RedPackService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(Configure.SENDREDPACK_API);
    }

    /**
     * 请求撤销服务
     *
     * @param redPackReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的XML数据
     * @throws Exception
     */
    public String request(RedPackReqData redPackReqData, Configure configure) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        return sendPost(redPackReqData, configure);
    }

}
