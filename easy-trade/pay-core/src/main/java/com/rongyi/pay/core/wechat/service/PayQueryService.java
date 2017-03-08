package com.rongyi.pay.core.wechat.service;

import com.rongyi.pay.core.wechat.model.PunchCardPayQueryReqData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;


/**
 * 支付结果查询服务
 * conan
 * 2016/10/11 14:49
 **/
public class PayQueryService extends BaseService {

	public PayQueryService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		super(WechatConfigure.PAY_QUERY_API);
	}

	/**
	 * 请求支付查询服务
	 * 
	 * @param punchCardPayQueryReqData
	 *            这个数据对象里面包含了API要求提交的各种数据字段
	 * @return API返回的XML数据
	 * @throws Exception
	 */
	public String request(PunchCardPayQueryReqData punchCardPayQueryReqData,WechatConfigure wechatConfigure) throws Exception {

		// --------------------------------------------------------------------
		// 发送HTTPS的Post请求到API地址
		// --------------------------------------------------------------------
		return sendPost(punchCardPayQueryReqData, wechatConfigure);
	}

}
