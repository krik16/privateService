package com.rongyi.easy.ryoms.merchant.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.bsoms.entity.BIndustryVersion;

public class IndustryVersionVO extends BIndustryVersion implements Serializable {

	private static final long serialVersionUID = 8149365561835250043L;
	
	private List<AuthorityVO> authorityVOs;

	public List<AuthorityVO> getAuthorityVOs() {
		return authorityVOs;
	}

	public void setAuthorityVOs(List<AuthorityVO> authorityVOs) {
		this.authorityVOs = authorityVOs;
	}

	
}
