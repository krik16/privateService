/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日下午3:45:21
 * @Description: TODO
 *
 **/

package com.rongyi.pay.core.constants;

/**
 * @Author:  柯军
 * @Description: 常量枚举
 * @datetime:2015年7月2日下午4:58:18
 *
 **/
public enum ConstantEnum {

	EXCEPTION_SYSTEM_ERROR("1019000","系统异常"),

	EXCEPTION_PARAM_NULL("1019101","参数不合法"),
	EXCEPTION_PARAM_NULL_SPECIFY("1019102","{}参数不能为空"),

	WEIXIN_REFUND_RESULT_SUCCESS("SUCCESS","退款成功!"),
	WEIXIN_REFUND_RESULT_PROCESSING("PROCESSING","微信退款处理中!"),
	WEIXIN_REFUND_RESULT_NOTSURE("NOTSURE","退款未确认,需重新发起退款!"),
	WEIXIN_REFUND_RESULT_CHANGE("CHANGE","退款转入代发，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，资金回流到商户的现金帐号，需要商户人工干预，通过线下或者财付通转账的方式进行退款!"),
	WEIXIN_REFUND_RESULT_FAIL("FAIL","退款失败!"),

	EXCEPTION_WEIXIN_SIGN_FAIL("1019104","微信支付签名生成失败"),
	EXCEPTION_WEIXIN_REFUND_QUERY_ORDER("1019105","微信退款查询失败"),
	EXCEPTION_WEIXIN_REFUND_FAIL("1019106","微信退款失败"),
	EXCEPTION_WEIXIN_ORDER_CLOSE("1019107","微信订单关闭失败"),
	EXCEPTION_WEIXIN_QUERY_ORDER("1019108","微信订单查询失败"),
	EXCEPTION_WEIXIN_PUNCH_CARD_FAIL("1019117","微信刷卡支付失败"),
	EXCEPTION_WEIXIN_SCAN_FAIL("1019118","微信扫码支付失败"),
	EXCEPTION_WEIXIN_REVERSE_SUCCESS("1019119","用户超时未支付,订单已关闭,请重新发起订单支付"),
	EXCEPTION_WEIXIN_OPENID_FAIL("1019120","获取用户微信openid失败"),
	EXCEPTION_WEIXIN_RERVERSE_FAIL("1019121","撤销订单失败"),

	EXCEPTION_ALI_PAY_SIGN_FAIL("1019201","支付宝支付签名生成失败"),
	EXCEPTION_ALI_QUERY_ORDER("1019202","支付宝订单查询失败"),
	EXCEPTION_ALI_AUTHORIZE_FAIL("1019203","支付宝授权信息获取失败"),
	EXCEPTION_ALI_REFUND_FAIL("1019204","支付宝退款失败"),
	EXCEPTION_ALI_PUNCH_CARD_PAY_FAIL("1019205","支付宝刷卡支付失败"),
	EXCEPTION_ALI_REFUND_QUERY_FAIL("1019206","支付宝刷退款查询失败"),

	EXCEPTION_CASH_PAY_FAIL("1019301","现金支付失败"),
	EXCEPTION_CASH_PAY_QUERY_FAIL("1019302","现金支付查询失败"),
	EXCEPTION_CASH_REFUND_FAIL("1019303","现金退款失败"),
	EXCEPTION_CASH_REFUND_QUERY_FAIL("1019304","现金退款查询失败"),



	EXCEPTION_APPLE_PAY_TN_FAIL("1019112","applePay生成支付流水号tn失败，请重新尝试"),
	EXCEPTION_APPLE_PAY_QUERY_FAIL("1019113","applePay支付交易查询失败"),
	EXCEPTION_APPLE_PAY_REFUND_FAIL("1019114","applePay发起退款申请失败"),
	EXCEPTION_APPLE_PAY_REFUND_NOTIFY_FAIL("1019116","applePay退款结果通知处理失败"),

	EXCEPTION_WEBANK_SIGN_FAIL("1019300","签名生成失败"),
	EXCEPTION_WEBANK_RES_FAIL("1019301","请求接口失败"),
	EXCEPTION_WEBANK_PUNCHCARD_FAIL("1019302", "刷卡支付失败"),
	EXCEPTION_WEBANK_PUNCHCARDQUERY_FAIL("1019303", "刷卡支付订单查询失败"),
	EXCEPTION_WEBANK_REVERSE_SUCCESS("1019304","用户超时未支付,订单已关闭,请重新发起订单支付"),
	EXCEPTION_WEBANK_PUNCHCARDREVERSE_FAIL("1019305", "刷卡支付撤销订单失败"),
	EXCEPTION_WEBANK_PUNCHCARDREFUND_FAIL("1019306", "刷卡支付退款失败"),
	EXCEPTION_WEBANK_PUNCHCARDREFUNDQUERY_FAIL("1019307", "刷卡支付退款失败"),
	EXCEPTION_WEBANK_ALI_TICKET_FAIL("1019308", "获取支付宝ticket失败"),


