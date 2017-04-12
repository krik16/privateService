/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日下午3:45:21
 * @Description: TODO
 *
 **/

package com.rongyi.rpb.constants;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.rpb.constants.ConstantUtil.NOTIFY_URL;



/**	
 * @Author:  柯军
 * @Description: 常量枚举
 * @datetime:2015年7月2日下午4:58:18
 *
 **/
public enum ConstantEnum {


	UNION_MSG_TYPE("msg_type","00"),//报文类型
	UNION_MSG_TXN_CODE("msg_txn_code","002002"),//交易代码,002002一次验证，002003二次验证
	UNION_MSG_TXN_CODE_TWO("msg_txn_code","002003"),//交易代码,002002一次验证，002003二次验证
	UNION_MSG_CRRLTN_ID("msg_crrltn_id",""),//交易流水号，请求、应答关联ID
	UNION_MSG_FLG("msg_flg","1"),//报文请求应答标志，0：请求；1：应答
	UNION_MSG_SENDER("msg_sender","173"),//报文发送方，分配的渠道号
	UNION_MSG_TIME("msg_time",DateUtil.getCurrentDateYYYYMMDD()+DateUtil.getCurrentHMSS()),//报文日期，YYYYMMDDhhmmss
	UNION_MSG_SYS_SN("msg_sys_sn",""),//平台流水号，按请求原值返回
	UNION_MSG_VER("msg_ver","0.1"),//报文版本号
	UNION_MSG_RSP_CODE("msg_rsp_code","0000"),//响应码,默认0000成功
	UNION_MSG_RSP_DESC("msg_rsp_desc","成功"),//响应码描述
	UNION_CONSUME_TYPE("consume_type","3"),//消费类型 1：纯验证（销券，打印小票，结束本次交易）2：需支付（银行卡支付、现金支付）3：需支付，仅限银行卡支付
	UNION_AMOUNT_MODE("amount_mode","1"),//金额模式0:纯验证1:单笔金额2:两笔金额3:固定金额
	UNION_POS_MONITOR("pos_monitor",""),//显示在POS屏幕上的提示，由活动介绍、折扣、折后应收金额组合而成
	UNION_EVENT_NO("event_no",""),//SP活动号
	UNION_PWD_MODE("pwd_mode","0"),//0:不需要密码;1:需要密码;
	UNION_SIGN("sign",""),//签名域
	
	UNION_COUPON_PREFIX("coupon_prefix","3173"),//券码前缀
	
	UNION_COUPON_VALIDATE_URL("union_coupon_validate_url","http://" + NOTIFY_URL.outernetAddress + "/v5/union/validateCoupon"),//银联券码验证接口地址
	UNION_SUCCESS_NOTIFY_URL("union_success_notify_url","http://" + NOTIFY_URL.outernetAddress + "/v5/union/successNotify"),// 银联支付成功通知验证接口
	UNION_FAILURE_NOTIFY_URL("union_failure_notify_url","http://" + NOTIFY_URL.outernetAddress + "/v5/union/failureNotify"),// 银联支付失败通知验证接口
	
	ALI_QUERY_ORDER_ERROR_CODE("TRADE_NOT_EXIST","交易不存在！"),
	
	WEIXIN_REFUND_RESULT_SUCCESS("SUCCESS","退款成功!"),
	WEIXIN_REFUND_RESULT_PROCESSING("PROCESSING","微信退款处理中!"),
	WEIXIN_REFUND_RESULT_NOTSURE("NOTSURE","退款未确认,需重新发起退款!"),
	WEIXIN_REFUND_RESULT_CHANGE("CHANGE","退款转入代发，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，资金回流到商户的现金帐号，需要商户人工干预，通过线下或者财付通转账的方式进行退款!"),
	WEIXIN_REFUND_RESULT_FAIL("FAIL","退款失败!"),

	EXCEPTION_PARAM_NULL("1019101","参数为空"),
	EXCEPTION_ALI_PAY_SIGN_FAIL("1019102","支付宝支付签名生成失败"),
	EXCEPTION_ALI_QUERY_ORDER("1019103","订单查询失败"),
	EXCEPTION_WEIXIN_SIGN_FAIL("1019104","微信支付签名生成失败"),
	EXCEPTION_WEIXIN_REFUND_QUERY_ORDER("1019105","微信退款查询失败"),
	EXCEPTION_WEIXIN_REFUND_FAIL("1019106","微信退款失败"),
	EXCEPTION_WEIXIN_ORDER_CLOSE("1019107","微信订单关闭失败"),
	EXCEPTION_WEIXIN_QUERY_ORDER("1019108","微信订单查询失败"),
	EXCEPTION_PAYMENT_NOT_EXIST("1019109","付款记录不存在"),
	EXCEPTION_WEIXIN_SIGN_OPEN_ID_FAIL("1019110","为确保你可以及时跟进和查看订单状态，请先关注公众号再支付订单"),
	EXCEPTION_WEIXIN_APPID_NOT_EXIST("1019111","生成支付签名失败，失败原因：APP_ID未找到对应商户信息"),
	EXCEPTION_PAY_RECORED_NOT_EXIST("1019112","支付记录不存在"),
	EXCEPTION_REFUND_RECORED_NOT_EXIST("1019113","退款记录不存在"),
	EXCEPTION_REVERSE_FAIL("1019114","撤销订单失败"),
	EXCEPTION_POS_BANK_SYN_NTIFY_FAIL("1019115","同步支付通知处理失败"),
	EXCEPTION_LIMIT_REVERSE("1019115","订单已完成支付,不允许撤销"),
	EXCEPTION_REFUND_FAIL("1019116","订单已退款完成，无法再次退款"),
	EXCEPTION_AMOUNT_FAIL("1019117","金额不匹配"),
	EXCEPTION_MCH_NOT_FOUND("1019118","商户信息不匹配"),
	EXCEPTION_ORDER_REPAY("1019219","订单重复支付,商户需确认用户是否多次付款"),
	EXC_SIGN_FAIL("1181111","签名验证失败"),

