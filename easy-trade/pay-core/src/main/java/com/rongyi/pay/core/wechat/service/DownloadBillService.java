package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.DownloadBillReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

/**
 * 微信支付对账单下载
 * conan
 * 2016/10/11 14:49
 **/
public class DownloadBillService extends BaseService{

    public DownloadBillService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(WechatConfigure.DOWNLOAD_BILL_API);
    }

    //ALL，返回当日所有订单信息，默认值
    public static final String BILL_TYPE_ALL = "ALL";

    //SUCCESS，返回当日成功支付的订单
    public static final String BILL_TYPE_SUCCESS = "SUCCESS";

    //REFUND，返回当日退款订单
    public static final String BILL_TYPE_REFUND = "REFUND";

    //REVOKED，已撤销的订单
    public static final String BILL_TYPE_REVOKE = "REVOKE";


    /**
     * 请求对账单下载服务
     * @param downloadBillReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的XML数据
     * @throws Exception
     */
    public String request(DownloadBillReqData downloadBillReqData,WechatConfigure wechatConfigure) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        return sendPost(downloadBillReqData, wechatConfigure);

    }

}
