package com.rongyi.rpb.service.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.bean.ObjectConvert;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.rpb.vo.QueryOrderParamVO;
import com.rongyi.rpb.common.util.orderSign.webPageAlipay.alipay.sign.RSA;
import com.rongyi.rpb.common.util.orderSign.webPageAlipay.alipay.util.AlipaySubmit;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.XMLUtil;
import com.rongyi.rpb.constants.ConstantEnum;
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
	public QueryOrderParamVO queryOrder(String tradeNo,String payNo) {
		String url = CreateUrl(tradeNo,payNo);
		HttpClient hc = new HttpClient(url, 30000, 30000);
		int status = 200;
		try {
			status = hc.send(new HashMap<String, String>(), PayZhiFuBao.INPUT_CHARSET);
			if (status == 200)
				return xmlStringToQueryOrderParamVO(hc.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.error("调用支付宝通信异常，通信状态-->" + status);
		return null;
	}

	/**
	 * @Description: xml 结果转换成QueryOrderParamVO对象
	 * @param xmlString
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月7日上午11:17:59
	 **/
	@SuppressWarnings("unchecked")
	private QueryOrderParamVO xmlStringToQueryOrderParamVO(String xmlString) {
		LOGGER.info("支付宝订单查询结果数据："+xmlString);
		QueryOrderParamVO queryOrderParamVO = new QueryOrderParamVO();
		try {
			Map<String, Object> xmlMap = XMLUtil.doXMLParse(xmlString);
			if ("T".equals(xmlMap.get("is_success"))) {
				String responseStr = xmlMap.get("response").toString();
				Map<String, Object> responseMap = XMLUtil.doXMLParse(responseStr);
				queryOrderParamVO = (QueryOrderParamVO) ObjectConvert.convertFromMap(QueryOrderParamVO.class, responseMap);
				queryOrderParamVO.setIs_success("T");
			} else {
				queryOrderParamVO.setIs_success("F");
//				if (ConstantEnum.ALI_QUERY_ORDER_ERROR_CODE.getCodeStr().equals(xmlMap.get("error")))
					queryOrderParamVO.setError(ConstantEnum.ALI_QUERY_ORDER_ERROR_CODE.getValueStr());
//				else
//					queryOrderParamVO.setError((String) xmlMap.get("error"));
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return queryOrderParamVO;
	}

	/**
	 * @Description: 生成订单查询URL字符串
	 * @param outTradeNo付款单号
	 * @param tradeNo支付宝交易流水号
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月7日上午11:20:00
	 **/
	public String CreateUrl(String tradeNo,String outTradeNo) {

		Map<String, String> params = new HashMap<String, String>();
		params.put("service", ZhiFuBaoWebPage.QUERY_SERVICE);
		params.put("partner", PayZhiFuBao.PARTNER);
		if (!StringUtils.isEmpty(outTradeNo))
			params.put("out_trade_no", outTradeNo);
		if (!StringUtils.isEmpty(tradeNo))
			params.put("trade_no", tradeNo);
		params.put("_input_charset", PayZhiFuBao.INPUT_CHARSET);
		String sign = AlipaySubmit.buildRequestMysign(params);
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

}
