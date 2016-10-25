package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;
import java.util.List;

public class IndustrySaveParam implements Serializable {
	
	private static final long serialVersionUID = -1529758349603604413L;
	
	private Integer id;
	
	private String name;//行业名称
	
	private List<IndustryVersionParam> industryVersionParam;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IndustryVersionParam> getIndustryVersionParam() {
		return industryVersionParam;
	}

	public void setIndustryVersionParam(List<IndustryVersionParam> industryVersionParam) {
		this.industryVersionParam = industryVersionParam;
	}

	@Override
	public String toString() {
		return "IndustrySaveParam [name=" + name + ", industryVersionParam=" + industryVersionParam + "]";
	}
	
}
