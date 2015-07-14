package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

public class OrderDeliveryEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = -8808951390633216306L;
	
	private String logisticsBillId;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		JSONObject param = getBody();
		
		setLogisticsBillId(param.get("logisticsBillId").toString());
	}
	
	@Override
	public String getName() {
		return "卖家发货";
	}
	

	public String getLogisticsBillId() {
		return logisticsBillId;
	}

	public void setLogisticsBillId(String logisticsBillId) {
		this.logisticsBillId = logisticsBillId;
	}
	
	
}
