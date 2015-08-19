package com.rongyi.rpb.common.util.orderSign.weixinSign.scan;

/**	
 * @Author:  柯军
 * @Description: 扫码支付退款 
 * @datetime:2015年6月25日下午3:17:35
 *
 **/
public class RefundService extends BaseService{

    public RefundService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(Configure.REFUND_API);
    }

    /**
     * 请求退款服务
     * @param refundReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的XML数据
     * @throws Exception
     */
    public String request(RefundReqData refundReqData) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        String responseString = sendPost(refundReqData);

        return responseString;
    }

}
