package com.rongyi.osm.knowledge;

import java.io.Serializable;

import net.sf.json.JSONObject;

import com.rongyi.core.common.util.JsonUtil;

public class BaseEvent implements Serializable{
	private static final long serialVersionUID = -3107656524101208105L;
	
	private String type;
	private String source;
	private JSONObject body;
	private String target;
	private long timestamp;
	private String correlationId;
	
	private boolean fired = false;
	
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
	
	/*
	public String toString() {
		JSONObject json = new JSONObject();
		
		updateBody();
		
		json.put("type", getType());
		json.put("body", getBody());
		json.put("source", getSource());
		json.put("timestamp", getTimestamp());
		
		return JsonUtil.getJSONString(json);
	}
	*/
	
	public String buildMessageString() {
		JSONObject json = new JSONObject();
		
		updateBody();
		
		json.put("type", getType());
		json.put("body", getBody());
		json.put("source", getSource());
		json.put("timestamp", System.currentTimeMillis());
		
		return JsonUtil.getJSONString(json);
	}
	
	public String getName() {
		return "基础事件";
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

	public boolean isFired() {
		return fired;
	}

	public void setFired() {
		this.fired = true;
	}

}
