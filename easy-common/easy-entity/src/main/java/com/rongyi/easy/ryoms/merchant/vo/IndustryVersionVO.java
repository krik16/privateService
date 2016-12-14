package com.rongyi.easy.ryoms.merchant.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.bsoms.entity.BIndustryVersion;

public class IndustryVersionVO extends BIndustryVersion implements Serializable {

	private static final long serialVersionUID = 8149365561835250043L;
	
	private List<Map> auths;

	public List<Map> getAuths() {
		return auths;
	}

	public void setAuths(List<Map> auths) {
		this.auths = auths;
	}

	
	
	
}
