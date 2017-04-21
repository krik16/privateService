package com.rongyi.pay.core.webank.model.req;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.webank.param.WwScanQueryParam;
import com.rongyi.pay.core.wechat.util.RandomStringGenerator;

/**
 * 微众微信公众号支付订单查询请求参数
 * Created by sujuan on 2017/3/28.
 */
public class WwScanQueryReqData extends BaseData{
    //商户号 必传
    private String mch_id;

    //商户订单号 （商户订单号 微众银行订单号 微信订单号必传其一）
    private String out_trade_no;

    //微众银行订单号
    private String orderid ;

    //微信支付订单号
    private String transaction_id ;

    //接口类型
    private String Service = "pay.weixin.jspay";

    //版本号
    private String version ="2.0";

    //字符集
    private String charset = "UTF-8";

    //签名方式
    private String sign_type = "MD5";

    //随机字符串
    private String nonce_str ;

    //签名
    private String sign ;

    public WwScanQueryReqData(){

    }

    public WwScanQueryReqData(WwScanQueryParam param) {
        setMch_id(param.getMchId());
        setOut_trade_no(param.getOutTradeNo());
        setOrderid(param.getOrderid());
        setTransaction_id(param.getTransactionId());
        setNonce_str(RandomStringGenerator.getRandomStringByLength(32));
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
