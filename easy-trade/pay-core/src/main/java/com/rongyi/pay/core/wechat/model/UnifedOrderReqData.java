package com.rongyi.pay.core.wechat.model;

import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.pay.core.wechat.util.MD5;
import com.rongyi.pay.core.wechat.util.Signature;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * 请求下单请求参数
 * conan
 * 2016/10/11 14:49
 **/
public class UnifedOrderReqData extends BaseData {
	//每个字段具体的意思请查看API文档
	private String appid = "";
	private String mch_id = "";
	private String sub_mch_id = "";
	private String sub_appid = "";
	private String device_info = "";
	private String nonce_str = "";
	private String sign = "";
	private String body = "";
	private String detail = "";
	private String attach = "";
	private String out_trade_no = "";
	private String fee_type = "";
	private Integer total_fee = 0;
	private String spbill_create_ip = "";
	private String time_start = "";
	private String time_expire = "";
	private String goods_tag = "";
	private String notify_url = "";
	private String trade_type = "";
	private String product_id = "";
	private String limit_pay = "";
	private String openid = "";
	private String sub_open_id = "";



	/**
	 * @Author:  柯军
	 * @Description: 初始化必要参数
	 * @datetime:2015年9月2日
	 *
	 **/
	public UnifedOrderReqData(String body,String outTradeNo,Integer totalFee,String notifyUrl,String timeStart,String timeExpire,String openid,
							  WechatConfigure wechatConfigure){
		//微信分配的公众号ID（开通公众号之后可以获取到）
		setAppid(wechatConfigure.getAppID());

		//微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）
		setMch_id(wechatConfigure.getMchID());


		if(StringUtils.isNotEmpty(wechatConfigure.getSubMchID())){
			setSub_mch_id(wechatConfigure.getSubMchID());
		}

		if(StringUtils.isNotEmpty(wechatConfigure.getSubAppID())){
			setSub_appid(wechatConfigure.getSubAppID());
		}


		//随机字符串，不长于32 位
		setNonce_str(genNonceStr());

		//商品描述
		setBody(body);

		//商户系统自己生成的唯一的订单号
		setOut_trade_no(outTradeNo);

		//总金额
		setTotal_fee(totalFee);

		//终端IP
		setSpbill_create_ip(wechatConfigure.getIp());

		//异步通知地址
		setNotify_url(notifyUrl);

		//交易类型
		setTrade_type(wechatConfigure.getTradeType());

		if(ConstantEnum.WEIXIN_PAY_TRADE_TYPE_APP.getValueStr().equals(wechatConfigure.getTradeType())) {
			//交易起始时间
			setTime_start(timeStart);

			//交易失效时间
			setTime_expire(timeExpire);
		}

		if(ConstantEnum.WEIXIN_PAY_TRADE_TYPE_JSAPI.getValueStr().equals(wechatConfigure.getTradeType())) {

			setOpenid(openid);
		}

		//根据API给的签名规则进行签名
		String sign = Signature.getSign(toMap(), wechatConfigure.getKey());
		setSign(sign);//把签名数据设置到Sign这个属性中

	}

	private String genNonceStr() {
		Random random = new Random();
		return MD5.getMessageDigest(String.valueOf(random.nextInt(10000)).getBytes());
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public Integer getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(Integer total_fee) {
		this.total_fee = total_fee;
	}

	public String getSpbill_create_ip() {
		return spbill_create_ip;
	}

	public void setSpbill_create_ip(String spbill_create_ip) {
		this.spbill_create_ip = spbill_create_ip;
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

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getLimit_pay() {
		return limit_pay;
	}

	public void setLimit_pay(String limit_pay) {
		this.limit_pay = limit_pay;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getSub_mch_id() {
		return sub_mch_id;
	}

	public void setSub_mch_id(String sub_mch_id) {
		this.sub_mch_id = sub_mch_id;
	}

	public String getSub_appid() {
		return sub_appid;
	}

	public void setSub_appid(String sub_appid) {
		this.sub_appid = sub_appid;
	}

	public String getSub_open_id() {
		return sub_open_id;
	}

	public void setSub_open_id(String sub_open_id) {
		this.sub_open_id = sub_open_id;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			Object obj;
			try {
				obj = field.get(this);
				if (obj != null) {
					map.put(field.getName(), obj);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map;
	}

}
