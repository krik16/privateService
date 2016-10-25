package com.rongyi.easy.ryoms.merchant.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.bsoms.entity.BIndustry;

/**
 * 
 * @ClassName: IndustryInfoVO 
 * @Description: 
 * @author Kenny
 * @date 2016年10月25日 下午6:45:43 
 *
 */
public class IndustryInfoVO extends BIndustry implements Serializable {

	private static final long serialVersionUID = -4403028000259507334L;
	
	private String creatorName;
	
	private String updatorName;
	
	private List<IndustryVersionVO> industryVersionVOs;

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getUpdatorName() {
		return updatorName;
	}

	public void setUpdatorName(String updatorName) {
		this.updatorName = updatorName;
	}

	public List<IndustryVersionVO> getIndustryVersionVOs() {
		return industryVersionVOs;
	}

	public void setIndustryVersionVOs(List<IndustryVersionVO> industryVersionVOs) {
		this.industryVersionVOs = industryVersionVOs;
	}
	
}
