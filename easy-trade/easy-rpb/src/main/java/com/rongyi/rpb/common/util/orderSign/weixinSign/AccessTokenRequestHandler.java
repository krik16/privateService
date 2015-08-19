package com.rongyi.rpb.common.util.orderSign.weixinSign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rongyi.rpb.common.util.orderSign.weixinSign.client.TenpayHttpClient;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.JsonUtil;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.WXUtil;
import com.rongyi.rpb.constants.ConstantUtil;



public class AccessTokenRequestHandler extends RequestHandler {

	public AccessTokenRequestHandler(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
	}

	private static String access_token = "";

	/**
	 * 获取凭证access_token
	 * @return
	 */
	public static String getAccessToken() {
		if ("".equals(access_token)) {// 如果为空直接获取
			return getTokenReal();
		}

		if (tokenIsExpire(access_token)) {// 如果过期重新获取
			return getTokenReal();
		}
		return access_token;
	}

	/**
	 * 实际获取access_token的方法
	 * @return
	 */
	protected static String getTokenReal() {
		String requestUrl = ConstantUtil.PayWeiXin.TOKENURL + "?grant_type=" + ConstantUtil.PayWeiXin.GRANT_TYPE + "&appid="
				+ ConstantUtil.PayWeiXin.APP_ID + "&secret=" + ConstantUtil.PayWeiXin.APP_SECRET;
		String resContent = "";
		TenpayHttpClient httpClient = new TenpayHttpClient();
		httpClient.setMethod("GET");
		httpClient.setReqContent(requestUrl);
		if (httpClient.call()) {
			resContent = httpClient.getResContent();
			if (resContent.indexOf(ConstantUtil.PayWeiXin.ACCESS_TOKEN) > 0) {
				access_token = JsonUtil.getJsonValue(resContent,ConstantUtil.PayWeiXin.ACCESS_TOKEN);
			} else {
				System.out.println("获取access_token值返回错误！！！");
			}
		} else {
			System.out.println("后台调用通信失败");
			System.out.println(httpClient.getResponseCode());
			System.out.println(httpClient.getErrInfo());
			// 有可能因为网络原因，请求已经处理，但未收到应答。
		}

		return access_token;
	}

	/**
	 * 判断传递过来的参数access_token是否过期
	 * @param access_token
	 * @return
	 */
	private static boolean tokenIsExpire(String access_token) {
		boolean flag = false;
		PrepayIdRequestHandler wxReqHandler = new PrepayIdRequestHandler(null, null);
		wxReqHandler.setParameter("appid",ConstantUtil.PayWeiXin.APP_ID);
		wxReqHandler.setParameter("appkey",ConstantUtil.PayWeiXin.APP_KEY);
		wxReqHandler.setParameter("noncestr", WXUtil.getNonceStr());
//		wxReqHandler.setParameter("package",OrderPaymentService.getPackageString()); //暂时没有
		wxReqHandler.setParameter("timestamp", WXUtil.getTimeStamp());
		wxReqHandler.setParameter("traceid", ConstantUtil.PayWeiXin.TRACEID); //traceid 可以不要

		// 生成支付签名
		String sign = wxReqHandler.createSHA1Sign();
		wxReqHandler.setParameter("app_signature", sign);
		wxReqHandler.setParameter("sign_method", ConstantUtil.PayWeiXin.SIGN_METHOD);
		String gateUrl = ConstantUtil.PayWeiXin.GATEURL + access_token;
		wxReqHandler.setGateUrl(gateUrl);
		// 发送请求
		String accesstoken = wxReqHandler.sendAccessToken();
/*		try {
			wxReqHandler.sendPrepay();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if (ConstantUtil.PayWeiXin.EXPIRE_ERRCODE.equals(accesstoken) ||ConstantUtil.PayWeiXin.FAIL_ERRCODE.equals(accesstoken))
			flag = true;
		return flag;
	}

}
