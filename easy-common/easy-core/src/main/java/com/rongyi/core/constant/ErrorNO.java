package com.rongyi.core.constant;

import java.util.HashMap;

/**
 * 错误编码
 * 
 * @author xiaobo
 *
 */
public interface ErrorNO {
	/**
	 * 成功
	 */
	final int SUCCESS = 0;
	/**
	 * 签名错误
	 */
	final int SIGN_ERROR = 1181001;
	/**
	 * 缺少参数
	 */
	final int LACK_PARAM = 1181002;
	/**
	 * 请求超时
	 */
	final int TIME_OUT = 1181003;
	/**
	 * 调用异常
	 */
	final int EXCEPTION = 1181010;

	public final static HashMap<String, String> ERRNO_MSG = new HashMap() {{
		put(SIGN_ERROR, "签名错误");
		put(LACK_PARAM, "缺少参数");
		put(TIME_OUT  , "请求超时");
		put(EXCEPTION , "调用异常");
	}};
}
