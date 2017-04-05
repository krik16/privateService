package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class RefundParam extends BaseData{

    //商户代码-M
    private String merchantId;

    //商户字代码-O
    private String subMerchantId;

    //商户调用密码
    private String merchantPwd;

    private String oldOrderNo;

    private String oldOrderReqNo;

    private String refundReqNo;

    private String refundReqDate;

    private String transAmt;

    private String ledgerDetail;

    private String channel;

    private String mac;

    private String bgUrl;
}
