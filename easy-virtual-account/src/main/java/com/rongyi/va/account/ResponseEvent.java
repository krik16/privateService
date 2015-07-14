/** 
 * @Title: ResponseEvent.java 
 * @Package com.rongyi.va.account 
 * @Description: RPC回复事件
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月4日 下午4:10:47 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.account;

import net.sf.json.JSONObject;

/**
 * @author ZhengYl
 * 
 */
public class ResponseEvent {
	private String message;
	private Integer code;

	public void load(JSONObject json) throws Exception {
		setMessage(json.get("message").toString());
		setCode(Integer.parseInt(json.get("code").toString()));
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
