package com.rongyi.rpb.common.pay.ali.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.rongyi.rpb.common.pay.ali.sign.AlipayConfig;
import com.rongyi.rpb.common.pay.ali.sign.MD5;
import com.rongyi.rpb.common.pay.ali.sign.RSA;

/* *
 *类名：AlipayNotify
 *功能：支付宝通知处理类
 *详细：处理支付宝各接口通知返回
 *版本：3.3
 *日期：2012-08-17
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考

 *************************注意*************************
 *调试通知返回时，可查看或改写log日志的写入TXT里的数据，来检查通知返回是否正常
 */
public class AlipayNotify {

	private AlipayNotify() {

	}

	private static final Logger LOGGER = LoggerFactory.getLogger(AlipayNotify.class);
	/**
	 * 支付宝消息验证地址
	 */
	private static final String HTTPS_VERIFY_URL = "https://mapi.alipay.com/gateway.do?service=notify_verify&";

	/**
	 * 验证消息是否是支付宝发出的合法消息，验证callback
	 * 
	 * @param params
	 *            通知返回来的参数数组
	 * @return 验证结果
	 */
	public static boolean verifyReturn(Map<String, String> params) {
		String sign = "";
		// 获取返回时的签名验证结果
		if (params.get("sign") != null) {
			sign = params.get("sign");
		}
		// 验证签名
		boolean isSign = getSignVeryfy(params, sign, true);

		// 判断isSign是否为true
		// isSign不是true，与安全校验码、请求时的参数格式（如：带自定义参数等）、编码格式有关
		return isSign;
	}

	/**
	 * 验证消息是否是支付宝发出的合法消息，验证服务器异步通知
	 * 
	 * @param params
	 *            通知返回来的参数数组
	 * @return 验证结果
	 */
	public static boolean verifyNotify(Map<String, String> params) {

		// 获取是否是支付宝服务器发来的请求的验证结果
		String responseTxt = "true";
		try {
			// XML解析notify_data数据，获取notify_id
			Document document = DocumentHelper.parseText(params.get("notify_data"));
			String notifyId = document.selectSingleNode("//notify/notify_id").getText();
			responseTxt = verifyResponse(notifyId);
		} catch (Exception e) {
			responseTxt = e.toString();
			LOGGER.error(e);
		}

		// 获取返回时的签名验证结果
		String sign = "";
		if (params.get("sign") != null) {
			sign = params.get("sign");
		}
		// 判断responsetTxt是否为true，isSign是否为true
		// responsetTxt的结果不是true，与服务器设置问题、合作身份者ID、notify_id一分钟失效有关
		// isSign不是true，与安全校验码、请求时的参数格式（如：带自定义参数等）、编码格式有关
		return getSignVeryfy(params, sign, false) && "true".equals(responseTxt);
	}

	/**
	 * 解密
	 * 
	 * @param inputPara
	 *            要解密数据
	 * @return 解密后结果
	 */
	public static Map<String, String> decrypt(Map<String, String> inputPara) {
		try {
			inputPara.put("notify_data", RSA.decrypt(inputPara.get("notify_data"), AlipayConfig.private_key, AlipayConfig.input_charset));
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return inputPara;
	}

	/**
	 * 根据反馈回来的信息，生成签名结果
	 * 
	 * @param params
	 *            通知返回来的参数数组
	 * @param sign
	 *            比对的签名结果
	 * @param isSort
	 *            是否排序
	 * @return 生成的签名结果
	 */
	private static boolean getSignVeryfy(Map<String, String> params, String sign, boolean isSort) {
		// 过滤空值、sign与sign_type参数
		Map<String, String> sParaNew = AlipayCore.paraFilter(params);
		// 获取待签名字符串
		String preSignStr = "";
		if (isSort) {
			preSignStr = AlipayCore.createLinkString(sParaNew);
		} else {
			preSignStr = AlipayCore.createLinkStringNoSort(sParaNew);
		}
		// 获得签名验证结果
		boolean isSign = false;
		if ("MD5".equals(AlipayConfig.sign_type)) {
			isSign = MD5.verify(preSignStr, sign, AlipayConfig.key, AlipayConfig.input_charset);
		}
		if ("0001".equals(AlipayConfig.sign_type)) {
			isSign = RSA.verify(preSignStr, sign, AlipayConfig.ali_public_key, AlipayConfig.input_charset);
		}
		return isSign;
	}

	/**
	 * 获取远程服务器ATN结果,验证返回URL
	 * 
	 * @param notifyId
	 *            通知校验ID
	 * @return 服务器ATN结果 验证结果集： invalid命令参数不对 出现这个错误，请检测返回处理中partner和key是否为空 true
	 *         返回正确信息 false 请检查防火墙或者是服务器阻止端口问题以及验证时间是否超过一分钟
	 */
	private static String verifyResponse(String notifyId) {
		// 获取远程服务器ATN结果，验证是否是支付宝服务器发来的请求

		String partner = AlipayConfig.partner;
		String veryfy_url = HTTPS_VERIFY_URL + "partner=" + partner + "&notify_id=" + notifyId;

		return checkUrl(veryfy_url);
	}

	/**
	 * 获取远程服务器ATN结果
	 * 
	 * @param urlvalue
	 *            指定URL路径地址
	 * @return 服务器ATN结果 验证结果集： invalid命令参数不对 出现这个错误，请检测返回处理中partner和key是否为空 true
	 *         返回正确信息 false 请检查防火墙或者是服务器阻止端口问题以及验证时间是否超过一分钟
	 */
	private static String checkUrl(String urlvalue) {
		String inputLine = "";

		try {
			URL url = new URL(urlvalue);
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			inputLine = in.readLine().toString();
		} catch (Exception e) {
			LOGGER.error(e);
		}

		return inputLine;
	}
}
