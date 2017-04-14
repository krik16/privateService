package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class PayDetailParam extends BaseData {

    //接口名称-M
    private String service = "mobile.securitypay.pay";

    //签约商户号-M
    private String merchantId;

    //签约商户密码-M
    private String merchantPwd;

    //签约子商户号-O
    private String submerchantId;

    //支付结果前台通知地址-M
    private String beforeMerchantUrl;

    //支付结果后台通知地址-M
    private String backMerchantUrl;

    //前面方式:MD5\RSA\CA-M
    private String signType = "MD5";

    //MAC签名，请参见"8签名机制"-M
    private String sign;

    //接入渠道（教父助手：01，微信：02，易信03）
    private String wapChannel;

    //收银台语言-O
    private String userLanguage = "zh";

    //扩展字段-O
    private String remark;

    //订单号-M
    private String orderSeq;

    //流水号-M
    private String orderReqTranseq;

    //订单请求时间格式yyyyMMddHHmmss-M
    private String orderTime;

    //订单有效时间格式yyyyMMddHHmmss-O
    private String orderValidityTime;

    //订单金额/积分扣减 （单位元，保留小数点后2位）-M
    private String orderAmount;

    //币种（默认填RMB）-M
    private String curType = "RMB";

    //业务标识，默认值为04（纯业务支付）-M
    private String productId = "04";

    //产品描述-M
    private String productDesc;

    //商品的标题-M
    private String subject;

    //产品金额 -M
    private String productAmount;

    //附加金额 如0.01-M
    private String attachAmount = "0";

    //附加信息-O
    private String attach;

    //分账明细，分账商户必填，格式见说明 -O
    private String divDetails;

    //翼支付账户号-O
    private String accountId;

    //用户手机号-M
    private String customerId;

    //用户IP-O
    private String userIp;

    //业务类型，默认“04”-M
    private String busiType = "04";

    //是否可切换用户true/false-M
    private String swtichAcc;

    //城市代码-O
    private String cityCode;

    //省份代码-O
    private String provinceCode;

    //免登录信息-翼支付帐号-O
    private String tid;

    //免登录信息-RSA 公钥索引-O
    private String key_index;

    //免登录信息-token令牌-O
    private String key_tid;

    //商户key
    private String key;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantPwd() {
        return merchantPwd;
    }

    public void setMerchantPwd(String merchantPwd) {
        this.merchantPwd = merchantPwd;
    }

    public String getSubmerchantId() {
        return submerchantId;
    }

    public void setSubmerchantId(String submerchantId) {
        this.submerchantId = submerchantId;
    }

    public String getBeforeMerchantUrl() {
        return beforeMerchantUrl;
    }

    public void setBeforeMerchantUrl(String beforeMerchantUrl) {
        this.beforeMerchantUrl = beforeMerchantUrl;
    }

    public String getBackMerchantUrl() {
        return backMerchantUrl;
    }

    public void setBackMerchantUrl(String backMerchantUrl) {
        this.backMerchantUrl = backMerchantUrl;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getWapChannel() {
        return wapChannel;
    }

    public void setWapChannel(String wapChannel) {
        this.wapChannel = wapChannel;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(String orderSeq) {
        this.orderSeq = orderSeq;
    }

    public String getOrderReqTranseq() {
        return orderReqTranseq;
    }

    public void setOrderReqTranseq(String orderReqTranseq) {
        this.orderReqTranseq = orderReqTranseq;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderValidityTime() {
        return orderValidityTime;
    }

    public void setOrderValidityTime(String orderValidityTime) {
        this.orderValidityTime = orderValidityTime;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCurType() {
        return curType;
    }

    public void setCurType(String curType) {
        this.curType = curType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public String getAttachAmount() {
        return attachAmount;
    }

    public void setAttachAmount(String attachAmount) {
        this.attachAmount = attachAmount;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getDivDetails() {
        return divDetails;
    }

    public void setDivDetails(String divDetails) {
        this.divDetails = divDetails;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getSwtichAcc() {
        return swtichAcc;
    }

    public void setSwtichAcc(String swtichAcc) {
        this.swtichAcc = swtichAcc;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getKey_index() {
        return key_index;
    }

    public void setKey_index(String key_index) {
        this.key_index = key_index;
    }

    public String getKey_tid() {
        return key_tid;
    }

    public void setKey_tid(String key_tid) {
        this.key_tid = key_tid;
    }
}
