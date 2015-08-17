package com.rongyi.rpb.common.util.orderSign.weixinSign;

import com.rongyi.rpb.common.util.orderSign.weixinSign.util.MD5Util;
import com.rongyi.rpb.constants.ConstantUtil;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetPackage {

	public static String getOrderPackage(double total_fee,String payNo ) {
		BigDecimal total_fee1 = new BigDecimal(total_fee+"").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
		List<NameValuePair> params = new LinkedList<NameValuePair>();
		params.add(new BasicNameValuePair("bank_type", "WX"));
//		bodyString = replaceBlank(bodyString);
		params.add(new BasicNameValuePair("body", "容易网商品"));
		// params.add(new BasicNameValuePair("body", "BODY"));
		params.add(new BasicNameValuePair("fee_type", "1"));
		params.add(new BasicNameValuePair("input_charset", "UTF-8"));
		params.add(new BasicNameValuePair("notify_url", ConstantUtil.PayNetAdress.NOTIFY_URL_WEIXIN));
		params.add(new BasicNameValuePair("out_trade_no", payNo));
		params.add(new BasicNameValuePair("partner", ConstantUtil.PayWeiXin.PARTNER));
		params.add(new BasicNameValuePair("spbill_create_ip", ConstantUtil.PayNetAdress.SPBILL_CREATE_IP_WEIXIN));
		params.add(new BasicNameValuePair("total_fee", total_fee1.toString()));
		// params.add(new BasicNameValuePair("total_fee","1"));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < params.size(); i++) {
			if (params.get(i).getName().equals("")) {

			}
			sb.append(params.get(i).getName());
			sb.append('=');
			sb.append(params.get(i).getValue());
			sb.append('&');
		}
		sb.append("key=");
		sb.append(ConstantUtil.PayWeiXin.PARTNER_KEY);

		String packageSign = MD5Util.MD5Encode(sb.toString(), "utf-8").toUpperCase();
		return URLEncodedUtils.format(params, "utf-8") + "&sign=" + packageSign;
	}

	/**
	 * 取出字符串中间的空格，否则PrepayId 生成不了
	 * 
	 * @param str
	 * @return
	 */
	public static String replaceBlank(String str) {
		Pattern p = Pattern.compile("\\s*|\t|\r|\n");
		Matcher m = p.matcher(str);
		String after = m.replaceAll("");
		return after;
	}
}
