package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;


public class UserEvent extends BaseEvent{
	private static final long serialVersionUID = -3107656524101208105L;
	
	private String orderNo;
	private String orderItemNo;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = getBody();
		
		setOrderNo(param.get("orderNum").toString());
		if (param.get("orderDetailNum") != null && 
			!param.get("orderDetailNum").toString().isEmpty()) {
			setOrderItemNo(param.get("orderDetailNum").toString());
		}else{
			setOrderItemNo(null);
		}
	}
	
	public void updateBody() {
		super.updateBody();
		
		JSONObject param = getBody();
		param.put("orderNum", getOrderNo());
		param.put("orderDetailNum", getOrderItemNo());
	}
	
	public BaseEvent buildResponseEvent(int code, String message) {
		UserEvent event = new UserEvent();
		event.setType(getType());
		event.setTimestamp(System.currentTimeMillis());
		
		event.setOrderNo(getOrderNo());
		event.setOrderItemNo(getOrderItemNo());
		
		if (getTarget()!= null) {
			event.setTarget(getTarget());
		}else{
			event.setTarget(getSource());
		}
		
		if (getCorrelationId() != null) {
			event.setCorrelationId(getCorrelationId());
		}
		
		event.setSource("osm");
		
		JSONObject param = new JSONObject();
		param.put("code", code);
		param.put("message", message);
		
		event.setBody(param);
		
		return event;
	}
	
	@Override
	public String getName() {
		return "用户事件";
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderItemNo() {
		return orderItemNo;
	}
	public void setOrderItemNo(String orderItemNo) {
		this.orderItemNo = orderItemNo;
	}
}
