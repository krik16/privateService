package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

public class OrderPaidEvent extends UserEvent{
	/**  */
	private static final long serialVersionUID = 2162213928084215948L;
	
	private String paymentIdList;

	public void load(JSONObject json) throws Exception {
		super.load(json);

		JSONObject param = getBody();
		
		setPaymentIdList(param.getString("paymentId"));
	}
	
	@Override
	public String getName() {
		return "买家付款";
	}
	
	public String getPaymentIdList() {
		return paymentIdList;
	}
	public void setPaymentIdList(String paymentIdList) {
		this.paymentIdList = paymentIdList;
	} 
}
