package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.webank.config.WwConfigure;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;

/**
 * 微众 微信刷卡支付总请求参数
 * Created by sujuan on 2017/2/17.
 */
public class WwPunchCardReqData extends BaseData{

    //商户号
    private String merchant_code;

    //终端号
    private String terminal_code;

    //商户订单号
    private String terminal_serialno;

    //金额
    private String amount;

    //产品
    private String product ;
;
    //用户openid
    private String sub_openid;

    //商户appid
    private String sub_appid ;

    //商户标记
    private String goods_tag ;

    //授权码
    private String auth_code ;

    //附加信息
    private String attach ;

    //签名
    private String sign ;

    public WwPunchCardReqData() {

    }

    public WwPunchCardReqData(WwPunchCardPayParam reqData) {
        setMerchant_code(reqData.getMerchantCode());
        setTerminal_code(reqData.getTerminalCode());
        setTerminal_serialno(reqData.getOrderNo());
        setAmount(reqData.getAmount());
        setProduct(reqData.getProduct());
        setSub_openid(reqData.getOpenid());
        setSub_appid(reqData.getSubAppid());
        setGoods_tag(reqData.getGoodsTag());
        setAuth_code(reqData.getAuthCode());
        setAttach(reqData.getAttach());
    }

    public String getMerchant_code() {
        return merchant_code;
    }

    public void setMerchant_code(String merchant_code) {
        this.merchant_code = merchant_code;
    }

    public String getTerminal_code() {
        return terminal_code;
    }

    public void setTerminal_code(String terminal_code) {
        this.terminal_code = terminal_code;
    }

    public String getTerminal_serialno() {
        return terminal_serialno;
    }

    public void setTerminal_serialno(String terminal_serialno) {
        this.terminal_serialno = terminal_serialno;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "WwPunchCardReqData{" +
                "merchant_code='" + merchant_code + '\'' +
                ", terminal_code='" + terminal_code + '\'' +
                ", terminal_serialno='" + terminal_serialno + '\'' +
                ", amount='" + amount + '\'' +
                ", product='" + product + '\'' +
                ", sub_openid='" + sub_openid + '\'' +
                ", sub_appid='" + sub_appid + '\'' +
                ", goods_tag='" + goods_tag + '\'' +
                ", auth_code='" + auth_code + '\'' +
                ", attach='" + attach + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
