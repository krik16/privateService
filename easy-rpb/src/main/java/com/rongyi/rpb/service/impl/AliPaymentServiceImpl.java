package com.rongyi.rpb.service.impl;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.rpb.common.util.orderSign.webPageAlipay.alipay.sign.RSA;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.service.AliPaymentService;
import com.rongyi.rpb.service.PaymentService;

/**
 * @Author: 柯军
 * @Description: 支付宝Service
 * @datetime:2015年4月23日上午9:51:11
 * 
 **/
@Service
public class AliPaymentServiceImpl extends BaseServiceImpl implements AliPaymentService{

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
		    resultMap.put("code", 1);//生成失败
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

}
