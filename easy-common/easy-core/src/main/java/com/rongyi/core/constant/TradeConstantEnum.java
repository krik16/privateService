package com.rongyi.core.constant;

/**
 * kejun
 * 2016/6/1 18:22
 **/
public enum  TradeConstantEnum {


    ALI_QUERY_ORDER_ERROR_CODE("TRADE_NOT_EXIST","交易不存在！"),

    EXCEPTION_PARAM_NULL("1020101","参数为空"),
    EXCEPTION_VALIDATE_SIGN("1020102","签名验证错误"),
    EXCEPTION_PAY_SIGN("1020103","获取支付签名失败"),
    EXCEPTION_WEIXIN_REFUND("1020104","退款申请失败"),
    EXCEPTION_ORDER_VALIDATE("1020105","订单信息验证失败"),
    EXCEPTION_THIRD_PAY_NOTIFY("1020106","通知结果处理失败"),
    EXCEPTION_THIRD_REFUND_NOTIFY("1020107","退款结果处理失败"),
    EXCEPTION_TIME_OVER("1020108","请求已失效，请重新发起请求"),

    PHP_SCORE_CHANNEL_TOKEN("NOTICECHANNEL","bb1b9a9d989b76b9860a1084ab6cbd3a"),//php积分商城端接口请求加密使用的channel和token
    PHP_SCORE_PUBLIC_KEY("publicKey","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDBD+TuKfbtDEW+Y3Tf0pjMQPTAonKTj6Hsm74TjXuWJzsIywIOLKJPSLoQ5pMhXO+RtgKYEBr1Z9z7r/VhY3LZF78w/jMpIBmIOD9+an4NUuUovCpeg4jIZY6bpgpJuxwWlaooXeG9srHOSGl6jVKnsZwD89R+BbU7WQ/gTzPTnwIDAQAB"),//php积分商城端接口请求加密使用的publicKey

    //交易中心提供给php积分商城端接口加密使用的channel和token
    SCORE_STORE_CHANNEL_TOKEN("STORECHANNEL","ec037d3911591c55b84b8e0918890989"),
    //交易中心提供的第三方接口加密privateKey
    PRIVATE_KEY("privateKey","MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAI4h+l2rYP4iUbGNJYk0h2KzwTXFE3EDfjfC9k5YUwei07nl33vc4PxMkFjxgx0jVIuPsHpFqcADEQIDni+pN7+H1L3kLUdVTVSVkqpMpaW1q0ArXvMSLBkAL30EZFhj4HPmZZ8RNrbtGU4wc2RuXJUXcrElsnZdLsGBgyCoXFLHAgMBAAECgYBnmuUBupctKJ8cKaMe7Kdzj0xbgZi2XLF4vCkG2uNLQanMbIAHre5iev0NmJ7WcpaCVO9zcaxXRuTy7ug0HcmAO8HikL2HzV1l2nYwoQagoEvr/rBG7Mc2Ov4Wk4tAScmARo7U99pPZfZDUUTjzQHRJJ/D057vZvQOdWt5fiNhQQJBAOrqFaSKbMjO/TrDeqnSQzmDDSULGXfnn+XQFvGc6s7nMPJIJWYmvCfFnzJyzkyBC7d3GFAbZ56eXwKrZUIqCm8CQQCa4++BomwOeEd+U770pc4CbIL2viNl7s1U0xjl58vIqml446VRNcuRs7/ByjMicvblPYH3YOVtwaKZoFP3SUkpAkA91d5akIFwHmQz6q7IMuu1INT98j0C/fpuAOd5NAfu7JZKwEjv6bRPd8qe+e9p3fIamgPRWlVdQGzcBAfEcdKLAkBrOaofSwqVBc0wddc20+WGpgoPuFcXBLcepriQx+O6OcakSquySZRwfEgeZtT5Xy7uSaNEVs7dKXRf967I/PHpAkBsv8SUC63K/gwiRfeJLtwZofXPa3kGzv/zfGdkZsBC4SN9M5VKi9UvJac1638VWoPsYfO9Nik5mhu0mYHhOej6"),
    //交易中心提供的第三方接口加密publicKey
    PUBLIC_KEY("publicKey","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCOIfpdq2D+IlGxjSWJNIdis8E1xRNxA343wvZOWFMHotO55d973OD8TJBY8YMdI1SLj7B6RanAAxECA54vqTe/h9S95C1HVU1UlZKqTKWltatAK17zEiwZAC99BGRYY+Bz5mWfETa27RlOMHNkblyVF3KxJbJ2XS7BgYMgqFxSxwIDAQAB");


    private Object code;

    private Object value;

    private TradeConstantEnum(Object code, Object value) {
        this.code = code;
        this.value = value;
    }


    /**
     * Description: 获取code int类型值,请确保该值可转换为int值，否则会类型转换异常
     **/
    public Integer getCodeInt() {
        return Integer.valueOf(code.toString());
    }

    /**
     * Description: 获取code String类型值
     **/
    public String getCodeStr() {
        return code.toString();
    }


    /**
     * Description:  获取value int类型值,请确保该值可转换为int值，否则会类型转换异常
     **/
    public Integer getValueInt() {
        return Integer.valueOf(value.toString());
    }

    /**
     * Description: 获取value String类型值
     **/
    public String getValueStr() {
        return value.toString();
    }

    /**
     * Description: 获取code byte类型值,请确保该值可转换为byte值，否则会类型转换异常
     **/
    public Byte getCodeByte() {
        return Integer.valueOf(code.toString()).byteValue();
    }

    /**
     * Description:  获取value byte类型值,请确保该值可转换为byte值，否则会类型转换异常
     **/
    public Byte getValueByte() {
        return Integer.valueOf(value.toString()).byteValue();
    }

    public Object getCode() {
        return code;
    }


    public Object getValue() {
        return value;
    }
}