	EXCEPTION_TIANYI_ORDER_FAIL("1019309", "下单失败"),
	EXCEPTION_TIANYI_PUBLICKEY_FAIL("1019310", "获取公钥失败"),
	EXCEPTION_TIANYI_PAY_FAIL("1019311", "翼支付失败"),
	EXCEPTION_TIANYI_GETH5_FAIL("1019312", "获取H5URL失败"),
	EXCEPTION_TIANYI_TRADEQUERY_FAIL("1019313", "交易查询失败"),
	EXCEPTION_TIANYI_TRADEREFUND_FAIL("1019314", "交易退款失败"),

	ALI_PAY_TIME_EXPIRE_GOODS("60m","商品支付宝支付默认超时时间"),
	WEIXIN_PAY_TIME_EXPIRE_GOODS(60,"商品微信支付默认超时时间"),


	WEIXIN_PAY_TRADE_TYPE_APP(0,"APP"),//app支付
	WEIXIN_PAY_TRADE_TYPE_JSAPI(1,"JSAPI"),//公众号支付
	WEIXIN_PAY_TRADE_TYPE_NATIVE(2,"NATIVE"),//原生扫码支付
	WEIXIN_PAY_TRADE_TYPE_PUNCH_CARD(3,"PUNCH_CARD"),//刷卡支付

	WA_PUNCHCARDPAY_SUCCESS("10000","SUCCESS"),//支付成功
	WA_PUNCHCARDPAY_PAYING("10003","USERPAYING"),//支付中
	WA_PUNCHCARDPAY_SYSERR("20000","FAIL"),//微众系统异常
	WA_PUNCHCARDPAY_COLSE("30000","CLOSE"),//交易结算，不可退款

	WA_SCANPAY_SYSERR("10000","Success"),

	WW_PUNCHCARDPAY_SUCCESS("SUCCESS","支付成功"),
	WA_TRADESTATUS_00("00","交易处理中"),
	WA_TRADESTATUS_01("01","交易支付成功"),
	WA_TRADESTATUS_02("02","交易失败"),
	WA_TRADESTATUS_03("03","交易创建，等待买家付款"),
	WA_TRADESTATUS_04("04","未付款订单超时关闭，或支付完成后余额退款"),
	WA_TRADESTATUS_05("05","交易结束，不可退款"),

	WW_PUNCHCARDPAY_USERPAYING("USERPAYING","用户支付中"),
	WW_PUNCHCARDPAY_REFUND("REFUND","已退款"),

	WEBANK_PAYEMENT_0("0","未支付"),
	WEBANK_PAYEMENT_1("1","已支付"),

	WEBANK_CODE_0("0","成功"),

	ALI_AUTH_TYPE_0(0,"公钥授权"),
	ALI_AUTH_TYPE_1(1,"商户授权"),
	ALI_AUTH_TYPE_2(2,"用户授权"),

	;
    private Object code;

    private Object value;

    private ConstantEnum(Object code, Object value) {
        this.code = code;
        this.value = value;
    }


    /**	
     * @Description: 获取code int类型值,请确保该值可转换为int值，否则会类型转换异常 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:51:11
     **/
    public Integer getCodeInt() {
        return Integer.valueOf(code.toString());
    }
    
    /**	
     * @Description: 获取code String类型值
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:53:36
     **/
    public String getCodeStr() {
        return code.toString();
    }


    /**	
     * @Description:  获取value int类型值,请确保该值可转换为int值，否则会类型转换异常 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:53:08
     **/
    public Integer getValueInt() {
        return Integer.valueOf(value.toString());
    }
    
    /**	
     * @Description: 获取value String类型值 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:53:21
     **/
    public String getValueStr() {
        return value.toString();
    }

	/**
	 * @Description: 获取code byte类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年5月19日下午3:51:11
	 **/
	public Byte getCodeByte() {
		return Integer.valueOf(code.toString()).byteValue();
	}

	/**
	 * @Description:  获取value byte类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年5月19日下午3:53:08
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
