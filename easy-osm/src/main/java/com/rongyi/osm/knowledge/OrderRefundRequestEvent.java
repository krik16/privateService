package com.rongyi.osm.knowledge;

import java.math.BigDecimal;

import net.sf.json.JSONObject;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;

public class OrderRefundRequestEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 8939218950872631333L;
	
	private ApplicationFormEntity applicationForm;
	private BigDecimal refundAmount;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = getBody();
		
		setApplicationForm((ApplicationFormEntity)
				JsonUtil.getDTO(param.get("application").toString(), 
						ApplicationFormEntity.class));
		setRefundAmount(new BigDecimal(param.get("refundMoney").toString()));
	}
	
	@Override
	public String getName() {
		return "买家申请退款";
	}
	
	public ApplicationFormEntity getApplicationForm() {
		return applicationForm;
	}
	public void setApplicationForm(ApplicationFormEntity applicationForm) {
		this.applicationForm = applicationForm;
	}
	public BigDecimal getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	
}
