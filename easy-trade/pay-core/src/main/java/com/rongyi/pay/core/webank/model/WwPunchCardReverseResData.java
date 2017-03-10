package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众微信刷卡支付撤销订单接口请求参数
 * Created by sujuan on 2017/2/24.
 */
public class WwPunchCardReverseResData extends BaseData{
    private static final long serialVersionUID = -1820246793692451769L;
    //请求结果
    private Result result;

    //是否需要重发冲正 errno为1时 终端是否需要重调冲正接口 Y是 N否
    private String recall ;

    private String sign ;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getRecall() {
        return recall;
    }

    public void setRecall(String recall) {
        this.recall = recall;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
