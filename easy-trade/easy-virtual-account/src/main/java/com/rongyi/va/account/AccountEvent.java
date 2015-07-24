/** 
* @Title: AccountEvent.java 
* @Package com.rongyi.va.account 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午8:14:35 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.account;

import net.sf.json.JSONObject;

/**
 * @author ZhengYl
 *
 */
public class AccountEvent extends BaseEvent{
	protected String userId;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = getBody();
		
		setUserId(param.get("userId").toString());
	}

	public void updateBody() {
		super.updateBody();
		
		JSONObject param = getBody();
		param.put("userId", getUserId());
	}
	
	public BaseEvent buildResponseEvent(int code, String message) {
		AccountEvent event = new AccountEvent();
		event.setType(getType());
		event.setTimestamp(System.currentTimeMillis());
		
		event.setUserId(getUserId());
		
		if (getTarget()!= null) {
			event.setTarget(getTarget());
		}else{
			event.setTarget(getSource());
		}
		
		if (getCorrelationId() != null) {
			event.setCorrelationId(getCorrelationId());
		}
		
		event.setSource("va");
		
		JSONObject param = new JSONObject();
		param.put("code", code);
		param.put("message", message);
		
		event.setBody(param);
		
		return event;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}
