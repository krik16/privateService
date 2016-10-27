package com.rongyi.rpb.common.pay.weixin.model;

import com.rongyi.rpb.common.pay.weixin.util.Configure;
import com.rongyi.rpb.common.pay.weixin.util.RandomStringGenerator;
import com.rongyi.rpb.common.pay.weixin.util.Signature;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 红包发送请求接口
 */
public class RedPackReqData {

    //每个字段具体的意思请查看API文档
    private String nonce_str = "";
    private String sign = "";
    private String mch_billno = "";//商户订单号
    private String mch_id = "";
    private String wxappid = "";
    private String send_name = "";//商户名称
    private String re_openid = "";//用户openid
    private int total_amount;//付款金额
    private int total_num = 1;//红包发放总人数
    private String wishing = "";//红包祝福语
    private String client_ip = "";//调用接口的机器Ip地址
    private String act_name = "";//活动名称
    private String remark = "";//备注

    public RedPackReqData(){}
    /**
     * 请求支付查询服务
     * @param mchBillno 是微信系统为每一笔支付交易分配的订单号，通过这个订单号可以标识这笔交易，它由支付订单API支付成功时返回的数据里面获取到。建议优先使用
     * @param sendName 商户名称
     * @param reOpenid 用户openId
     * @param totalAmount 付款金额
     * @param wishing 祝福语
     * @param actName 活动名称
     * @param remark 备注
     */
    public RedPackReqData(String mchBillno, String sendName,String reOpenid,int totalAmount,String wishing,
                          String actName,String remark,Configure configure){
        //--------------------------------------------------------------------
        //以下是测试数据，请商户按照自己的实际情况填写具体的值进去
        //--------------------------------------------------------------------

        //微信分配的公众号ID（开通公众号之后可以获取到）
        setWxappid(configure.getAppID());

        //微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）
        setMch_id(configure.getMchID());

        setClient_ip(configure.getIp());

        setMch_billno(mchBillno);

        setSend_name(sendName);

        setRe_openid(reOpenid);

        setTotal_amount(totalAmount);

        setWishing(wishing);

        setAct_name(actName);

        setRemark(remark);

        //随机字符串，不长于32 位
        setNonce_str(RandomStringGenerator.getRandomStringByLength(32));

        //根据API给的签名规则进行签名
        String sign = Signature.getSign(toMap(), configure.getKey());
        System.err.println("sign="+sign);
        setSign(sign);//把签名数据设置到Sign这个属性中


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

    public String getMch_billno() {
        return mch_billno;
    }

    public void setMch_billno(String mch_billno) {
        this.mch_billno = mch_billno;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getWxappid() {
        return wxappid;
    }

    public void setWxappid(String wxappid) {
        this.wxappid = wxappid;
    }

    public String getSend_name() {
        return send_name;
    }

    public void setSend_name(String send_name) {
        this.send_name = send_name;
    }

    public String getRe_openid() {
        return re_openid;
    }

    public void setRe_openid(String re_openid) {
        this.re_openid = re_openid;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public int getTotal_num() {
        return total_num;
    }

    public void setTotal_num(int total_num) {
        this.total_num = total_num;
    }

    public String getWishing() {
        return wishing;
    }

    public void setWishing(String wishing) {
        this.wishing = wishing;
    }

    public String getClient_ip() {
        return client_ip;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
    }

    public String getAct_name() {
        return act_name;
    }

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<String, Object>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if(obj!=null){
                    map.put(field.getName(), obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
