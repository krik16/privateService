package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

public class PaymentResponseEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = -5118899359556863261L;
	
	private String paymentIdList;

	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = getBody();
		
		setPaymentIdList(param.get("paymentId").toString());
	}
	
	public String getPaymentIdList() {
		return paymentIdList;
	}

	public void setPaymentIdList(String paymentIdList) {
		this.paymentIdList = paymentIdList;
	}
	
}
