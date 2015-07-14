package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;

public class OrderAppealRequestEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = -5707560538419867035L;
	
	private ApplicationFormEntity applicationForm;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		JSONObject param = getBody();

		setApplicationForm((ApplicationFormEntity)
				JsonUtil.getDTO(param.get("applicationForm").toString(), 
						ApplicationFormEntity.class));
	}
	
	@Override
	public String getName() {
		return "买家申请维权";
	}

	public ApplicationFormEntity getApplicationForm() {
		return applicationForm;
	}

	public void setApplicationForm(ApplicationFormEntity applicationForm) {
		this.applicationForm = applicationForm;
	}
	
}
