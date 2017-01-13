package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.GetOpenIdReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

/**
 * @Description 获取openId
 * @author wudi
 * @date 2016年11月14日 下午3:07:12
 */
public class GetOpenIdService extends BaseService {

	public GetOpenIdService(String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//		super(WechatConfigure.WEB_GET_OPEN_ID);
		super(url);
	}

	public String webGetOpenId(GetOpenIdReqData getOpenIdReqData, WechatConfigure wechatConfigure) throws Exception {

		// --------------------------------------------------------------------
		// 发送HTTPS的Post请求到API地址
		// --------------------------------------------------------------------
		return sendPost(getOpenIdReqData, wechatConfigure);

	}
}
