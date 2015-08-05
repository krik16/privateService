package com.rongyi.rpb.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.rpb.common.util.orderSign.webPageAlipay.alipay.sign.Md5Encrypt;
import com.rongyi.rpb.common.util.orderSign.webPageAlipay.alipay.sign.RSA;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.constants.ConstantUtil.PayZhiFuBao;
import com.rongyi.rpb.constants.ConstantUtil.ZhiFuBaoWebPage;
import com.rongyi.rpb.service.AliPaymentService;
import com.rongyi.rpb.service.PaymentService;
import com.unionpay.acp.sdk.HttpClient;

/**
 * @Author: 柯军
 * @Description: 支付宝Service
 * @datetime:2015年4月23日上午9:51:11
 * 
 **/
@Service
public class AliPaymentServiceImpl extends BaseServiceImpl implements AliPaymentService {

	private static final Logger LOGGER = Logger.getLogger(AliPaymentServiceImpl.class);
	@Autowired
	PaymentService paymentService;

	@Override
	public Map<String, Object> getZhiFuBaoSign(Map<String, Object> orderMaps, String payNo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String title = orderMaps.get("title").toString();
		if (StringUtils.isEmpty(title))
			title = paymentService.getTitle(payNo);
		String totalPrice = orderMaps.get("totalPrice").toString();

		// 根据生成订单号再生成支付宝签名
		String signContentString = getZhiFuBaoSignContent2(payNo, title, totalPrice);
		String zhifubaoSign = RSA.sign(signContentString, ConstantUtil.PayZhiFuBao.PRIVATE_KEY, ConstantUtil.PayZhiFuBao.INPUT_CHARSET);
		try {
			String stringWithFormat = signContentString + "&sign=\"" + URLEncoder.encode(zhifubaoSign, "utf-8") + "\"&sign_type=\"RSA\"";
			resultMap.put("code", 0);
			resultMap.put("zhifubaoSign", stringWithFormat);
			resultMap.put("title", title);
			resultMap.put("totlePrice", totalPrice);
		} catch (Exception e) {
			resultMap.put("code", 1);// 生成失败
			LOGGER.error(e);
		}
		return resultMap;
	}

	private String getZhiFuBaoSignContent2(String orderId, String title, String totlePrice) {
		StringBuilder sb = new StringBuilder();
		sb.append("partner=\"");
		sb.append(ConstantUtil.PayZhiFuBao.PARTNER);
		sb.append("\"&out_trade_no=\"");
		sb.append(orderId); // orderId
		sb.append("\"&subject=\"");
		sb.append(title); // title
		sb.append("\"&body=\"容易网商品");
		sb.append("");// title
		sb.append("\"&total_fee=\"");
		sb.append(totlePrice); // totlePrice
		sb.append("\"&notify_url=\"");
		try {
			sb.append(URLEncoder.encode(ConstantUtil.PayNetAdress.NOTIFY_URL_ZHIFUBAO_APP, "utf-8"));
		} catch (Exception e) {
			LOGGER.error(e);
		}

		// 网址需要做URL编码
		sb.append("\"&service=\"");
		sb.append(ConstantUtil.PayZhiFuBao.SDK_SERVICE);
		sb.append("\"&_input_charset=\"utf-8");
		sb.append("\"&payment_type=\"1");
		sb.append("\"&seller_id=\"");
		sb.append(ConstantUtil.PayZhiFuBao.SELLER_ID);

		sb.append("\"&it_b_pay=\"30m");
		sb.append("\"");

		return new String(sb);
	}

	/**
	 * @Description: 查询订单状态
	 * @param payNo
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月5日上午9:34:52
	 **/
	@Override
	public String queryOrder(String payNo) {
		String url = CreateUrl(payNo);
		HttpClient hc = new HttpClient(url, 30000, 30000);
		try {
			int status = hc.send(new HashMap<String, String>(), PayZhiFuBao.INPUT_CHARSET);
			System.err.println(status);
			if (status == 200)
				return hc.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 生成url方法 网关
	 * 
	 * @param paygateway
	 *            服务参数
	 * @param service
	 *            签名类型
	 * @param sign_type
	 *            外部订单号
	 * @param out_trade_no
	 *            编码机制
	 * @param input_charset
	 *            合作者ID
	 * @param partner
	 *            安全校验码
	 * @param key
	 * @return
	 */
	public String CreateUrl(String outTradeNo) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("service", ZhiFuBaoWebPage.QUERY_SERVICE);
		params.put("partner", PayZhiFuBao.PARTNER);
		params.put("out_trade_no", outTradeNo);
		params.put("_input_charset", PayZhiFuBao.INPUT_CHARSET);

		String prestr = "";

		prestr = prestr + PayZhiFuBao.PRIVATE_KEY;

		String sign = Md5Encrypt.md5(getContent(params, PayZhiFuBao.PRIVATE_KEY), PayZhiFuBao.INPUT_CHARSET);

		String parameter = "";
		parameter = parameter + ZhiFuBaoWebPage.ALIPAY_QUERY_ORDER_GATEWAY;
		List<String> keys = new ArrayList<String>(params.keySet());
		for (int i = 0; i < keys.size(); i++) {
			String value = (String) params.get(keys.get(i));
			if (value == null || value.trim().length() == 0) {
				continue;
			}
			try {
				parameter = parameter + keys.get(i) + "=" + URLEncoder.encode(value, PayZhiFuBao.INPUT_CHARSET) + "&";
			} catch (UnsupportedEncodingException e) {

				e.printStackTrace();
			}
		}

		parameter = parameter + "sign=" + sign + "&sign_type=" + PayZhiFuBao.SIGNTYPE;

		return parameter;

	}

	/**
	 * 功能：将安全校验码和参数排序 参数集合
	 * 
	 * @param params
	 *            安全校验码
	 * @param privateKey
	 * */
	private String getContent(Map<String, Object> params, String privateKey) {
		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		String prestr = "";

		boolean first = true;
		for (int i = 0; i < keys.size(); i++) {
			String key = (String) keys.get(i);
			String value = (String) params.get(key);
			if (value == null || value.trim().length() == 0) {
				continue;
			}
			if (first) {
				prestr = prestr + key + "=" + value;
				first = false;
			} else {
				prestr = prestr + "&" + key + "=" + value;
			}
		}

		return prestr + privateKey;
	}

}
