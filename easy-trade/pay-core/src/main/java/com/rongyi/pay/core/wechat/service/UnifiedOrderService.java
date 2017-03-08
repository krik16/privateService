/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月2日上午10:39:20
 * @Description: TODO
 *
 **/

package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.UnifedOrderReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

/**
 * 统一下单服务
 * conan
 * 2016/10/11 14:49
 **/
public class
        UnifiedOrderService extends BaseService{
	
    public UnifiedOrderService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(WechatConfigure.UNIFIED_ORDER_API);
    }

    /**
     * 统一下单服务
     * @param unifedOrderReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的数据
     * @throws Exception
     */
    public String request(UnifedOrderReqData unifedOrderReqData,WechatConfigure wechatConfigure) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        return sendPost(unifedOrderReqData, wechatConfigure);
    }

}
