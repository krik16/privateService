package com.rongyi.rpb.common.util.orderSign.weixinSign;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONException;

import com.rongyi.rpb.common.util.orderSign.weixinSign.client.TenpayHttpClient;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.JsonUtil;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.Sha1Util;
import com.rongyi.rpb.constants.ConstantUtil;

public class PrepayIdRequestHandler extends RequestHandler {

	private static final Logger LOGGER = Logger
			.getLogger(PrepayIdRequestHandler.class);

	public PrepayIdRequestHandler(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
	}

	public String createSHA1Sign() {
		StringBuffer sb = new StringBuffer();
		Set es = super.getAllParameters().entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			sb.append(k + "=" + v + "&");
		}
		String params = sb.substring(0, sb.lastIndexOf("&"));
		String appsign = Sha1Util.getSha1(params);
		this.setDebugInfo(this.getDebugInfo() + "\r\n" + "sha1 sb:" + params);
		this.setDebugInfo(this.getDebugInfo() + "\r\n" + "app sign:" + appsign);
		return appsign;
	}

	public String sendPrepay() throws JSONException {
		String prepayid = "";
		StringBuffer sb = new StringBuffer("{");
		Set es = super.getAllParameters().entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			if (null != v && !"".equals(v) && !"appkey".equals(k)) {
				sb.append("\"" + k + "\":\"" + v + "\",");
			}
		}
		String params = sb.substring(0, sb.lastIndexOf(","));
		params += "}";

		String requestUrl = super.getGateUrl();
		this.setDebugInfo(this.getDebugInfo() + "\r\n" + "requestUrl:"
				+ requestUrl);
		TenpayHttpClient httpClient = new TenpayHttpClient();
		httpClient.setReqContent(requestUrl);
		String resContent = "";
		this.setDebugInfo(this.getDebugInfo() + "\r\n" + "post data:" + params);
		if (httpClient.callHttpPost(requestUrl, params)) {
			resContent = httpClient.getResContent();
			if (2 == resContent.indexOf("prepayid")) {
				prepayid = JsonUtil.getJsonValue(resContent, "prepayid");
			} else {
				LOGGER.info("微信支付生成prepayid失败，失败原因：" + resContent);
			}
		}
		return prepayid;
	}

	public String sendAccessToken() {
		String accesstoken = "";
		StringBuffer sb = new StringBuffer("{");
		Set es = super.getAllParameters().entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			if (null != v && !"".equals(v) && !"appkey".equals(k)) {
				sb.append("\"" + k + "\":\"" + v + "\",");
			}
		}
		String params = sb.substring(0, sb.lastIndexOf(","));
		params += "}";

		String requestUrl = super.getGateUrl();

		TenpayHttpClient httpClient = new TenpayHttpClient();
		httpClient.setReqContent(requestUrl);
		String resContent = "";

		if (httpClient.callHttpPost(requestUrl, params)) {
			resContent = httpClient.getResContent();
			if (2 == resContent.indexOf(ConstantUtil.PayWeiXin.ERRORCODE)) {
				accesstoken = resContent.substring(11, 16);
			}
		}
		return accesstoken;
	}
}
