package com.rongyi.pay.core.webank.model.req;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.webank.param.WwScanPayParam;
import com.rongyi.pay.core.wechat.util.RandomStringGenerator;

/**
 * 微众微信公众号支付请求参数
 * Created by sujuan on 2017/3/24.
 */
public class WwScanPayReqData extends BaseData{

    //接口类型
    private String Service ="pay.weixin.jspay";

    //版本号
    private String version = "2.0";

    //字符集
    private String charset = "UTF-8";

    //签名方式
    private String sign_type = "MD5";

    //商户号
    private String mch_id ;

    //是否原生态
    private String is_raw ;

    //商户订单号
    private String out_trade_no ;

    //设备号
    private String device_info = "web";

    //商品描述
    private String body ;

    //用户openid
    private String sub_openid ;

    //商户appid
    private String sub_appid;

    //附加信息
    private String attach ;

    //总金额
    private int total_fee ;

    //终端ID
    private String mch_create_ip = "218.1.20.94";

    //通知地址
    private String notify_url ;

    //订单生成时间
    private String time_start ;

    //订单超时时间
    private String time_expire ;

    //商品标记
    private String goods_tag ;

    //随机字符串
    private String nonce_str ;

    //是否限制信用卡
    private String limit_credit_pay ;

    //签名
    private String sign ;

    public WwScanPayReqData(){

    }

    public WwScanPayReqData(WwScanPayParam param,String notifyUrl) {
        setMch_id(param.getMchId());
        setOut_trade_no(param.getOutTradeNo());
        setBody(param.getBody());
        setSub_openid(param.getSubOpenid());
        setSub_appid(param.getSubAppid());
        setAttach(param.getAttach());
        setTotal_fee(param.getTotalFee());
        setNotify_url(notifyUrl);
        setTime_start(param.getTimeStart());
        setTime_expire(param.getTimeExpire());
        setGoods_tag(param.getGoodsTag());
        setNonce_str(RandomStringGenerator.getRandomStringByLength(32));
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

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getIs_raw() {
        return is_raw;
    }

    public void setIs_raw(String is_raw) {
        this.is_raw = is_raw;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSub_openid() {
        return sub_openid;
    }

    public void setSub_openid(String sub_openid) {
        this.sub_openid = sub_openid;
    }

    public String getSub_appid() {
        return sub_appid;
    }

    public void setSub_appid(String sub_appid) {
        this.sub_appid = sub_appid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public String getMch_create_ip() {
        return mch_create_ip;
    }

    public void setMch_create_ip(String mch_create_ip) {
        this.mch_create_ip = mch_create_ip;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getLimit_credit_pay() {
        return limit_credit_pay;
    }

    public void setLimit_credit_pay(String limit_credit_pay) {
        this.limit_credit_pay = limit_credit_pay;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
