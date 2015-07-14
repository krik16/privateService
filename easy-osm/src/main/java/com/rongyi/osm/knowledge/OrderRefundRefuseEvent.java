package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

public class OrderRefundRefuseEvent extends UserEvent{
	/**  */
	private static final long serialVersionUID = 4825021085108158489L;
	
	private String rejectReason;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		JSONObject param = getBody();
		
		setRejectReason(param.get("rejectReason").toString());
	}
	
	@Override
	public String getName() {
		return "卖家拒绝退款";
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	
	
}
