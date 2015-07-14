/** 
* @Title: BaseEvent.java 
* @Package com.rongyi.va.account 
* @Description: 基础事件
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午4:27:49 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.account;

import org.springframework.context.ApplicationContext;

import com.rongyi.core.common.util.JsonUtil;

import net.sf.json.JSONObject;

/**
 * @author ZhengYl
 *
 */
public class BaseEvent {
	private String type;
	private String source;
	private JSONObject body;
	private String target;
	private long timestamp;
	private String correlationId;
	
	public void load(JSONObject json) throws Exception {
		setType(json.get("type").toString());
		setSource(json.get("source").toString());
		setTimestamp(Long.valueOf(json.get("timestamp").toString()));
		setBody((JSONObject)json.get("body"));
	}
	
	public void updateBody() {
		if (getBody() == null) {
			setBody(new JSONObject());
		}
	}
	
	public String buildMessageString() {
		JSONObject json = new JSONObject();
		
		updateBody();
		
		json.put("type", getType());
		json.put("body", getBody());
		json.put("source", getSource());
		json.put("timestamp", System.currentTimeMillis());
		
		return JsonUtil.getJSONString(json);
	}
	
	public void process(ApplicationContext ctx) throws Exception{
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public JSONObject getBody() {
		return body;
	}
	public void setBody(JSONObject body) {
		this.body = body;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	
}