	ALI_PAY_TIME_EXPIRE_GOODS("60m","商品支付宝支付默认超时时间"),
	ALI_PAY_TIME_EXPIRE_COUPONS("15m","代金券支付宝支付默认超时时间"),
	WEIXIN_PAY_TIME_EXPIRE_GOODS(60,"商品微信支付默认超时时间"),
	WEIXIN_PAY_TIME_EXPIRE_COUPONS(15,"代金券微信宝支付默认超时时间"),

	IS_DELETE_0(0,"正常"),
	IS_DELETE_1(1,"标记删除"),

	WEIXIN_PAY_TRADE_TYPE_APP(0,"APP"),//app支付
	WEIXIN_PAY_TRADE_TYPE_JSAPI(1,"JSAPI"),//公众号支付
	WEIXIN_PAY_TRADE_TYPE_NATIVE(2,"NATIVE"),//原生扫码支付

	WEIXIN_IS_RONGYI_PAY_0(0,"不是"),
	WEIXIN_IS_RONGYI_PAY_1(1,"是"),

	THIRD_NOTIFY_TYPE_1(1,"支付通知"),
	THIRD_NOTIFY_TYPE_2(2,"退款通知"),

	PAY_NATIVE_0(0,"综合支付服务接口"),
	PAY_NATIVE_1(1,"原生支付服务接口"),

	ORG_CHANNLE_RONGYI(0,"容易网"),
	ORG_CHANNLE_WEBANL(1,"微众"),

	PAY_SCENE_POS(1,"移动pos设备"),
	PAY_SCENE_SCAN(2,"扫码支付"),

	UNION_PRIVATE_KEY("privateKey","30820277020100300d06092a864886f70d0101010500048202613082025d02010002818100929ccdf660fde8b26c03ef181a7414ffe2a59b92419328e790f50bf96c32242f4d383209cc14e485f485140a8c694ab35a207899ec2dfaa8b5f918323942fa02ad55afcff870e3ac4f248be6843024bd9661aac4bf5d3f71f8fefb2b2593a0ccd161abda2deb290566bac24d70dc1a770266b2585d1fc99da890edea9b88af21020301000102818100900ac6bffd62f8aff3379a3c5021245092d8aa13f3a1255afd2c03ebb5c53d8fcb8a1e7f49a66d2ebea1d0a2dc78c60f97c8b73462ba79be2faadf7ed88b591cb294ba6f739010025d55e3ee820f2afd6dc66763348a8ef018c961deab48d5fe5868225d38b9b97c03f812eb4bdfd2b602e06148af4eb20a55704b913a0b1051024100cff5d92b440886c9509b9ebd4d447b2039477ef8ec0c87d726cef23e372bbd69a9029f4d93ef4e0d6a721ee1a15f18d5b564d8c7951e02bd1688fd0ee2dd3a3b024100b47b078fe517292cab94ac933027a58e91ff8b3a2a3087c9bcdae47558fe5ce4db984666acd15e3adec42e8c568f9a70b9965f700ca224ac277f945b63918a53024100c88d0d2c3e6602a66e884563c5fa3ecb6ab1da6f7024fd73adc771b2323e8a62354d8417aa8ce3b6e86aba015a407d90cb683feee98d91928d02fb18ba0c233502405dadb25a253e2558136363442eed9548704da515b6ca63e0f9cee0606ca5f2cfb38fd192ffc6d8d353c79ea5a75478846440421f65df4f8bb020cf7fb429da1302401ab8cbd3012684e94faf7551ade468412b19eea7c9ca69df09bad25115c28706f7ce63047c421a77ff0a110017c51ebca8afcaa80589b7772ebaac41dcd74d6d"),
	UNION_PUBLIC_KEY("publicKey","30819f300d06092a864886f70d010101050003818d0030818902818100929ccdf660fde8b26c03ef181a7414ffe2a59b92419328e790f50bf96c32242f4d383209cc14e485f485140a8c694ab35a207899ec2dfaa8b5f918323942fa02ad55afcff870e3ac4f248be6843024bd9661aac4bf5d3f71f8fefb2b2593a0ccd161abda2deb290566bac24d70dc1a770266b2585d1fc99da890edea9b88af210203010001");


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
